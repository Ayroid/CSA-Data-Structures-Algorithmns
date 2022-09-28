import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter Elements in Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        for(int i=0;i<size/2;i++){
            int swap = arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=swap;
        }

        System.out.print("ReversedArray: [ ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
}
