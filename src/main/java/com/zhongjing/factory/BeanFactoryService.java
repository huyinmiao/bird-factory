package com.zhongjing.factory;

import java.util.List;

/**
 * bean factory 服务
 */
public interface BeanFactoryService<K, V extends MatchBeanService<K>> extends List<V> {
    /**
     * 根据k获取指定的bean
     *
     * @param k
     * @return
     */
    V getBean(K k);
}
