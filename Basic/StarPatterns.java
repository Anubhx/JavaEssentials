public class StarPatterns {
    public static void main(String[] args) {
        int n = 5; // You can change the size of the patterns by modifying this value

        // Pattern 1: Right-Angled Triangle
        // Output:
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("Pattern 1: Right-Angled Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 2: Inverted Right-Angled Triangle
        // Output:
        // *****
        // ****
        // ***
        // **
        // *
        System.out.println("\nPattern 2: Inverted Right-Angled Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 3: Pyramid
        // Output:
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        System.out.println("\nPattern 3: Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 4: Inverted Pyramid
        // Output:
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        System.out.println("\nPattern 4: Inverted Pyramid");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 5: Diamond
        // Output:
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        System.out.println("\nPattern 5: Diamond");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 6: Right-Angled Triangle (Mirrored)
        // Output:
        //     *
        //    **
        //   ***
        //  ****
        // *****
        System.out.println("\nPattern 6: Right-Angled Triangle (Mirrored)");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 7: Sandglass
        // Output:
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        System.out.println("\nPattern 7: Sandglass");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
