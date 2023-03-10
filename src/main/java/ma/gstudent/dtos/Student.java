package ma.gstudent.dtos;

public class Student {
  private String nom;
  private int age ;

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

}
