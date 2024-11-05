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
        Studenttest S = new Studenttest();
        S.roll = 118;
        S.name = "Satish";
        S.dept = "CSE";
        S.m1 = 84;
        S.m2 = 71;
        S.m3 = 62;

        System.out.println(S.details());
        System.out.println("Total marks obtained: "+S.total());
        System.out.println("Average marks: "+S.average());
        System.out.println("Grade obtained: "+S.grade());
    }
}