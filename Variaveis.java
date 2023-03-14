
public class Variaveis {
	
	public static void main(String[] args) {
		
		int idade, soma; /*Declarando uma variavel como inteira*/
		
		idade = 29;
		System.out.println(idade);
		
		soma = idade + 20;
		System.out.println(soma);
		
		System.out.println("A idade e " + idade );
		
		System.out.println(soma / idade);
		
		/*Declarando variaveis como Real*/
		double num1, num2, sum; //O double tem uma precisão maior que o float
		float num3;//O float tem uma precisão menor que o double.
		
		num1 = 65832.5647352839476256;
		System.out.println(num1);
		
		num2 = 5.9;
		System.out.println(num2);
		
		sum = num1 + num2;
		System.out.println("A soma é " + sum);
		
		System.out.println(num1 * num2);
		
		num3 = 6.8983645f;
		
		System.out.println(num3);
		
	}

}
