// 1) Find first occurrence of an element in given array

public class LinearSearch1 {

    public static void main(String[] args) {
    int arr[]={2,3,6,3,2,24,7,9,54,44,444,22,23,55,65,44,33,3};
      linearSearch(arr, 3);

    }



    public static void linearSearch(int arr[], int target){
        int ans =-1;
        for (int i =0; i<arr.length;i++){
            if(arr[i]==target){
                ans =i;
                break;
        }
    }
        if(ans == -1){
            System.out.println("Element not found");
        }else{

        System.out.println("found element at pos "+ans);
        }
    }
}