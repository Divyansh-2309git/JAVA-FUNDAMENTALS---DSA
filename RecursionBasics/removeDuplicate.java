package RecursionBasics;

public class removeDuplicate {
    public static void removeDup(String str , int index , StringBuilder newStr , boolean map[]){
        if (index == str.length()){
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(index);
        if (map[current - 'a'] == true ){
            removeDup(str, index + 1, newStr, map);
        }else{
            map[current- 'a'] = true ; 
            removeDup(str, index +1, newStr.append(current), map);
        }

    }
    public static void main (String args[]){
        String str = "divynashsinghehlloo";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
