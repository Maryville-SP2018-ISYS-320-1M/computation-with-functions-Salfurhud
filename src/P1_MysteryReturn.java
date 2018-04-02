/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):

1. 2 0
2. 1 2 4
3. 3 3
4. 5 2 4
5. 7 1
6. 5 9 4
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 Yes, I was correct.
 
 */
public class P1_MysteryReturn {
	
	public static void main(String[] args) { 
		
		int x = 1, y = 2, z  = 3; 
	
		z = mystery( x, z, y); 
		
		System.out.println( x + " " + y + " " + z); 
		
		x = mystery( z, z, x); 
		
		System.out.println( x + " " + y + " " + z); 
		
		y = mystery( y, y, z); 
		
		System.out.println( x + " " + y + " " + z); 
	} 
	
	public static int mystery( int z, int x, int y) { 
		
		z--;
		
		x = 2 * y + z; 
		
		y = x - 2; 
		
		System.out.println(y + " " + z ); 

		return x; 
	} 
}