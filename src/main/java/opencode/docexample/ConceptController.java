package opencode.docexample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(value="Concept")
@Controller
@RequestMapping("/concept")
public class ConceptController {
	
	@ApiOperation(value = "Fetch all Concepts")
	@RequestMapping(method= RequestMethod.GET)
	public @ResponseBody Concept displayConcepts() throws Exception {
		Concept concept = new Concept();
		concept.setConceptName("Test Concept");
		concept.setConceptOwner("Me");
		concept.setConceptType("Sample");
		
		return concept;
	}
	
	@ApiOperation(value = "Creates a new Person in the database")
	@RequestMapping(method= RequestMethod.POST)
	public Concept createConcept(){
		
		
		return null;
	}

}
