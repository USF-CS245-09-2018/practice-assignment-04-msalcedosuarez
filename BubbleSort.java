
public class BubbleSort implements SortingAlgorithm{

	public void sort(int [] a){


		 int n = a.length;
        for (int i = 0; i < n-1; i++){

            for (int j = 0; j < n-i-1; j++){
            	 if (a[j] > a[j+1]) {
                    // swap temp and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
             
        }

		// for(int i = 0; i < a.length -1; i++){
		// 	if(a[i] > a[i+1]){
		// 		swap(i, i+1, a);
		// 	}
		// }
	}

	// public void swap(int a, int b, int[] arr){
	// 	int temp = arr[a];
	// 	arr[a] = arr[b];
	// 	arr[b] = temp;
	// }
 
}