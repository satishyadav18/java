
class Student{
    int roll;
    java.lang.String name;
    int marks;
}

public class ArrayStudent {
    public static void main(Str[] args){
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.roll = 12;
        s1.marks = 87;

        Student s2 = new Student();
        s2.name = "Shyam";
        s2.roll = 22;
        s2.marks = 57;

        Student s3 = new Student();
        s3.name = "Sanskriti";
        s3.roll = 47;
        s3.marks = 97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(s1.roll + ":-" + s1.name + ":" + s1.marks);

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }
  
//enhanced for loop
        System.out.println("----------------"); 

        for(Student stud : students){
            System.out.println(stud.name + ":" + stud.marks);
        }
    }
}
