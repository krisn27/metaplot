public class r11{
    static boolean ispalidrome(String str){
        int low=0;
        int high=str.length()-1;
        while(low<=high){
            if((str.charAt(low))!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void main(String args[]){
        String str="aba";

        System.out.println(str+" " +"is palidrome"+ " "+ispalidrome(str));
        
    }
}