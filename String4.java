import java.util.Scanner;
class String4{
	String subString(String str,int i ,int j){
		String result ="";
		for(int l = i;l<j;l++){
			result += str.charAt(l);
		}
	return result;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String4 obj = new String4();
		System.out.print("Enter the string : ");
		String str = scan.next();
		System.out.print("Enter the starting index : ");
		int i = scan.nextInt();
		System.out.print("Enter the ending index : ");
		int j = scan.nextInt();
		System.out.println("The sub string : " + obj.subString(str,i,j));
	}
}