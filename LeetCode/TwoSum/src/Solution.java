import java.util.Arrays;

/**
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution.
* Input: numbers={2, 7, 11, 15}, target=9
* Output: index1=1, index2=2
*/
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] sortNum = nums.clone(); //拷贝数组nums
        Arrays.sort(sortNum);//采用Java自带的排序方法，底层采用的是快速排序，最优时间复杂度O(nlogn) 
        int size = nums.length;
        int[] answers = new int[2];
        //遍历数组，通过二分查找获取是否存在一个
        for(int i = 0 ; i < size ; i++)
        {
            int count = 0; 
            int index1 = 0;
            int index2 = 0;
            int result = target - sortNum[i];
            //如果能够查询到数组中存在result值
            if(Arrays.binarySearch(sortNum,result) > 0)
            {
                for(int j = 0 ; j < size ; j++)
                {
                    if((nums[j] == sortNum[i]) || (nums[j] == result))
                    {
                        count++;
                        if(count == 2)
                        {
                            index2 = j;
                            answers[0] = index1 < index2 ? index1 : index2;
                            answers[1] = index2 < index1 ? index1 : index2;
                            break;
                        }
                        else
                        {
                            index1 = j;
                        }
                    }
                }
            }
        }
        return answers;
    }
}