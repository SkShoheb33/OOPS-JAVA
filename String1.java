import java.util.Scanner;
class String1{
	boolean check(String str1,String str2){
		boolean flag;
		int count = 0;
		if(str1.length()!=str2.length()){
			flag = false;
		}else{
			for(int i = 0; i< str1.length();i++){
				if(str1.charAt(i)==str2.charAt(i)){
					count+=1;
				}
			}
		}
		flag = (count==str1.length())?true:false;
		return flag;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String1 str = new String1();
		System.out.print("Enter the first string : ");
		String str1 = scan.next();
		System.out.print("Enter the second string : ");
		String str2 = scan.next();
		if(str.check(str1,str2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}