import java.util.Scanner;
class duplicate{
	public static void main(String args[]){
		int i,j,k=0,k1=0,c;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++){
			int x=sc.nextInt();
			a[i]=x;
			for(j=0;j<=i;j++){
				c=0;
				for(k=0;k<=k1;k++){
					if(x==b[k]){
						c=1;
						break;
					}
				} 
				if(c!=1){
					for(k=0;k<i;k++){
						if(x==a[k]){
							b[k1]=x;
							k1++;
							break;
						}
					}
				}
			}		
		}
		System.out.println("\n");
		for(i=0;i<k1;i++){
			System.out.println(b[i]);
		}
	}
}
