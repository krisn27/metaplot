import java.util.*;
public class r20{
    static void sort(int arr[]){
        Arrays.sort(arr);
    }
    static int search(int arr[],int n,int k){
        
        int l=0,r=n-1;
        
        while(l<=r){
            int mid=(l+r)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(arr[mid]<k){
            l=mid+1;

        }
        else{
            r=mid-1;
        }
        
    }
    return -1;
}
    public static void main(String args[]){
        int arr[]={5,9,45,23,7,86};
        int n=arr.length;
        int k=23;
        sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int result=search(arr,n,k);
        if(result==-1){
            System.out.println("elements is not present");
        }
        else{
            System.out.println("elements is present in" + "index:"+result);
        }
    }
}