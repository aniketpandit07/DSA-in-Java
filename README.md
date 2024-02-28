
# Data Structure & Algorithms in Java

#### Welcome to the comprehensive repository for Data Structures and Algorithms in Java! The code snippets are organized neatly in the README file, written in Markdown for easy readability.

### Index 

[Linear Search](#linear-search)

[Binary Search](#binary-search)


## Code

### accordion
## Linear Search
<!-- 1 -->
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

<!-- 2 -->
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

<!-- 3  -->
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

<!-- 4 -->
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

## Binary Search
<!-- 1 -->
<details>
<summary>1) Find target element in non decreasing Array</summary>

```java
//code
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

<!-- 2 -->
<details>
<summary>2) Find target element in non increasing Array</summary>

```java
//code
public class BinarySearch1 {
    public static void main(String[] args) {
        //non-decreasing order
        int arr[]={22,20,16,15,15,12,10,6,2,1,1};
        binarySearchDesc(arr,56);

    }

public static void binarySearchDesc(int arr[], int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            } else if (arr[mid]<target) {
                end = mid - 1;
            }else{
               start = mid +1;
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

<!-- 3 -->
<details>
<summary>3) find target in order Agnostics Array </summary>

```java
//code
//order agnostics means we don’t know the order is incresing or decresing
public class BinarySearch1 {
    public static void main(String[] args) {
        //non-decreasing order
        int arr[] ={2,4,8,9,23,56,77,85};
				int arr2[]={22,20,16,15,15,12,10,6,2,1,1};

        binarySearchOrderAgnostic(arr, 23);
        binarySearchOrderAgnostic(arr2, 10);

    }
public static void binarySearchOrderAgnostic (int arr[], int target ){
        int start = 0;
        int end = arr.length -1;
        if(arr[start]<=arr[end]){
            binarySearch(arr, target);
        }
        else{
            binarySearchDesc(arr, target);
        }
    }
}
```
</details>

<!-- 4 -->
<details>
<summary>4) Finding the first and last occurrence of a particular element</summary>

```java
//code
public class BinarySearch2 {
    public static void main(String[] args) {
    int arr[] = {2,3,4,4,4,5,7,9,33,99};
    firstLastOccurrence(arr,4,true); //it gives first occurrence
    firstLastOccurrence(arr,4,false); //it gives last occurrence

    }
    public static void firstLastOccurrence(int arr[], int target, boolean isFirst){
            int ans =-1;
            int start = 0;
            int end = arr.length-1;


            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]==target){
                    ans = mid;
                    if(isFirst ==true){
                        end = mid -1;
                    }
                    else{
                        start = mid +1;
                    }
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

<!-- 5 -->
<details>
<summary>5) Count all the occurrence of an element in the array</summary>

```java
//code
public class BinarySearch3 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,5,5,6,7,7,7,7,7,8};
        int res[] = new int [2];
        int first = totalOccurrence(arr,7,true);
        int last = totalOccurrence(arr,7,false);
        if(first ==-1){
            System.out.println("Occurrence is " + 0);
        }else{

        System.out.println("Occurrence of target is "+ (last - first +1));
        }

    }

    public static int totalOccurrence(int arr[], int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirst == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("element not found");
        } else {
            System.out.println(target + " found at index " + ans);
        }

    return ans;
    }
	}
}
```
</details>

<!-- 6 -->
<details>
<summary>6) Find the FLOOR value of target element if target is not present</summary>

```java
//code
public class BinarySearch4 {
    public static void main(String[] args) {

        int arr[] = {4,4,5,6,8,9,15,15,17,18,19,40};
        binarySearchFloor(arr, 20);
        
    }

public static void binarySearchFloor(int arr[], int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = arr[mid];
                break;
            } else if (arr[mid]<target) {
                start = mid+1;
                ans = arr[mid];  //if we write ans = mid then it returns the index of that value
            }else{
                end = mid-1;
            }
        }
        if(ans ==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println(target+" floor value present is  "+ans);
        }
    }
}
```
</details>

<!-- 7 -->
<details>
<summary>7) Find the CEIL value of target element if target is not present</summary>

```java
//code
public class BinarySearch4 {
    public static void main(String[] args) {

        int arr[] = {4,4,5,6,8,9,15,15,17,18,19,40};
        binarySearchCeil(arr,3);
        
    }

public static void binarySearchCeil(int arr[], int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = arr[mid];
                break;
            } else if (arr[mid]<target) {
                start = mid+1;

            }else{
                end = mid-1;
                ans = arr[mid];  //if we write ans = mid then it returns the index of that value
            }
        }
        if(ans ==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println(target+" ceil value present is  "+ans);
        }
    }

}
```
</details>

<!-- 8 -->
<details>
<summary>8) Find minimum element in bitonic array</summary>

```java
//code
public static void main(String[] args) {
    int arr []= {2,5,7,11,13,16,10,8,6,2,1};
        findMinElementInBitonicArray(arr);
    }

public static void findMinElementInBitonicArray(int arr[]){
        int firstIdx = arr[0];
        int lastIdx = arr[arr.length-1];
        if(arr.length ==0){
            System.out.println("array is empty");
        } else if (arr.length == 1) {
            System.out.println("Min element is "+ arr[0]);
        }else{
//            int result = (arr[0]<arr[arr.length-1])?arr[0]:arr[arr.length-1];
            int result = (firstIdx<lastIdx)?firstIdx:lastIdx;
            System.out.println("min element is"+ result);
        }
    }
}
```
</details>

<!-- 9 -->
<details>
<summary>9) Find peak element in bitonic array</summary>

```java
//code
public class BitonicArray {
    public static void main(String[] args) {
    int arr []= {2,5,7,11,13,16,10,8,6,2,1};
        int index = findPeakInBitonicArray(arr);
        if(index ==-1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Found "+arr[index]+" at "+index);
        }
    }

public static int findPeakInBitonicArray(int []arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int next = (mid+1)%arr.length;
            int prev = (mid-1+arr.length)%arr.length;


            //you are in bitonic array
            if(arr[mid]> arr[prev] && arr[mid]>arr[next]){
                return mid;
            }
            //you are in increasing array
            else if(arr[mid]> arr[prev]){
                start = mid+1;
            }
            //you are in decreasing array
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
```
</details>

### 🗿Author
- [@aniketpandit07](https://www.github.com/aniketpandit07)

### 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://aniketpandit07.github.io/portfolio-hub/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/aniket-pandit-7b1951201/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/aniketpandit07)



