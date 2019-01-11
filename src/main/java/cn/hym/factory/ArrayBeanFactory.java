package cn.hym.factory;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * bean 工厂
 *
 * @param <K> 匹配关键上下文
 * @param <V> 目标bean实例
 */
public class ArrayBeanFactory<K, V extends MatchBeanService<K>> extends ArrayList<V> implements BeanFactoryService<K, V> {
    /**
     * 根据k获取指定的bean
     *
     * @param k
     * @return
     */
    @Override
    public V getBean(K k) {
        if (this.size() == 0) {
            return null;
        }
        Iterator<V> it = this.iterator();
        while (it.hasNext()) {
            V v = it.next();
            if (v.match(k)) {
                return v;
            }
        }
        return null;
    }
}
