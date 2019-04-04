package br.com.digitalhouse;

public class Exercicio1 {
    public static boolean verificarMenor(Integer num1, Integer num2) {
        return num1 < num2 ;
    }

    public static void main(String[] args) {
        System.out.println(verificarMenor(2, 5));

        if (2 < 5) {
            System.out.println(true);
        } else {
            if (2 >5) {
                System.out.println(false);
            }
        }
    }
}
