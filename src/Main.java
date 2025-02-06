public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int a){
       if (a==1){
        return a;
    }

        return factorial(a-1)*a;
    }

}