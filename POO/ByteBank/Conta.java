class Conta {
  double saldo;
  int agencia;
  int numero;
  String titular;

  public void deposita(double valor) {
    this.saldo = this.saldo + valor;
  }

  public String saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo = this.saldo - valor;
      return "Saque efetuado com sucesso.";
    } else {
      return "Sua conta não tem saldo suficiente.";
    }
  }

  public boolean transfere(double valor, Conta destino) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      destino.deposita(valor);
      return true;
    }
    return false;
  }
}

