
import java.util.Arrays;

    class BreakCamelCase {
        public static String camelCase(String input) {
            return input.replaceAll("([A-Z])", " $1");
        }
    }

