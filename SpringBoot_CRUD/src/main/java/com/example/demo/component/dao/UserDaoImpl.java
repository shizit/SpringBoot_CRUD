package com.example.demo.component.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.demo.component.database.ConnectionMySQL;

@Component
public class UserDaoImpl implements UserDao {

	@Override
	public List<Map<String,Object>> selectData() {
		
		//実行SQL
		String SELECT_USERINFO_SQL = "SELECT * FROM USERINFO"; 
		
		//カラム名取得Map
		List<String> columnList = new ArrayList<String>();		
		//取得結果格納ListMap
		List<Map<String, Object>> resultMapList = new ArrayList<Map<String,Object>>();
		
		
		
		//Connection取得インスタンス生成
		ConnectionMySQL conMySQL = new ConnectionMySQL();
		
		try(Connection con = conMySQL.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_USERINFO_SQL);){
			
			//カラム名取得
			ResultSetMetaData rsmd = rs.getMetaData();
			
			
			//実行結果取得
			while(rs.next()) {
				
				//値を格納するMapを生成
				Map<String, Object> map = new LinkedHashMap<String, Object>();
				
				for(int colCount = 1; colCount <= rsmd.getColumnCount(); colCount ++ ) {
					
					//Mapに結果を格納
					map.put(rsmd.getColumnName(colCount), 
							rs.getString(rsmd.getColumnName(colCount)));
				}
				
				resultMapList.add(map);
			}
				
		return resultMapList;
		
		}catch(SQLException e) {
			e.printStackTrace();
			return new ArrayList<Map<String,Object>>();		
		}		
	}
}
