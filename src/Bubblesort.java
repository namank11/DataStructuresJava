import java.util.*;
class Bubblesort {
    int c;
    public void insertele(int arr[],int l){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void bswap(int arr[],int l){
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++){
                if (arr[j]>arr[j+1]){
                    c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
    }
    public void darr(int arr[]){
        System.out.println("The sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bubblesort bb=new Bubblesort();
        System.out.println("Enter the elements you want to enter in the array");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements of the array!");
        bb.insertele(arr,l);
        bb.bswap(arr,l);
        bb.darr(arr);
    }
}
