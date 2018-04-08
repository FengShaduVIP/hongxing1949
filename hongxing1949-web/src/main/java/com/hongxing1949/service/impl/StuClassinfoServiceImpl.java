package com.hongxing1949.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hongxing1949.dao.StuClassinfoDao;
import com.hongxing1949.entity.StuClassinfoEntity;
import com.hongxing1949.service.StuClassinfoService;



@Service("stuClassinfoService")
public class StuClassinfoServiceImpl implements StuClassinfoService {
	@Autowired
	private StuClassinfoDao stuClassinfoDao;
	
	@Override
	public StuClassinfoEntity queryObject(Integer id){
		return stuClassinfoDao.queryObject(id);
	}
	
	@Override
	public List<StuClassinfoEntity> queryList(Map<String, Object> map){
		return stuClassinfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return stuClassinfoDao.queryTotal(map);
	}
	
	@Override
	public void save(StuClassinfoEntity stuClassinfo){
		stuClassinfoDao.save(stuClassinfo);
	}
	
	@Override
	public void update(StuClassinfoEntity stuClassinfo){
		stuClassinfoDao.update(stuClassinfo);
	}
	
	@Override
	public void delete(Integer id){
		stuClassinfoDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		stuClassinfoDao.deleteBatch(ids);
	}
	
}
