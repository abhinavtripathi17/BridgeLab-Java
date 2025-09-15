package Inheritance.HierarchicalInheritance.SchoolRoles;
public class Staff extends Person {
    String department;
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    void displayRole() {
        System.out.println(name + " is Staff in " + department + " department");
    }
}
