public class SmartTV {

    boolean ligada= false;
    int volume= 25;

    int canal = 1;

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }

    public void aumentarCanal(){
        canal++;
            System.out.println("O canal mudou para o " + canal);
    }

    public void diminuirCanal(){
        canal--;
            System.out.println("O canal mudou para o " + canal);

    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }
    public void diminuirVolume(){
        volume--;

        System.out.println("Diminuindo o volume para " + volume);
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
