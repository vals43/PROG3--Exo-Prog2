package Prog3.exo;

import java.time.LocalDate;

public class Student {
    /*Les étudiants qui sont caractérisés par
    un id (entier),
     un nom,
      un prénom,
       une date de naissance,
        un email,
         un numéro de téléphone,
          un groupe (sous la forme d’une chaîne de caractères), et
           un tuteur;*/

       private final int id;
       private final String name;
       private final String LastName;
       private final LocalDate BirthDate;
       private final String email;
       private final String phone;
       private final String group;
       private final Tutor tutor;

    public Student(int id, String name, String lastName, LocalDate birthDate, String email, String phone, String group, Tutor tutor) {
        this.id = id;
        this.name = name;
        LastName = lastName;
        BirthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.group = group;
        this.tutor = tutor;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGroup() {
        return group;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
