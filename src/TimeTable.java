public class TimeTable {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        //declaring integer array
        int a1[][]=new int[4][4];
        //iterative loop
        for (i=1;i<4;i++){
            for (j=1;j<4;j++){
                a1[i][j]=i*j;
                System.out.print(a1[i][j]+" \t");
            }
            System.out.print(" \n");
        }
    }
}
