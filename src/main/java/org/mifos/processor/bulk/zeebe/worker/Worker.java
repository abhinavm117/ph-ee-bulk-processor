package org.mifos.processor.bulk.zeebe.worker;

public enum Worker {

    PARTY_LOOKUP("partyLookup"),
    APPROVAL("approval"),
    ORDERING("ordering"),
    SPLITTING("splitting"),
    FORMATTING("formatting"),
    BATCH_STATUS("batchStatus"),
    MERGE_BACK("mergeSubBatch"),

    INIT_SUB_BATCH("initSubBatch");

    private final String value;

    private Worker(String s) {
        value = s;
    }

    public String getValue() {
        return value;
    }

}