
public class KorrutamineJagamine {

	public static void main(String[] args) {
		// 1. Kahe muutuja korrutamine, jagamine (võib proovida liitmist ja
		// lahutamist
		int a = 8;
		int b = 4;
		int c = a % 2; // jääk a jagamisel
		boolean isEven = c == 0;
		boolean isOdd = !isEven;
		System.out.println(isOdd);

		// a suurem kui 10
		boolean overTen = a > 10;
		boolean underHundred = a <= 100;
		if (overTen) {
			System.out.println("is over Ten");
		} else {
			System.out.println("is not Ten");

		}
		// tingimus, et a suurem kui 10, aga väiksem kui 100
		// AND && - on üks ja teine.
		// OR || - on üks või teine.
		boolean over10AndUnder100 = overTen && underHundred;
		System.out.println("a üle 10 ja alla 100: " + over10AndUnder100);
	}
}
