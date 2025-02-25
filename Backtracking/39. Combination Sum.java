class Solution {
    public void helper(int arr[],int target,int i,List<List<Integer>> ans,List<Integer> subans){
        if(i==arr.length || target<0){
               return;
        }
        if(target==0){
            ans.add(new ArrayList<>(subans));
            return;
        }
        subans.add(arr[i]); // include the current element
        helper(arr,target-arr[i],i,ans,subans); // allow multiple elemnt 
        subans.remove(subans.size()-1); // backtracking
        helper(arr,target,i+1,ans,subans); // exclude curent elemnt move to next
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subans=new ArrayList<>();
        helper(candidates,target,0,ans,subans);
        return ans;
    }
}
