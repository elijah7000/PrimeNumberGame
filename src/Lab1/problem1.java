package Lab1;

public class problem1 {
    public static void main(String[] args){
        int[] array = {3,3};
        int target = 6;
        int arrayLength = array.length;
        for(int i = 0; i<arrayLength; i++){
            for(int j = 1; j<arrayLength; j++){
                int result = array[i] +  array[j];
                if(result == target ){
                    System.out.println(i + " " + j);
                    break;
                }else{
                    break;
                }
            }
        }
    }

}
