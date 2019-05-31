import java.util.Scanner;

class OlderDate{
	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);
		String s1,s2;
		s1=kb.next();
		s2=kb.next();
		String ss=findOlderDate(s1,s2);
		if(ss.equals("equal")) System.out.println("Dates are same");
		else System.out.println(findOlderDate(s1,s2));
	}
	static String findOlderDate(String s1, String s2){
		String t1[]=s1.split("/");
		String t2[]=s2.split("/");
		int p1[]=new int[3];
		int p2[]=new int[3];
		p1[0]=Integer.parseInt(t1[0]);
		p1[1]=Integer.parseInt(t1[1]);
		p1[2]=Integer.parseInt(t1[2]);
		p2[0]=Integer.parseInt(t2[0]);
		p2[1]=Integer.parseInt(t2[1]);
		p2[2]=Integer.parseInt(t2[2]);
		int flag1=0,flag2=0;
		while(true){
			if(p1[2] > p2[2]){
				flag2=2;
				break;
			}
			else if(p1[2] < p2[2]){
				flag1=1;
				break;
			}
			if(p1[1] > p2[1]){
				flag2=2;
				break;
			}
			else if(p1[1] < p2[1]){
				flag1=1;
				break;
			}
			if(p1[0] > p2[0]){
				flag2=1;
				break;
			}
			else if(p1[0] < p2[0]){
				flag1=1;
				break;
			}
			break;
		}
		String ss="";
		if(flag1==1) ss=(t1[0]+"-"+t1[1]+"-"+t1[2]);
		else if(flag2==1) ss=(t2[0]+"-"+t2[1]+"-"+t2[2]);
		else ss=("equal");
		return ss;
	}
}