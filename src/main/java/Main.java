import com.lijie.Config;
import com.lijie.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lijie7
 * @date 2018/1/30
 * @Description
 * @modified By
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IUserService service = (IUserService)context.getBean("userService");
        service.delAccount(12);
    }
}
