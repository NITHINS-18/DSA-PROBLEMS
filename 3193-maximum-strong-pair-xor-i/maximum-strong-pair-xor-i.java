import java.util.*;
class Solution {
    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
        int count;
    }
    TrieNode root = new TrieNode();
    void insert(int num) {
        TrieNode curr = root;
        curr.count++;
        for (int i=20;i>=0;i--) {
            int n = (num>>i)&1;
            if (curr.child[n] == null) {
                curr.child[n] = new TrieNode();
            }
            curr=curr.child[n];
            curr.count++;
        }
    }
    void remove(int num) {
        TrieNode curr=root;
        curr.count--;
        for (int i=20;i>=0;i--) {
            int n = (num >> i) & 1;
            curr = curr.child[n];
            curr.count--;
        }
    }

    int getMaxXor(int num) {
        TrieNode curr = root;
        int ans = 0;

        for (int i=20;i>=0;i--) {

            int n=(num>>i)&1;
            int opposite=1-n;

            if (curr.child[opposite] != null &&
                curr.child[opposite].count > 0) {

                ans |= (1 << i);
                curr = curr.child[opposite];

            } else {
                curr = curr.child[n];
            }
        }

        return ans;
    }

    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int right = 0;
        for (int left = 0; left < nums.length; left++) {
            while (right < nums.length &&
                   nums[right] <= 2 * nums[left]) {
                insert(nums[right]);
                right++;
            }
            max = Math.max(max, getMaxXor(nums[left]));
            remove(nums[left]);
        }
        return max;
    }
}