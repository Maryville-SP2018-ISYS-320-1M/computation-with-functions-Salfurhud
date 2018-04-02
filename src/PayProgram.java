/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class PayProgram {

	public static void main(String[] args) {
		
		double salary = computePay(4, 11);
		System.out.println(salary);
	}

	public static double computePay( double salary, double numOfHours ) {
		if(numOfHours > 8) {
			return (8 * salary) + ( (1.5 * salary) * ( numOfHours - 8 ) );
		} else {
			return salary * numOfHours;
		}
	}
}