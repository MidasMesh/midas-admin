package com.grailstack.midas.admin.dataobject;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;
import static com.baomidou.mybatisplus.annotation.IdType.AUTO;

/**
 * @author halo codegen
 */
@TableName("t_application_instance")
@Data
public class ApplicationInstanceDO {

    /**
     * 主键
     */
    @TableId(value = "id", type = AUTO)
    private Integer id;

    /**
     * 关联应用表主键
     */
    @TableField(value = "application_id")
    private Integer applicationId;

    /**
     * IP+Prot
     */
    @TableField(value = "instance_code")
    private String instanceCode;

    /**
     * 实例名称
     */
    @TableField(value = "instance_name")
    private String instanceName;

    /**
     * up：存活，down：下线
     */
    @TableField(value = "instance_status")
    private String instanceStatus;

    /**
     * 实例创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

}