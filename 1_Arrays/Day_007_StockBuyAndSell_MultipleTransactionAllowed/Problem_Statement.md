# **Stock Buy and Sell – Multiple Transactions Allowed**

### 🟠 Difficulty: **Medium**  

---  

## 📌 Problem Statement  
The cost of stock on each day is given in an array `price[]`. Each day, you may decide to either **buy** or **sell** the stock at `price[i]`. You can even buy and sell the stock on the **same day**. Find the **maximum profit** that you can achieve.

🔹 **Note:**  
- A stock can **only be sold if it has been bought previously**.  
- **Multiple stocks cannot be held** on any given day.  

🔗 **[View Problem on GFG](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615)**  

---  

## 🔹 Examples  

### **Example 1**  
🔹 **Input:**  
```plaintext
prices[] = [100, 180, 260, 310, 40, 535, 695]
```
🔹 **Output:**  
```plaintext
865
```
🔹 **Explanation:**  
- Buy the stock on **day 0** and sell it on **day 3** ⇒ `310 - 100 = 210`  
- Buy the stock on **day 4** and sell it on **day 6** ⇒ `695 - 40 = 655`  
- **Maximum Profit** = `210 + 655 = 865`

---  

### **Example 2**  
🔹 **Input:**  
```plaintext
prices[] = [4, 2, 2, 2, 4]
```
🔹 **Output:**  
```plaintext
2
```
🔹 **Explanation:**  
- Buy the stock on **day 3** and sell it on **day 4** ⇒ `4 - 2 = 2`  
- **Maximum Profit** = `2`

---  

## 🔹 Constraints  
- `1 ≤ prices.size() ≤ 10^5`  
- `0 ≤ prices[i] ≤ 10^4`  
