public class Corrente {

    String nome;

    String cpf;

    double numero_da_conta;

    double saldo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(double numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public double getSaldo() {
        return  saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void Exibir_dados_da_conta (){

        System.out.println("-----------------------------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Conta: "+numero_da_conta);
        System.out.println("Saldo: "+saldo);
        System.out.println("-----------------------------------------------------");



    }

    ///public double Adicionar_Dinheiro(){

       /// return  setSaldo(saldo);


    //}



}
