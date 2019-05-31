public class StringQty{
	public static void main(String args[]){
		String s="2:10.5,2:20.25,3:30.5";
		float sum=0;
		String str[]=s.split(",");
		for(int i=0;i<str.length;i++){
			String x=str[i];
			String y[]=x.split(":");
			if(y.length==2){
				float p1=Float.parseFloat(y[0]);
				float p2=Float.parseFloat(y[1]);
				sum+=p1*p2;
			}else{
				float p1=Float.parseFloat(y[0]);
				sum+=p1;
			}
		}
		System.out.println(Math.round(sum));
	}
}