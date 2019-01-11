# bird-factory
结合spring支持List注入，能从List根据key取出匹配的bean实例。

# 使用说明
```xml
    <bean class="org.springframework.beans.factory.config.CustomEditorConfigurer">
        <property name="customEditors">
            <map>
                <entry key="cn.hym.factory.ArrayBeanFactory" value="cn.hym.factory.BeanFactoryServiceEditor"></entry>
            </map>
        </property>
    </bean>
```
