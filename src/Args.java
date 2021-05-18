public class Args {
    public static void main (String[] args){
        if (args.length != 3){
            System.out.println("Incorrect amount of args ");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        String msg = args[0] + args[1] + args[2] + "=";

        switch (args[1]) {
            case "+":
                msg += (num1 + num2);
                break;
            case "-":
                msg += (num1 - num2);
                break;
            case "x":
                msg += (num1 * num2);
                break;
            case "/":
                msg += (num1 / num2);
                break;
            default:
                msg = "Incorrect operator";
                break;
        }

        System.out.println( msg ) ;
    }
}
