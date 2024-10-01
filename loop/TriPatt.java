class TriPatt{
    public static void main(String[] args){

       
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i+1; j++){
                System.out.format(j+" "); 
            }
        System.out.println(" ");
        }
    }
}
//output
// 1 2 3 4 5  
// 1 2 3 4
// 1 2 3
// 1 2
// 1


    // int n = 0;
    // for(int i=1; i<=5; i++){
    //     for(int j=1; j<=i; j++){
            
    //         n++;
    //         System.out.format(n+" "); 
    //     }
    // System.out.println(" ");
    // }

    // output
    // 1  
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15





        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
               
        //         System.out.format(j+" "); 
        //     }
        // System.out.println(" ");
        // }

        // output
        // 1  
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5




        // for(int i=1; i<=5; i++){
        //     for(int j=i; j<=5; j++){
               
        //         System.out.format(j+" "); 
        //     }
        // System.out.println(" ");
        // }
        
        //output
        // 1 2 3 4 5  
        // 2 3 4 5
        // 3 4 5
        // 4 5
        // 5

