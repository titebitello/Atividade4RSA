package atividade4;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        float valor1 = 0;
        float valor2 = 0;
        float valor3 = 0;
        float valor4 = 0;
        float valor5 = 0;
        float valor6 = 0;
        int e = 55;
        int d = 0;
        int n = 0;
        int p = 0;
        int q = 0;
        int z = 0;
        int resultado = 0;
        
        Scanner scn = new Scanner(System.in); //Declarando o scanner, e falando que é do tipo in
        System.out.println("Digite o primeiro primo: ");
        p = scn.nextInt();
        System.out.println("Digite o segundo primo: ");
        q = scn.nextInt();
        n = p * q;
        
        z = (p - 1) * (q - 1);
        
        while (resultado != 1){
            d++;
            resultado = (e * d) % z;
        }
        
        valor1 = (float) (pow(44, d) % n);
        valor2 = (float) (pow(52, d) % n);
        valor3 = (float) (pow(81, d) % n);
        
        valor4 = (float) ((pow(39, e)) % n);
        valor5 = (float) (pow(18, e) % n);     
        valor6 = (float) (pow(21, e) % n);
        
        System.out.println();
        System.out.println("Chave Pública = (" + n + ", " + e + ")");
        System.out.println("Chave Privada = (" + n + ", " + d + ")");
        System.out.println();
        System.out.println("n = " + n);
        System.out.println("z = " + z);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println();
        System.out.println("Decodificação");
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println();
        System.out.println("Codificação");
        System.out.println(valor4);
        System.out.println(valor5);
        System.out.println(valor6);
        
        System.out.println("2 elevado ao cubo = " + Math.pow(39, 55) % 85);
    }
}