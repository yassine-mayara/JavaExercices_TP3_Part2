package ex2;

public class Main {
    public static void main(String[] args) {
        Dictionnaire larousse = new Dictionnaire("Larousse");

        MotDico mot1 = new MotDico("Arbre", "Plante avec un tronc et des branches");
        MotDico mot2 = new MotDico("Voiture", "Vehicule motorise à quatre roues");
        MotDico mot3 = new MotDico("Maison", "Batiment ou on habite");

        larousse.ajouterMot(mot1);
        larousse.ajouterMot(mot2);
        larousse.ajouterMot(mot3);

        System.out.println("Contenu du dictionnaire :");
        larousse.listerDico();

        String motInexistant = "Chien";
        int indexInexistant = larousse.chercherMot(motInexistant);
        if (indexInexistant == -1) {
            System.out.println("Le mot '" + motInexistant + "' n'existe pas");
        }

        String motExistant = "Voiture";
        int indexExistant = larousse.chercherMot(motExistant);
        if (indexExistant != -1) {
            MotDico foundMot = larousse.getMotAt(indexExistant);
            System.out.println("Mot trouve : " + foundMot.getMot() + " | Def : " + foundMot.getDefinition());
        }

        int nbSynonymes = larousse.nbSynonymes(mot2);
        System.out.println("Nombre de synonymes de 'Voiture' : " + nbSynonymes);

        larousse.supprimerMot("Voiture");

        System.out.println("Apres suppression :");
        larousse.listerDico();
    }
}
