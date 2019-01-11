package service.impl;

import org.springframework.stereotype.Service;
import service.IPayService;

@Service
public class AlipayServiceImpl implements IPayService {
    @Override
    public void pay(int amount) {

    }

    @Override
    public boolean match(String s) {
        return "Alipay".equals(s);
    }
}
