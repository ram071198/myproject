import java.util.*;
class QuickSort{
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter Ten Values");
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = sc.nextInt();
		}
		int length = arr.length;
		int low = 0,high = length-1;
		QuickSort q = new QuickSort();
		q.recurArray(arr,low,high);
		q.printArray(arr);
	}

	int partitionArray(int [] arr,int low,int high)
	{
		int pi = (low + high)/2;
		while (low<=high) {
			while (arr[low]<arr[pi]) {
				low++;
			}
			while (arr[high]>arr[pi]) {
				high--;
			}
			if (low<=high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
				
			}
		}
		return low;
	}

	void recurArray(int [] arr,int low,int high)
	{
		int pi = partitionArray(arr,low,high);
		if (low<pi-1) {
			recurArray(arr,low,pi-1);
		}
		if (high>pi-1) {
			recurArray(arr,pi,high);
		}
	}

	void printArray(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
}