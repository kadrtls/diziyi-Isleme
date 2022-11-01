import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz:");
        int size= scanner.nextInt();
        int[] numbers=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("dizinin"+(i+1)+".elemanı:");
            int arrIndex= scanner.nextInt();
            numbers[i]=arrIndex;
        }
        Arrays.sort(numbers);
        System.out.println("Dizi sıralaması:"+Arrays.toString(numbers));
    }
}