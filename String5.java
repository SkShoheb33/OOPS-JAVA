import java.util.Scanner;
class String5{
	void replace(String str,char ch1, char ch2){
		String result="";
		for (int i =0;i<str.length();i++){
			if(str.charAt(i)==ch1){
				result += ch2;
			}else{
				result+=str.charAt(i);
			}
		}
		System.out.println("Replaced String : "+result);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String5 obj = new String5();
		System.out.print("Enter the string : ");
		String str = scan.next();
		System.out.print("Enter the character to be replace : ");
		char ch1 = scan.next().charAt(0);
		System.out.print("Enter the character to replace : ");
		char ch2  = scan.next().charAt(0);
		obj.replace(str,ch1,ch2);
	}
}