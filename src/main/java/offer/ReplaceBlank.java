package offer;

public class ReplaceBlank {

    public static String replace(String str) {
        if(str == null) {
            return null;
        }
        char[] array = str.toCharArray();
        int blanks = getBlank(array);
        char[] nArray = new char[array.length + 2 * blanks];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i] == ' ') {
                nArray[j++] = '%';
                nArray[j++] = '2';
                nArray[j++] = '0';
            }else {
                nArray[j++] = array[i];
            }
        }
        return new String(nArray);
    }

    private static int getBlank(char[] array) {
        if(array == null) {
            return 0;
        }
        int nums = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == ' ') {
                nums ++;
            }
        }
        return nums;
    }

}
