public class QueryHandler {
    private VectorDatabase vectorDatabase;
    private VectorEmbedding vectorEmbedding;

    public QueryHandler(VectorDatabase vectorDatabase, VectorEmbedding vectorEmbedding) {
        this.vectorDatabase = vectorDatabase;
        this.vectorEmbedding = vectorEmbedding;
    }

    public String handleQuery(String query) {
        float[] queryEmbedding = vectorEmbedding.generateEmbedding(query);
        String mostRelevantChunk = vectorDatabase.retrieveMostSimilarChunk(queryEmbedding);
        return mostRelevantChunk;
    }
}
