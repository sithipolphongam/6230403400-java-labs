package phongam.sithipol.lab4;
public class Teacher extends PersonV2 {

    // create variable 
    private String teachingSubject;
    private int salary;

    public Teacher(String name, double height, double weight, String dob, String teachingSubject , int salary) {
        super(name, height, weight, dob); //Use super so that the subclass Teacher can use constructors that already exist in the superclass PersonV2.

        this.teachingSubject = teachingSubject;
        this.salary = salary;
    }

    public String getTeachingSubject() {
        return this.teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " teahingSubject=" + teachingSubject + ", salary=" + salary;
    }
}
