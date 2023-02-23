package Terminal.src;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome");
            String nome =scanner.next();

        System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

        System.out.println("Qual a sua idade?");
            int idade = scanner.nextInt();

        System.out.println("Qual a sua Altura?");
            double altura = scanner.nextDouble();


        System.out.println("Olá meu nome é " + nome + sobrenome);
        System.out.println("tenho " + idade +"anos" );
        System.out.println("tenho "+ altura + " de altura"+ "cm");
    }
}