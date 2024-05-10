 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Journalist;

import java.util.List;

/**
 *
 * @author joe
 */
public class Permanent extends Journaliste {
    private List<Interview> interviews;

    public void ajouterInterview(Interview interview) {
        interviews.add(interview);
    }
}