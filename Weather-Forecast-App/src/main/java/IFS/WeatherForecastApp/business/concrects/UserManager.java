package IFS.WeatherForecastApp.business.concrects;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import IFS.WeatherForecastApp.business.abstracts.UserService;
import IFS.WeatherForecastApp.core.utilities.results.DataResult;
import IFS.WeatherForecastApp.core.utilities.results.Result;
import IFS.WeatherForecastApp.core.utilities.results.SuccessDataResult;
import IFS.WeatherForecastApp.core.utilities.results.SuccessResult;
import IFS.WeatherForecastApp.dataAccess.abstracts.UserDao;
import IFS.WeatherForecastApp.entities.concretes.User;




@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listelendi");
	}
	


}
