package Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import Models.PersonModel;
import Services.PersonInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	private PersonInterface personInterface;

	
	//creating get all persons api
	
	@GetMapping("/person")
	public List<PersonModel> getAllPersons() {
		
		return personInterface.getAllPersons();

	}
	
	@GetMapping("/test")
	public String testapi() {
		
		return "api is working";

	}
}
