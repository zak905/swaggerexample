package opencode.docexample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value="Person")
@Controller
@RequestMapping("/person")
public class PersonController {
	
	@ApiOperation(value = "Fetch all Persons")
	@RequestMapping(method= RequestMethod.GET)
	public @ResponseBody Person getPersons(){
		Person person = new Person();
		person.setFirstname("some first name");
		person.setLastName("some lastname");
		person.setAge(26);
		person.setDepartement("Accounting");
		
		return person;
	}

}
