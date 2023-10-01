//Factorial
//import java.utils.*;
public class VIKASH {
	public static int fact(int n){
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		
		int t=4;
		if(t<0)
			System.out.println("Number can't ne negative ");
		System.out.println("Factorial of " + t + " is : " + fact(t));
	}
	
}
