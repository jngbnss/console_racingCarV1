package util;

import java.util.Arrays;
import java.util.List;

public class Parse {

    public static List<String> parse(String input) {
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .toList();
    }

}
