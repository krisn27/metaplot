public class r18{
    static void printsortindescending(Integer arr[]){
       
       Arrays.sort(arr,Collections.reverseOrder());
    }
    public static void  main(String args[]){
        Integer arr[]={3,9,5,2,3,1,9};
       
       printsortindescending(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}