import java.util.*;
public class Majority {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i=0, j=0, flag=0;
            System.out.print("Enter Array Size: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter Elements in Array: ");
            for(i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            for(i=0;i<(size/2)+1;i++){
                int count=0;
                for(j=i;j<size;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>=size/2){
                    System.out.println("Majority Element: "+arr[i]);
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                System.out.println("No Majority Element Present!");
            }
        }
    }
}
