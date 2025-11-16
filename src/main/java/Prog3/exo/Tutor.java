package Prog3.exo;


import java.time.LocalDate;

public class Tutor {
    /*Les tuteurs qui sont caractérisés par
     un id (entier),
    un nom,
     un prénom,
     une date de naissance,
     un email,
     un numéro de téléphone,
     et une description du lien avec l’étudiant (sous la forme d’une chaîne de caractères). */

    private final int id;
    private final String lastName;
    private final String firstName;
    private final LocalDate birthDate;
    private final String email;
    private final String phone;
    private final String relationDescription;

    public Tutor(int id, String lastName, String firstName, LocalDate birthDate, String email, String phone, String relationDescription) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.relationDescription = relationDescription;
    }

    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public LocalDate getBirthDate() { return birthDate; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getRelationDescription() { return relationDescription; }


}