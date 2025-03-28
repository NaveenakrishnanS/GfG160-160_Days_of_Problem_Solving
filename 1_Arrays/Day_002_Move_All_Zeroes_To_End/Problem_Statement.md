# **Move All Zeroes to End**  

### 🟢 Difficulty: **Easy**  

---  

## 📌 Problem Statement  
You are given an array `arr[]` of **non-negative integers**. Your task is to move all the **zeroes** in the array to the **right end** while maintaining the **relative order** of the non-zero elements.  

🔹 The operation must be performed **in place**, meaning you **should not use extra space** for another array.  

🔗 **[View Problem on GFG](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751)**  

---  

## 🔹 Examples  

### **Example 1**  
🔹 **Input:**  
```plaintext
arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
```  
🔹 **Output:**  
```plaintext
[1, 2, 4, 3, 5, 0, 0, 0]
```  
🔹 **Explanation:**  
There are **three zeroes** that are moved to the end.  

---  

### **Example 2**  
🔹 **Input:**  
```plaintext
arr[] = [10, 20, 30]
```  
🔹 **Output:**  
```plaintext
[10, 20, 30]
```  
🔹 **Explanation:**  
No change in the array as there are no zeroes.  

---  

### **Example 3**  
🔹 **Input:**  
```plaintext
arr[] = [0, 0]
```  
🔹 **Output:**  
```plaintext
[0, 0]
```  
🔹 **Explanation:**  
No change in the array as all elements are zeroes.  

---  

## 🔹 Constraints  
- `1 ≤ arr.size() ≤ 10^5`  
- `0 ≤ arr[i] ≤ 10^5`  
