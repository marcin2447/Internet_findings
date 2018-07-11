package pl.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import pl.home.model.User;
import pl.home.repository.UserRepository;

@Controller
public class LoginController {

private UserRepository userRepository;
	
	@Autowired
	public LoginController(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
		
	@GetMapping("/login")
	    public String login()
	    {
		 
		 return "login";
		 
	    }
	
	 @PostMapping("/login")
	 public String auth(@RequestParam String j_username, @RequestParam String j_password)
	 {
		  User user=new User();
		 
		 user=userRepository.findFirstByusername(j_username);
		 
		
		   
		 
		 
		if(user!=null )
		{
			
			
		return "redirect:/";
			
			
		}
		else
			{return "login";}
		
		 
		 
	 }
	
	
}
