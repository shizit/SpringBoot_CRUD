package com.example.demo.component.dao;

import java.util.List;
import java.util.Map;

public class SelectResultRetForm {
	
	public List<String> columnList;
	public List<Map<String, Object>> resultMapList;
	
	public List<String> getColumnList() {
		return columnList;
	}
	public void setColumnList(List<String> columnList) {
		this.columnList = columnList;
	}
	public List<Map<String, Object>> getResultMapList() {
		return resultMapList;
	}
	public void setResultMapList(List<Map<String, Object>> resultMapList) {
		this.resultMapList = resultMapList;
	}
	
	
}
