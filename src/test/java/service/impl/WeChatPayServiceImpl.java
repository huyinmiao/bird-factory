package service.impl;

import org.springframework.stereotype.Service;
import service.IPayService;

@Service
public class WeChatPayServiceImpl implements IPayService {
    @Override
    public void pay(int amount) {

    }

    @Override
    public boolean match(String s) {
        return "WeChatPay".equals(s);
    }
}
