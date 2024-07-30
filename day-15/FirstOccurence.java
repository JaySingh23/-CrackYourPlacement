public class FirstOccurence {
    public static void main(String[] args) {
        String s = "mississippi";
        String needle = "issi";
        System.out.println(strStr(s, needle));
    }

    public static int strStr(String haystack, String needle) {
        int l = needle.length();
        int i = 0, index = -1;
        while(i<=haystack.length() && i+l <= haystack.length()) {
            String s = haystack.substring(i, i + l);
            if(s.equals(needle)) {
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
    
}
