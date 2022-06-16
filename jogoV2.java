import java.util.Random;
public class jogoV2 {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem(10, 0, 0);
        Personagem soneca = new Personagem(2, 4, 9);

        soneca.nome = "Soneca";
        Random gerador = new Random();
        while (true) {
            int oQueFazer = gerador.nextInt(5) + 1;

            switch (oQueFazer) {
                case 1:
                    soneca.dormir();
                    break;
                case 2:
                    soneca.dormir();
                    break;
                case 3:
                    soneca.dormir();
                    break;
                case 4:
                    soneca.cacar();
                    break;
                case 5:
                    soneca.comer();
                    break;
            }
            System.out.printf("Energia: %d, Fome: %d, Sono: %d\n", soneca.getEnergia(), soneca.fome, soneca.sono);
            System.out.println("==============================================================");
            Thread.sleep(3000);
        }


    }
}