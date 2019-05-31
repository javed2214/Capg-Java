import java.util.Scanner;

class UniqueCharactersCount{
	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		int p=(getUniqueCharacterCount(s));
		if(p==0) System.out.println("No unique character/s");
		else System.out.println(p+" unique character/s");
	}
	static int getUniqueCharacterCount(String s){
		String str=s.toLowerCase();
		int a[]=new int[26];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			a[str.charAt(i)-'a']++;
		}
		int c=0;
		for(int i=0;i<26;i++){
			if(a[i]==1) c++;
		}
		if(c==0) return -1;
		return c;
	}
}