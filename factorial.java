import java.util.Scanner;
class factorial{
	public static void main(String args[]){
		int i,pro=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++){
			pro=pro*i;
		}
	System.out.println(pro);
	}
}
