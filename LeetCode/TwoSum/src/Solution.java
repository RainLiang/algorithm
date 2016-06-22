import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] sortNum = nums.clone(); //拷贝数组nums
        Arrays.sort(sortNum);//采用Java自带的排序方法，底层采用的是快速排序，最优时间复杂度O(nlogn) 
        int size = nums.length;
        int[] answers = new int[2];
        //遍历数组，通过二分查找获取是否存在一个
        for(int i = 0 ; i < size ; i++)
        {
            int result = target - sortNum[i];
            int count = 0; 
            //如果能够查询到数组中存在result值
            if(Arrays.binarySearch(sortNum,result) != -1)
            {
            
                for(int j = 0 ; j < size ; j++)
                {
                    if((nums[j] == sortNum[i]) || (nums[j] == result))
                    {
                        count++;
                        if(count == 2)
                        {
                            answers[1] = j;
                            break;
                        }
                        answers[0] = j;
                    }
                }
            }
        }
        return answers;
    }
   
}