// NON RECURSIVE PROGRRAME
public class fact {
    public static void printfact(int n){
        int sol=1;
        for(int i=1;i<=n;i++){
            sol=sol*i;
        }
        System.out.println(" "+sol);
    }
    public static void main(String[]args){
        printfact(6);

    }
    
}
