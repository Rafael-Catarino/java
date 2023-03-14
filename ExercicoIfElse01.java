public class ExercicoIfElse01 {
	public static void main(String[] args) {
		System.out.println("Vasco");
		double salario = 4665.0;
		
		if(salario < 1900.0) {
			System.out.println("Isento");
		} else if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else if (salario > 2800.0 && salario <= 3751.0) {
			System.out.println("O IR é de 15% e pode deduzir R$ 350");
		} else if (salario > 3751.0 && salario <= 4664.0) {
			System.out.println("O IR é de 22.5% e pode deduzir R$ 636");
		} else {
			System.out.println("O IR é de 27.5% e pode deduzir R$ 869.36");
		}
	}
}
