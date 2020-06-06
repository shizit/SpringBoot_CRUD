package com.example.demo.component.dao;


import java.util.List;
import java.util.Map;

public interface UserDao {
	
	//テーブルデータを取得
	public List<Map<String,Object>> selectData();
}
