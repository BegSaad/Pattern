import java.util.*;
public class Largearrayelement {
    public static int MaxArray(int arr[],int length){
    int max = arr[0];
    int index=0;
     
        for(int i=0;i<length;i++){
             if(arr[i]>max){
                max=arr[i];
                index =i;
             }
        }
        System.out.println(max);
        System.out.println(index);



        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
        MaxArray(arr, n);
        sc.close();
    }
    
}
