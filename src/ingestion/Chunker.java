import java.util.ArrayList;
import java.util.List;

public class Chunker {
    public List<String> chunkText(String text, int chunkSize) {
        List<String> chunks = new ArrayList<>();
        String[] sentences = text.split("\\. "); // Split by period and space
        StringBuilder chunk = new StringBuilder();
        
        for (int i = 0; i < sentences.length; i++) {
            chunk.append(sentences[i]).append(". ");
            if ((i + 1) % chunkSize == 0 || i == sentences.length - 1) {
                chunks.add(chunk.toString());
                chunk.setLength(0); // Reset for next chunk
            }
        }
        return chunks;
    }
}
