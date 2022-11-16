import java.util.Arrays;

public class Lama {
    private static String toRoman(String string) {
        int[] arr = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'I': arr[i] = 1;break;
                case 'V': arr[i] = 5;break;
                case 'X': arr[i] = 10;break;
                case 'L': arr[i] = 50;break;
                case 'C': arr[i] = 100;break;
                case 'D': arr[i] = 500;break;
                case 'M': arr[i] = 1000;break;}}
        System.out.println(Arrays.toString(arr));
        int result = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result -= arr[i];
            } else {
                result += arr[i];
            }
        }
        result += arr[arr.length - 1];
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(toRoman("CIXM"));
    }
}

