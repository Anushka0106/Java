import java.util.Scanner;

public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int arr[]= new int[size];

        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }
for(int i =0;i<arr.length-1;i++){
    int small = i;

    for(int j =i+1;j<arr.length;j++){
        if(arr[small]>arr[j])
        {
            small=j;

        }
    }
    int temp = arr[small];
    arr[small]=arr[i];
    arr[i]=temp;
}
printArray(arr);

    }
    
}
