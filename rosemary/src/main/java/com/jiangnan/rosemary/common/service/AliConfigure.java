package com.jiangnan.rosemary.common.service;

import java.util.Map;

/**
 * 获取阿里公共配置参数
 * @author  jiangnan
 */
public interface AliConfigure {

    /**
     * 获取阿里公共参数
     * @return Map 配置参数
     */
    Map<String,Object> getAliConfigure();


    /**
     * 获取阿里OSS参数基础参数
     * @return Map 配置参数
     */
    Map<String,Object> getAliOssConfigure();
}
