package Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import Models.PersonModel;

@Service
public class PersonService implements PersonInterface {

	
	@Override
	public List<PersonModel> getAllPersons() {
		
		List<PersonModel> persons = new ArrayList<PersonModel>();
		
		persons.add(new PersonModel(1,"Mos","Jan","jy6784gfgabsdf67v","dev"));
		persons.add(new PersonModel(2,"Pippo","Pallini","p54pa54gadf67v","manager"));
		persons.add(new PersonModel(2,"Pinco","Pallo","p67adf67vut","employee"));
		
		return persons; 
		
	}

}
