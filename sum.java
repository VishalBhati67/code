// NON RECURSIVE PROGRRAME
public class sum {
    public static void printodd(int n){
        int sol =0;
        sol = n*n;
        System.out.println(" "+sol);
    }
    public static void printeven(int n){
        int sol1=0;
         sol1 = n*(n+1);
         System.out.println(" "+sol1);

    }
    public static void main(String[]args){
        printodd(3);
        printeven(2);

    }
    
}
