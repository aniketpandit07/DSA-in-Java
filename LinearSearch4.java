// 4) Find minimum in given array

public class LinearSearch4 {

    public static void main(String[] args) {
    int arr[]={2,3,6,3,2,24,7,9,54,44,444,22,23,55,65,44,33,3};

       findMinimum(arr);
    }

public static void findMinimum(int arr[]){
//        int minn = Integer.MAX_VALUE;
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum is "+min);
    }


}
