package com.example.demo.component.dto;

import javax.validation.constraints.NotBlank;

public class UseridDto {

	@NotBlank(message="データが登録されていません")
	public String userid;
	
}
