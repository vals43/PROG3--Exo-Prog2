package Prog3.exo;


import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveGrades {
    private final Map<Exam, Map<Student, Grades>> notes = new HashMap<>();

    public void setFirstNote(Exam exam, Student student, double value, Instant when) {
        notes.computeIfAbsent(exam, e -> new HashMap<>())
                .put(student, new Grades(value, when));
    }

    public void changeNote(Exam exam, Student student, double newValue, Instant when, String reason) {
        Grades note = getNote(exam, student);
        if (note == null) throw new Error("Pas de premier note");
        note.addChange(newValue, when, reason);
    }

    public Grades getNote(Exam exam, Student student) {
        return notes.getOrDefault(exam, Collections.emptyMap()).get(student);
    }
    public double getExamNote(Exam exam, Student student, Instant t) {
        Grades note = getNote(exam, student);
        if (note == null) throw new Error("Pas de note à : " + exam.getTitle());
        return note.valueAt(t);
    }

    public double getCoursNote(Course cours, Student student, Instant t) {
        List<Exam> exams = cours.getExams();
        int sumCoef = 0;
        double sum = 0.0;
        for (Exam ex : exams) {
            Grades note = getNote(ex, student);
            if (note != null) {
                double val = note.valueAt(t);
                sum += val * ex.getCoefficient();
                sumCoef += ex.getCoefficient();
            }
        }
        if (sumCoef == 0) throw new Error("Erreur");
        return sum / sumCoef;
    }

}