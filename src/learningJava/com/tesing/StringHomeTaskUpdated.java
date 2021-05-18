package learningJava.com.tesing;

public class StringHomeTaskUpdated {

    public static void main(String[] args) {

        String txt = "I like Java";
        System.out.println("Task 1");
        task1(txt);
        int a1 = 352, a2 = 56;
        System.out.println("Task 2");
        task2(a1, a2);
    }

    private static void task1(String txt) {
        // task 1.б
        System.out.println("Last symbol is : " + txt.charAt(txt.length() - 1));

        // task 1.в
        if (txt.endsWith("!!!")) {
            System.out.println("Строка заканчивается с !!!");
        } else {
            System.out.println("Строка не заканчивается с !!!");
        }

        // task 1.г
        if (txt.startsWith("I like")) {
            System.out.println("Стока начинается с I like");
        } else {
            System.out.println("СТрока не начинается с I like");
        }

        // task 1.д
        if (txt.contains("Java")) {
            System.out.println("Строка содержит Java");
        } else {
            System.out.println("Строка не содержит Java");
        }

        // task 1.e
        int position = txt.indexOf("Java");
        System.out.println("Position 'Java' is :" + position);

        //task 1.ж
        String replaceTxt = txt.replace("a", "o");
        System.out.println("After replacement " + replaceTxt);

        // task 1.з
        System.out.println(txt.toUpperCase());

        //task 1.и
        System.out.println(txt.toLowerCase());

        //task 1.k
        int elementStart = txt.indexOf("Java");
        String cutTxt = txt.substring(elementStart, elementStart + 4);
        System.out.println("Substring is cut: " + cutTxt);
        System.out.println("Not cut string: " + txt);

    }

    private static void task2(int a1, int a2) {

        //task 2.a
        StringBuilder newTxt = new StringBuilder();
        newTxt.append(a1);
        newTxt.append(" + ");
        newTxt.append(a2);
        newTxt.append(" = ");
        newTxt.append(a1 + a2);
        System.out.println(newTxt);

        StringBuilder newTxt1 = new StringBuilder();
        newTxt1.append(a1);
        newTxt1.append(" - ");
        newTxt1.append(a2);
        newTxt1.append(" = ");
        newTxt1.append(a1 - a2);
        System.out.println(newTxt1);

        StringBuilder newTxt2 = new StringBuilder();
        newTxt2.append(a1);
        newTxt2.append(" * ");
        newTxt2.append(a2);
        newTxt2.append(" = ");
        newTxt2.append(a1 * a2);
        System.out.println(newTxt2);

        //task 2.б
        equalTask(newTxt);
        equalTask(newTxt1);
        equalTask(newTxt2);

        //task 2.в
        replaceTask(newTxt);
        replaceTask(newTxt1);
        replaceTask(newTxt2);

    }

    private static StringBuilder replaceTask(StringBuilder txt) {

        int positionStart = txt.indexOf("равно");
        int positionEnd = positionStart + 5;
        txt.replace(positionStart, positionEnd, "=");
        System.out.println(txt);
        return txt;
    }

    private static StringBuilder equalTask(StringBuilder txt) {

        int position1 = txt.indexOf("=");
        txt.insert(position1, "равно");
        position1 = txt.indexOf("=");
        txt.deleteCharAt(position1);
        System.out.println(txt);

        return txt;
    }


}
