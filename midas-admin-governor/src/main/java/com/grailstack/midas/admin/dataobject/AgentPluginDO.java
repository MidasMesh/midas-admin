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
@TableName("t_agent_plugin")
@Data
public class AgentPluginDO {

    /**
     * 主键
     */
    @TableId(value = "id", type = AUTO)
    private Integer id;

    /**
     * 关联的插件ID
     */
    @TableField(value = "plugin_id")
    private Integer pluginId;

    /**
     * 关联的agentID
     */
    @TableField(value = "agent_id")
    private Integer agentId;

    /**
     * 元数据
     */
    @TableField(value = "metadata")
    private String metadata;

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