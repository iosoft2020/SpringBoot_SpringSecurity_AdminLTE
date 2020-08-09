package com.iosoft2020.Module1.fein;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "Module2")
public interface Module2FenService {

	@RequestMapping("/Module2/list")
	public String list();


}
