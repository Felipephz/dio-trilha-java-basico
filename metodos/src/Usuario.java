public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o volume atual: " + smartTv.volume);
        System.out.println("Qual o canal atual: " + smartTv.canal);

        // funciona com os dois metodos de ligar e desligar
        /* ex:
         * smartTv.desligar();
         * System.out.println("Novo status --> A TV está ligada? " + smartTv.ligada);
         * vai retornar false
         */ 
        smartTv.ligar();
        System.out.println("Novo status --> A TV está ligada? " + smartTv.ligada);
        
        // funciona com os dois metodos tambem de diminuirVolume e aumentarVolume
        /* ex:
         * smartTv.aumentarVolume
         * System.out.printIn("Novo status --> Qual o volume atual: + smartTv.volume")
         * vai retornar (volume + 1)
         * obs : pode ser repetida para diminuir ou aumentar cada vez mais o volume
         */
        smartTv.diminuirVolume();
        System.out.println("Novo status --> Qual o volume atual: " + smartTv.volume);
        
        // funciona com qualquer numero da variavel int
        // caso use aumentarCanal ou diminuirCanal funcionará do msm jeito q o metodo aumentarVolume/diminuirVolume
        smartTv.mudarCanal(13);
        System.out.println("Novo status --> Qual o canal atual: " + smartTv.canal);

    }
}
