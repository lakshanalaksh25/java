public class employee {
    String name;
    int id;
    String department;
    public employee() {
        this.name = "Not Assigned";
        this.id = 0;
        this.department = "Not Assigned";
    }
    public employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "IT";
    }
    public employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee("Lakshana", 101);
        employee emp3 = new employee("Krishna", 102, "HR");

        // Display info
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}

