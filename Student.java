
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
       System.out.println("Course List :\n");
        for(int i=0;i<course.length;i++){
            System.out.println((i+1)+","+ course[i]);
        }
   }
   
   public static void main(String[] args) {
        Student s = new Student("Rohit", "BCA", new String[]{"java","python","devops"});
        s.show();
   }
}


