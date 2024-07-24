package com.entity.view;

import com.entity.WenzhangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenzhang")
public class WenzhangView extends WenzhangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 频道类型的值
		*/
		private String wenzhangValue;
		/**
		* 文章类型的值
		*/
		private String wenzhangErjiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



		//级联表 zimeitiren
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
			* 电子邮箱
			*/
			private String zimeitirenEmail;

	public WenzhangView() {

	}

	public WenzhangView(WenzhangEntity wenzhangEntity) {
		try {
			BeanUtils.copyProperties(this, wenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 频道类型的值
			*/
			public String getWenzhangValue() {
				return wenzhangValue;
			}
			/**
			* 设置： 频道类型的值
			*/
			public void setWenzhangValue(String wenzhangValue) {
				this.wenzhangValue = wenzhangValue;
			}
			/**
			* 获取： 文章类型的值
			*/
			public String getWenzhangErjiValue() {
				return wenzhangErjiValue;
			}
			/**
			* 设置： 文章类型的值
			*/
			public void setWenzhangErjiValue(String wenzhangErjiValue) {
				this.wenzhangErjiValue = wenzhangErjiValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}














				//级联表的get和set zimeitiren

					/**
					* 获取： 自媒体人姓名
					*/
					public String getZimeitirenName() {
						return zimeitirenName;
					}
					/**
					* 设置： 自媒体人姓名
					*/
					public void setZimeitirenName(String zimeitirenName) {
						this.zimeitirenName = zimeitirenName;
					}

					/**
					* 获取： 自媒体人手机号
					*/
					public String getZimeitirenPhone() {
						return zimeitirenPhone;
					}
					/**
					* 设置： 自媒体人手机号
					*/
					public void setZimeitirenPhone(String zimeitirenPhone) {
						this.zimeitirenPhone = zimeitirenPhone;
					}

					/**
					* 获取： 自媒体人头像
					*/
					public String getZimeitirenPhoto() {
						return zimeitirenPhoto;
					}
					/**
					* 设置： 自媒体人头像
					*/
					public void setZimeitirenPhoto(String zimeitirenPhoto) {
						this.zimeitirenPhoto = zimeitirenPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getZimeitirenEmail() {
						return zimeitirenEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setZimeitirenEmail(String zimeitirenEmail) {
						this.zimeitirenEmail = zimeitirenEmail;
					}


}
