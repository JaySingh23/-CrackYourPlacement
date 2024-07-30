import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(findDuplicate(str));
    }

    public static String findDuplicate(String str) {
        String ans = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!hm.containsKey(ch))
                hm.put(ch, 1);
            else
                hm.put(ch, hm.get(ch) + 1);   
        }

        for (char ch : hm.keySet()) {
            if(hm.get(ch) > 1)
                ans += ch;
        }
        return ans;
    }
    
}
