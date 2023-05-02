import java.util.Scanner;

public class TreinandoOqueJaAprendi {
    public static void main(String[] args){
        String nome = "Rafael dos Santos Catarino";
        String tipoConta = "Corrente";
        float saldo = 2500, valor, valorTrans;
        int resp;

        System.out.println("""
                ********************************************
                Dados iniciais do cliente:
                
                Nome:...........: %s
                Tipo conta:.....: %s
                Saldo inicial:..:R$ %.2f
                ********************************************
                """.formatted(nome, tipoConta, saldo));

        do {
            Scanner conta = new Scanner(System.in);
            System.out.println("""
                    Operações:
                                        
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferencio de valor
                    4- Sair
                                        
                    Digite a opção desejada:
                    """);
            resp = conta.nextInt();

            switch (resp){
                case 1:
                    System.out.println("O seu saldo é: %.2f ".formatted(saldo));
                    break;

                case 2:
                    System.out.println("Informe o valor a receber:");
                    valor = conta.nextFloat();
                    saldo = saldo + valor;
                    System.out.println("Saldo atualizado R$ %.2f".formatted(saldo));
                    break;

                case 3:
                    System.out.println("Informe o valor da transferencia:");
                    valorTrans = conta.nextFloat();
                    if (valorTrans < saldo && valorTrans > 0) {
                        saldo = saldo - valorTrans;
                        System.out.println("""
                                Valor transferido com sucesso.
                                Novo saldo: %.2f
                                """.formatted(saldo));
                    } else if (valorTrans > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor invalido");
                    }

                case 4:
                    break;

                default:
                    System.out.println("Numero invalido, favor digitar uma das opções.");
            }

        } while (resp != 4);

        System.out.println(resp);
    }
}
