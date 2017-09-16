package soup.impl;

import org.apache.commons.io.FileUtils;
import soup.support.ClassBean;
import soup.support.ClassGenerator;

import java.io.*;

public class DefaultClassGenerator implements ClassGenerator {

    private static String template = "src/main/resources/class.template";

    private static String srcDir = "src/main/java/";

    private String templateStr = "";

    public DefaultClassGenerator() {
        initTemplate();
    }

    private void initTemplate() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(template)));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            templateStr = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String generate(ClassBean beanInfo, boolean isCopy) {
        if(beanInfo == null) {
            return null;
        }
        String result = replace(templateStr, "packageName", beanInfo.getPackageName());
        result = replace(result, "className", beanInfo.getClassName());
        result = replace(result, "classComment", beanInfo.getClassComment());
        if(isCopy) {
            copy(beanInfo, result);
        }
        return result;
    }

    private void copy(ClassBean beanInfo, String result) {
        String packageName = beanInfo.getPackageName();
        packageName = packageName.replaceAll("\\.", "/");
        String fileDir = srcDir + packageName;
        String filepath = fileDir + File.separator + beanInfo.getClassName() + ".java";
        try {
            FileUtils.forceMkdir(new File(fileDir));
            if(new File(filepath).exists()) {
                System.out.println("file exists:" + filepath);
                return;
            }
            PrintWriter writer = new PrintWriter(filepath);
            writer.print(result);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String replace(String template, String key, String value) {
        return template.replaceAll("\\$\\{" + key + "}", value);
    }

}
