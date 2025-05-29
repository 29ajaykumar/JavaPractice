package bubble.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[20];
		
		for(int i = 0;i<arr.length;i++) {
			int num = (int)Math.random()*10;
			arr[i]=num;
		}
		System.out.println(arr);
		
	}



}
