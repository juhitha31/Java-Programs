import java.util.Scanner;
class fibonacci{
	public static void main(String args[]){
		int a=0,b=1,i,s=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<n;i++){
			System.out.println(a);
			s=a+b;
			a=b;
			b=s;
		}
	}
}
