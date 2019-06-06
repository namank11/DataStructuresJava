import java.util.*;
import java.io.*;
public class test {

    public static void main(String[] args) {
        int[] arr=new int[]{6,2,9,1,4};
        int less=Arrays.stream(arr).min().getAsInt();
        System.out.println(less);
    }
}
