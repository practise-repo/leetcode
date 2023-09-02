public class LongestCommonPrefix {
    public static void main(String[] args) {

        // String[]strs = {"flower","flow","flight"};
        String[] strs = { "flower", "flow", "flight" };

        String out = longestCommonPrefix(strs);
        System.out.println("Output= " + out);

    }

    public static String longestCommonPrefix(String[] strs) {

        String output = "\" \"";

        if (!(1 <= strs.length && strs.length <= 200))
            return output;

        for (int i = 0; i < strs.length; i++) {
            if (!(0 <= strs[i].length() && strs[i].length() <= 200))   return output;
            
                System.out.println(strs[i]);
                return output = "Passed the condition";

            

        }

        return "Hello";

    }
}
