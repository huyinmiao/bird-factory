import cn.hym.factory.BeanFactoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IPayService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring-bean.xml")
public class FactoryTest {
    @Autowired
    private BeanFactoryService<String, IPayService> payFactory;

    @Test
    public void test() {
        IPayService alipay = payFactory.getBean("Alipay");
        alipay.pay(1000);
        IPayService weChatPay = payFactory.getBean("WeChatPay");
        weChatPay.pay(500);
    }
}
