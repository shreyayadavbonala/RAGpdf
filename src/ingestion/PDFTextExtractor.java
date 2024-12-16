import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;

public class PDFTextExtractor {
    public String extractTextFromPage(String pdfPath, int pageNumber) throws IOException {
        File file = new File(pdfPath);
        
        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File not found: " + pdfPath);
            return null;
        }

        PDDocument document = PDDocument.load(file);
        PDFTextStripper stripper = new PDFTextStripper();
        stripper.setStartPage(pageNumber);
        stripper.setEndPage(pageNumber);
        String text = stripper.getText(document);
        document.close();
        return text;
    }

    public static void main(String[] args) throws Exception {
        PDFTextExtractor extractor = new PDFTextExtractor();
        String pdfPath = "C:\\RAG\\data\\sample.pdf"; // Make sure the file exists here
        String extractedText = extractor.extractTextFromPage(pdfPath, 1); // Extract from page 1
        if (extractedText != null) {
            System.out.println(extractedText);
        }
    }
}
