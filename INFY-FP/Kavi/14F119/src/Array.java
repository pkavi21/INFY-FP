
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int brr[] = { 6, 7, 8, 9, 10 };
		int copy[] = arr;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
			System.out.println(copy[i] + " ");
		}

	}

}
