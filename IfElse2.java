public class IfElse2 {
	public static void main(String[] args) {
		System.out.println("Olá mundo!!");
		int idade = 19;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas <= 2;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!!");
		} else {
			System.out.println("Infelismente Você não pode entrar.");
		}
	}
}
