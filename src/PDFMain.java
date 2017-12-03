
import java.io.IOException;

public class PDFMain {

    public static void main(String[] args) throws IOException {

       PDFManager pdfManager = new PDFManager();
       pdfManager.setFilePath("/Users/sbale19/Desktop/test.pdf");
       System.out.println(pdfManager.ToText());       
    
}    
}


