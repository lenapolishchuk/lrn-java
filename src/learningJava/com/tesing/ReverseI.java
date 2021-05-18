package learningJava.com.tesing;

import java.util.Arrays;

public class ReverseI {

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

        for (int i = in.length - 1; i >= 0; i--) {
            forResult[in.length - 1 - i] = in[i];
        }
        return forResult;
    }

    private static char[] reverseArrayWhile(char[] in) {
        char[] whileResult = new char[in.length];

        int i = in.length - 1;
        while (i >= 0) {
            whileResult[in.length - 1 - i] = in[i];
            i--;
        }
        return whileResult;

    }

    private static char[] reverseArrayDoWhile(char[] in) {
        char[] result = new char[in.length];

        int i = in.length - 1;

        do {
            result[in.length - 1 - i] = in[i];
            i--;
        }
        while (i >= 0);
        return result;
    }
}


