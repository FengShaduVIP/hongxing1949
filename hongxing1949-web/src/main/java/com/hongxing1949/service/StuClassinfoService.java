package com.hongxing1949.service;

import com.hongxing1949.entity.StuClassinfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 班级信息
 * 
 * @author FengShadu
 * @email twpvip@gmail.com
 * @date 2017-11-03 10:16:50
 */
public interface StuClassinfoService {
	
	StuClassinfoEntity queryObject(Integer id);
	
	List<StuClassinfoEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(StuClassinfoEntity stuClassinfo);
	
	void update(StuClassinfoEntity stuClassinfo);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
