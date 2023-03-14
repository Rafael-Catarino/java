
public class Tabuada2A1000 {
	public static void main(String[] args) {
		for(int num = 2; num <= 100; num++) {
			for(int mult = 1; mult <= 10; mult++ ) {
				System.out.print(mult + " x " + num + " = " + num * mult + " / ");
			}
			System.out.println("");
		}
	}
}
