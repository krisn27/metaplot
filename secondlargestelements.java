
import java.util.Arrays;
import java.util.Collection;

public class secondlargestelements{
    static int  print2elements(Integer arr[],int n){
        Arrays.sort(arr,Collection.reverseorder());
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[0]){
                System.out.println("the second largest elements be:"+arr[i]);

               return;
                
            }
            return -1;
            
        }
        

    }
    public static void main(String[] args) {
        Integer arr[]={3,2,5,9,8};
        int n=arr.length;
        print2elements(arr,n);

    }

}