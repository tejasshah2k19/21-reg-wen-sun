package constructor;

public class StaticInstanceBlock {

	public static void main(String[] args) {

		// Player p1 = new Player();
		// Player p2 = new Player();
//		System.out.println(Player.gameCode);
		System.out.println("hi...");

		//
	}
}

class Player {
	String firstName;
	int numberOfInnings;
	static int gameCode;

	public Player() {
		System.out.println("Player()");
		numberOfInnings = 10;
		firstName = "";
		gameCode = 100;
	}

	// static
	static {
		// some logic
		System.out.println("static-1");
		gameCode = 100;
	}

	// instance
	{
		// some logic
		System.out.println("instance-1");
	}
}
