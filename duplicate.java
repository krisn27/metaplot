public class duplicate{
    static void printduplicaqte(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate elements be:"+arr[i]);
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,9,8,4,1};
        int n=arr.length;
        printduplicaqte(arr,n);
    }
}