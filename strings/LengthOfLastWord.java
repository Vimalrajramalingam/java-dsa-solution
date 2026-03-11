class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String result[]=s.split(" ");
        String last=result[result.length-1];
        for(char a:last.toCharArray())
        {
            count++;

        }
        return count;
        
    }
}
