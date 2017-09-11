package lintcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SystemLongestFilePathTest {
    @Test
    public void lengthLongestPath() throws Exception {
        String path = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        int length = "dir/subdir2/subsubdir2/file2.ext".length();
        assertEquals(length, SystemLongestFilePath.lengthLongestPath(path));
    }

    @Test
    public void lengthLongestPath2() throws Exception {
        String path = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        int length = "dir/subdir2/file.ext".length();
        assertEquals(length, SystemLongestFilePath.lengthLongestPath(path));
    }

    @Test
    public void lengthLongestPath3() throws Exception {
        String path = "dir\n\tsubdir1\n\tsubdir2\n\t\tsubdir2\n\t\t\ta.ext\n\taaaaaaaaaaaaaaaaaaaaaaaaa.png";
        int length = "dir/aaaaaaaaaaaaaaaaaaaaaaaaa.png".length();
        assertEquals(length, SystemLongestFilePath.lengthLongestPath(path));
    }

    @Test
    public void lengthLongestPath4() throws Exception {
        String path = "dir\n file.txt";
        int length = " file.txt".length();
        assertEquals(length, SystemLongestFilePath.lengthLongestPath(path));
    }

}