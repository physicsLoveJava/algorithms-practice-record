package soup.impl;

import org.junit.Test;
import soup.support.ClassBean;

import static org.junit.Assert.*;

public class DefaultClassGeneratorTest {

    DefaultClassGenerator generator = new DefaultClassGenerator();

    @Test
    public void generate() throws Exception {
        ClassBean bean = new ClassBean();
        bean.setPackageName("com.test");
        bean.setClassName("Test");
        bean.setClassComment("This is a test class");
        String classStr = generator.generate(bean, true);
        System.out.println(classStr);
    }

}