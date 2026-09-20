class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int i=0;
        HashSet<Integer> set=new HashSet<>();
        for(int j:nums){
            if(set.contains(j)){
                arr[i]=j;
                i++;
                if(i==2){
                    break;
                }
            }
            set.add(j);
        }
        return arr;
    }
}