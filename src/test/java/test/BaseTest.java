package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User:huangtao
 * Date:2015-07-24
 * description：
 */
@ContextConfiguration(locations ="/applicationContext.xml" )
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseTest {
}
