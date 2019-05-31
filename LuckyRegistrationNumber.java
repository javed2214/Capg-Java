import java.util.Scanner;

class LuckyRegistrationNumber{
	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);
		String s=kb.next();
		int x=checkRegistrationNumber(s);
		if(x==-1) System.out.println("Invalid registration number");
		if(x==0) System.out.println("Valid registration number");
		if(x==1) System.out.println("Lucky registration number");
	}
	static int checkRegistrationNumber(String s){
		if(s.length()==0) return -1;
		int c=0;
		if(!s.substring(0,2).equals("KA") && !s.substring(0,2).equals("DL")) return -1;
		String g[]={"01","02","03","04","05","06","07","08","09","10"};
		int cv=g.length;
		int k=0,plo=0;
		while(cv!=0){
			if(s.substring(2,4).equals(g[k])){
				plo=1;
				break;
			}
			k++;
			cv--;
		}
		if(plo==0) return -1;
		System.out.println("*");
		for(int i=4;i<=5;i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				c++;
		}
		int index=5;
		if(c==1) index=5;
		else if(c==0) return -1;
		else if(c==2) index=6;

		int x=s.length();
		String ss=s.substring(index,x);
		int z=Integer.parseInt(ss);
		int flag=0,t=0,r,p=0;
		if(z>=1000 && z<=9999){
			t=1;
			while(z!=0){
				r=z%10;
				p=p+r;
				z/=10;
				if(z==0){
					z=p;
					if(p==6){
						flag=1;
						break;
					}
					else if(p<10) break;
				}
			}
		}
		if(flag==1) return 1;
		if(t==1) return 0;
		return -1;
	}
}