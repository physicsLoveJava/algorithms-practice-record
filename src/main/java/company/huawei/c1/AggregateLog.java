package company.huawei.c1;

import java.util.*;

public class AggregateLog {

    static class Log {
        int id;
        String file;
        int size;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> unique = new HashSet<>();
        Map<String, Log> map = new HashMap<>();
        int id = 0;
        while(scanner.hasNext()) {
            String file = scanner.next();
            int line = scanner.nextInt();
            if(!unique.contains(file + line)) {
                unique.add(file + line);
                if(map.containsKey(file)) {
                    Log log = map.get(file);
                    log.line.add(line);
                }else {
                    Log log = new Log();
                    log.file = file;
                    log.id = id++;
                    log.line.add(line);
                    map.put(file + line, log);
                }
            }
        }
        ArrayList<Log> logs = new ArrayList<>(map.values());
        Collections.sort(logs, new Comparator<Log>() {
            @Override
            public int compare(Log o1, Log o2) {
                int cmp = o1.line.size() - o2.line.size();
                if(cmp == 0) {
                    return o1.id - o2.id;
                }
                return cmp * -1;
            }
        });
        for (int i = 0; i < logs.size() && i < 8; i++) {
            System.out.println(format(logs.get(i)));
        }
    }

    private static String format(Log log) {
        String file = log.file;
        file = file.substring(file.lastIndexOf("\\") + 1);
        if(file.length() > 16) {
            file = file.substring(file.length() - 16);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file).append(" ");
        for (Integer line : log.line) {
            sb.append(line).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

}
