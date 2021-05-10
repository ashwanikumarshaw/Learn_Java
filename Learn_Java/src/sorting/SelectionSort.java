package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] l = { -11, 1, 9, 2, 8, -2, 9, 6 };
		int n = l.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i; j < n; j++)
				if (l[minIndex] > l[j])
					minIndex = j;

			int temp = l[minIndex];
			l[minIndex] = l[i];
			l[i] = temp;

		}
		for (int item : l)
			System.out.println(item);

	}

}
