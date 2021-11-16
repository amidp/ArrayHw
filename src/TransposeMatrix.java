public class TransposeMatrix
{
    public static void main(String args[])
    {
        //declaring two integer arrays
        int a1[][] = {{1, 2, 3}, {4,5,6}, {7, 8, 9}};
        int b1[][] = new int[3][3];
        //iterative loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b1[i][j] = a1[j][i];
            }
        }
        System.out.println("Array without transpose:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array after Transpose:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(b1[i][j] + " ");
            }
            System.out.println();
        }
    }
}