package eu.openminted.corpus;

import eu.openminted.content.connector.Query;
import eu.openminted.registry.domain.Corpus;

public interface CorpusBuilder {
    /***
     * Standard method to prepare building a corpus (gathers necessary information)
     * @param query Search information
     * @return Corpus containing the corpus metadata
     */
    Corpus prepareCorpus(Query query);

    /***
     * Standard method to begin building the corpus
     * @param corpusMetadata metadata stored for the corpus building
     */
    void buildCorpus(Corpus corpusMetadata);

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
