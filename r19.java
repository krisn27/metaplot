public class r19{
    static int printpeakelements(int arr[],int n){
        
            if(n==1){
                return 0;
            }
            if(arr[0]>=arr[1]){
                return 0;
            }
            if(arr[n-1]>=arr[n-2]){
                return n-1;
            }
            for(int i=1;i<n-1;i++){
                if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]){
                    return i;
                }
            }
            return 0;
        }
    
    public static void main(String args[]){
        int arr[]={20,3,5,4,1,0};
        int n=arr.length;
        System.out.println("Index of peek point is:"+printpeakelements(arr,n));

    }
}