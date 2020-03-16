
public class fournumbers {

	public static void main(String[] args) {
	  int num1 = Integer.parseInt(args[0]);
	  int num2 = Integer.parseInt(args[1]);
	  int d1 = num1%10 ;
	  int d2 = num1/10 ;
	  int d3 = num2%10 ;
	  int d4 = num2/10 ;
	  int sum = d1+d2+d3+d4 ;
	  System.out.println(sum );
	}

}
