package IFS.WeatherForecastApp.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="user_tab")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="user_type")
	private boolean usertype;
	
	@Column(name="default_city_name")
	private String default_city_name;
	
	@Column(name="status")
	private boolean status;
}
