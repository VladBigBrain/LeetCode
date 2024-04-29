package Easy.longestcommonprefix;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        int minvalue = Math.min(strs[0].length(), strs[strs.length - 1].length());
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < minvalue; ++i) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] str) {
        String[] str1 = new String[] { "flower", "flow", "flight" }; // fl
        System.out.println(longestCommonPrefix(str1));
        String[] str2 = new String[] { "dog", "racecar", "car" }; // no
        System.out.println(str2);
    }
}

// для каждого элемента в этом массиве одновременно считай общий индекс начиная
// с 0 предусмотри что строки разных длин могут быть
// иди по самой короткой строке

// Миграцию с Димой разбирал задачу
// Правил замечания который нашел Валера
// Дописывал свои сценарии Б корректировки НДС КЗК , стиль кода правил,пул
// реквест разбирал
