package IFS.WeatherForecastApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import IFS.WeatherForecastApp.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
