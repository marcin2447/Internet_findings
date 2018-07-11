package pl.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.home.model.Discovery;

import pl.home.repository.DiscoveryRepository;


@Controller
public class DiscoveryAddController {
	
	
private DiscoveryRepository discoveryRepository;
	
	@Autowired
	public DiscoveryAddController(DiscoveryRepository discoveryRepository)
	{
		this.discoveryRepository=discoveryRepository;
		
		
	}
	
	
	
	
	@GetMapping("/add")
	public String add()
	{
		return "new";
		
	}
	
	
	
	
    @PostMapping("/add")
    public String saveUser(@RequestParam String inputName, @RequestParam String inputUrl, @RequestParam String inputDescription) {
        Discovery discovery=new Discovery();
        discovery.setName(inputName);
		discovery.setUrl(inputUrl);
		discovery.setDescription(inputDescription);
		
		
    	
    	discoveryRepository.save(discovery);
        return "redirect:/";
    }
	
	

}
