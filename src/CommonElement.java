public class CommonElement {
    public static void main(String[] args) {
        //creating two string arrays
        String a1[] = {"apple","banana","chikoo","grapes"};
        String a2[]= {"banana","lemon","mango","pear"};
        //applying iterative loop
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a2.length; j++){
                if(a1[i].equals(a2[j])){
                    System.out.println(" The common element is : " + a1[i]);
                    break;
                }
            }
        }
    }
}
