package ExceptionHandiling;

public class Main {
    public static void main(String[] args) {

        try {
            int myint = Integer.parseInt("hi");
            System.out.println("after parsing");
            // will not print will go to catch block
        } catch (NumberFormatException e){
            System.out.println("cant parse int into string");
        } finally {
            System.out.println("always prints");
            // finally always does action
        }

        System.out.println("end here");

    }

}
