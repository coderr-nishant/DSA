class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        List<List<Integer>> answer=new ArrayList<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],1);
        }
        for(int i=0;i<nums1.length;i++){
            if(!map2.containsKey(nums1[i])&&map1.containsKey(nums1[i])){
                l1.add(nums1[i]);
                map1.remove(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!map1.containsKey(nums2[i])&&map2.containsKey(nums2[i])){
                l2.add(nums2[i]);
                map2.remove(nums2[i]);
            }
        }
        answer.add(l1);
        answer.add(l2);
        return answer;
    }
}