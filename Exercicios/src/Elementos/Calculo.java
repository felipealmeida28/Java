package Elementos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Calculo {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Digite o Primeiro Numero:");
            float numero1 = Float.parseFloat(teclado.readLine());
            System.out.println("Digite o Segundo Numero:");
            float numero2 = Float.parseFloat(teclado.readLine());

            float Soma = numero1 + numero2;
            float Subtracao = numero1 - numero2;
            float Multiplicacao = numero1 * numero2;
            float Divisao = numero1 / numero2;
            float Resto = numero1 % numero2;

            System.out.println("O resulta e :\n"
                    + "Soma:" + Soma + " Resto:" + Resto + " Multiplicacao:" + Multiplicacao
                    + " Divisao:" + Divisao + " Resto da Divisao:" + Subtracao);







        } catch (IOException ex) {
            Logger.getLogger(Calculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
