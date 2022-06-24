import java.util.Scanner;
public class FunctionDemo {
//    static int x;
//    static int y;
    static int sub(int a, int b){
        int result = a - b ;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int SubRessult = sub(a,b);
        System.out.println(SubRessult);

    }
}
