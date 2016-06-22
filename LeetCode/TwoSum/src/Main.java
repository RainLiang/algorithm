public class Main {
	public static void main(String[] args) {
		int arr[] = {3,2,4,5,6,7,6,20,19,21,24,17,16,15,11,12,13};
		int target = 6;
		int results[] = Solution.twoSum(arr, target);
		System.out.println(results[0]+","+results[1]);
	}
}
