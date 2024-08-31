package college;

import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows in matrix: ");
        int rows = in.nextInt();

        System.out.print("Enter the number of column in matrix: ");
        int columns = in.nextInt();

        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];

        System.out.println("Enter elements in matrix1: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter elements in matrix2: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix2[i][j] = in.nextInt();
            }
        }
        
        int SumOfMat[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                SumOfMat[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("first matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Second matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Sum of two matrices is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(SumOfMat[i][j]+" ");
            }
            System.out.println();
        }

        int DifferenceOfMat[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                DifferenceOfMat[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Subtract of two matrices is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(DifferenceOfMat[i][j]+" ");
            }
            System.out.println();
        }

        int MulOfMat[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                MulOfMat[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        
        System.out.println("Multiplication of two matrices is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(MulOfMat[i][j]+" ");
            }
            System.out.println();
        }

        int DivisionOfMat[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                DivisionOfMat[i][j] = matrix1[i][j] / matrix2[i][j];
            }
        }
        
        System.out.println("Division of two matrices is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(DivisionOfMat[i][j]+" ");
            }
            System.out.println();
        }

        in.close();
    }
}
