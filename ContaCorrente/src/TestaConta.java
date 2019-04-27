public class TestaConta{


    public static void main(String[]args){
        Conta c1 = new Conta("Felipe Almeida", "9112777", 128881,"28/10/2000");
        Conta c2 = new Conta("Felipe Almeida", "9112777", 128881,"28/10/2000");
        System.out.println("Salario Antigo: " + c1.getSaldo());
        c1.setSaldo(9000);
        c1.Deposita(c1,101);
        c1.Transfere(c2, 9100);

        System.out.println(c1.getSaldo());

        c1.Saca(2);

        System.out.println(c1.getSaldo());


    }
}






