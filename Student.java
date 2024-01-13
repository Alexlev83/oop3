public class Student {
    int StudentId;
    String firstName;
    String secondName;
    String lastName;
    public Student(int studentId, String firstName, String secondName, String lastName) {
        StudentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + StudentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    
     }
}
