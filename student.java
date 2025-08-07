public class student {
    String name;
    int age;
    String grade;
 student(String name, int age, String grade) {
    
        this.name = name;      
        this.age = age;
        this.grade = grade;
    }
    public void showDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + this.grade);
    }
    public static void main(String[] args) {
        student s1 = new student("Lakshana", 20, "A");
        s1.showDetails();
    }
}
