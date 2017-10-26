package com.learning.extra;

public class LongestSubStringWithoutRepeatingChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("aab"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int visited[] = new int[256];
        for(int i = 0; i<256; i++) {
            visited[i]=-1;
        }
        if(s.length() > 0) {
            visited[s.charAt(0)]=0;
        int curr_len=1;
        int max_len=1;
        int prev_index=0;
        for(int i=1;i<s.length();i++) {
            prev_index = visited[s.charAt(i)];
            if((i-curr_len) > prev_index || prev_index == -1) {
               curr_len++;
            }
            else {
                if(curr_len > max_len) {
                    max_len = curr_len;
                }
                curr_len = i-prev_index;
            }
            visited[s.charAt(i)] = i;
        }
        if(curr_len > max_len) {
            max_len = curr_len;
        }
        return max_len;
        }
        else
            return 0;
    }

}
