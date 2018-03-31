package company.microsoft.c4;

import java.util.*;

public class PerformanceLog {

    static class Function {
        String name;
        String time;
        String action;

        public Function(String name, String time, String action) {
            this.name = name;
            this.time = time;
            this.action = action;
        }
    }

    static class Span {
        String name;
        String time;

        public Span(String name, String time) {
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Function> stack = new Stack<>();
        Map<String, Span> rs = new HashMap<>();
        List<String> order = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String fun = scanner.next();
            String time = scanner.next();
            String action = scanner.next();
            if(action.equals("START")) {
                stack.push(new Function(fun, time, action));
                order.add(fun);
            }else {
                if(stack.isEmpty()) {
                    System.out.println("Incorrect performance log");
                    break;
                }
                Function prev = stack.pop();
                if(!prev.name.equals(fun)) {
                    System.out.println("Incorrect performance log");
                    break;
                }
                String computed = computed(prev.time, time);
                if(computed.equals("-1")) {
                    System.out.println("Incorrect performance log");
                    break;
                }
                rs.put(fun, new Span(fun, computed));
            }
        }
        for (String seq : order) {
            Span span = rs.get(seq);
            System.out.printf("%s %s\n", span.name, span.time);
        }
    }

    private static String computed(String start, String end) {
        int s = toInt(start);
        int e = toInt(end);
        System.out.println(s);
        if(s > e) {
            return "-1";
        }
        return toTimeString(e - s);
    }

    private static String toTimeString(int time) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int part = time /(int) Math.pow(60, 2 - i);
            sb.append(part < 10 ? "0" + part : part);
            if(i != 2) {
                sb.append(":");
            }
            time = time % (int) Math.pow(60, 2 - i);
        }
        return sb.toString();
    }

    private static int toInt(String start) {
        String[] split = start.split(":");
        int v = 0;
        for (int i = 0; i < split.length; i++) {
            v += Integer.valueOf(split[i]) * (int) Math.pow(60, 2 - i);
        }
        return v;
    }

}
