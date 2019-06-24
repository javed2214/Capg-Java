import java.util.*;

public class ProductService {
	public static Map<Integer, Integer> changeProductPrice(Map<Integer, String> Map1 , Map<Integer, Integer> Map2){
		
		if(Map1==null || Map2==null) return null;
		
		ArrayList <Integer> AL = new ArrayList<>();
		
		for (Map.Entry<Integer, String> entry : Map1.entrySet()){
			if(entry.getValue().equalsIgnoreCase("electronic"))
				AL.add(entry.getKey());
		}
		
		Map<Integer, Integer> Mapx = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<AL.size();i++){
			float x = Map2.get(AL.get(i));
			float p = x;
			p = (p/10);
			x = x - p;
			int ppx = Math.round(x);
			int px = AL.get(i);
			Mapx.put(px, ppx);
		}
		
		return Mapx;
	}
	
	public static void main(String args[]){
		
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		
		Map<Integer, String> Map1 = new LinkedHashMap<Integer, String>();
		Map<Integer, Integer> Map2 = new LinkedHashMap<Integer, Integer>();
		Map<Integer, Integer> Mapx = new LinkedHashMap<Integer, Integer>();
		
		while(test!=0){
			
			int s1,s2;
			String s;
			s1 = kb.nextInt();
			s = kb.next();
			s2 = kb.nextInt();
			s.toLowerCase();
			
			if(!(s.equalsIgnoreCase("electronic"))){
				test-=1;
				continue;
			}
			
			Map1.put(s1, s);
			Map2.put(s1, s2);
			
			test-=1;
		}
		Mapx = changeProductPrice(Map1, Map2);
		
		if(Mapx.size()==0) System.out.println("No Electronic Products");
		
		else{
			for (Map.Entry<Integer, Integer> entry : Mapx.entrySet()){
				System.out.println(entry.getKey()+" - "+entry.getValue());
			}
		}
	}
}
