# bird-factory
结合spring支持List注入，能从List根据key取出匹配的bean实例。是一种通用模式的工厂。

支付示例

| 渠道标识   |      名称      |
|----------|-------------|
| Alipay |  支付宝 |
| WeChatPay |  微信支付 |

问题：我们根据 渠道标识 从spring上下文中获取对应的PayService的实现类？

方案：spring 支持 List<V> 注入，只要遍历List 中每个元素，以此匹配判断是否是目标类的实现即可。

# 使用说明
首先，你需要通过spring的xml配置将cn.hym.factory.ArrayBeanFactory 的编辑器注册到 CustomEditorConfigurer中，如下所示
```xml
    <bean class="org.springframework.beans.factory.config.CustomEditorConfigurer">
        <property name="customEditors">
            <map>
                <entry key="cn.hym.factory.ArrayBeanFactory" value="cn.hym.factory.BeanFactoryServiceEditor"></entry>
            </map>
        </property>
    </bean>
```

然后你就可以愉快的使用了，参考 测试样例。
