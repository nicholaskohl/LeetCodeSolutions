public class mergesort{
	public static void main(String[] args){
		int[] one = {5,2,3,1};
		int[] two = {5,1,1,2,0,0};
		sortArray(one, 0, one.length - 1);
		sortArray(two,0, two.length - 1);
		printArray(one);
		printArray(two);
	}
	private static void sortArray(int[] nums, int lowIndex, int highIndex){
		if(lowIndex >= highIndex){
			return;
		}
		int pivot = nums[highIndex];
		int leftpointer = lowIndex;
		int rightpointer = highIndex;
		while(leftpointer < rightpointer){
			while(nums[leftpointer] <= pivot && leftpointer < rightpointer){
				leftpointer++;
			}
			while(nums[rightpointer] >= pivot && leftpointer< rightpointer){
				rightpointer--;
			}
			swap(nums,leftpointer,rightpointer);

		}
		swap(nums,leftpointer,highIndex);
		sortArray(nums,lowIndex,leftpointer - 1);
		sortArray(nums,leftpointer + 1, highIndex);

	}
	
	private static void swap(int[] nums, int index1, int index2){
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

	private static void printArray(int[] array){
	for(int i = 0; i < array.length; i++){
	System.out.print(array[i] + " ");
	}
	System.out.println();
	}

}
