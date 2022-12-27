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
@TableName("t_agent")
@Data
public class AgentDO {

    /**
     * 主键
     */
    @TableId(value = "id", type = AUTO)
    private Integer id;

    /**
     * agent编码
     */
    @TableField(value = "agent_code")
    private String agentCode;

    /**
     * agent名称
     */
    @TableField(value = "agent_name")
    private String agentName;

    /**
     * java，go，python
     */
    @TableField(value = "language")
    private String language;

    /**
     * 01-服务治理，02-APM，03-组件集成
     */
    @TableField(value = "scene_type")
    private String sceneType;

    /**
     * 参数
     */
    @TableField(value = "param")
    private String param;

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