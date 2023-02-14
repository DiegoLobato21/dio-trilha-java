public class OperadoresRelacionais {
    public static void main(String[]args){
        String nome ="Diego";
        String nome2 =new String ("Diego");
        System.out.println(nome.equals(nome2));


        int numero1 = 2;
        int numero2= 2;

        boolean comparacao = numero1 == numero2;

        System.out.println("numero um é igual o numero 2? " + comparacao);

        comparacao = numero1 != numero2 ;
            System.out.println("número um é diferente de número 2? " + comparacao);

        comparacao =numero1 >= numero2 ;
            System.out.println("número um é maior ou igual a número 2? "+ comparacao);
    }

}
