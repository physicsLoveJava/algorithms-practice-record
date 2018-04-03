package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/first-bad-version
 */
public class FirstBadVersion {

    public boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start < end) {
            int mid = (start + end) >>> 1;
            if(isBadVersion(mid)) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return end;
    }

}
