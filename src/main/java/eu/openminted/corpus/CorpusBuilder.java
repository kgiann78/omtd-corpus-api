package eu.openminted.corpus;

import eu.openminted.content.connector.Query;

public interface CorpusBuilder {
    /***
     * Standard method to prepare building a corpus (gathers necessary information)
     * @param query Search information
     * @return CorpusMetadata as XML in the form of String
     */
    String prepareCorpus(Query query);

    /***
     * Standard method to begin building the corpus
     * @param corpusMetadata metadata stored for the corpus building
     */
    void buildCorpus(String corpusMetadata);

    /***
     * Returns the status of a particular corpus based on its ID
     * @param corpusID corpus ID
     * @return CorpusStatus
     */
    CorpusStatus getStatus(String corpusID);

    /***
     * Standard method to recall the building of a corpus.
     * @param corpusID corpus ID
     */
    void cancelProcess(String corpusID);

    /***
     * Standard method to delete a created corpus based on its ID
     * @param corpusID corpus ID
     */
    void deleteCorpus(String corpusID);
}
