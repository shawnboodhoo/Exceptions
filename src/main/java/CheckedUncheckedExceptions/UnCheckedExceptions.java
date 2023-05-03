package CheckedUncheckedExceptions;

public class UnCheckedExceptions {

    public static void main(String[] args) {
        String name = null;
        printLength(name);

    }

    public static void printLength(String name){
      try {
            System.out.println(name.length());
      } catch (NullPointerException e){
          System.out.println("string is null");
        }
    }

    // unchecked exception is before compiling don't need to be handled before compiling.
}
