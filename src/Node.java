public class Node {
    String fullName, department, semester, section;
    int ID, age, contact, height; 
    Node left, right;

    public Node(Student s) {
        this.ID = s.ID;
        this.fullName = s.fullName;
        this.department = s.department;
        this.semester = s.semester;
        this.section = s.section;
        this.age = s.age;
        this.contact = s.contact;
        this.height = 1;
    }
    
    
}
