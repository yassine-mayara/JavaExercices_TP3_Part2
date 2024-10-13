package ex2;

public class Dictionnaire {
    private MotDico[] dico; 
    private int nbMots;
    private String nom;

    public Dictionnaire(String nom) {
        this.nom = nom;
        this.dico = new MotDico[100]; 
        this.nbMots = 0;
    }

    public MotDico getMotAt(int index) {
        if (index >= 0 && index < nbMots) {
            return dico[index];
        }
        return null;
    }

    public void ajouterMot(MotDico m) {
        if (nbMots < dico.length) {
            dico[nbMots] = m;
            nbMots++;
        } else {
            System.out.println("Dictionnaire plein");
        }
    }

    public void supprimerMot(String ch) {
        int index = chercherMot(ch);
        if (index != -1) {
            for (int i = index; i < nbMots - 1; i++) {
                dico[i] = dico[i + 1];
            }
            dico[nbMots - 1] = null;
            nbMots--;
        } else {
            System.out.println("Mot non trouve");
        }
    }

    public int chercherMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].getMot().equalsIgnoreCase(ch)) {
                return i;
            }
        }
        return -1;
    }

    public void listerDico() {
        if (nbMots == 0) {
            System.out.println("Le dictionnaire est vide");
        } else {
            for (int i = 0; i < nbMots; i++) {
                System.out.println("Mot: " + dico[i].getMot() + " | Def: " + dico[i].getDefinition());
            }
        }
    }

    public int nbSynonymes(MotDico m) {
        int count = 0;
        for (int i = 0; i < nbMots; i++) {
            if (m.synonyme(dico[i])) {
                count++;
            }
        }
        return count;
    }
}
