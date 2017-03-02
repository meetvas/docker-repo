package hello;

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
    	return "Hello Docker World.....Server Host:"+request.getLocalAddr()+"...Final Update for port";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
