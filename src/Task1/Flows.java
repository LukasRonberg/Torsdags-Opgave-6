package Task1;

public class Flows {

    public void methodA(String input) {

        if (!input.equals("start")) {
            System.out.println("J");
            System.out.println("a");
            methodB("start");
        } else {
            System.out.println("e");
            System.out.println(methodC(""));

        }
        System.out.println("a");
    }

    public void methodB(String start) {
        System.out.println("v");
    }

    public int methodC(String input) {
        System.out.println("r");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("s");
        if (number > 5) {
            System.out.println("g");
        }
        System.out.println("j");

    }
}