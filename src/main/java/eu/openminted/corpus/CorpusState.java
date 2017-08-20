package eu.openminted.corpus;

/***
 * CorpusState enum, informs the status of a corpus
 */
public class CorpusState {
    private String id;
    private String connector;
    private int totalHits;
    private int totalFulltext;
    private CorpusStatus currentStatus;
    private int currentProgress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public int getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public int getTotalFulltext() {
        return totalFulltext;
    }

    public void setTotalFulltext(int totalFulltext) {
        this.totalFulltext = totalFulltext;
    }

    public CorpusStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CorpusStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }
}
