public class BinaryRecursiveSearch implements Practice03Search {

	public String searchName(){
		return ("Binary Recursive");
	}

	public int search(int[]a, int target) {
		return search(a, target, 0, a.length-1);
	}

	public int search(int[]a, int target, int start, int end){

		if(end<start){
			return -1;
		}

		int mid = (start + end)/2;
		if(a[mid] == target){
			return mid;
		}
		else if(target < a[mid]){
			return search(a, target, start, mid -1);
		}
		else{
			return search(a, target, mid+1, end);
		}
	}
}