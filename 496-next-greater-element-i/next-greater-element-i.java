class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        int arr[]=new int[nums1.length];
        for(int i=0;i<arr.length;i++){
            int num=-1;
            for(int j=map.get(nums1[i])+1;j<nums2.length;j++){
                if(j!=nums2.length&&nums2[j]>nums1[i]){
                    num=nums2[j];
                    break;
                }
            }
            arr[i]=num;
        }
        return arr;
    }
}