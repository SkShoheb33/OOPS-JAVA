import java.util.Scanner;
class NegException{
	public static void main(String args[]){
		try{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Size of the array : ");
			int size = scan.nextInt();
			int array[] = new int[size];
			System.out.print("Enter the index : ");
			int i = scan.nextInt();
			System.out.print("Enter the element : ");
			array[i] = scan.nextInt();
			System.out.println("Your entered element : "+array[i]);
		}catch(NegativeArraySizeException e){
			System.out.println("Please enter the positive size. ");
		}
	}
}