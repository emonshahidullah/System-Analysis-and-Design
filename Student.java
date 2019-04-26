package student;
public class Student {
   private int id;
   private String name;
   private Double cgpa;
    public static void main(String[] args) {
        Student s1= new Student (100,"Emon Shahidullah",3.03);
        System.out.println(s1);
    }

    public Student(int id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", cgpa=" + cgpa + '}';
    }

}
