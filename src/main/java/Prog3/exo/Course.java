package Prog3.exo;

import java.util.ArrayList;
import java.util.List;

public class Course {
    //Les cours (ou matières) avec
    // leur id,
    // leur label (PROG1, PROG2, ...),
    // leurs crédits, et
    //l’enseignant (un seul) qui enseigne le cours.
    private final int id;
    private final String label;
    private final int credits;
    private final Teacher teacher;
    private final List<Exam> exams = new ArrayList<>();



    public Course(int id, String label, int credits, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.teacher = teacher;
    }

    public int getId() { return id; }
    public String getLabel() { return label; }
    public int getCredits() { return credits; }
    public Teacher getTeacher() { return teacher; }
    public List<Exam> getExams() { return exams; }

    public void addExam(Exam exam) { this.exams.add(exam); }

}
