
public class Conta {

    private String Titular;
    private double Saldo;
    private String NumeroConta;
    private int NumeroAgencia;
    private String DataAbertura;
    public double Bonificacao;

    Conta(String Titular, String NumeroConta, int NumeroAgencia, String DataAbertura){
        this.Titular = Titular;
        this.NumeroConta = NumeroConta;
        this.NumeroAgencia = NumeroAgencia;
        this.DataAbertura = DataAbertura;
        this.Saldo = 0;

    }

    public void setBonificacao(double bonificacao) {
        bonificacao += bonificacao * 0.1;
        this.Bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return Bonificacao + this.Saldo;
    }

    public void setTitular(String titular){
        this.Titular = titular;
    }

    public String getTitular() {
        return Titular;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setNumeroConta(String Numero){
        this.NumeroConta = Numero;
    }

    public String getNumeroConta(){
        return NumeroConta;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        NumeroAgencia = numeroAgencia;
    }

    public int getNumeroAgencia() {
        return NumeroAgencia;
    }

    public void setDataAbertura(String Data){
        this.DataAbertura = Data;
    }

    public String getDataAbertura(){
        return DataAbertura;
    }

    boolean Transfere(Conta Destino, double Valor){

        if(Saldo < Valor){
            System.out.println("Saldo Insuficiente :(");
            return false;
        }else{
            Saldo -= Valor;
            Destino.Saldo += Valor;
            System.out.println("Transferencia Realizada Com Sucesso!");
            return true;
        }


    }


     boolean Deposita(Conta Destino, double valor){
        Destino.Saldo += valor;
        System.out.println("Deposito Realizado Com Sucesso!");
        return true;

    }

    boolean Saca(double valor) {

        if (this.Saldo < valor) {
            System.out.println("Saldo Inferior");
            return false;
        } else {
            this.Saldo -= valor;
            System.out.println("Saque Realizado Com Sucesso!");
            return true;
        }

    }

}
