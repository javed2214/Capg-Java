import java.util.Scanner;

class MessageEncryption{
	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		System.out.println(encrypt(s));
	}
	static String encrypt(String str){
		String s=str.toLowerCase();
		String ss="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='a') ss+='e';
			else if(ch=='e') ss+='a';
			else if(ch=='o') ss+='u';
			else if(ch=='u') ss+='o';
			else if(ch=='i') ss+='!';
			else if(ch==' ') ss+='+';
			else if(ch=='z') ss+='b';
			else if(ch=='0') ss+='1';
			else if(ch=='9') ss+='0';
			else if(ch>='a' && ch<='y'){
				int x=(int)ch;
				x++;
				if(x==97 || x==101 || x==105 || x==111 || x==117){
					x++;
				}
				ss+=(char)(x);
			}
			else if(ch>='1' && ch<='9'){
				int x=(int)ch+1;
				ss+=(char)x;
			}
		}
		return ss;
	}
}