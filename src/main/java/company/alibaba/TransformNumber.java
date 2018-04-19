package company.alibaba;

import java.util.Scanner;

public class TransformNumber {

    static char[] ZH = new char[] {
            '零', '一', '二', '三', '四','五','六','七','八','九','十'
    };

    static char[] UZH = new char[] {
            '亿', '万'
    };

    static char[] S_UNITS = new char[] {
            '十', '百', '千'
    };

    static String process(long tmp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            int rest = (int) (tmp / Math.pow(10, i));
            tmp = (int) (tmp - rest * Math.pow(10, i));
            if(rest != 0) {
                sb.append(ZH[rest]);
                if(i > 0) {
                    sb.append(S_UNITS[i - 1]);
                }
            }else {
                sb.append(ZH[0]);
            }
        }
        if(sb.length() == 0) {
            sb.append(ZH[0]);
        }
        String rs = sb.toString();
        rs = rs.replaceAll("零{2,}", "零");
        if(rs.equals("零")) {
            return rs;
        }
        if(rs.endsWith("零")) {
            rs = rs.substring(0, rs.length() - 1);
        }
        if(rs.startsWith("一十") || rs.contains("零一十")) {
            rs = rs.replaceFirst("一十", "十");
        }
        return rs;
    }

    static String transform(long number) {
        int mi = (int)Math.pow(10, 8);
        int ti = (int)Math.pow(10, 4);
        int oi = (int)Math.pow(10, 0);
        StringBuilder sb = new StringBuilder();
        int[] units = new int[] {mi, ti, oi};
        for(int i = 0; i < units.length; i++) {
            long tmp = (int)(number / units[i]);
            number = number - tmp * units[i];
            String msg = process(tmp);
            if(!msg.equals("零")) {
                sb.append(msg);
                if(i != units.length - 1) {
                    sb.append(UZH[i]).append(',').append(' ');
                }
            }else {
                if(sb.length() != 0 && i != units.length - 1) {
                    sb.append(msg);
                    sb.append(',').append(' ');
                }else if(i == units.length - 1) {
                    sb.append(msg);
                }
            }
        }
        String rs = sb.toString();
        if(rs.equals("零")) {
            return rs;
        }
        if(rs.startsWith("零")) {
            rs = rs.substring(1);
        }
        rs = rs.replaceAll(", 零, 零$", "");
        rs = rs.replaceAll(", 零, 零(.*)", ", 零$1");
        rs = rs.replaceAll(", 零$", "");
        if(rs.endsWith(", ")) {
            rs = rs.substring(0, rs.length() - 2);
        }
        return rs;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        long _number;
        _number = Long.parseLong(in.nextLine().trim());

        res = transform(_number);
        System.out.println(res);
    }

    static class Test {

        public static void main(String[] args) {
            System.out.println(transform(0).equals("零"));
            System.out.println(transform(4).equals("四"));
            System.out.println(transform(14).equals("十四"));
            System.out.println(transform(20).equals("二十"));
            System.out.println(transform(104).equals("一百零四"));
            System.out.println(transform(1004).equals("一千零四"));
            System.out.println(transform(1014).equals("一千零十四"));
            System.out.println(transform(1024).equals("一千零二十四"));
            System.out.println(transform(1104).equals("一千一百零四"));
            System.out.println(transform(1124).equals("一千一百二十四"));
            System.out.println(transform(10000).equals("一万"));
            System.out.println(transform(10004).equals("一万, 零四"));
            System.out.println(transform(10014).equals("一万, 零十四"));
            System.out.println(transform(10231011).equals("一千零二十三万, 一千零十一"));
            System.out.println(transform(10041003).equals("一千零四万, 一千零三"));
            System.out.println(transform(100000000).equals("一亿"));
            System.out.println(transform(100000004).equals("一亿, 零四"));
            System.out.println(transform(100001000).equals("一亿, 零, 一千"));
            System.out.println(transform(100010001).equals("一亿, 零一万, 零一"));
            System.out.println(transform(Long.parseLong("111112341234")).equals("一千一百一十一亿, 一千二百三十四万, 一千二百三十四"));
            System.out.println(transform(Long.parseLong("100112341234")).equals("一千零一亿, 一千二百三十四万, 一千二百三十四"));
        }

    }

}
