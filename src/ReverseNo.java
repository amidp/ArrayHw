public class ReverseNo {
    public static void main(String[] args) {
        int num=123456789;
        int revnum =0;
        //applying loop
        while( num != 0 )
        {
            revnum = revnum * 10;
            revnum = revnum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+revnum);
    }
}
