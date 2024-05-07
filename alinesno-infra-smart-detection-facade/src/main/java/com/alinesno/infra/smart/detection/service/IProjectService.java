package com.alinesno.infra.smart.detection.service;

import com.alinesno.infra.common.facade.services.IBaseService;
import com.alinesno.infra.smart.detection.entity.ProjectEntity;

/**
 *
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
public interface IProjectService extends IBaseService<ProjectEntity> {
    void initDefaultApp(long userId);
}
