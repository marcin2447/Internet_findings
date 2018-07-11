package pl.home.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.home.model.Discovery;
import pl.home.repository.DiscoveryRepository;


@Controller
public class HomeController {
	
	
private DiscoveryRepository discoveryRepository;
	
	@Autowired
	public HomeController(DiscoveryRepository discoveryRepository)
	{
		this.discoveryRepository=discoveryRepository;
	}
	
	
	
	
	@RequestMapping("/")
	public String home(Model model )
	{
		 
		List<Discovery>allDiscoveries=discoveryRepository.findAll();
		model.addAttribute("allDiscoveries", allDiscoveries);
		
		
		return "index";
		
	}

}
