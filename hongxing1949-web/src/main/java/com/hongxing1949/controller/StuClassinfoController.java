package com.hongxing1949.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hongxing1949.entity.StuClassinfoEntity;
import com.hongxing1949.service.StuClassinfoService;
import com.hongxing1949.utils.PageUtils;
import com.hongxing1949.utils.Query;
import com.hongxing1949.utils.R;


/**
 * 班级信息
 * 
 * @author FengShadu
 * @email twpvip@gmail.com
 * @date 2017-11-03 10:16:50
 */
@RestController
@RequestMapping("stuclassinfo")
public class StuClassinfoController {
	@Autowired
	private StuClassinfoService stuClassinfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("stuclassinfo:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<StuClassinfoEntity> stuClassinfoList = stuClassinfoService.queryList(query);
		int total = stuClassinfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(stuClassinfoList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("stuclassinfo:info")
	public R info(@PathVariable("id") Integer id){
		StuClassinfoEntity stuClassinfo = stuClassinfoService.queryObject(id);
		
		return R.ok().put("stuClassinfo", stuClassinfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("stuclassinfo:save")
	public R save(@RequestBody StuClassinfoEntity stuClassinfo){
		stuClassinfoService.save(stuClassinfo);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("stuclassinfo:update")
	public R update(@RequestBody StuClassinfoEntity stuClassinfo){
		stuClassinfoService.update(stuClassinfo);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("stuclassinfo:delete")
	public R delete(@RequestBody Integer[] ids){
		stuClassinfoService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
