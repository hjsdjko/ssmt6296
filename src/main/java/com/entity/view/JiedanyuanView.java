package com.entity.view;

import com.entity.JiedanyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接单员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
@TableName("jiedanyuan")
public class JiedanyuanView  extends JiedanyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiedanyuanView(){
	}
 
 	public JiedanyuanView(JiedanyuanEntity jiedanyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiedanyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}