package service;

import cn.hym.factory.MatchBeanService;

public interface IPayService extends MatchBeanService<String> {
    void pay(int amount);
}
