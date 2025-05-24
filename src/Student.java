public class Student {
    //Variables
    String fullName, department, semester, section;
    int ID, age, contact;
    
    public Student()
    {
        ///*Nothing*/
    }

    public Student(String Id, String fullName, String age, String contact, String department, String semester, String section) {
        this.ID = Integer.parseInt(Id);
        this.fullName = fullName;
        this.department = department;
        this.semester = semester;
        this.section = section;
        this.age = Integer.parseInt(age);
        this.contact = Integer.parseInt(contact);
    }
    
    //Cunstructor to Pass object for displaying search results
    public Student(Node stu){
        this.ID = stu.ID;
        this.fullName = stu.fullName;
        this.age = stu.age;
        this.contact = stu.contact;
        this.department = stu.department;
        this.semester = stu.semester;
        this.section = stu.section;
    }  

    
}
