# **Rotate Array**

### 🟠 Difficulty: **Medium**  

---  

## 📌 Problem Statement  
Given an array `arr[]`, rotate the array to the **left** (*counter-clockwise direction*) by `d` steps, where `d` is a positive integer. Perform the operation **in place** without using extra space.

🔹 Consider the array as **circular**.

🔗 **[View Problem on GFG](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621)**  

---  

## 🔹 Examples  

### **Example 1**  
🔹 **Input:**  
```plaintext
arr[] = [1, 2, 3, 4, 5], d = 2
```
🔹 **Output:**  
```plaintext
[3, 4, 5, 1, 2]
```
🔹 **Explanation:**  
When rotated by **2** elements, it becomes `[3, 4, 5, 1, 2]`.

---  

### **Example 2**  
🔹 **Input:**  
```plaintext
arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
```
🔹 **Output:**  
```plaintext
[8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
```
🔹 **Explanation:**  
When rotated by **3** elements, it becomes `[8, 10, 12, 14, 16, 18, 20, 2, 4, 6]`.

---  

### **Example 3**  
🔹 **Input:**  
```plaintext
arr[] = [7, 3, 9, 1], d = 9
```
🔹 **Output:**  
```plaintext
[3, 9, 1, 7]
```
🔹 **Explanation:**  
Rotating **9** times results in `[3, 9, 1, 7]` (since `9 % 4 = 1`, it's equivalent to rotating **1** step).

---  

## 🔹 Constraints  
- `1 ≤ arr.size(), d ≤ 10^5`  
- `0 ≤ arr[i] ≤ 10^5`  
