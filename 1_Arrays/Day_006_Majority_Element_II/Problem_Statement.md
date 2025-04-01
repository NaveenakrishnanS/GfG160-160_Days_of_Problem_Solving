# **Majority Element II**  

### 🟠 Difficulty: **Medium**  

---  

## 📌 Problem Statement  
You are given an array of integers `arr[]` where each number represents a **vote** to a candidate. Your task is to return the candidates that have votes **greater than one-third** (`n/3`) of the total votes. If there is no such majority vote, return an **empty array**.  

🔹 The answer should be returned **in increasing order**.  

🔗 **[View Problem on GFG](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226)**  

---  

## 🔹 Examples  

### **Example 1**  
🔹 **Input:**  
```plaintext
arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
```  
🔹 **Output:**  
```plaintext
[5, 6]
```  
🔹 **Explanation:**  
Elements `5` and `6` appear **more than n/3 times**, hence they are included in the output.  

---  

### **Example 2**  
🔹 **Input:**  
```plaintext
arr[] = [1, 2, 3, 4, 5]
```  
🔹 **Output:**  
```plaintext
[]
```  
🔹 **Explanation:**  
No element appears **more than n/3 times**, so the result is an empty array.  

---  

## 🔹 Constraints  
- `1 ≤ arr.size() ≤ 10^6`  
- `-10^9 ≤ arr[i] ≤ 10^9`  
