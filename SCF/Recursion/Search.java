public class Search {

	/**
	 * @param arr is the integer array in which search has to be carried out
	 * 
	 * @param element is the element to be searched
	 * 
	 * @return returns index of the key if it is present in the array else
	 * returns -1
	 */
	public int Linear(int[] arr, int element) throws Exception {
		int str = 0;
		return LinearSearch(arr, str, element);

	}

	/**
	 * @param arr is the integer array in which linear search is to be done
	 * @param index is the start index of array
	 * 
	 * @param ele is the element to be searched
	 */
	public int LinearSearch(int[] array, int index, int ele) throws Exception {
		if (index == array.length) {
			return -1;
		}
		if (array.length == 0) {
			throw (new Exception("Empty Array"));
		}
		if (array[index] == ele) {
			return index + 1;
		}

		return LinearSearch(array, ++index, ele);
	}

	/**
	 * @param array is the integer array in which search has to be carried out
	 * @param element is the element to be searched
	 * @return returns index of the key if it is present in the array else
	 * returns -1
	 */
	public int BinarySearch(int[] array, int element){

		if (array.length > 0) {
			int mid_value = (array.length) / 2;

			if (array[mid_value] == element ) {
				return mid_value + 1;
			} else if (element > array[mid_value]) {
				int[] Temp = new int[ array.length - mid_value -1 ];
				int k = 0;
				for (int i = mid_value + 1; i < array.length; i++) {
					Temp[k] = array[i];
					k++;
				}
				int result = 0;
				if ((result = BinarySearch(Temp, element)) < 0) {
					return -1;
				} else {
					return result + mid_value + 1;
				}

			} else {
				int tempArray[] = new int[mid_value];
				for (int i = 0; i < tempArray.length; i++) {
					tempArray[i] = array[i];
				}
				return BinarySearch(tempArray, element);
			}
		} else {
			return -1;
		}

	}

	public static void main(String[] args) throws Exception {
		Search ob=new Search();
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(ob.BinarySearch(a,2));
		System.out.println(ob.Linear(a,5));
	}
}