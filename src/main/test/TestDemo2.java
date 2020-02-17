import com.itdr.controller.UsersController;
import com.itdr.dao.UsersDao;
import com.itdr.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

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

    @Test
    public void test3() throws IOException {
        String path="SqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(path);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = build.openSession();
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);
        Users user = mapper.getUser("zhangjintao","123");
        System.out.println(user);
        sqlSession.close();
    }


}
