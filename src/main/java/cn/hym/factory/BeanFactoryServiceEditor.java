package cn.hym.factory;

import org.springframework.beans.propertyeditors.CustomCollectionEditor;

/**
 *  bean 工厂服务 编辑器
 */
public class BeanFactoryServiceEditor extends CustomCollectionEditor{
    public BeanFactoryServiceEditor() {
        super(ArrayBeanFactory.class);
    }
}
