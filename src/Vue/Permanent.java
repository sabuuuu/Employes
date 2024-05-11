
package Vue;

import Vue.Interview;

import java.util.List;

public class Permanent extends Journaliste {
    private List<Interview> interviews;

    public void ajouterInterview(Interview interview) {
        interviews.add(interview);
    }
}