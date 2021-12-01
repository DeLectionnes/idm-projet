import java.util.ArrayList;

public class Dora {
    private String name;
    private Integer maxSize;
    private Integer currentSize;
    private ArrayList<Tentative> tentatives;
    private ArrayList<Reussite> knowlegde;

    public Dora() {
        this.name = "Dora";
        this.maxSize = 3;
        this.tentatives = new ArrayList<Tentative>();
        this.tentatives.add(new Tentative());
        this.tentatives.add(new Tentative());
        this.tentatives.add(new Tentative());
        this.currentSize = constructSize(tentatives);
        this.knowlegde = new ArrayList<Reussite>();
    }

    public void addTentative(Tentative tentative) {
        if (tentative.getSize() <= maxSize) {
            this.tentatives.add(tentative);
        } else {
            System.out.println("L'Tentative est perdu");
        }
    }

    public void addKnowledge(Reussite knowledge) {
        this.knowlegde.add(knowledge);
    }

    public Integer getTentativesNumber() {
        return this.tentatives.size();
    }

    public void removeTentative() {
        Tentative t = this.tentatives.remove(0);
        if (t != null) {
            this.currentSize -= t.getSize();
        }
    }

    private Integer constructSize(ArrayList<Tentative> tentativesInit) {
        Integer size = 0;
        for (Tentative p : tentativesInit) {
            size += p.getSize();
        }
        return size;
    }

}
