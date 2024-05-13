package com.entity.view;

import com.entity.XiadanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 下单信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
@TableName("xiadanxinxi")
public class XiadanxinxiView  extends XiadanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiadanxinxiView(){
	}
 
 	public XiadanxinxiView(XiadanxinxiEntity xiadanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiadanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}