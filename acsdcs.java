import java.util.Scanner;
class acsdcs{
	public static void main(String args[]){
		int i,j,min,k;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		String temp;
		for(i=0;i<n;i++){
			String st=sc.nextLine();
			a[i]=st;
		}
			for(i=0;i<n;i++){
			min=i;
			for(j=i+1;j<n;j++){
				if(a[j].compareTo(a[min])<0){
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
