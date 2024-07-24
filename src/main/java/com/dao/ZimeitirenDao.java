package com.dao;

import com.entity.ZimeitirenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZimeitirenView;

/**
 * 自媒体人 Dao 接口
 *
 * @author 
 */
public interface ZimeitirenDao extends BaseMapper<ZimeitirenEntity> {

   List<ZimeitirenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
