# bird-factory
结合spring支持List注入，能从List根据key取出匹配的bean实例。

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
