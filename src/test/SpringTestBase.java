package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Spring测试类基础
 * @author Administrator
 *
 */
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestBase {
}