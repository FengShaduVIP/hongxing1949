package com.hongxing1949.entity;

import java.io.Serializable;


/**
 * 班级信息
 * 
 * @author FengShadu
 * @email twpvip@gmail.com
 * @date 2017-11-03 10:16:50
 */
public class StuClassinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String className;
	//
	private Integer classNo;
	//
	private Integer year;
	//
	private Integer techId;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * 获取：
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * 设置：
	 */
	public void setClassNo(Integer classNo) {
		this.classNo = classNo;
	}
	/**
	 * 获取：
	 */
	public Integer getClassNo() {
		return classNo;
	}
	/**
	 * 设置：
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * 获取：
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * 设置：
	 */
	public void setTechId(Integer techId) {
		this.techId = techId;
	}
	/**
	 * 获取：
	 */
	public Integer getTechId() {
		return techId;
	}
}
