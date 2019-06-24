import java.util.HashMap;
import java.util.*;

public class CountryCapital {
	
	public static void main(String args[]){
		
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		
		HashMap <String, String> Map1 = new HashMap <>();
		HashMap <String, String> Map2 = new HashMap <>();
		
		while(test!=0){
			
			String s1,s2;
			
			s1 = kb.next();
			s2 = kb.next();
			
			s1.toLowerCase();
			s2.toLowerCase();
			
			Map1.put(s1, s2);
			Map2.put(s2, s1);
			
			test-=1;
		}
		
		int x = kb.nextInt();
		String s = kb.next();
		
		if(x == 1){
			String ss = getCapital(Map1, s);
			if(ss.equals("Country not found"))
				System.out.println(ss);
			else
				System.out.println("Capital : "+ss);
		}
		else if(x == 2){
			String ss = getCountry(Map1, s);
			if(ss.equals("Capital not found"))
				System.out.println(ss);
			else
				System.out.println("Country : "+ss);
		}
		else System.out.println("Invalid Option");
		
	}
	
	public static String getCapital(HashMap<String, String> Map, String str){
		
		str.toLowerCase();
		String ss = "";
		if(Map.containsKey(str)){ 
			ss = Map.get(str);
			return ("Capital : "+ss);
		}
		else ss = "Capital not found";
		
		return ss;
	}
	
	public static String getCountry(HashMap<String, String> Map, String str){
		
		str.toLowerCase();
		String ss = "";
		if(Map.containsKey(str)){
			ss = Map.get(str);
			return ("Country : "+ss);
		}
		else ss = "Country not found";
		
		return ss;
	}
}
