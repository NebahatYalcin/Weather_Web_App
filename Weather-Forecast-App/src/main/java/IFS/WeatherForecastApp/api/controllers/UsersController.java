package IFS.WeatherForecastApp.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import IFS.WeatherForecastApp.business.abstracts.UserService;
import IFS.WeatherForecastApp.core.utilities.results.DataResult;
import IFS.WeatherForecastApp.core.utilities.results.Result;
import IFS.WeatherForecastApp.entities.concretes.User;





@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();	
	}
	
	
	

}
