import java.util.*;
public class increasingSort {
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
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }

        System.out.print("Array: [ ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
}
