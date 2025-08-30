import java.util.*;

public class q8 {
    public static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]); 
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // generateException(names);   // Will crash
        handleException(names);        // Will catch exception
    }
}
