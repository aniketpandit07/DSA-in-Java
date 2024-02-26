













# Data Structure & Algorithms in Java

This repo contains code files of DSA learnings

## Index
### Linear Search 
[ 1) Find first occurrence of an element in given array](#1)


[ 2) Find multiple occurrences of an element in given array](#2)

[ 3) Find maximum in given array](https://github.com/aniketpandit07/DSA-in-Java/blob/main/LinearSearch3.java)

[ 4) Find minimum in given array](https://github.com/aniketpandit07/DSA-in-Java/blob/main/LinearSearch4.java)


## Code

### 1
## Find first occurrence of an element in given array


```java
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
```
### 2
## Find multiple occurrences of an element in given array
```java
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
```

## Author

- [@aniketpandit07](https://www.github.com/aniketpandit07)

