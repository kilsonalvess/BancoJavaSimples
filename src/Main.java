import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {


            System.out.println("--------------Banco do Brasil-----------------");
            System.out.println("1- Exibir dados da conta ");
            System.out.println("2- Deposito em conta");
            System.out.println("-------------------------------");

            Corrente meusdados = new Corrente();

            meusdados.nome = "Kilson";
            meusdados.cpf = "08417606408";
            meusdados.numero_da_conta = 856;
            meusdados.saldo = 0;





            Scanner leitura = new Scanner(System.in);
            int opcao = leitura.nextInt();


            if (opcao == 1) {
                meusdados.Exibir_dados_da_conta();
            }


            else if(opcao == 2) {

                System.out.println("Digite o valor do deposito: ");
                Scanner entrada = new Scanner(System.in);
                double valor = entrada.nextDouble();
                meusdados.saldo += valor;

                meusdados.Exibir_dados_da_conta();
                break;


            }





        }


    }














    }
