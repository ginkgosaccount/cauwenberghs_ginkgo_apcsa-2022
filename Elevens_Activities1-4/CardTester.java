/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card first = new Card("1","spades",1);
		Card second = new Card("2","hearts",2);
		Card third = new Card("ace","diamonds",11);

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
