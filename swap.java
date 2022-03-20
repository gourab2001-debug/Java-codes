class IntWrapper{
    int a;
    IntWrapper() {}
    IntWrapper(int a){
        this.a = a;
    }
}
public class swap {
    static int a = 10;
    static int b = 20;
    public static void swapFunction1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping A = " + a + " B = " + b);
    }
    public static void swapFunction2(IntWrapper A, IntWrapper B){
        IntWrapper C = new IntWrapper();
        C.a = A.a;
        A.a = B.a;
        B.a = C.a;
        System.out.println("Inside swapfun2 After swapping A = " + A.a + " B = " + B.a);
    }
    public static void main(String[] args) {
        System.out.println("Before swapping A = " + a + " B = " + b);
        swapFunction1(a, b);
        System.out.println("After swapping A = " + a + " B = " + b);
        
        IntWrapper A = new IntWrapper(a);
        IntWrapper B = new IntWrapper(b);
        swapFunction2(A, B);
        System.out.println("Inside main After swapping A = " + A.a + " B = " + B.a);
        // System.out.println("After swapping A = " + a + " B = " + b);
    }
}
