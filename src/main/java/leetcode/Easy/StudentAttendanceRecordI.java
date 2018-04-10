package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/student-attendance-record-i
 */
public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        int idx = s.indexOf('A');
        if(idx > -1) {
            idx = s.indexOf('A', idx + 1);
            if(idx > -1) {
                return false;
            }
        }
        return !s.contains("LLL");
    }

}
