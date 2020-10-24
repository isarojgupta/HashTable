package dsProject;

public class Student {
    private String name;
    private String roll_no;
    private Double cgpa;

    public Student(String name, String roll_no, Double cgpa){
        this.name = name;
        this.roll_no = roll_no;
        this.cgpa = cgpa;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no='" + roll_no + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
