class Solution {
    public static String arr[]={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letter(String digits){
         if(digits.length()==0){
            List<String> base=new ArrayList<>();
           base.add("");
            return base;
        }
        char cur=digits.charAt(0);
        String ros=digits.substring(1);
        List<String> ans=letter(ros);
        List<String> Fans=new ArrayList<>();
        int idx=cur-'0';
        String word=arr[idx-1];
        for(int i=0;i<word.length();i++){
            for(int j=0;j<ans.size();j++){
                Fans.add(word.charAt(i)+ans.get(j));
            }
        }
        return Fans;
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        List<String> ans=letter(digits);
        return ans;
}
}
