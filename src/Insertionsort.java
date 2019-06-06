import java.util.*;
import java.io.*;
public class Insertionsort {
    void elementinsert(int arr[],int l){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
    }
    void inssort(int arr[],int l){
        int key;
        for(int i=1;i<l;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                key=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=key;
                j--;
            }
        }
    }
    void display(int arr[], int l ){
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Insertionsort is=new Insertionsort();
        System.out.println("Enter the size of the array");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements of the array");
        is.elementinsert(arr,l);
        is.inssort(arr,l);
        System.out.println("The Sorted array is");
        is.display(arr,l);
    }
}
