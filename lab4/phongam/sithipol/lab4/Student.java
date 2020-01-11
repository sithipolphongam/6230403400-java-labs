package phongam.sithipol.lab4;
public class Student extends PersonV2 {
     
        // create variable 
        private String major;
        private double GPA;

        public Student(String name, double height, double weight, String dob,String mojor, double GPA) {
        super(name, height, weight, dob); //Use super so that the subclass Student will be able to use constructors that already exist in the superclass PersonV2.

        this.major = mojor;
        this.GPA = GPA;
    }  
        public String getMajor() {
            return this.major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public double getGPA() {
            return this.GPA;
        }

        public void setGPA(double GPA) {
            this.GPA = GPA;
        }

        @Override 
        public String toString() {
            return super.toString() + " major=" + major + ", GPA=" + GPA;
        }

}   