package AugmentedRealityApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AugmentedRealityApp.Domain.Animal;
import AugmentedRealityApp.Service.AnimalService;

@RestController
@RequestMapping("/ar_animals/api")
public class AppController{
	
	@Autowired
	private AnimalService as;
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAnimal/{name}")
	public Animal getAnimal(@PathVariable("name") String name) {
		return as.getAnimal(name);
	}
	
}