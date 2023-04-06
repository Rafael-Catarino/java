public class ex11BrincandoAteristico {
	public static void main(String[] args) {
		for (int linha = 1; linha <= 10; linha++) {
			System.out.print(linha);
			for (int coluna = 1; coluna <= 10; coluna++) {

				if (linha == 1) {
					if (linha == 1 && coluna == 3) {
						System.out.print("*");
					} else if (linha == 1 && coluna == 4) {
						System.out.print(" *");
					} else if (linha == 1 && coluna == 7) {
						System.out.print(" *");
					} else if (linha == 1 && coluna == 8) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}
				if (linha == 2) {
					if (linha == 2 && coluna == 2) {
						System.out.print(" *");
					} else if (linha == 2 && coluna == 3) {
						System.out.print(" *");
					} else if (linha == 2 && coluna == 4) {
						System.out.print(" *");
					} else if (linha == 2 && coluna == 6) {
						System.out.print(" *");
					} else if (linha == 2 && coluna == 7) {
						System.out.print(" *");
					} else if (linha == 2 && coluna == 8) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}
				if (linha == 3) {
					if (linha == 3 && coluna == 10) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				}
				if (linha == 4) {
					if ((linha == 4 && coluna == 10) || (linha == 4 && coluna == 9) || (linha == 4 && coluna == 1)) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				}
				if (linha == 5) {
					if ((linha == 4 && coluna == 10) || (linha == 4 && coluna == 9) || (linha == 4 && coluna == 1)) {
						System.out.print("  ");
					} else {
						System.out.print(" *");
					}
				}

			}
			System.out.println();
		}
	}
}

