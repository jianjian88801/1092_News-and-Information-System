package com.entity.model;

import com.entity.ZimeitirenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 自媒体人
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZimeitirenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 自媒体人姓名
     */
    private String zimeitirenName;


    /**
     * 自媒体人手机号
     */
    private String zimeitirenPhone;


    /**
     * 自媒体人头像
     */
    private String zimeitirenPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    private String zimeitirenEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：自媒体人姓名
	 */
    public String getZimeitirenName() {
        return zimeitirenName;
    }


    /**
	 * 设置：自媒体人姓名
	 */
    public void setZimeitirenName(String zimeitirenName) {
        this.zimeitirenName = zimeitirenName;
    }
    /**
	 * 获取：自媒体人手机号
	 */
    public String getZimeitirenPhone() {
        return zimeitirenPhone;
    }


    /**
	 * 设置：自媒体人手机号
	 */
    public void setZimeitirenPhone(String zimeitirenPhone) {
        this.zimeitirenPhone = zimeitirenPhone;
    }
    /**
	 * 获取：自媒体人头像
	 */
    public String getZimeitirenPhoto() {
        return zimeitirenPhoto;
    }


    /**
	 * 设置：自媒体人头像
	 */
    public void setZimeitirenPhoto(String zimeitirenPhoto) {
        this.zimeitirenPhoto = zimeitirenPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getZimeitirenEmail() {
        return zimeitirenEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setZimeitirenEmail(String zimeitirenEmail) {
        this.zimeitirenEmail = zimeitirenEmail;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
