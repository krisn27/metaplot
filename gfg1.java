public class gfg1{
    static void rotatearray(int arr[],int n,int d){
        int p=1;
        //int last=arr[0];
        while(p<=d){
            int last=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            p++;


        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){

        int arr[]={9,8,6,5,4,34};
        int n=arr.length;
        int d=2;
        rotatearray(arr,n,d);

    }
}