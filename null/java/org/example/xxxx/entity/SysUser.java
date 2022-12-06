package org.example.xxxx.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户登录表
 * </p>
 *
 * @author 
 * @since 2022-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField("pass_word")
    private String passWord;

    /**
     * 用户编号
     */
    @TableField("user_no")
    private Integer userNo;

    /**
     * 密钥
     */
    @TableField("private_key")
    private String privateKey;

    /**
     * 总在线时长
     */
    @TableField("online_time")
    private Long onlineTime;

    /**
     * 登录状态
     */
    @TableField("login_status")
    private Integer loginStatus;

    /**
     * 登录时间
     */
    @TableField("login_time")
    private Date loginTime;

    /**
     * 用户状态
     */
    @TableField("user_status")
    private Integer userStatus;

    /**
     * 版本号
     */
    @TableField("version")
    private Long version;

    /**
     * 逻辑删除标识
     */
    @TableField("deleted")
    private Integer deleted;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 租户ID
     */
    @TableField("tenant_id")
    private Long tenantId;


}
