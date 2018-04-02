/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

/*
 What were the errors you found?
 
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = ftoc(tempf);
		System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf) {
	      double tempc = (tempf - 32) * 5 / 9;
	      return tempc;
    }
}