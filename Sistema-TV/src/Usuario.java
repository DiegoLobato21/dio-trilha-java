public class Usuario {

    public static void main(String[]args){
        SmartTV smartTv = new SmartTV();

            System.out.println("a tv esta ligada? " + smartTv.ligada);

            System.out.println("Qual o volume da tv ? " + smartTv.volume);

            System.out.println(" Qual o canal que a tv esta? " + smartTv.canal) ;



        smartTv.ligar();

            System.out.println( "A tv continua ligada? "+ smartTv.ligada );

        smartTv.desligar();

            System.out.println("a tv continua desligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.mudarCanal(30);
            System.out.println("O canal mudou para " + smartTv.canal);
    }
}
