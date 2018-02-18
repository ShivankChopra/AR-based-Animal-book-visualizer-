package AugmentedRealityApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AugmentedRealityApp.Dao.AnimalDao;
import AugmentedRealityApp.Domain.Animal;

@Service
public class AnimalService{
	
	@Autowired
	private AnimalDao ad;
	
	public Animal getAnimal(String name) {
		return ad.getAnimalByName(name);
	}
}