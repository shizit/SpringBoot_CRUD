package com.example.demo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.component.dao.SelectResultRetForm;
import com.example.demo.component.dao.UserDao;
import com.example.demo.component.propertyutil.GetDBProperty;


@Controller
public class CrudController {
	private final UserDao userDao;
	
	public CrudController(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	@RequestMapping("/index")
	public String  index() {
		return "index";
	}
	
	@RequestMapping(value="sendValue", method=RequestMethod.GET)
	public String sendValue(
			@RequestParam(name = "inputText") String inputText, 
			Model model) {
		model.addAttribute("inputText", inputText);
		return "receiveValue";
	}
	
	@RequestMapping("/select")
	public String  select(Model model) {
		
		//テーブルデータを取得
		List<Map<String, Object>> resultMapList = userDao.selectData();
		
		//前画面で入力された文字を追加
		model.addAttribute("inputText", "select");
		//取得したテーブルの結果リストを追加
		//TODO　エラーでデータ取得できなかった場合の対応
		model.addAttribute("resultMapList", resultMapList);
		//カラム名表示用にmapを生成
		model.addAttribute("columnMap", resultMapList.get(0));
		
		return "receiveValue";
	}
	@RequestMapping("/update")
	public String  update(Model model) {
		model.addAttribute("inputText", "update");
		return "receiveValue";
	}
	@RequestMapping("/delete")
	public String  delete(Model model) {
		model.addAttribute("inputText", "delete");
		return "receiveValue";
	}
	@RequestMapping("/insert")
	public String  insert(Model model) {
		model.addAttribute("inputText", "insert");
		return "receiveValue";
	}
}
