package Java_8_feature_jm__;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class aug_17 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("a", "B", "C");

        List<String> result = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}