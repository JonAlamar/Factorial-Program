public class Main {

    public static void main(String[] args) {
        System.out.println("N      N!");
        System.out.println("---     --------- ");
        for (int i = 0; i <= 50; i++) {
            System.out.println(i + "       " + factorial(i));
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}