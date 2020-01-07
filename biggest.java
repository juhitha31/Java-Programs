import java.util.Scanner;
class biggest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("the biggest num is "+a);
			}
			else{
				System.out.println("the biggest is "+c);
			}
		}
		else if(b>c){
			System.out.println("the biggest is "+b);
		}
		else{
			System.out.println("the biggest is "+c);
		}
	}
}			
