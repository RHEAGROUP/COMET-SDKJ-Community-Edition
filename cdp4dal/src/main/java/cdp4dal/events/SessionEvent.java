/*
 * SessionEvent.java
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

package cdp4dal.events;

import cdp4dal.Session;
import lombok.Getter;
import lombok.Setter;

/**
 * The session event.
 */
@Getter
@Setter
public class SessionEvent {

  /**
   * Initializes a new instance of the {@link SessionEvent} class.
   *
   * @param session The session.
   * @param status The status.
   */
  public SessionEvent(Session session, SessionStatus status) {
    this.session = session;
    this.status = status;
  }

  /**
   * Gets or sets the {@link Session}.
   */
  public Session session;

  /**
   * Gets or sets the {@link SessionStatus} of the {@link Session}.
   */
  public SessionStatus status;
}
