import java.util.Scanner;


public class ProgramaFilme {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o titulo do filme: ");
    String titulo = sc.next();
    
    System.out.println("Digite o nome do diretor: ");
    String diretor = sc.next();

    /* System.out.println("Digite o ano do filme: ");
    int ano = sc.nextInt(); */

    System.out.println("Digite a descricao: ");
    String descricao = sc.next();

    Filme f1 = new Filme(titulo, diretor, descricao);

    System.out.println(f1.getTitulo() + "\n" + f1.getDescricao() + "\n" + f1.getDiretor());
    sc.close();
  }
}
