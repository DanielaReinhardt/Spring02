package com.wildcodeschool.myProject2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class DemoApplication extends Exception {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/doctor/{id}")
	@ResponseBody
		public String doctor(@PathVariable int id){ 

		//a simple way to show the result

		if(id==8 || id==7|| id==6|| id==5|| id==4|| id==3|| id==2 || id==1){
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See another Number");
		}

		if (id==9){
			return "{'Number :' " + id + ", " + "'Christopher Eccleston'}";
		}

		if (id==10){
			return "{'Number :' " + id + ", " + "'David Tennant'}";
		}

		if (id==11){
			return "{'Number :' " + id + ", " + "'Matt Smith'}";
		}
		
		if (id==12){
			return "{'Number :' " + id + ", " + "'Peter Capaldi'}";
		}

		if (id==13){
			return "{'Number :' " + id + ", " + "'Jodie Whittaker'}";
		}

		else{
				
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible to retrieve the incarnation <incarnation number>");
				
		 }
		
	}
	
}




