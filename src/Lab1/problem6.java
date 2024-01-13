package Lab1;

import java.util.Arrays;

public class problem6 {
    public static void main(String[] args){
        int[] list1 = {1,2,4};
        int[] list2 = {1,3,4};
        int arryLength = list1.length + list2.length;
        int[] array = new int[arryLength];
        System.arraycopy(list1,0,array,0,list1.length);
        System.arraycopy(list2,0,array,list1.length,list2.length);
       Arrays.sort(array);
       System.out.println(Arrays.toString(array));


    }
}
