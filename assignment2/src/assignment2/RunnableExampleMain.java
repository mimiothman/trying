package assignment2;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.util.*;
import java.io.*;

public class RunnableExampleMain {

    public static void main(String[] args)  throws IOException, Exception {
    
    	long start = System.currentTimeMillis();
	      for (int i = 0; i <1; i++) {
	         Thread.sleep(60);
	      }
    	
    	 try
    	  {
    	   PDDocument document = PDDocument.load(new File("try.pdf"));
    	   document.getClass();
    	   if (!document.isEncrypted())
    	   {
    	    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
    	    stripper.setSortByPosition(true);
    	    PDFTextStripper Tstripper = new PDFTextStripper();
    	    String str = Tstripper.getText(document);
    	    Scanner scn = null;     
    	    scn = new Scanner(str);
    	    String line="";
    	    while (scn.hasNextLine()) 
    	    {  
    	     line = scn.nextLine();
    	     System.out.println("\n"+line);
    	    } 
    	
    	 System.out.println( "\n"); 	
    	 	
    	//bahagian thread
        System.out.println("Analysis program...");
        

        runnable_2 day = new runnable_2(); //count exam day
        runnable_3 full_course = new runnable_3(); // count total course
        runnable_4 list_SOC = new runnable_4(); //list course soc
        runnable_5 total_SOC = new runnable_5(); // total course soc
        runnable_6 search = new runnable_6(); //search stiw3054
   
        
        
        Thread thread1 = new Thread(full_course, "Thread 2"); //total course
        thread1.start();    

        Thread thread2 = new Thread(day, "Thread 3"); //total day
        thread2.start();
        
        Thread thread4 = new Thread(list_SOC, "Thread 4"); //list soc
        thread4.start();

        Thread thread5 = new Thread(total_SOC, "Thread 5");//total SOC
        thread5.start();
        
        Thread thread6 = new Thread(search, "Thread 6");//search stiw3054
        thread6.start();


        
        Thread thread3 = new Thread(new Runnable() {  //count page
            @Override
            public void run() {
                
                for (int i = 0; i < 1; i++) {
                    System.out.println(Thread.currentThread().getName() +
                            "\tPage Count : " + document.getNumberOfPages());
                  
                }
            }
        }, "Thread 1");
        thread3.start();
        

    	   }
    	   document.close();
    	  }
    	  catch (Exception e) 
    	  {
    	   e.printStackTrace();
    	  }

    	 long end = System.currentTimeMillis();
    	 float sec = (end - start) / 1000F; System.out.println(sec + " seconds");
    }
}