class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    //constructor
    public Subject(String subID, String name, int maxMarks, int marksObtain){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain= marksObtain;
    }


    //methods
    public String getSubID(){
        return subID;
    }

    public String getName(){
        return name;
    }

    public int getMaxMarks(){
        return maxMarks;
    }
    
    public int getMarksObtain(){
        return marksObtain;
    }

    public void setMaxMarks(int mm){
        maxMarks = mm;
    }

    public void setMarksObtain(int m){
        marksObtain = m;
    }

    boolean isQualified(){
        return marksObtain >= maxMarks/10*4;
    }

    public String toString(){
        return "\nSubject ID: "+subID+"\nName: "+name+"\nMax marks: "+maxMarks+"\nMarks Obtained: "+marksObtain;
    }
}

public class SubjectConst{
    public static void main(String[] args){
        Subject subs[] = new Subject[3]; //refernces

        //Array of objects
        subs[0] = new Subject("M101", "MTHS", 100, 89);
        subs[1] = new Subject("PCC101", "DSA", 100, 76);
        subs[2] = new Subject("ES101", "CA", 100, 38);


        for(Subject s : subs ){
            System.out.println(s);
            System.out.println("Qualified: " + s.isQualified());
        }
    }
}