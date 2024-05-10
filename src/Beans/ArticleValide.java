/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author dell
 */
public class ArticleValide {

    private String titre, domaine, theme, contenu;
    private int code, numerorevue;

    public ArticleValide() {
    }

    public ArticleValide(String titre, String domaine, String theme, String contenu, int code, int numerorevue) {
        this.titre = titre;
        this.domaine = domaine;
        this.theme = theme;
        this.contenu = contenu;
        this.code = code;
        this.numerorevue = numerorevue;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public int getNumerorevue() {
        return numerorevue;
    }

    public void setNumerorevue(int numerorevue) {
        this.numerorevue = numerorevue;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTitre() {
        return titre;
    }

}
