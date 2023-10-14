package get_loopy;

public class OutputForLoopsA {
    public static void main(String[] args) {
        int o;
        int i;

        for (o = 1; o <= 5; o++) {
            for (i = 1; i <= o; i++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
