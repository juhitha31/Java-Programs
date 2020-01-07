import java.util.Scanner;
class mmm{
	public static void main(String args[]){
		int i,temp,sum=0,med,min,mode,mean,j;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			int x=sc.nextInt();
			a[i]=x;
			sum=sum+x;
		}
		mean=sum/n;
		System.out.println("mean is "+mean);
		for(i=0;i<n;i++){
			min=i;
			for(j=i+1;j<n;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		if(n%2==0){
			med=(a[n/2]+a[n/2-1])/2;
		}
		else{
			med=a[(n-1)/2];
		}
		System.out.println("median is "+med);
		mode=(3*med)-(2*mean);
		System.out.println("mode is "+mode);
	}
}
		
