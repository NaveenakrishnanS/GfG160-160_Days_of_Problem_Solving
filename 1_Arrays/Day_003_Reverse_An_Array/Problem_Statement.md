# **Reverse an Array**  

### 🟢 Difficulty: **Easy**  

---  

## 📌 Problem Statement  
You are given an array of integers `arr[]`. Your task is to **reverse** the given array.

🔹 Modify the array **in place**.

🔗 **[View Problem on GFG](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array/)**  

---  

## 🔹 Examples  

### **Example 1**  
🔹 **Input:**  
```plaintext
arr[] = [1, 4, 3, 2, 6, 5]
```  
🔹 **Output:**  
```plaintext
[5, 6, 2, 3, 4, 1]
```  
🔹 **Explanation:**  
The elements of the array are `1 4 3 2 6 5`. After reversing the array, the first element goes to the last position, the second element goes to the second last position, and so on. Hence, the answer is `[5, 6, 2, 3, 4, 1]`.  

---  

### **Example 2**  
🔹 **Input:**  
```plaintext
arr[] = [4, 5, 2]
```  
🔹 **Output:**  
```plaintext
[2, 5, 4]
```  
🔹 **Explanation:**  
The elements of the array are `4 5 2`. The reversed array will be `[2, 5, 4]`.  

---  

### **Example 3**  
🔹 **Input:**  
```plaintext
arr[] = [1]
```  
🔹 **Output:**  
```plaintext
[1]
```  
🔹 **Explanation:**  
The array has only a single element, hence the reversed array is the same as the original.  

---  

## 🔹 Constraints  
- `1 ≤ arr.size() ≤ 10^5`  
- `0 ≤ arr[i] ≤ 10^5`  