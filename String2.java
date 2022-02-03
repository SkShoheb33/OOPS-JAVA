import java.util.*;
class String2{
	boolean check(String str, char ch){
		if(str.charAt(0) == ch ){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String2 obj = new String2();
		System.out.print("Enter the string : " );
		String str  = scan.next();
		System.out.print("Enter the charecter : ");
		char ch = scan.next().charAt(0);
		if(obj.check(str,ch))
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}