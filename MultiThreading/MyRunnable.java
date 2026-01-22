//Using 2 different class for achieving multithreading

// class My implements Runnable{
//     public void run(){
//         int i = 1;
//         while(true){
//             System.out.print(i + "Hello");
//             i++;
//         }
//     }
// }

// class MyRunnable{
//     public static void main(String[] args){
//         My m = new My();
//         Thread t = new Thread(m);
//         t.start();
//         int i = 1;
//         while(true){
//             System.out.print(i + "World");
//         }
//     }
// }



//Using single class

class MyRunnable implements Runnable{
    public void run(){
        int i = 1;
        while(true){
            System.out.print(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args){
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while(true){
            System.out.print(i + "World");
        }
    }
}