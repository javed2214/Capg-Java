import java.util.Scanner;

class MaxNum{
	public static void main(String args[]){
		int mx=-1,flag=0;
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				int j=i;
				String ss="";
				ss+=s.charAt(i);
				int m=Integer.parseInt(ss);
				mx=Math.max(mx,m);
				if(flag==1) break;
			}
		}
		System.out.println(mx);
	}
}
