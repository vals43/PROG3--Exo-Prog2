
import Prog3.exo.*;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradesTest {
    private Tutor tut() {
        return new Tutor(1, "John ", "Doe", LocalDate.of(1900,1,1), "John@example.com", "0320000000", "Parent");
    }
    private Student stu() {
        return new Student(1, "Example", "test", LocalDate.of(2100, 1, 1), "test@example.com", "0341111111", "K1", tut());
    }
    private Teacher prof() {
        return new Teacher(1, "Idk", "laFlemme", LocalDate.of(2000, 1, 1), "Idk@example.com", "0332222222", "back-end");
    }

    @Test void getNoteAtT() {
        Student s = stu();
        Teacher t = prof();
        Course c = new Course(10, "PROG2", 6, t);
        Instant d = Instant.parse("2025-09-04T08:00:00Z");
        Exam e = new Exam(100, "exam PROG2", c, d, 2);
        c.addExam(e);

        SaveGrades save1 = new SaveGrades();
        Instant t0 =Instant.parse("2025-01-01T08:00:00Z");
        save1.setFirstNote(e, s, 10.0, t0);


        Instant q0 = Instant.parse("2025-01-01T08:00:00Z");
        assertEquals(10.0, save1.getExamNote(e, s, q0));
    }

    @Test void getFinalNoteAtT() {
        Student s = stu();
        Teacher t = prof();
        Course c = new Course(10, "PROG3", 6, t);

        Instant d1 = Instant.parse("2025-01-01T08:00:00Z");
        Exam e1 = new Exam(100, "test", c, d1, 2);


        Instant d2 = Instant.parse("2025-01-01T08:00:00Z");
        Exam e2 = new Exam(101, "Final", c, d2, 3);


        c.addExam(e1); c.addExam(e2);

        SaveGrades jk = new SaveGrades();
        jk.setFirstNote(e1, s, 10.0, Instant.parse("2025-01-01T08:00:00Z"));

        jk.setFirstNote(e2, s, 15.0, Instant.parse("2025-01-01T08:00:00Z"));

        jk.changeNote(e1, s, 12.0, Instant.parse("2025-01-01T08:00:00Z"), "Correction");

        Instant q = Instant.parse("2025-01-01T08:00:00Z");

        double expected = (12.0*2 + 15.0*3) / 5.0;

        assertEquals(expected, jk.getCoursNote(c, s, q));
    }
    // ALl test run ok on my pc XD
}