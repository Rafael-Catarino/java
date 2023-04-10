import java.util.function.Function;

public class Filme{
  private String titulo;
  private int ano;
  private String diretor;
  /* private String imagem; */
  private String descricao;

  public Filme(String titulo, String diretor, String descricao) {
    this.titulo = titulo;
    /* this.ano = ano; */
    this.diretor = diretor;
    this.descricao = descricao;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.diretor;
  }

  public void setDiretor(String diretor){
    this.diretor = diretor;
  }

  public String getDiretor() {
    return this.diretor;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public int getAno() {
    return this.ano;
  }

  
}

