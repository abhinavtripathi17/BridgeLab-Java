package Strings.Level3;

import java.util.*;

public class q2 {

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUniqueChars(String s) {
        int n = getLength(s);
        char[] temp = new char[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = c;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = findUniqueChars(text);

        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}

