package learningJava.com.tesing;

public class ReverseMatrix {

    public static void main(String[] args) {

        char[][] inParam = new char[][]{{'q', 'w', 'e', 'r', 't'},
            {'a', 's', 'd', 'f', 'g'},
            {'z', 'x', 'c', 'v', 'b'}
        };

        char[][] forResult = reverseArrayFor(inParam);
        System.out.println("Result FOR: ");
        for (int i = 0; i < forResult.length; i++) {
            for (int j = 0; j < forResult[i].length; j++) {
                System.out.print(forResult[i][j] + "\t");
            }
            System.out.println();
        }

        char[][] whileResult = reverseArrayWhile(inParam);
        System.out.println("Result While: ");
        int i = 0;
        int j;

        while (i < whileResult.length) {
            j = 0;
            while (j < whileResult[i].length) {
                System.out.print(whileResult[i][j] + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
        char[][] doWhileResult = reverseArrayDoWhile(inParam);

        System.out.println("Result Do While: ");
        i = 0;
        do {
            j = 0;
            do {
                System.out.print(doWhileResult[i][j] + "\t");
                j++;
            } while (j < doWhileResult[i].length);
            System.out.println();
            i++;
        } while (i < doWhileResult.length);
    }


    private static char[][] reverseArrayFor(char[][] in) {

        char[][] forResult = new char[in.length][in[0].length];

        for (int i = 0; i < in.length; i++) {
            for (int j = in[i].length - 1; j >= 0; j--) {
                forResult[i][in[i].length - 1 - j] = in[i][j];
            }
        }
        return forResult;
    }


    private static char[][] reverseArrayWhile(char[][] in) {

        char[][] whileResult = new char[in.length][in[0].length];

        int i = 0;
        int j;

        while (i < in.length) {
            j = 0;
            while (j < in[i].length) {
                whileResult[i][in[i].length - 1 - j] = in[i][j];
                j++;
            }
            i++;
        }
        return whileResult;
    }


    private static char[][] reverseArrayDoWhile(char[][] in) {
        char[][] result = new char[in.length][in[0].length];

        int i = 0;
        int j;

        do {
            j = 0;
            do {
                result[i][in[i].length - 1 - j] = in[i][j];
                j++;
            } while (j < in[i].length);
            i++;
        }
        while (i < in.length);
        return result;
    }

}
