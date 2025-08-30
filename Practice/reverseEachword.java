import java.util.*;
public class reverseEachword {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int i = 0 , j = 0;
        int n = s.length();


        while(j <= n){
            if(j == n || arr[j] == ' '){
                reverse(arr, i, j-1);
                i = j + 1;

            }
            j++;
            
        }
        String str = new String(arr);
        System.out.println(str);

    }

    public static void reverse(char[] arr, int i, int j) {
    
    int l = i, r = j;

    while (l < r) {
        char temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        l++;
        r--;
    }
}

}
