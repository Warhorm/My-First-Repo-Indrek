
public class KorrutamineJagamine {

	public static void main(String[] args) {
		// 1. Kahe muutuja korrutamine, jagamine (v�ib proovida liitmist ja
		// lahutamist
		int a = 8;
		int b = 4;
		int c = a % 2; // j��k a jagamisel
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
		// tingimus, et a suurem kui 10, aga v�iksem kui 100
		// AND && - on �ks ja teine.
		// OR || - on �ks v�i teine.
		boolean over10AndUnder100 = overTen && underHundred;
		System.out.println("a �le 10 ja alla 100: " + over10AndUnder100);
	}
}
