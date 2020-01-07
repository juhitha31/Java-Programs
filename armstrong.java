import java.util.Scanner;
import java.lang.Math;
class armstrong{
	public static void main(String args[]){
		int t,n1;
		int r,c=0,n2=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		t=n;
		n1=n;
		while(n!=0){	
			n=n/10;
			c=c+1;
		}
		while(t!=0){
			r=t%10;
			t=t/10;
			n2=n2+(int)Math.pow(r,c);
			System.out.println(r);
		}
		if(n2==n1){
			System.out.println("armstrong num");
		}		
		else{
			System.out.println(n2);
		}
	}
}
