public class r23{
    public static void main(String args[]){
        String str="My Name is KrishRanjan";
        int count=0;
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}