import java.util.*;

class Fibo{
    int n1=0, n2=1, n3=0;
    // int n2 = 1;
    // int n3 = 0;
    void fibbo(int count){
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibbo(count - 1);
        }
    }
}

class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int count = sc.nextInt();

        Fibo f = new Fibo();

        System.out.print(f.n1+" "+f.n2);
        f.fibbo(count - 2);

    }
}



// class Fibonacci{  
//     public static void main(String args[]){    
//         System.out.println("Enter the number of terms: ");
//         Scanner in = new Scanner(System.in) ;
//         int count = in.nextInt();

//         int n1=0,n2=1,n3,i;  
//         System.out.print(n1+" "+n2);//printing 0 and 1    
            
//         for(i=2;i<count;++i){    
//             n3=n1+n2;    
//             System.out.print(" "+n3);    
//             n1=n2;    
//             n2=n3;    
//         }    
//     }
// }  