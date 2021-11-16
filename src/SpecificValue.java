public class SpecificValue {
    public static void main(String[] args) {
    int a []= {10,20,30,40,50};
    int spe_val = 30;
    boolean flag = false;
    //iterative loop
    for (int i=0;i< a.length;i++)
    {//conditional loop
        if (spe_val==a[i])
        {
            System.out.println(" Specific value found is  : "+ spe_val);
            flag = true;
            break;
        }
    }
        if (flag==false){
            System.out.println( " Element not found. ");
        }
    }
}
