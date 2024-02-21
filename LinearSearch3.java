// 3) Find maximum in given array

public class LinearSearch3 {

    public static void main(String[] args) {
    int arr[]={2,3,6,3,2,24,7,9,54,44,444,22,23,55,65,44,33,3};

    findMax(arr);
      
    }

public static  void findMax(int arr[]){
//        int maxx = Integer.MIN_VALUE; //this is another method to calculate max. just compare element with min value
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max =arr[i];
            }
        }
        System.out.println("maximum is "+max);
    }
}