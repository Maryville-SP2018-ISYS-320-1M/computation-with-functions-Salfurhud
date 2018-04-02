/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class P6_Scientific {

	public static void main(String[] args) {
		// REMINDER: Any print statements should only be in the main method
		double ans = computeScientificValue(6.5, 3);
		
		System.out.println(ans);
	}

	public static double computeScientificValue(double base, double base10Exponent ) {
		return base * Math.pow(10, base10Exponent);
	}
}