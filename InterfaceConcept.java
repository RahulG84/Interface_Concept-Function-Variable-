import java.util.Scanner;

// Ability
  class T1 implements Client1{
      void Demo1(){

    }
      @Override
      public void Addition() {

      }
  }

interface Client1{
    void Addition(); //Interface Method is By-Default Public And Abstract  "Why We not Use Static?"
}
interface Client2 extends Client1{
    void Sub();  //Interface Method is By-Default Public And Abstract "Why We not Use Static?"
                //Interface have ability to extend multiple interface class but not extend any abstract class "Client1 --extend--> Client2 "
                // to use Interface  class in Sub Class we have to implement the Interface Class Name "class Rahul implements Client2"
}
class Rahul implements Client2{
    @Override
    public void Addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 1st Two Number : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = (A + B);
        System.out.println("Addition is " +sum);
    }
    @Override
    public void Sub() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2nd Two Number : ");
       int C = sc.nextInt();
       int D = sc.nextInt();
       int Diff = (C - D);
        System.out.println("Subtraction is " +Diff);
    }
}
class Demo {
    static int E = 10; //Static Variable
    int F =30;  // Instance Variable
    public static void main(String[] args) {
        Client2 sc = new Rahul();
        sc.Addition(); sc.Sub();
        System.out.println("************************* Variable Declaration ********************");
        int E = 100; //Local Variable
        System.out.println(E); //
       Demo R = new Demo();  /// Object to Access Instance Variable
        System.out.println(R.F); /// To Access/Declare Instance Variable With The Object
        System.out.println(Demo.E); // To Access/Declare Static Variable With The Class Name
    }
}