
public class SelectionSort implements SortingAlgorithm{

	public void sort(int [] a){
		int aLength = a.length;
        for (int i = 0; i < aLength - 1; i++) {
            int min = i;
            for (int j = i + 1; j < aLength; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // swaps
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}