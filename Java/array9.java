import java.util.Scanner;
public class array9 {
	static int[] arr = {1,10,10,2};
	public static int[] withoutTen(int[] nums) {
		int[] copy = new int[nums.length];
		int j = 0;
		for (int i=0; i<nums.length; i++)
			if (nums[i] != 10) {
				copy[j] = nums[i];
				j++;
}
		return copy;
}
	public static void main(String[] args) {
		int[] result = withoutTen(arr);
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i]+"  \t");

}
}
}