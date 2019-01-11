# bird-factory
结合spring支持List注入，能从List根据key取出匹配的bean实例。

# 使用说明
(```)
<bean class="org.springframework.beans.factory.config.CustomEditorConfigurer">
		<property name="customEditors">
			<map>
				<entry key="com.eskins.common.factory.ArrayBeanFactory" value="com.eskins.common.factory.BeanFactoryServiceEditor"></entry>
			</map>
		</property>
</bean>
(```)
