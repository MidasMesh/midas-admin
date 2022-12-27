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
@TableName("t_application_agent")
@Data
public class ApplicationAgentDO {

    /**
     * 主键
     */
    @TableId(value = "id", type = AUTO)
    private Integer id;

    /**
     * 关联的应⽤ID
     */
    @TableField(value = "application_id")
    private Integer applicationId;

    /**
     * 关联的agentID
     */
    @TableField(value = "agent_id")
    private Integer agentId;

    /**
     * up：存活，down：下线
     */
    @TableField(value = "agent_status")
    private String agentStatus;

    /**
     * 参数
     */
    @TableField(value = "param")
    private String param;

    /**
     * 类加载器
     */
    @TableField(value = "class_loader")
    private String classLoader;

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