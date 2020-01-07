import java.util.Scanner;
class methods{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("length of string is "+str.length());
		System.out.println("index of a is "+str.indexOf('a'));
		System.out.println("character at position 3 is "+str.charAt(3));
		System.out.println("substring is "+str.substring(2,7));
		String s1=sc.nextLine();
		System.out.println("concatination of strings is "+str.concat(s1));
		System.out.println(str.compareTo(s1));
	}
}

