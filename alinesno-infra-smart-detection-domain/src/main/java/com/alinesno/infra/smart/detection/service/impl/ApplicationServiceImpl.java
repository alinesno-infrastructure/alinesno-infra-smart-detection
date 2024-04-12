package com.alinesno.infra.smart.detection.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.smart.detection.entity.ApplicationEntity;
import com.alinesno.infra.smart.detection.mapper.ApplicationMapper;
import com.alinesno.infra.smart.detection.service.IApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApplicationServiceImpl extends IBaseServiceImpl<ApplicationEntity, ApplicationMapper> implements IApplicationService {

}
