import java.util.Scanner;

public class multipleofhundred {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int result = ((num + 99) /100) * 100 ;
		System.out.println("The require number " + result);

	}

}
