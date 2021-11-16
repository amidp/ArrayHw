import java.lang.reflect.Array;
import java.util.Arrays;
public class EqualityOfArrays
{
    public static void main(String[] args)
    {
        //declaring two integer arrays
        int a1[] = {1, 2, 3, 8, 5, 6};
        int a2[] = {1, 2, 3, 4, 5, 6};
        boolean status = true;
        //conditional loop
        if (a1.length == a2.length)
        {
                while (Arrays.equals(a1,a2))
                {
                    System.out.println(" Equal ");
                    status = false;
                    break;
                }
                if (status = true)
                {
                    System.out.println(" Arrays are not equal.");
                }
                }
        else
            {
                System.out.println(" Arrays are not equal.");
            }
        }
    }

