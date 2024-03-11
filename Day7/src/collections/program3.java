package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class program3 {
    public static List<Integer> checkPerfectCouple(Map<Integer, String> coupleData) {
        List<Integer> perfectCoupleIds = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : coupleData.entrySet()) {
            Integer coupleId = entry.getKey();
            String coupleNames = entry.getValue();

        String[] names = coupleNames.split("-");

        String husbandName = names[0].trim();
        String wifeName = names[1].trim();

        String lowerHusbandName = husbandName.toLowerCase();
        String lowerWifeName = wifeName.toLowerCase();

        if (areEqualSets(lowerHusbandName, lowerWifeName)) {
            perfectCoupleIds.add(coupleId);
        }
    }

    return perfectCoupleIds;
}

private static boolean areEqualSets(String str1, String str2) {
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    java.util.Arrays.sort(arr1);
    java.util.Arrays.sort(arr2);

    return java.util.Arrays.equals(arr1, arr2);
}

public static void main(String[] args) {
    Map<Integer, String> coupleData = new HashMap<>();
    coupleData.put(1, "John-Mary");
    coupleData.put(2, "David-Virginia");
    coupleData.put(3, "Alan-Lana");
    coupleData.put(4, "Robert-Betty");

    List<Integer> perfectCouples = checkPerfectCouple(coupleData);

    System.out.println("Perfect couple IDs: " + perfectCouples);
    }
}
