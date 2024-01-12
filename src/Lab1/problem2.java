package Lab1;

public class problem2 {
    public static void main(String[] args){
        String x = "121";
        char firstL = x.charAt(0);
        char lastL = x.charAt(x.length()-1);
        if(firstL == lastL){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
