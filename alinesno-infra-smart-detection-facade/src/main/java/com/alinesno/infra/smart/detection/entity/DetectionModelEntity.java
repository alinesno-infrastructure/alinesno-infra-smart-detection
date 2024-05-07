package com.alinesno.infra.smart.detection.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 模型管理
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("detection_model")
public class DetectionModelEntity extends InfraBaseEntity {

    /**
     * 模型的名称或标识
     */
    @ColumnComment("模型的名称或标识")
    @ColumnType(length=32)
    @TableField("model_name")
    private String modelName;

    /**
     * 存储模型文件的路径或URL
     */
    @ColumnComment("存储模型文件的路径或URL")
    @ColumnType(length=32)
    @TableField("model_path")
    private String modelPath;

    /**
     * 模型的版本号或标识
     */
    @ColumnComment("存储模型文件的路径或URL")
    @ColumnType(length=32)
    @TableField("model_version")
    private String modelVersion;

}