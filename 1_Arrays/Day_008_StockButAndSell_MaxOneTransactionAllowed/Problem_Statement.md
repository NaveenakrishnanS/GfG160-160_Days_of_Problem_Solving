# **Stock Buy and Sell – Max One Transaction Allowed**

### 🟢 Difficulty: **Easy**  

---  

## 📌 Problem Statement  
Given an array `prices[]` of length `n`, representing the prices of the stocks on different days. The task is to find the **maximum profit** possible by buying and selling the stocks on different days when **at most one transaction is allowed**. Here, **one transaction** means **1 Buy + 1 Sell**. If it is not possible to make a profit, return `0`.

🔹 **Note:**  
- A stock must be **bought before** being **sold**.  

🔗 **[View Problem on GFG](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2)**  

---  

## 🔹 Examples  

### **Example 1**  
🔹 **Input:**  
```plaintext
prices[] = [7, 10, 1, 3, 6, 9, 2]
```
🔹 **Output:**  
```plaintext
8
```
🔹 **Explanation:**  
- Buy the stock on **day 2** at `price = 1` and sell it on **day 5** at `price = 9`.  
- **Maximum Profit** = `9 - 1 = 8`

---  

### **Example 2**  
🔹 **Input:**  
```plaintext
prices[] = [7, 6, 4, 3, 1]
```
🔹 **Output:**  
```plaintext
0
```
🔹 **Explanation:**  
- Here, prices are in decreasing order, meaning no profit can be made.  
- **Answer:** `0`

---  

### **Example 3**  
🔹 **Input:**  
```plaintext
prices[] = [1, 3, 6, 9, 11]
```
🔹 **Output:**  
```plaintext
10
```
🔹 **Explanation:**  
- Since the array is sorted in increasing order, the **maximum profit** is achieved by **buying at price[0] and selling at price[n-1]**.  
- **Maximum Profit** = `11 - 1 = 10`

---  

### **Example 4 (With Duplicates)**  
🔹 **Input:**  
```plaintext
prices[] = [5, 1, 2, 2, 2, 4, 6]
```
🔹 **Output:**  
```plaintext
5
```
🔹 **Explanation:**  
- Buy the stock on **day 1** at `price = 1` and sell it on **day 6** at `price = 6`.  
- **Maximum Profit** = `6 - 1 = 5`

---  

## 🔹 Constraints  
- `1 ≤ prices.size() ≤ 10^5`  
- `0 ≤ prices[i] ≤ 10^4`

