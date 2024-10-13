package ex2;

public class MotDico {
    private static int compteur = 0;
    private int num;
    private String mot;
    private String definition;

    public MotDico(String mot, String definition) {
        this.num = ++compteur;
        this.mot = mot;
        this.definition = definition;
    }

    public String getMot() {
        return mot;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public boolean synonyme(MotDico m) {
        return this.mot.equalsIgnoreCase(m.getMot());
    }
}
