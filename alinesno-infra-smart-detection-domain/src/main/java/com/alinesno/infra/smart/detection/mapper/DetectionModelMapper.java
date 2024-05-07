package com.alinesno.infra.smart.detection.mapper;

import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import com.alinesno.infra.smart.detection.entity.DetectionModelEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetectionModelMapper extends IBaseMapper<DetectionModelEntity> {
}
