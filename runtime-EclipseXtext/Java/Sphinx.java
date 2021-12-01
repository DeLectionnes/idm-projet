import java.util.ArrayList;

public class Sphinx {

    private String name;
    private boolean obligatory;
    private boolean visible;

    public Sphinx() {
        this.name = "Sphinx";
        this.obligatory = true;
        this.visible = true;
    }

    public boolean getObligatory() {
        return obligatory;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public String getName() {
        return name;
    }

    public void printText() {
        System.out.println("J'ai quatre pattes le matin, deux le midi et trois le soir, qui suis-je ?");
    }

    public void printAnswers() {
        System.out.println("1 : Un homme");
        System.out.println("2 : La famille d'évolution de Ramolosse");
        System.out.println("3 : La famille d'évolution de Porygon");
        System.out.println("4 : Réponse fausse quelconque");
    }

    public boolean verifyAnswer(Integer answer) {
        return 0 < answer && answer < 4;
    }

}