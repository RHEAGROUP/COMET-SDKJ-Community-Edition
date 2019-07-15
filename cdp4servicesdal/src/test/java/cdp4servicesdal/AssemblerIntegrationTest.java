/*
 * AssemblerIntegrationTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */


package cdp4servicesdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4common.Version;
import cdp4common.dto.Thing;
import cdp4dal.Assembler;
import cdp4jsonserializer.Cdp4JsonSerializerImpl;
import com.google.common.base.Stopwatch;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Suite of tests to test the {@link Assembler} class using DTO's produced from JSON.
 */
class AssemblerIntegrationTest {

  private URI uri;

  private List<Thing> dtos;

  @BeforeEach
  void setUp() throws IOException {
    this.uri = URI.create("http://www.rheagroup.com");

    InputStream is = new FileInputStream(
        "src/test/java/cdp4servicesdal/testdata/SiteDirectoryExtentDeep.json");

    var version = new Version(1, 0, 0);

    var jsonSerializer = new Cdp4JsonSerializerImpl(version);

    this.dtos = jsonSerializer.deserialize(is);
  }

  @Test
  void verify_that_Thing_Revisions_is_populated_on_second_load()
      throws ExecutionException, InterruptedException {
    var assembler = new Assembler(this.uri);

    var sw = Stopwatch.createStarted();
    assembler.synchronize(this.dtos, true).get();
    sw.stop();
    System.out.println(String.format("Synchronize took %s [ms]", sw.elapsed(
        TimeUnit.MILLISECONDS)));

    sw.start();
    assembler.synchronize(this.dtos, true).get();
    sw.stop();
    System.out.println(String.format("Re-Synchronize took %s [ms]", sw.elapsed(
        TimeUnit.MILLISECONDS)));

    for (var dto : dtos) {
      dto.setRevisionNumber(dto.getRevisionNumber() + 1);
    }

    sw.start();
    assembler.synchronize(this.dtos, true).get();
    sw.stop();
    System.out.println(String.format("Update-Synchronize took %s [ms]", sw.elapsed(
        TimeUnit.MILLISECONDS)));

    var things = assembler.getCache()
        .asMap()
        .values();

    for (var thing : things) {
      assertEquals(1, thing.getRevisions().size());
    }

    sw.start();
    assembler.synchronize(this.dtos, true).get();
    sw.stop();
    System.out.println(String.format("Re-Synchronize took %s [ms]", sw.elapsed(
        TimeUnit.MILLISECONDS)));
  }
}
