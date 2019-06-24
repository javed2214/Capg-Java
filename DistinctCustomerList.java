import java.util.*;

public class DistinctCustomerList {
	
	public static int p = 0;
	
	public static Integer[] getDistinctCustomers(List<Integer> first, List<Integer> second) {
		
		HashMap<Integer, Boolean> Map = new HashMap<>();
		
		int a[] = null;
		
		for(int i=0;i<first.size();i++){
			int xx=first.get(i);
			if(!(Map.containsKey(xx))) Map.put(xx, true);
			
		}
		for(int i=0;i<second.size();i++){
			int xx=second.get(i);
			if(!(Map.containsKey(xx))) Map.put(xx, true);
			else{
				Map.put(xx, false);
			}
		}
		
		List<Integer> Listint = new ArrayList<>();
		int c = 0;
		for(Integer key: Map.keySet()){
			if(Map.get(key)==true){
				Listint.add(key);
			}
		}
		p=Listint.size();
		Collections.sort(Listint, Collections.reverseOrder());
		Integer xx[] = new Integer[p];
		
		for(int i=0;i<p;i++)
			xx[i]=Listint.get(i);
		
		return xx;
	}
	
	public static void main(String args[]){
		
		Scanner kb = new Scanner(System.in);
		
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();

		int n1,n2;
		n1=kb.nextInt();
		for(int i=0;i<n1;i++){
			int px=kb.nextInt();
			first.add(px);
		}
		n2=kb.nextInt();
		for(int i=0;i<n2;i++){
			int px=kb.nextInt();
			second.add(px);
		}
		Integer xx[] = new Integer[p];
		xx = getDistinctCustomers(first, second);
		
		System.out.println(Arrays.toString(xx));
	}
}
