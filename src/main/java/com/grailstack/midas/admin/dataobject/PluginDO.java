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
@TableName("t_plugin")
@Data
public class PluginDO {

    /**
     * 主键
     */
    @TableId(value = "id", type = AUTO)
    private Integer id;

    /**
     * 插件编码
     */
    @TableField(value = "plugin_code")
    private String pluginCode;

    /**
     * 插件名称
     */
    @TableField(value = "plugin_name")
    private String pluginName;

    /**
     * 01-oss，02-nfs
     */
    @TableField(value = "type")
    private String type;

    /**
     * 插件存储地址
     */
    @TableField(value = "url")
    private String url;

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