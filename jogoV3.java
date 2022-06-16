import java.util.Random;
public class jogoV3 {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem(10, 0, 0);

        cacador.nome = "Cacador";
        Random gerador = new Random();
        while (true) {
            int oQueFazer = gerador.nextInt(5) + 1;

            switch (oQueFazer) {
                case 1:
                    cacador.dormir();
                    break;
                case 2:
                    cacador.cacar();
                    break;
                case 3:
                    cacador.cacar();
                    break;
                case 4:
                    cacador.cacar();
                    break;
                case 5:
                    cacador.comer();
                    break;
            }
            System.out.printf("Energia: %d, Fome: %d, Sono: %d\n", cacador.getEnergia(), cacador.fome, cacador.sono);
            System.out.println("==============================================================");
            Thread.sleep(3000);
        }


    }
}