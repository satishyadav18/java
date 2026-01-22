// using 2 classes

// class My extends Thread{
//     public void run(){
//         int i = 1;
//         while(true){
//             System.out.print(i+"Hello");
//             i++;
//         }
//     }
// }


// public class MyThread{
//     public static void main(String[] args){
//         My t = new My();
//         t.start();
        
//         int i = 1;
//         while(true){
//             System.out.print(i+"World");
//             i++;
//         }
//     }
// }




// using single class
public class MyThread extends Thread{

    public void run(){
        int i = 1;
        while(true){
            System.out.print(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        
        int i = 1;
        while(true){
            System.out.print(i+"World");
            i++;
        }
    }
}