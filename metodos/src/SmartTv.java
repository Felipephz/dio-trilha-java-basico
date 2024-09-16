public class SmartTv {
    
    int volume = 25;
    int canal = 1;
    boolean ligada = false;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }
}
