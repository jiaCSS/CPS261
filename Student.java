
public class Student implements Comparable<Student> {

    private Integer studentID;
    private String name;
    private Double gpa;
    private static int maxStudentID;

    //default constructor of student to automake ID
    public Student() {

        maxStudentID++;
        this.studentID = maxStudentID;

    }
    //2 args constructor of student;
    public Student(String name, Double gpa) {

        this();
        this.setName(name);
        this.setGpa(gpa);

    }
    //3 args constructor of student
    public Student(Integer studentID, String name, Double gpa) {
        this.setID(studentID);
        this.setName(name);
        this.setGpa(gpa);
    }

    //set and get
    public Integer getId() {return studentID;}

    public String getName() {return name;}

    public Double getGpa() { return gpa;}

    private void setID(Integer studentID) {this.studentID = studentID;}

    public void setName(String name) {this.name = name;}

    public void setGpa(Double gpa) {this.gpa = gpa;}

    // sort by name
    @Override
    public int compareTo(Student other){

    return this.name.compareToIgnoreCase(other.name);

    }//compareTo

    // sort by id
    // @Override
    // public int compareTo(Student other){

    // return this.studentID.compareTo(other.studentID);
    // }

    // sort by gpa
    // @Override

    // public int compareTo(Student other) {

    //     return this.getGpa().compareTo(this.getGpa());
    // }


    //display id
    public void display(Student other){

        int results = this.compareTo(other);

        if (results > 0)
            
            System.out.println(this + "'s id " + "is greater than\n" + other);
        else if (results <0)
            
            System.out.println(this + "'s id " + "is less than\n" + other);
        
        else System.out.println(this + "'s id " + "is equal to\n" + other);
            
    }


    public String toString() {
        return "{ ID= " + this.getId() + ", Name= " + this.getName() + ", " +
                "GPA=" + this.getGpa() + "}";
    }

}// student
