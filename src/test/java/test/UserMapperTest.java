package test;

import com.dfire.bean.User;
import com.dfire.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * User:huangtao
 * Date:2015-07-24
 * description：
 */
public class UserMapperTest extends BaseTest{
    @Autowired
    private UserMapper userMapper;
    private User user;

    @Before
    public void init(){
        user = new User();
        user.setAge(12);
        user.setPassWord("pass");
        user.setBirthday("12");
        user.setUserName("sasa1");
        user.setLastName("0");
        user.setFirstName("sa");
    }
    @Test
    public void testInsertAndSelect(){
        userMapper.addUser(user);
//        Assert.assertArrayEquals(user.getUserName(),userMapper.getUserByName(user.getUserName()));
//        Assert.assertArrayEquals(user,userMapper.getUserByName(user.getUserName()));
        Assert.assertEquals(user.getBirthday(),userMapper.getUserByName(user.getUserName()).getBirthday());
    }

}
