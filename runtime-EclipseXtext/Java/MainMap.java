import java.io.IOException;
import java.util.Scanner;

public class MainMap {
    public static void main(String[] args) {
        Dora dora = new Dora();
        Sphinx sx = new Sphinx();
        boolean continuer = true;
        new Enigme();
        while (continuer) {
            sx.printText();
            sx.printAnswers();
            System.out.print("Rentrer votre numéro de réponse : ");
            Scanner sc = new Scanner(System.in);
            int answer = Integer.parseInt(sc.nextLine());
            dora.removeTentative();
            if (sx.verifyAnswer(answer)) {
                new Succes();
                dora.addKnowledge(new Reussite());
                System.out.println("Vous savez que vous avez réussi");
                continuer = false;
            } else if (dora.getTentativesNumber() == 0) {
                new Echec();
                continuer = false;
            } else {
                System.out.println("Essaie encore");
                System.out.println("Il te reste " + dora.getTentativesNumber() + " Tentative(s)");

            }
        }
    }
}