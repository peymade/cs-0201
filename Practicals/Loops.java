/** Remember not to change the name of this file! */
public class Loops {
    /**
     * When called, print n 'X' on the same line.
     */
    public static void printXs(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print('X');
        }
        System.out.println();
    }

    /**
     * This is the entry point to our program.
     * 
     * @param args we'll talk about what that String[] args means... eventually.
     */
    public static void main(String[] args) {
        // Count up from 0..10
        for (int i = 0; i < 10; i += 1) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i -= 1) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i += 2) {
            printXs(i);
        }

    }
}