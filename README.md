
# Data Structure & Algorithms in Java

This repo contains code files of DSA learnings

## Index 

### Linear Search 
[ 1) Find first occurrence of an element in given array](#1)

[ 2) Find multiple occurrences of an element in given array](#2)

[ 3) Find maximum in given array](#3)

[ 4) Find minimum in given array](#4)


## Code

### 1
[Back to top](#Index)


## accordion
<details>
<summary>1) Find target element in non decreasing Array</summary>

```java
public class BinarySearch1 {
    public static void main(String[] args) {
        //non-decreasing order
        int arr[] ={2,4,8,9,23,56,77,85};
        binarySearch(arr,56);

    }

public static void binarySearch(int arr[], int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        if(ans ==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println(target+" found at index "+ans);
        }
    }
}
```
</details>

<details>
<summary>1)Find first occurrence of an element in given array</summary>

```java
public class LinearSearch {

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
</details>

<details>
<summary>2) Find multiple occurrences of an element in given array</summary>

```java
//code
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
</details>

<details>
<summary>3) Find maximum in given array</summary>

```java
//code// 3) Find maximum in given array

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
```
</details>

<details>
<summary>4) Find minimum in given array</summary>

```java
//code
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

```

</details>

<details>
<summary></summary>

```java
//code

```

</details>

<details>
<summary></summary>

```java
//code

```

</details>

## Author

- [@aniketpandit07](https://www.github.com/aniketpandit07)

## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://aniketpandit07.github.io/portfolio-hub/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/aniket-pandit-7b1951201/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/aniketpandit07)



