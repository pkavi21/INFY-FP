
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sin = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY 1:");
		int m = sin.nextInt();
		int arr[] = new int[m];
		System.out.println("ENTER THE ELEMENTS:");
		for (int i = 0; i < m; i++) {
			arr[i] = sin.nextInt();
		}
		System.out.println("ENTER THE SIZE OF ARRAY 2:");
		int n = sin.nextInt();
		int brr[] = new int[n];
		System.out.println("ENTER THE ELEMENTS:");
		for (int i = 0; i < n; i++) {
			brr[i] = sin.nextInt();
		}
		int a = m + n;
		int mer[] = new int[a];
		for (int i = 0; i < m; i++) {
			mer[i] = arr[i];
		}
		for (int j = m, i = 0; j < a; j++, i++) {
			mer[j] = brr[i];
		}
		Arrays.sort(mer);
		System.out.println("AFTER MERGING:");
		for (int i = 0; i < mer.length; i++) {
			System.out.println(mer[i] + " ");
		}
		float med;
		if (mer.length % 2 != 0) {
			int mid = (mer.length / 2);
			med = mer[mid];
			System.out.println("MEDIAN:" + med);

		} else {
			int mid = (mer.length / 2);
			med = mer[mid] + mer[mid - 1];
			med = med / 2;
			System.out.println("MEDIAN:" + med);
		}

	}

}
