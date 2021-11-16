public class OccurenceInString {
    public static void main(String[] args) {
        //creating string variable
    String str = "My name is Aaisha Ahuwalia";
    int count =0;
    int i = 0;
    //applying loop
    while (i<str.length()) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
            count++;
        i++;
    }
            System.out.println(" Total number of a or A is :"+count+ " times ");
    }
}
