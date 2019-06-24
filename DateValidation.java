import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class DateValidation{
   public static int checkDate(String strDate)
   {
	if (strDate.trim().equals(""))
	{
	    return -1;
	}
	else
	{
	    SimpleDateFormat sdfrmt1 = new SimpleDateFormat("dd/MM/yyyy");
	    SimpleDateFormat sdfrmt2 = new SimpleDateFormat("dd-MM-yyyy");
	    SimpleDateFormat sdfrmt3 = new SimpleDateFormat("dd.MM.yyyy");
	    sdfrmt1.setLenient(false);
	    sdfrmt2.setLenient(false);
	    sdfrmt3.setLenient(false);
	    try
	    {
	    	if(strDate.charAt(2)=='/'){
	    		Date javaDate = sdfrmt1.parse(strDate);
	    	}
	    	else if(strDate.charAt(2)=='-'){
	    		Date javaDate = sdfrmt2.parse(strDate); 
	    	}
	    	else if(strDate.charAt(2)=='.'){
	    		Date javaDate = sdfrmt3.parse(strDate); 
	    	}
	    	else return -1;
	    }
	    catch (ParseException e)
	    {
	        return -1;
	    }
	    return 1;
	}
   }
   public static void main(String args[]){
	   
	   Scanner kb = new Scanner(System.in);
	   String s = kb.next();
	   
	   int x = checkDate(s);
	   
	   if(x == -1) System.out.println("Invalid");
	   else System.out.println("Valid");
   }
}
