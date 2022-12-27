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
@TableName("t_application")
@Data
public class ApplicationDO {

    /**
     * 主键
     */
    @TableId(value = "id", type = AUTO)
    private Integer id;

    /**
     * 应用编码
     */
    @TableField(value = "application_code")
    private String applicationCode;

    /**
     * 应用名称
     */
    @TableField(value = "application_name")
    private String applicationName;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

}