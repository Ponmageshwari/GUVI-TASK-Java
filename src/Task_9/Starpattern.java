package Task_9;

public class Starpattern {

	public static void printPattern(int n)
    {
        int i, j;
        // Printing the upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                System.out.print("*" + " ");
            }

            // printing new line for each row
            System.out.println();
        }

        // Printing the lower part
        for (i = n - 1; i >= 1; i--) {
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                System.out.print("*" + " ");
            }
            // printing new line for each row
            System.out.println();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
        printPattern(n);

	}

}
