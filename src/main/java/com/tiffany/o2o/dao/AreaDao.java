package com.tiffany.o2o.dao;

import java.util.List;

import com.tiffany.o2o.entity.Area;

public interface AreaDao {
	/**
	 * 列出所有区域信息
	 * @return areaList
	 */
	List<Area> queryArea();
	
	
	

}
