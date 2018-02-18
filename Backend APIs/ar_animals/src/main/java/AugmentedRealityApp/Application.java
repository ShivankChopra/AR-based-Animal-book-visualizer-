package AugmentedRealityApp;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@PropertySource({"classpath:AugmentedRealityApp/Application.properties"})
public class Application extends WebMvcConfigurerAdapter{
	@Value("${userdb.url}")
	String url;
	
	@Value("${userdb.driverClassName}")
	String driverClassName;
	
	@Value("${userdb.username}")
	String username;
	
	@Value("${userdb.password}")
	String password;
	
	@Bean
	public DataSource getDataSource(){
		DataSource ds = new DataSource();
	    ds.setUrl(url);
	    ds.setUsername(username);
	    ds.setPassword(password);
	    ds.setDriverClassName(driverClassName);
	    
	    return ds;
	}
	
	public static void main(String args[]){
		SpringApplication.run(Application.class, args);
}
}