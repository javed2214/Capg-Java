import java.util.*;

public class GradeCalculator {
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		
		int test = kb.nextInt();
		HashMap<Integer, Integer> Map = new HashMap <>();
		
		while(test!=0){
			
			int x = kb.nextInt();
			int y = kb.nextInt();
			
			if(y > 100){
				test-=1;
				continue;
			}
			
			Map.put(x, y);
			
			test-=1;
		}
		
		Map <Integer, String> Map1 = new HashMap<Integer, String>();
		
		if(Map.isEmpty()) Map1 = calculateGrade(Map);
		
		else{
			
			Map1 = calculateGrade(Map);
			
			
			for (Map.Entry<Integer, String> entry : Map1.entrySet()){
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
	}
	
	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores){
		
		if(scores.isEmpty()) return null;
		
		Map<Integer, Integer> sorted = new TreeMap<>(scores); 
		
		HashMap <Integer, String> Map = new HashMap<>();
		
		String grade="";
		for (Map.Entry<Integer, Integer> entry : sorted.entrySet()){
			
			if(entry.getValue() >= 80) grade = "A";
			else if(entry.getValue() >= 60 && entry.getValue() < 80) grade = "B";
			else if(entry.getValue() >= 45 && entry.getValue() < 60) grade = "C";
			else grade = "D";
//			System.out.println(grade);
			
			Map.put(entry.getKey(), grade);
		}
		
		Map<Integer, String> ss = new TreeMap<>(Map); 
		
		return ss;
	}
}
