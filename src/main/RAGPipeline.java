import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;

public class RAGPipeline {

    public static void main(String[] args) {
        // Disable PDFBox warnings by setting the logging level to SEVERE
        Logger logger = Logger.getLogger("org.apache.pdfbox");
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.SEVERE); // Only show SEVERE messages (suppress warnings)
        logger.addHandler(consoleHandler);

        // Your existing code to process the PDF
        String pdfPath = "C:\\RAG\\data\\sample.pdf";
        
        PDFTextExtractor extractor = new PDFTextExtractor();
        try {
            // Extract text from page 1 of the PDF
            String extractedText = extractor.extractTextFromPage(pdfPath, 1);
            System.out.println("Extracted Text from Page 1: ");
            System.out.println(extractedText);  // Check the extracted text

            // Continue with your other logic (chunk retrieval, etc.)
            String retrievedChunk = "The unemployment rate for people with a bachelor's degree is 3.5%...";
            System.out.println("Retrieved Chunk: ");
            System.out.println(retrievedChunk);  // Check the retrieved chunk

            // Generate response
            String response = "Generated Response based on the relevant data: " + retrievedChunk;
            System.out.println("Generated Response: ");
            System.out.println(response);  // Final Output
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
