import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3};
        List<Integer> result = solution.findMajority(nums);
        System.out.println(result); // Output: [3]

        // int[] nums2 = {1, 2, 3, 1, 2, 1};
        int[] nums2 = {2,1,1,9,9,9,9,9,9,9,9,9,5,5,5,5,6,6,6,6,6};
        List<Integer> result2 = solution.findMajorityElements(nums2);
        System.out.println(result2); // Output: [1, 2]
    }


    /**
     * * Approach: HashMap
     * * Function to find the majority elements in the array
     * * The majority element is the element that appears more than n/3 times in the array.
     * * * The function uses a HashMap to count the occurrences of each element in the array.
     * * * It then iterates through the HashMap and adds the elements that appear more than n/3 times to the result list.
     * * * Finally, it returns the result list.
     * 
     * * * * Time Complexity: O(n)
     * * * * Space Complexity: O(n)
     * * * * The function uses a HashMap to store the counts of each element in the array.
     * * * * * The function uses a List to store the majority elements.
     * @param nums
     * @return
     */
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> result = new HashMap<>();
        List<Integer> majority = new ArrayList<Integer>();
        
        if(n == 0){
            return majority;
        }

        for(int i=0; i<n;i++){
            result.put(nums[i], result.getOrDefault(nums[i], 0) +1);
        }
        
        for(Map.Entry<Integer,Integer> entry: result.entrySet()){
            if(entry.getValue() > (n/3)){
                majority.add(entry.getKey());
            }
        }
        
        return majority;
    }


    /**
     * * Approach: Boyer-Moore’s Voting Algorithm
     * * * Function to find the majority elements in the array
     * * * The majority element is the element that appears more than n/3 times in the array.
     * * * * The function uses the Boyer-Moore’s Voting Algorithm to find the majority elements in the array.
     * * * * The function uses two variables to keep track of the two candidates for the majority element.
     * * * * * The function iterates through the array and updates the candidates and their counts.
     * * * * * The function then resets the counts and counts the occurrences of the candidates in the array.
     * * * * * * Finally, it adds the candidates to the result list if they are majority elements.
     * * * * * * * The function returns the result list.
     * 
     * * * * * Time Complexity: O(n)
     * * * * * Space Complexity: O(1)
     * * * * * The function uses two variables to keep track of the two candidates for the majority element.
     * * * * * * The function uses a List to store the majority elements.
     * @param nums
     * @return
     */
    public List<Integer> findMajorityElements(int[] nums){
        int n = nums.length;
        List<Integer> majority = new ArrayList<Integer>();
        
        if(n ==0)
            return majority;
        int e1 = -1, e2 =-1;
        int c1 = 0, c2 = 0;
        
        for(int i=0; i<n;i++){
            // Increment Count for Candidate1
            if(e1 == nums[i]){
                c1++;
            }
            // Increment Count for Candidate2
            else if(e2 == nums[i]){
                c2++;
            }
            // New Candidate1 if Count is zero
            else if(c1 == 0){
                e1 = nums[i];
                c1++;
            }
            // New Candidate2 if Count is zero
            else if(c2 == 0){
                e2 = nums[i];
                c2++;
            }
            // Decrement Both counts if neither candidate
            else{
                c1--;
                c2--;
            }
        }
        
        // Reset Counts
        c1=0;
        c2=0;
        // Count the Occurences of candidates
        for(int ele: nums){
            if(e1 == ele) c1++;
            if(e2 == ele) c2++; 
        }
        // Add to result if they are majority elements
        if (c1 > (n / 3)) majority.add(e1);
        if ((c2 > (n / 3)) && (e1 != e2)) majority.add(e2);
        
        if (majority.size() == 2 && majority.get(0) > majority.get(1)) {
            int temp = majority.get(0);
            majority.set(0, majority.get(1));
            majority.set(1, temp);
        }
        return majority;
    }
    
}