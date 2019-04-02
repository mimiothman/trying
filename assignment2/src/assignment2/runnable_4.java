package assignment2;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.itextpdf.text.pdf.PdfReader;

public class runnable_4 extends RunnableExampleMain implements Runnable {


    @Override
    public void run() {
    	PdfReader reader;

        try {
        	
            PDDocument document = PDDocument.load(new File("try.pdf"));                
        	PDFTextStripper stripper = new PDFTextStripper();
        	stripper.setStartPage(25);
        	stripper.setEndPage(26);
        	String result = stripper.getText(document);
        	 System.out.println(Thread.currentThread().getName() +
                     "\tList Course SOC : \n" + result);
        	 
        } catch (IOException e) {
            e.printStackTrace();
           
        }
    }
}
