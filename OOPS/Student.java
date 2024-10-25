class Studenttest{
    int roll;
    String name;
    String dept;
    int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }

    public float average(){
        return (float)total() / 3;
    }

    public char grade(){
        if(average() >= 60)
            return 'A';
        else if(average() >=40)
            return 'B';
        else
            return 'F';
    }

    public String details(){
        return "Roll No: "+roll+"\n"+"Name: "+name+"\n"+"Dept: "+dept+"\n";
    }
}

class Student{
    public static void main(String[] args){
        Studenttest s = new Studenttest();
        s.roll = 118;
        s.name = "Satish";
        s.dept = "CSE";
        s.m1 = 84;
        s.m2 = 71;
        s.m3 = 62;

        System.out.println(s.details());
        System.out.println("Total marks obtained: "+s.total());
        System.out.println("Average marks: "+s.average());
        System.out.println("Grade obtained: "+s.grade());
    }
}