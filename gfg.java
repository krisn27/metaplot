import java.util.*;
public class gfg{
    public static void main(String args[]){
        Stack<Integer>st=new Stack<>();
        st.push(4);
        st.push(9);
        st.push(10);
        //System.out.println(st);
          
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}