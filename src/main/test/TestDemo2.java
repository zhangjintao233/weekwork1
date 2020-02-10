import com.itdr.controller.UsersController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestDemo2 {


    @Test
    public void test(){
        try {
            long l = System.currentTimeMillis();
            Robot robot = new Robot();

            long l1 = System.currentTimeMillis();
            System.out.println("共用"+(l1-l)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("sspring.xml");
        UsersController bean = ac.getBean(UsersController.class);
        bean.updateMoney("zhang", "zhangjintao", 10);

    }
}
