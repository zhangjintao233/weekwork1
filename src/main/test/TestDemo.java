
import com.itdr.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestDemo {


    @Test
    public void test() {
        DriverManagerDataSource dmd = new DriverManagerDataSource();
        dmd.setDriverClassName("com.mysql.jdbc.Driver");
        dmd.setUrl("jdbc:mysql://localhost:3306/xc");
        dmd.setUsername("root");
        dmd.setPassword("5371460521");

        JdbcTemplate jdt = new JdbcTemplate(dmd);

        String sql = "SELECT * FROM users";
        List<Map<String, Object>> maps = jdt.queryForList(sql);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                System.out.println(map.get(u));
            }
        }
    }

    @Test
    public void test2() {
        DriverManagerDataSource dmd = new DriverManagerDataSource();
        dmd.setDriverClassName("com.mysql.jdbc.Driver");
        dmd.setUrl("jdbc:mysql://localhost:3306/xc");
        dmd.setUsername("root");
        dmd.setPassword("5371460521");

        JdbcTemplate jtl = new JdbcTemplate(dmd);
        String sql = "INSERT INTO users VALUES (null,'zhang','123')";
        int update = jtl.update(sql);
        System.out.println(update);
    }

    @Test
    public void test3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        JdbcTemplate bean = ac.getBean(JdbcTemplate.class);

        String sql = "SELECT * FROM users";
        List<Map<String, Object>> maps = bean.queryForList(sql);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                System.out.println(map.get(u));
            }
        }


    }

    @Test
    public void test4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate2 = ac.getBean("jdbcTemplate2", JdbcTemplate.class);
        String sql = "SELECT * FROM users";
        List<Map<String, Object>> maps = jdbcTemplate2.queryForList(sql);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                System.out.println(map.get(u));
            }
        }

        /*ComboPooledDataSource com = new ComboPooledDataSource();
        QueryRunner qr = new QueryRunner(com);
        String sql = "SELECT id,username,password FROM users";
        List li = null;
        try {
            li = qr.query(sql,new BeanListHandler<Users>(Users.class));
            System.out.println(li);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    @Test
    public void test5() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate3 = ac.getBean("jdbcTemplate3", JdbcTemplate.class);
        String sql = "FROM * FROM users";
        List<Map<String, Object>> maps = jdbcTemplate3.queryForList(sql);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                System.out.println(map.get(u));
            }
        }
    }

    @Test
    public void test6(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate4 = ac.getBean("jdbcTemplate4", JdbcTemplate.class);
        String sql = "SELECT * FROM users";
        List<Map<String, Object>> maps = jdbcTemplate4.queryForList(sql);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                System.out.println(map.get(u));
            }
        }
    }

}
