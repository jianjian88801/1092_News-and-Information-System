package com.entity.model;

import com.entity.WenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文章
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenzhangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 自媒体人
     */
    private Integer zimeitirenId;


    /**
     * 文章编号
     */
    private String wenzhangUuidNumber;


    /**
     * 文章名称
     */
    private String wenzhangName;


    /**
     * 文章照片
     */
    private String wenzhangPhoto;


    /**
     * 频道类型
     */
    private Integer wenzhangTypes;


    /**
     * 文章类型
     */
    private Integer wenzhangErjiTypes;


    /**
     * 热度
     */
    private Integer wenzhangClicknum;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 文章详情
     */
    private String wenzhangContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer wenzhangDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：自媒体人
	 */
    public Integer getZimeitirenId() {
        return zimeitirenId;
    }


    /**
	 * 设置：自媒体人
	 */
    public void setZimeitirenId(Integer zimeitirenId) {
        this.zimeitirenId = zimeitirenId;
    }
    /**
	 * 获取：文章编号
	 */
    public String getWenzhangUuidNumber() {
        return wenzhangUuidNumber;
    }


    /**
	 * 设置：文章编号
	 */
    public void setWenzhangUuidNumber(String wenzhangUuidNumber) {
        this.wenzhangUuidNumber = wenzhangUuidNumber;
    }
    /**
	 * 获取：文章名称
	 */
    public String getWenzhangName() {
        return wenzhangName;
    }


    /**
	 * 设置：文章名称
	 */
    public void setWenzhangName(String wenzhangName) {
        this.wenzhangName = wenzhangName;
    }
    /**
	 * 获取：文章照片
	 */
    public String getWenzhangPhoto() {
        return wenzhangPhoto;
    }


    /**
	 * 设置：文章照片
	 */
    public void setWenzhangPhoto(String wenzhangPhoto) {
        this.wenzhangPhoto = wenzhangPhoto;
    }
    /**
	 * 获取：频道类型
	 */
    public Integer getWenzhangTypes() {
        return wenzhangTypes;
    }


    /**
	 * 设置：频道类型
	 */
    public void setWenzhangTypes(Integer wenzhangTypes) {
        this.wenzhangTypes = wenzhangTypes;
    }
    /**
	 * 获取：文章类型
	 */
    public Integer getWenzhangErjiTypes() {
        return wenzhangErjiTypes;
    }


    /**
	 * 设置：文章类型
	 */
    public void setWenzhangErjiTypes(Integer wenzhangErjiTypes) {
        this.wenzhangErjiTypes = wenzhangErjiTypes;
    }
    /**
	 * 获取：热度
	 */
    public Integer getWenzhangClicknum() {
        return wenzhangClicknum;
    }


    /**
	 * 设置：热度
	 */
    public void setWenzhangClicknum(Integer wenzhangClicknum) {
        this.wenzhangClicknum = wenzhangClicknum;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：文章详情
	 */
    public String getWenzhangContent() {
        return wenzhangContent;
    }


    /**
	 * 设置：文章详情
	 */
    public void setWenzhangContent(String wenzhangContent) {
        this.wenzhangContent = wenzhangContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getWenzhangDelete() {
        return wenzhangDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setWenzhangDelete(Integer wenzhangDelete) {
        this.wenzhangDelete = wenzhangDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
