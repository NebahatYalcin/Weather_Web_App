package IFS.WeatherForecastApp.business.abstracts;


import java.util.List;

import org.jboss.jandex.Result;

import IFS.WeatherForecastApp.core.utilities.results.DataResult;
import IFS.WeatherForecastApp.entities.concretes.User;


public interface UserService {
	DataResult<List<User>> getAll();//DENEME için sonra çıkar

}
