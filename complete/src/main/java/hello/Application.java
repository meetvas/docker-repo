package hello;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public final Logger log =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HttpServletRequest request;
	
    @RequestMapping("/")
    public String home() throws Exception {
    	/*try {
    		System.out.println("jdbc:mysql://192.168.3.20:3306/mysql");	
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection(	"jdbc:mysql://192.168.3.20:3306/mysql-galera","root","mypassword");
    	con.close();
    	} catch(Exception e) {
    		System.out.println(e);
    	}*/
    	
    	log.debug("debug message");
    	log.warn("warn message");
    	log.info("info message");
    	log.error("error message");
    	
    	return "Hello Docker World.....Server Host:"+request.getLocalAddr()+"...Final Update for port is the final one";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
