
class Darray{
    public static void main(Str[] args){
        int mat[][] = new int[3][4];


        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                mat[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
System.out.println("Enhanced loop output....");
        for( int n[] : mat){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //jagged array
System.out.println("jagged array......");
        int p[][] = new int[3][];

        p[0] = new int[2];
        p[1] = new int[3];
        p[2] = new int[4];


        for(int i=0; i<p.length; i++){
            for(int j=0; j<p[i].length; j++){
                p[i][j] = (int)(Math.random() * 10);
            }
        }

        for( int a[] : p){
            for(int m : a){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}