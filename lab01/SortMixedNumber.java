public class SortMixedNumber{
	public static void main(String[] args){
		MixedNumber[] arr = new MixedNumber[5];
		for(int i = 0; i < arr.length; i++){
			arr[i] = new MixedNumber(((int)(9 * Math.random() + 1)), ((int)(16 * Math.random() + 5)), ((int)(10 * Math.random() + 1)));
		}

		System.out.println("Original List:");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

		MixedNumber temp;
	   	for(int i = 1; i < arr.length; i++){
	    	for(int j = i; j > 0; j--){
	    		if(arr[j].getLNum() < arr[j - 1].getLNum()){
	    			temp = arr[j];
		      		arr[j] = arr[j - 1];
		      		arr[j - 1] = temp;
	    		}
	    		else if(arr[j].getLNum() == arr[j - 1].getLNum()){
	    			if(arr[j].getRNum().compareTo(arr[j - 1].getRNum()) == -1){
			      		temp = arr[j];
			      		arr[j] = arr[j - 1];
			      		arr[j - 1] = temp;
	     			}
	    		}
	     		else if(arr[j].getRNum().compareTo(arr[j - 1]) == -1){
		      		temp = arr[j];
		      		arr[j] = arr[j - 1];
		      		arr[j - 1] = temp;
	     		}
	    	}
	   	}

	   	System.out.println("Sorted List:");
	   	for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}