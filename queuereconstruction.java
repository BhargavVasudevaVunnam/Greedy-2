//time complexity: O(n2)
//space complexity: O(n)
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people,(n1,n2) -> (n2[0]==n1[0]) ? n1[1]-n2[1]: n2[0]-n1[0]);
        List<int[]> res=new LinkedList<>();
        for(int[] p:people) res.add(p[1],p);
        return res.toArray(new int[people.length][2]);
    }
  
}