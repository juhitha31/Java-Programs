import java.util.Scanner;
class reversearray{
	public static void main(String args[]){
		int i,temp;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			int x=sc.nextInt();
			a[i]=x;
		}
		for(i=0;i<n/2;i++){
			temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}

			
