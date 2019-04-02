package assignment2;

import java.util.Calendar;

public class runnable_2 extends RunnableExampleMain implements Runnable {

    @Override
    public void run() {
    	
        Calendar cal = Calendar.getInstance();
       	   int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
       	   int total = days - 14;
            System.out.println(Thread.currentThread().getName() +
                    "\tTotal days exam : " + total);
            
    }
}