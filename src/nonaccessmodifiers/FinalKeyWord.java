package nonaccessmodifiers;

public class FinalKeyWord {

	public static void main(String[] args) {

	}
}

class RBI {
	static final float ROI = 3.5F;// you can't modify value --- constant variable
	static final float SN_ROI = 4.0F; // when you declare final variable you must have to assign value or
	static final int MIN_BAL = 5000;
	// you must have to assign value using constructor
	// by convention -> final variable should be in Capital

	// if i have 50 instance of RBI , how many copies of ROI will be created?50

	// after static - if i have 50 instance of RBI , how many copies of ROI will be
	// created?50
	final int MAX_AMOUNT;

	RBI() {
		this.MAX_AMOUNT = 5000;
	}

	void add() {
		System.out.println(ROI);
//		ROI=90;   //compilation error 
	}

	void sub() {
		final int SUB_AMOUNT = 10; // final local
		// wid ==> balance - amt

	}

	// wid - minbal 1000
	// api - minbal 1000
	// method local inner class
	void click() {
		int jk = 90;// local
		class MouseClick {
			int k;// instance

			void abc() {
				// jk
				// System.out.println(jk);
			}
		}
		class KeyBoardClick {
			int j;// instnace

			//
		}
		jk = 9000;
		class AAAA {
			void add() {
//				System.out.println(jk);
			}
		}
	}

}
