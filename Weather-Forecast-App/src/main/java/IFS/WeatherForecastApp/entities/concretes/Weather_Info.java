package IFS.WeatherForecastApp.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="weather_info_tab")
public class Weather_Info {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	
	@Column(name="weather_date")
	private Date weatherDate;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="temprature")
	private Float temprature;
	
	@Column(name="main_status")
	private String mainStatus;
	
}
