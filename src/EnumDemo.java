import java.util.Calendar;

public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Drink.SMALL);// SMALL
		System.out.println(Drink.SMALL.value);// 1
		Drink.SMALL.printValue();

		Calendar c = Calendar.getInstance();
		c.get(Calendar.MONTH);
	}

}

enum Drink {
	SMALL(1), LARGE(2), XLARGE(4);
	int value;

	private Drink(int k) {
		this.value = k;
	}

	void printValue() {
		System.out.println(this.value);
	}
}

class JB {

	enum PriceMenu {

	}
}