package Demo;

public class Counttheelement {
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 3,2};
		for (int i = 0; i < arr.length; i++) {
			boolean alreadyCounted = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
				alreadyCounted = true;
				break;
				}
			}
			if (alreadyCounted) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i] + " -> " + count);
		}
	}

}
