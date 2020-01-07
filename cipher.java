import java.util.Scanner;
class cipher{
	public static void main(String args[]){
		int i;
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str=str1.toUpperCase();
		int key=sc.nextInt();
		for(i=0;i<str.length();i++){
				if((char)(str.charAt(i)+key)>'Z'){
					System.out.print((char)('A'+(char)((str.charAt(i)+key)-'Z'-1)));
				}
				else{
					System.out.print((char)((str.charAt(i)+key)));
				}
		}
	}
}

