import java.util.Scanner;
class String3{
	int locate(String str , char ch){
		int i;	
		for(i =0; i<str.length();i++){
			if ( str.charAt(i) == ch){
				return i;
			}
		}
			return -1;
	}
	boolean find(String str ,char ch){
		int i;
		for(i =0;i<str.length();i++){
			if (str.charAt(i) == ch){
				return true;
			}
		}
			return false;
	}
	void locate(String str1,String str2){
		int i ;
		for(i=0;i<=str1.length() -str2.length();i++){
			if(str1.substring(i,i+str2.length()).equals(str2)){
				System.out.println("The substring present at : "+i);
				break;
			}
		}
		if (i==str1.length() -str2.length()+1){
			System.out.println("Sorry ! The substring you entered is not present ");
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String3 obj = new String3();
		System.out.print("Enter the string : ");
		String str = scan.next();
		System.out.print("Enter the character : ");
		char ch1 = scan.next().charAt(0);
		System.out.print("Enter the character to find : ");
		char ch2 = scan.next().charAt(0);
		System.out.print("Enter the substring : ");	
		String substr = scan.next();
		if(obj.locate(str,ch1)!=-1)
			System.out.println("The character" +ch1+ "is located at index : "+obj.locate(str,ch1));
		else
			System.out.println("Sorry ! The character you entered is not present ");
		if (obj.find(str,ch2))
			System.out.println("Yes the character is present");
		else
			System.out.println("Sorry ! The character you entered is not present ");
		obj.locate(str,substr);
	}
}