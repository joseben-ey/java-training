package collections;

import java.util.ArrayList;
import java.util.List;

public class program1  {

    public static List<String> modifyElement(List<String> arrayList, String element) {
        List<String> modifiedList = new ArrayList<>();

        for (String original : arrayList) {
            if (original.equals(element)) {
                int halfLength = original.length() / 2;
                String modifiedElement = original.substring(0, halfLength);
                modifiedList.add(modifiedElement);
            } else {
                modifiedList.add(original);
            }
        }

        return modifiedList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("cherry");
        inputList.add("Mango");

        String targetElement = "banana";

        List<String> modifiedList = modifyElement(inputList, targetElement);

        System.out.println("Original List: " + inputList);
        System.out.println("Modified List: " + modifiedList);
    }
}
