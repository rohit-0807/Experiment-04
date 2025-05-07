
public class Student {
   String name,programe;
   String[] course = new String[3];
   
   
   Student(String name, String programe, String[] course) {
       this.name = name;
       this.programe = programe;
       this.course = course;
   }

   void show() {
       System.out.println("Student Name: " + name + "\nPrograme: " + programe);
       System.out.println("Course List :");
        for(int i=0;i<course.length;i++){
            System.out.println((i+1)+","+ course[i]);
        }
   }
   
   public static void main(String[] args) {
        // Student s = new Student("Rohit", "BCA", new String[]{"java","python","devops"});
        // s.show();

        Course obj1  = new Course("Rohit", "BCA", new String[]{"java","python","devops"},new int[]{30,45,50});
        obj1.show();
        obj1.display();
   }
}

class Course extends Student{
    
    int[] marks = new int[3];

   Course(String name, String programe, String[] course,int[] marks){
    super(name,programe,course);
    this.marks = marks;
   }

    void display(){
        System.out.println("marks less then 40 :");
        for(int i=0;i<marks.length;i++){
            if(marks[i] < 40){
                System.out.println("Course Name: " + course[i] + "\tMarks: " + marks[i]);
            }
            
        }
    }
}
