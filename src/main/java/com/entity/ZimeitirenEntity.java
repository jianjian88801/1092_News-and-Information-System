package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 自媒体人
 *
 * @author 
 * @email
 */
@TableName("zimeitiren")
public class ZimeitirenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZimeitirenEntity() {

	}

	public ZimeitirenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 自媒体人姓名
     */
    @TableField(value = "zimeitiren_name")

    private String zimeitirenName;


    /**
     * 自媒体人手机号
     */
    @TableField(value = "zimeitiren_phone")

    private String zimeitirenPhone;


    /**
     * 自媒体人头像
     */
    @TableField(value = "zimeitiren_photo")

    private String zimeitirenPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "zimeitiren_email")

    private String zimeitirenEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：自媒体人姓名
	 */
    public String getZimeitirenName() {
        return zimeitirenName;
    }
    /**
	 * 获取：自媒体人姓名
	 */

    public void setZimeitirenName(String zimeitirenName) {
        this.zimeitirenName = zimeitirenName;
    }
    /**
	 * 设置：自媒体人手机号
	 */
    public String getZimeitirenPhone() {
        return zimeitirenPhone;
    }
    /**
	 * 获取：自媒体人手机号
	 */

    public void setZimeitirenPhone(String zimeitirenPhone) {
        this.zimeitirenPhone = zimeitirenPhone;
    }
    /**
	 * 设置：自媒体人头像
	 */
    public String getZimeitirenPhoto() {
        return zimeitirenPhoto;
    }
    /**
	 * 获取：自媒体人头像
	 */

    public void setZimeitirenPhoto(String zimeitirenPhoto) {
        this.zimeitirenPhoto = zimeitirenPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getZimeitirenEmail() {
        return zimeitirenEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setZimeitirenEmail(String zimeitirenEmail) {
        this.zimeitirenEmail = zimeitirenEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zimeitiren{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", zimeitirenName=" + zimeitirenName +
            ", zimeitirenPhone=" + zimeitirenPhone +
            ", zimeitirenPhoto=" + zimeitirenPhoto +
            ", sexTypes=" + sexTypes +
            ", zimeitirenEmail=" + zimeitirenEmail +
            ", createTime=" + createTime +
        "}";
    }
}
