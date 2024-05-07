package com.alinesno.infra.smart.detection.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.smart.detection.entity.ProjectEntity;
import com.alinesno.infra.smart.detection.mapper.ProjectMapper;
import com.alinesno.infra.smart.detection.service.IProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.sqids.Sqids;

import java.util.Arrays;

@Slf4j
@Service
public class ProjectServiceImpl extends IBaseServiceImpl<ProjectEntity, ProjectMapper> implements IProjectService {

    private static final String DEFAULT_PROJECT_FIELD = "default" ;

    @Override
    public void initDefaultApp(long userId) {

        Sqids sqids=Sqids.builder().build();
        String code = sqids.encode(Arrays.asList(1L,2L,3L)); // "86Rf07"

        ProjectEntity project = new ProjectEntity() ;

        project.setOperatorId(userId);
        project.setFieldProp(DEFAULT_PROJECT_FIELD);

        project.setProjectName("默认文档应用");
        project.setProjectDesc("包含所有的文档查看权限，用于开发和验证场景");
        project.setProjectCode(code);

        save(project) ;
    }
}
