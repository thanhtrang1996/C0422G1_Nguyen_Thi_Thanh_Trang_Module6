

public class Number {
//    public static void main(String[] args) {
//        int  arr[] = {1,2,3,4,5,6,7,8,9};
//        int N  = 6;
//        for (int i = 0; i <= arr.length - 1; i++){
//            for (int j = i+1; j <= arr.length - 1; j++){
//                if(arr[i] + arr[j] == N){
//                    System.out.print("Vị trí của số  " + arr[i] + " :" + i);
//                    System.out.println("Vị trí của số " + arr[j] + ":" +j);
//                    break;
//                };
//            };
//        }
//    }
public static void main(String[] args) {
    octalConvert(177);
}

    public static void octalConvert(int n) {
        String str = "";
        while (n != 0) {
            str = n % 8 + str;
            n = n / 8;
        }
        System.out.println(str);
    }
}
