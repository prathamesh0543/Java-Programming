package Java_8_feature_jm__;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class aug_17_2collect_in_set {

    public static void main(String[] args) {

        // Integer List
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 1, 5, 3);

        Set<Integer> numSet = numList.stream()
                .distinct()
                .map(n -> n * n)
                .collect(Collectors.toSet());

        System.out.println("Number Set: " + numSet);



        List<String> nameList = Arrays.asList(
                "Java", "Spring", "Java", "Hibernate"
        );

        Set<String> nameSet = nameList.stream()
                .distinct()
                .collect(Collectors.toSet());

        System.out.println("String Set: " + nameSet);
    }
}