public class ValChange{
    
    static void change(int X[], int index, int val){   // int A[] same name or different but it will refer to main class Array
        X[index] =  val;                            //forml parameter
    }

    static void change2(int x, int val){   // int a    [formal value is changed but not the actual parameter as here only value is passed not the refernce and new x is created  and had scope only to that method]
        x = val;    
        System.out.println("Val of formal parameter of primitive: "+x);              // a = val;
    }
    
    
    public static void main(String[] args){

        //object 
        int A[] = {2, 5, 4, 9, 78, 12, 35};   //Actual parameter

        change(A, 3, 45);

        for(int x : A){
            System.out.println(x);  // Here actual parameter value is changed because when an object 
                                    // is passed as parameter to a method then its reference is passed
        }                           // so no new object is created it hold the same refernce of the array of actual parameter    




        // primitive
        int x = 18;
        change2(x, 21);
        System.out.println("Value of primitive: "+x); // o/p = 18

        // here vlaue will not change because primitive data types in java are passed as value.
    }
}


