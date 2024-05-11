package Vue;

class Personnalite {
    private final int numP;
    private final String nomP;
    private final String prenomP;
    private final String fonction;
    private final String domaineInteret;
    private final String adresseP;
    private final String emailP;

    public Personnalite(int numP, String nomP, String prenomP, String fonction, String domaineInteret, String adresseP, String emailP) {
        this.numP = numP;
        this.nomP = nomP;
        this.prenomP = prenomP;
        this.fonction = fonction;
        this.domaineInteret = domaineInteret;
        this.adresseP = adresseP;
        this.emailP = emailP;
    }
}