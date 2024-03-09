package com.thr.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thr.project.model.entity.InterfaceInfo;
import com.thr.project.model.entity.Post;

/**
* @author thr
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-09 12:47:55
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
