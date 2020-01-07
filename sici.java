import java.util.Scanner;
import java.lang.Math;
class sici{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int p1,a;
		float r1;
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		System.out.println("simple intrest is "+((p*t*r)/100));
		int n=sc.nextInt();
		p1=n*t;
		r1=r/n;
		a=p*((int)Math.pow((int)(1+r1),p));
		System.out.println("coumpound intrest is "+a);
	}
}
		
