package pl.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.home.model.User;
import pl.home.repository.UserRepository;

@Controller
public class RegisterController {

	private UserRepository userRepository;
	
	@Autowired
	public RegisterController(UserRepository userRepository)
	{
		this.userRepository=userRepository;
		
		
	}
	
	@GetMapping("/register")
    public String getregister()
    {
		
		
		return "register";
		
    }
	
    		
    		
    @PostMapping("/register")
    public String saveUser(@RequestParam String inputEmail, @RequestParam String inputUsername, @RequestParam String inputPassword) {
        User user=new User();
        user.setUsername(inputUsername);
		user.setPassword(inputPassword);
		user.setEmail(inputEmail);
		user.setActive(true);
		
    	
    	userRepository.save(user);
        return "redirect:/login";
    }
	
	
	
}
