package kg.azati.springcourse.testBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean = xmlApplicationContext.getBean("testBean1", TestBean.class);
        System.out.println(testBean.getName());
        xmlApplicationContext.close();
    }
}
