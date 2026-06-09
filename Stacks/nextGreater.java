import java.util.*; 
public class nextGreater{
    public static void main(String[] args){
        int[] arr = {6 , 8 , 0 , 1 , 3} ; 
        Stack <Integer> s = new Stack<>(); 
        int nextGreat[] = new int[arr.length]; 

        for( int i = arr.length -1 ; i >=0 ; i --){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop() ; 
            }
            if(s.isEmpty()){
                nextGreat[i] = -1 ; 
            }else{
                nextGreat[i] = arr[s.peek()]; 
            }
            s.push(i); 
            
        }

        for(int i = 0 ; i < arr.length  ; i ++ ){
            System.out.println(nextGreat[i]); 
        }
    }
}