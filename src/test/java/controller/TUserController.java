package controller;


import com.lijie.Config;
import com.lijie.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @author lijie7
 * @date 2018/1/30
 * @Description
 * @modified By
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class TUserController {
    @Autowired
    private IUserService userService;
    @Test
    public void userTest(){
        userService.delAccount(12);
    }
}
