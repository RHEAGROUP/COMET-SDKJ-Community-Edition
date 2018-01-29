/* --------------------------------------------------------------------------------------------------------------------
 * AbstractFileRevision.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.tuple.Pair;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a persisted revision of a File
 * Note 1: The <i>name</i> property is used to denote the name of the FileRevision and therefore of the File, without any file type extension. So for a Microsoft Windows file the name contains the characters up to (but not including) the dot that separates the file name from the extension. The file type extension is stored in the associated FileType. Case is preserved in the file name.
 * Note 2: The representation of the actual file content of a FileRevision depends on the implementation technology and is not modeled as an explicit property. It may differ between server and client applications. A server application (e.g. a combination of a web services processor and a persistent data store) may store the content partitioned into chunks for reasons of efficiency. A client application may implement an API that provides access to an instance of a retrieved file in a locally accessible file system. There is a FileContentType data type that can be used in code generation or implementation.
 */
@Container(clazz = File.class, propertyName = "fileRevision")
@ToString
@EqualsAndHashCode
public  class FileRevision extends Thing implements NamedThing, TimeStampedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>FileRevision<code/> class.
     *
     * @see FileRevision
     */
    public FileRevision() {
        this.fileType = new OrderedItemList<FileType>(this);
    }

    /**
     * Initializes a new instance of the <code>FileRevision<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see FileRevision
     */
    public FileRevision(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.fileType = new OrderedItemList<FileType>(this);
    }

    /**
     * Property containingFolder.
     * optional reference to the containing Folder
     * Note: If the reference is undefined (or null) the File and FileRevision are considered to be contained by the containing FileStore at the top level.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Folder containingFolder;

    /**
     * Property contentHash.
     * SHA-1 hash code of the content (byte stream) of this FileRevision
     * Note: The SHA-1 cryptographic hash is described in <a href="http://en.wikipedia.org/wiki/SHA-1">http://en.wikipedia.org/wiki/SHA-1</a>. It provides a unique hash to the file content of the FileRevision and was selected for future compatibility with a GIT (<a href="http://git-scm.com/">http://git-scm.com/</a>) version controlled file store. Implementations of E-TM-10-25 need to provide a way to associate a SHA-1 hash to the content of a file. Whether or not the content of two FileRevisions differs can then be determined by just comparing the SHA-1 hashes without the need for having access to the actual file content itself.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String contentHash;

    /**
     * Property createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LocalDateTime createdOn;

    /**
     * Property creator.
     * reference to the Participant who created this FileRevision
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Participant creator;

    /**
     * List of ordered FileType.
     * reference to one or more FileTypes that define the type and format of this FileRevision
     * Note: A file can have more than one FileType in order to support possible encryption and compression formats. The order in which the FileTypes are defined is the same as the order the formats were applied from the "inside out", i.e. the first FileType is the normal format of the content, e.g. text or Microsoft Excel, and the subsequent formats are the encryption and/or compression formats, e.g. public-key cryptography standard <a href="http://en.wikipedia.org/wiki/PKCS">PKCS#7</a> and zip.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<FileType> fileType;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String name;

    /**
     * Property path.
     * full path name including folder path and type extension(s)
     * Note: The path is derived to be the concatenation of the path of the containingFolder (if any) followed by a forward slash and the name of this FileRevision and then a dot separated concatenation of the extensions of the associated FileTypes. This yields a path that is similar to that of a "file://" URL starting from the containing FileStore.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String path;
 

    /**
     * Gets the containingFolder.
     * optional reference to the containing Folder
     * Note: If the reference is undefined (or null) the File and FileRevision are considered to be contained by the containing FileStore at the top level.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Folder getContainingFolder(){
         return this.containingFolder;
    }

    /**
     * Gets the contentHash.
     * SHA-1 hash code of the content (byte stream) of this FileRevision
     * Note: The SHA-1 cryptographic hash is described in <a href="http://en.wikipedia.org/wiki/SHA-1">http://en.wikipedia.org/wiki/SHA-1</a>. It provides a unique hash to the file content of the FileRevision and was selected for future compatibility with a GIT (<a href="http://git-scm.com/">http://git-scm.com/</a>) version controlled file store. Implementations of E-TM-10-25 need to provide a way to associate a SHA-1 hash to the content of a file. Whether or not the content of two FileRevisions differs can then be determined by just comparing the SHA-1 hashes without the need for having access to the actual file content itself.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getContentHash(){
         return this.contentHash;
    }

    /**
     * Gets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LocalDateTime getCreatedOn(){
         return this.createdOn;
    }

    /**
     * Gets the creator.
     * reference to the Participant who created this FileRevision
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Participant getCreator(){
         return this.creator;
    }

    /**
     * Gets a list of ordered FileType.
     * reference to one or more FileTypes that define the type and format of this FileRevision
     * Note: A file can have more than one FileType in order to support possible encryption and compression formats. The order in which the FileTypes are defined is the same as the order the formats were applied from the "inside out", i.e. the first FileType is the normal format of the content, e.g. text or Microsoft Excel, and the subsequent formats are the encryption and/or compression formats, e.g. public-key cryptography standard <a href="http://en.wikipedia.org/wiki/PKCS">PKCS#7</a> and zip.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<FileType> getFileType(){
         return this.fileType;
    }

    /**
     * Gets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getName(){
         return this.name;
    }

    /**
     * Gets the path.
     * full path name including folder path and type extension(s)
     * Note: The path is derived to be the concatenation of the path of the containingFolder (if any) followed by a forward slash and the name of this FileRevision and then a dot separated concatenation of the extensions of the associated FileTypes. This yields a path that is similar to that of a "file://" URL starting from the containing FileStore.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getPath(){
        return this.GetDerivedPath();
    }

    /**
     * Sets the containingFolder.
     * optional reference to the containing Folder
     * Note: If the reference is undefined (or null) the File and FileRevision are considered to be contained by the containing FileStore at the top level.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setContainingFolder(Folder containingFolder){
        this.containingFolder = containingFolder;
    }

    /**
     * Sets the contentHash.
     * SHA-1 hash code of the content (byte stream) of this FileRevision
     * Note: The SHA-1 cryptographic hash is described in <a href="http://en.wikipedia.org/wiki/SHA-1">http://en.wikipedia.org/wiki/SHA-1</a>. It provides a unique hash to the file content of the FileRevision and was selected for future compatibility with a GIT (<a href="http://git-scm.com/">http://git-scm.com/</a>) version controlled file store. Implementations of E-TM-10-25 need to provide a way to associate a SHA-1 hash to the content of a file. Whether or not the content of two FileRevisions differs can then be determined by just comparing the SHA-1 hashes without the need for having access to the actual file content itself.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setContentHash(String contentHash){
        this.contentHash = contentHash;
    }

    /**
     * Sets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCreatedOn(LocalDateTime createdOn){
        this.createdOn = createdOn;
    }

    /**
     * Sets the creator.
     * reference to the Participant who created this FileRevision
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCreator(Participant creator){
        this.creator = creator;
    }

    /**
     * Sets a list of ordered FileType.
     * reference to one or more FileTypes that define the type and format of this FileRevision
     * Note: A file can have more than one FileType in order to support possible encryption and compression formats. The order in which the FileTypes are defined is the same as the order the formats were applied from the "inside out", i.e. the first FileType is the normal format of the content, e.g. text or Microsoft Excel, and the subsequent formats are the encryption and/or compression formats, e.g. public-key cryptography standard <a href="http://en.wikipedia.org/wiki/PKCS">PKCS#7</a> and zip.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setFileType(OrderedItemList<FileType> fileType){
        this.fileType = fileType;
    }

    /**
     * Sets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the path.
     * full path name including folder path and type extension(s)
     * Note: The path is derived to be the concatenation of the path of the containingFolder (if any) followed by a forward slash and the name of this FileRevision and then a dot separated concatenation of the extensions of the associated FileTypes. This yields a path that is similar to that of a "file://" URL starting from the containing FileStore.
     *
     * @throws IllegalStateException The path property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setPath(String path){
        throw new IllegalStateException("Forbidden Set value for the derived property FileRevision.path");
    }

    /**
     * Creates and returns a copy of this <code>FileRevision<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>FileRevision<code/>.
     *
     * @see FileRevision
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        FileRevision clone = (FileRevision)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setFileType(new OrderedItemList<FileType>(this.getFileType(), this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>FileRevision<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>FileRevision<code/>.
     * 
     * @see FileRevision
     */
    @Override
    public FileRevision clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (FileRevision)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>FileRevision<code/>.
     *
     * @return A list of potential errors.
     *
     * @see FileRevision
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getContentHash().trim().isEmpty()) {
            errorList.add("The property contentHash is null or empty.");
        }

        if (this.getCreator() == null || this.getCreator().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property creator is null.");
            this.setCreator(SentinelThingProvider.getSentinel<Participant>());
            this.sentinelResetMap["creator"] = () -> this.setCreator(null);
        }

        int fileTypeCount = this.getFileType().size();
        if (fileTypeCount < 1) {
            errorList.add("The number of elements in the property fileType is wrong. It should be at least 1.");
        }

        if (this.getName().trim().isEmpty()) {
            errorList.add("The property name is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>FileRevision<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see FileRevision
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.FileRevision dto = (cdp4common.dto.FileRevision)dtoThing;

        this.setContainingFolder((dto.getContainingFolder() != null) ? this.getCache().get<Folder>(dto.getContainingFolder.getValue(), dto.getIterationContainerId()) : null);
        this.setContentHash(dto.getContentHash());
        this.setCreatedOn(dto.getCreatedOn());
        this.setCreator(this.cache.get<Participant>(dto.getCreator(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Participant>());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.fileType.resolveList(dto.getFileType(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>FileRevision<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see FileRevision
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.FileRevision dto = new cdp4common.dto.FileRevision(this.getIid(), this.getRevisionNumber());

        dto.setContainingFolder(this.getContainingFolder() != null ? (UUID)this.getContainingFolder().getIid() : null);
        dto.setContentHash(this.getContentHash());
        dto.setCreatedOn(this.getCreatedOn());
        dto.setCreator(this.getCreator() != null ? this.getCreator().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getFileType().add(this.getFileType().toDtoOrderedItemList());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}