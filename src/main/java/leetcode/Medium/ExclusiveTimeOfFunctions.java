package leetcode.Medium;

import java.util.List;
import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/exclusive-time-of-functions
 */
public class ExclusiveTimeOfFunctions {

    static class Function {
        int id;
        String op;
        int time;
        int innerUsed;

        public Function(int id, String op, int time) {
            this.id = id;
            this.op = op;
            this.time = time;
        }
    }

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] rs = new int[n];
        Stack<Function> stack = new Stack<>();
        for (String log : logs) {
            String[] parts = log.split(":");
            Integer id = Integer.valueOf(parts[0]);
            String op = String.valueOf(parts[1]);
            Integer time = Integer.valueOf(parts[2]);
            if(op.equals("start")) {
                stack.push(new Function(id, op, time));
            }else {
                Function f1 = stack.pop();
                rs[f1.id] += time - f1.time + 1 - f1.innerUsed;
                int used = time - f1.time + 1;
                if(!stack.isEmpty()) {
                    Function func = stack.peek();
                    func.innerUsed += used;
                }
            }
        }
        return rs;
    }

}
