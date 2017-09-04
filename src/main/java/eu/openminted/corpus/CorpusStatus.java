package eu.openminted.corpus;

/***
 * CorpusStatus enum, informs the status of a corpus
 */
public enum CorpusStatus {
    INITIATING,
    SUBMITTED,
    PROCESSING,
    PROCESSING_METADATA,
    PROCESSING_FULLTEXT,
    CREATED,
    CANCELED,
    DELETED,
    FAILED
}
