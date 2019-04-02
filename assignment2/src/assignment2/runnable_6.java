package assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;

public class runnable_6 extends RunnableExampleMain implements Runnable {
    	 
	@Override
	public void run() {

		 
		String yo = "STIW3054";
        Scanner scanner = null;
		try {
			scanner = new Scanner(new File("src/assignment2/try1.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // path to file
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().contains(yo)) { // check if line has your finding word
            
            	 System.out.println(Thread.currentThread().getName() +
                         "\tDisplay the information of " +yo+ " : ");
            }
   		
        }
        
    	String line1 = null;
    	int n1 = 2627;
    	try(BufferedReader br1 = new BufferedReader(new FileReader("src/assignment2/try1.txt"))){
    		for(int i=4; i<n1; i++)
    			br1.readLine();
    		line1=br1.readLine(); 
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(line1);

    	try(BufferedReader br2 = new BufferedReader(new FileReader("src/assignment2/try1.txt"))){
    		for(int x=3; x<n1; x++)
    			br2.readLine();
    		line1=br2.readLine();   		
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(line1);
    	
    	try(BufferedReader br3 = new BufferedReader(new FileReader("src/assignment2/try1.txt"))){
    		for(int i=2; i<n1; i++)
    			br3.readLine();
    		line1=br3.readLine();   		
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(line1);
    	
    	try(BufferedReader br4 = new BufferedReader(new FileReader("src/assignment2/try1.txt"))){
    		for(int i=1; i<n1; i++)
    			br4.readLine();
    		line1=br4.readLine();   		
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(line1);
    	
                  
}
}

