class Verify{
    boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }

    boolean validate(int age){
        return age >= 3 && age <= 15;
    }
}

public class Valid{
    public static void main(String[] args){
        Verify V = new Verify();
      
        boolean isNameValid = V.validate("Satish Yadav");
        System.out.println("Is the name valid? " + isNameValid);
        
    
        boolean isAgeValid = V.validate(20);
        System.out.println("Is the age valid? " + isAgeValid);
    }
}