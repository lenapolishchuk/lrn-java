package learningJava.com.tesing;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        char[] inParam = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Array inParam: " + Arrays.toString(inParam));

        char[] forResult = reverseArrayFor(inParam);
        char[] whileResult = reverseArrayWhile(inParam);
        char[] doWhileResult = reverseArrayDoWhile(inParam);

        System.out.println("Array FOR: " + Arrays.toString(forResult));
        System.out.println("Array While: " + Arrays.toString(whileResult));
        System.out.println("Array Do While: " + Arrays.toString(doWhileResult));

    }

    private static char[] reverseArrayFor(char[] in) {

        char[] forResult = new char[in.length];
        int j = 0;
        for (int i = in.length - 1; i >= 0; i--) {
            forResult[j] = in[i];
            j++;
        }
        return forResult;
    }

    private static char[] reverseArrayWhile(char[] in) {
        char[] whileResult = new char[in.length];

        int j = 0;
        int i = in.length - 1;
        while (i >= 0) {
            whileResult[j] = in[i];
            j++;
            i--;
        }
        return whileResult;

    }

    private static char[] reverseArrayDoWhile(char[] in) {
        char[] result = new char[in.length];

        int j = 0;
        int i = in.length - 1;

        do {
            result[j] = in[i];
            j++;
            i--;
        }
        while (i >= 0);
        return result;
    }
}
