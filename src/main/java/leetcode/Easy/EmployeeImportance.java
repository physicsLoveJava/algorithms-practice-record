package leetcode.Easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/employee-importance
 */
public class EmployeeImportance {

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {

        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }

        return findImp(map, id);
    }

    private int findImp(Map<Integer, Employee> map, int id) {
        Employee employee = map.get(id);
        int val = 0;
        val += employee.importance;
        List<Integer> subList = employee.subordinates;
        if (subList != null) {
            for (Integer sId : subList) {
                val += findImp(map, sId);
            }
        }
        return val;
    }

}
