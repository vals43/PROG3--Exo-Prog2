package Prog3.exo;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Grades {
    /*Les notes pour un étudiant à un examen donné,
     avec une valeur initiale,
     et un
    historique des changements de la valeur, datée à l'heure près.
     On veut à chaque changement donner le motif avec une petite phrase ; */

    private final double initialValue;
    private final Instant initial;
    private final List<GradeChange> history = new ArrayList<>();

    public Grades(double initialValue, Instant initialTimestamp) {
        this.initialValue = initialValue;
        this.initial = initialTimestamp;
    }

    public void addChange(double newValue, Instant when, String reason) {
        history.add(new GradeChange(newValue, when, reason));
    }

    public double valueAt(Instant t) {
        if (t.isBefore(initial)) return initialValue;
        double current = initialValue;
        return history.stream()
                .filter(c -> !c.getTimestamp().isAfter(t))
                .sorted(Comparator.comparing(GradeChange::getTimestamp))
                .map(GradeChange::getValue)
                .reduce(current, (prev, val) -> val);
    }

    public double getInitialValue() { return initialValue; }
    public Instant getInitial() { return initial; }
    public List<GradeChange> getHistory() {
        return Collections.list((java.util.Enumeration<GradeChange>) history);
    }
}



