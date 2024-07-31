import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return Pattern.matches(regex, className);
    }
    public static void main(String[] args) {
        System.out.println(isValidClassName("C1234G"));  
        System.out.println(isValidClassName("A5678H"));
        System.out.println(isValidClassName("P0000K"));
        System.out.println(isValidClassName("C12345G"));
        System.out.println(isValidClassName("B1234G"));
        System.out.println(isValidClassName("C1234!"));
    }
}
