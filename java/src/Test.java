import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số mà bạn muốn sắp xếp  :");
       int count = Integer.parseInt(scan.nextLine());
        int str[] = new int[count];
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Nhập giá trị cho từng chuỗi:");
        for(int i = 0; i < count; i++)
        {
            str[i] = Integer.parseInt(scan2.nextLine());
        }
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (str[i] > str[j])
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.print("Các chuỗi sau khi sắp xếp là:");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.print(str[i] + ", ");
        }
    }
}
