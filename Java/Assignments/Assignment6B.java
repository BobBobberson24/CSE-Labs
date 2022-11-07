import java.util.Scanner;

public class Assignment6B {

    static String WhatsMyType(int data) {
        String ret = data + " is an integer value!";
        return ret;
    }

    static String WhatsMyType(String data) {
        String ret = data + " is a string value!";
        return ret;
    }

    static String WhatsMyType(boolean data) {
        String ret = data + " is a boolean value!";
        return ret;
    }

    static String WhatsMyType(char data) {
        String ret = data + " is a char value!";
        return ret;
    }

    static String WhatsMyType(float data) {
        String ret = data + " is a float value!";
        return ret;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[What's my datatype?]\n");
        System.out.print("Enter an int: ");
        int integer = scan.nextInt();
        System.out.print("Enter a string: ");
        String string = scan.next();
        System.out.print("Enter a float: ");
        float floatyFloat = scan.nextFloat();
        System.out.print("Enter a char: ");
        char character = scan.next().charAt(0);
        System.out.print("Enter a boolean: ");
        boolean bool = scan.nextBoolean();
        System.out.print("\n");
        System.out.print("What data type do you want to check for? ");
        String dataType = scan.next();
        if (dataType.equals("int")) {
            System.out.print(WhatsMyType(integer));
        }
        if (dataType.equals("string")) {
            System.out.print(WhatsMyType(string));
        }
        if (dataType.equals("float")) {
            System.out.print(WhatsMyType(floatyFloat));
        }
        if (dataType.equals("char")) {
            System.out.print(WhatsMyType(character));
        }
        if (dataType.equals("boolean")) {
            System.out.print(WhatsMyType(bool));
        }
    }
}