package nonaccessmodifiers;

//class 
strictfp public class StrictFpDemo {

	float x = 9.9f; // IEEE 754

	public static void main(String[] args) {
		// ASCI unicode
	}
}

class EarthQ {
	// IEEE 754
	strictfp void scale() {
		float x = 9.9f;
	}

	// os-computer -- default
	void deScale() {
		float x = 9.9f;
	}
}
