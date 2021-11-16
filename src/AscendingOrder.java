public class AscendingOrder {
    public static void main(String[] args) {
        {
        //declaring an array
            int[] arr = new int[] {34, 1, 3, 34,0, -1, -4, 6, 55, 20};
            System.out.println("Array elements after sorting:");
            //applying iterative loop to meet the requirement
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    int temp = 0;
                    if (arr[i] > arr[j])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
        //prints the sorted element of the array as per requirement
                System.out.println(arr[i]);
            }
        }
    }
}