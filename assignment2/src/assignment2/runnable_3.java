package assignment2;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;

public class runnable_3 extends RunnableExampleMain implements Runnable {
    
	
    private ThreadLocal<PDDocument> localPdDocument = new ThreadLocal<PDDocument>() {
    	
        @Override
        
        protected PDDocument initialValue() {
        	File file = new File("student.pdf");
            return new PDDocument();
        }
    };

    PDDocument doc = localPdDocument.get();

	@Override
	public void run() {

		for (int i = 0; i < 1; i++) {
                  System.out.println(Thread.currentThread().getName() +
                "\tTotal Course : " + (i+645));
                  
      }
	}
}


