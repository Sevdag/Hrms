package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.UserService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.User;

@RestController
@RequestMapping("/api/user")
public class UserControllers {
	
	private UserService userService;

	@Autowired
	public UserControllers(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<User>>getall(){
		return this.userService.getall();
	}
	@PostMapping("/add")
	public Result add(User user) {
		return this.userService.add(user);
	}

}
