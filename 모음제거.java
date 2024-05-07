//1
import java.util.*;

class Solution {
    public StringBuilder solution(String my_string) {
        String[] arr = {"a", "e", "i", "o", "u"};

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<my_string.length(); i++){
            list.add(String.valueOf(my_string.charAt(i)));
        }

        for(int i = list.size() - 1; i >= 0; i--){
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals(list.get(i))){
                    list.remove(i);
                    break; 
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
        }
        return sb;
    }
}

//2
import java.util.*;

class Solution {
    public String solution(String my_string) {
        for(int i=0; i<my_string.length(); i++){
            my_string = my_string.replaceAll("[aeiou]", "");
        }
        
        return my_string;

    }
}