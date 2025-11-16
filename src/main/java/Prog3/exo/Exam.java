package Prog3.exo;

import java.time.Instant;

public class Exam {
    /*Les examens avec leur id,
     leur titre,
     le cours rattaché,
    la date & heure de l’examen,
     et le coefficient de l’examen (par exemple, si un examen de PROG2 a un coefficient 2
    résulte sur un 10/20, et un autre examen de PROG2 a un coefficient 3 résulte sur un
    15/20 , le calcul de la note finale du cours est : (10*2 + 15*3) / 5 = 13/20. */

    private final int id;
    private final String title;
    private final Course course;
    private final Instant dateTime; // date & heure
    private final int coefficient;

    public Exam(int id, String title, Course course, Instant dateTime, int coefficient) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.dateTime = dateTime;
        this.coefficient = coefficient;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public Course getCourse() { return course; }
    public Instant getDateTime() { return dateTime; }
    public int getCoefficient() { return coefficient; }


}