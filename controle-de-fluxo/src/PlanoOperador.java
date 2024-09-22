
public class PlanoOperador {
    
    public static void main(String[] args) {
        
        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
            /*Se optarem por usar switch / case, estudem um pouco mais sobre os conceitos de continue,
             break e default */
			 //neste caso não utilizamos o break e agora podemos pegar mais informações de cada caso
    }
    
  }
}
