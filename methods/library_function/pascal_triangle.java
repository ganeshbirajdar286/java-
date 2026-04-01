package methods.library_function;

public class pascal_triangle {
    public static void main(String[] args){
        int rows = 5;

        for (int n = 0; n < rows; n++) {
            for (int s = 0; s < rows - n; s++) {
                System.out.print(" ");
            }

            for (int r = 0; r <= n; r++) {
                int ncr = factorial(n) / (factorial(r) * factorial(n - r));
                System.out.print(ncr + " ");
            }

            System.out.println();
        }

    }
    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
