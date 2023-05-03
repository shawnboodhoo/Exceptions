package CustomExceptions;

public class AgeLessThanZero {

    public static void main(String[] args) {
        validateAge(-5);

    }

    public static void validateAge(int age){
        if (age < 0){
            throw new AgeLessThanZeroException("age has to be higher than zero", new IllegalAccessException());
        }
    }
}
