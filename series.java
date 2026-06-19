// NON RECURSIVE PROGRRAME
public class series {
    public static void printfibo(int n){
        int n1=0 ,n2=1;
        System.out.println(" "+n1+" "+n2);
        for(int i=0;i<=n;i++){
            int n3=n1+n2;
            System.out.println(n3+" ");
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String[]args){
        printfibo(28);

    }
}