# Second Largest

### Difficulty:  **Easy**  
### Accuracy: 26.72%  
### Average Time: 15 minutes  

---

## Problem Statement  
Given an array of positive integers `arr[]`, find and return the second largest element in the array. If there is no second largest element, return `-1`.  

**Note:**  
- The second largest element must be **strictly less** than the largest element.  
- If all elements in the array are the same, return `-1`.  

## Examples  

### Example 1  
**Input:**  
`arr[] = [12, 35, 1, 10, 34, 1]`  

**Output:**  
`34`  

**Explanation:**  
The largest element of the array is `35`, and the second largest element is `34`.  

---

### Example 2  
**Input:**  
`arr[] = [10, 5, 10]`  

**Output:**  
`5`  

**Explanation:**  
The largest element of the array is `10`, and the second largest element is `5`.  

---

### Example 3  
**Input:**  
`arr[] = [10, 10, 10]`  

**Output:**  
`-1`  

**Explanation:**  
The largest element of the array is `10`, and since all elements are the same, there is no second largest element.  

---

## Constraints  
- `2 ≤ arr.size() ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^5`  
