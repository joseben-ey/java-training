package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program2 {
    public static char[] mergeData(List<Character> list1, List<Character> list2) {
        List<Character> mergedList = new ArrayList<>();

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList);

        char[] result = new char[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            result[i] = mergedList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('c');
        list1.add('b');

        List<Character> list2 = new ArrayList<>();
        list2.add('d');
        list2.add('f');
        list2.add('e');

        char[] mergedArray = mergeData(list1, list2);
        System.out.print("Merged and sorted array: ");
        for (char c : mergedArray) {
            System.out.print(c + " ");
        }
    }
}
