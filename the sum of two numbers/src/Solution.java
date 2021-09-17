public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][]result=new int[nums.length][nums.length];
        int []location={0,0};
        int flag=0;
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums.length;j++)
                if(i!=j)
                {
                    result[i][j]=nums[i]+nums[j];
                }
                else
                {
                    result[i][j]=0;
                }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
                if(result[i][j]==target&i!=j)
                {
                    location[0]=i;
                    location[1]=j;
                    flag=1;
                    break;
                }
            if(flag==1)
            {
                break;
            }
        }
        return location;
    }
}
