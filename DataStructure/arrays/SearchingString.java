package DataStructure.arrays;
import java.lang.String;
public class SearchingString {
    public static void main(String[] args) {
            String name = "Hello How are you?";
            char target = 'H';
            System.out.println(Search(name,target));

    }

    static  Boolean Search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for(int index=0; index<str.length();index++){
            //find particular character at index
            if (target==str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
