// 2) Find multiple occurrences of an element in given array


public class LinearSearch2 {

    public static void main(String[] args) {
    int arr[]={2,3,6,3,2,24,7,9,54,44,444,22,23,55,65,44,33,3};
     
		 linearSearchMultiple(arr,3);
    }

 public static void linearSearchMultiple(int arr[], int target){

        int ans[]= new int[arr.length];
        int k =0;
        for (int i =0; i<arr.length;i++){
            if(arr[i]==target){
                ans[k] =i;
                k++;
            }
        }
        if(k == 0){
            System.out.println("Element not found");
        }else{
            for(int i= 0; i<k; i++)
            System.out.println("found element at pos "+ans[i]);
        }
    }

}