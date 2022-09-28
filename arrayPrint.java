import java.util.*;
public class arrayPrint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.print("Array: [ ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
}