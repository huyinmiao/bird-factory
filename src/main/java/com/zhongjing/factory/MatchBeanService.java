package com.zhongjing.factory;

/**
 * bean对象需要支持的匹配操作
 * @param <K>
 */
public interface MatchBeanService<K> {
    boolean match(K k);
}