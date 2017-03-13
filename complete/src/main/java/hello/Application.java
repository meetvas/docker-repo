package hello;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private HttpServletRequest request;
	
    @RequestMapping("/")
    public String home() throws Exception {
    	try {
    		System.out.println("jdbc:mysql://192.168.3.20:3306/mysql-galera");	
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection(	"jdbc:mysql://192.168.3.20:3306/mysql-galera","root","mypassword");
    	con.close();
    	} catch(Exception e) {
    		System.out.println(e);
    	}
    	return "Hello Docker World.....Server Host:"+request.getLocalAddr()+"...Final Update for port is the final one";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
