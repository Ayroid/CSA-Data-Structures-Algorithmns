import java.util.*;
public class rightRotations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i=0, j=0;
            System.out.print("Enter Array Size and Number of Rotations: ");
            int size = sc.nextInt();
            int rotations = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter Elements in Array: ");
            for(i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            for(j=0;j<rotations;j++){
                int temp=arr[size-1];
                for(i=size-1;i>0;i--){
                    arr[i]=arr[i-1];
                }
                arr[0]=temp;
            }

            System.out.print("Array: [ ");
            for(i=0;i<size;i++){
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}