import java.io.*;
import java.util.*;
public class Selectionsort {
    void insertlement(int arr[],int l){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
    }
    void selsort(int arr[],int l){
        for(int i=0;i<l;i++){
            int min=i;
            for(int j=i;j<l;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int key=arr[min];
            arr[min]=arr[i];
            arr[i]=key;
        }
    }
    void display(int arr[],int l){
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Selectionsort ss=new Selectionsort();
        System.out.println("Enter the array Size");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements of the array");
        ss.insertlement(arr,l);
        ss.selsort(arr,l);
        System.out.println("Sorted array is:");
        ss.display(arr,l);
    }
}
