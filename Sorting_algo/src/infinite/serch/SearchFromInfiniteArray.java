package infinite.serch;

import java.util.Arrays;
import java.util.List;

public class SearchFromInfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
				18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });

		int target = 23;
		int start = 0;
		int end = 1;
		System.out.println(start + ":" + end);
		while (target > arr.get(end)) {

			int temp = end + 1;
			end = Math.min(end + (end - start + 1) * 2, arr.size() - 1);
			start = temp;
			System.out.println(start + ":" + end);
		}
		System.out.println(start + ":" + end);
		System.out.println(BST(arr, start, end, target));
	}

	private static Integer BST(List<Integer> array, int left, int right, int target) {

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == array.get(mid))
				return mid;
			if (target < array.get(mid)) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
