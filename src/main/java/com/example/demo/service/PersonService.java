package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Passport;
import com.example.demo.entity.Person;
import com.example.demo.entity.ResponseVO;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String URL = "http://PASSPORT-SERVICE/passport/";
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	
	public ResponseVO getPeronById(int id) {
		Person person = null;
		ResponseVO responseVO = new ResponseVO();
		
		Optional<Person> p = personRepository.findById(id);
		if(p.isPresent()) {
			person = p.get();
			Passport passport = restTemplate.getForObject(URL+""+person.getPassportId(), Passport.class, "");
			responseVO.setPerson(person);
			responseVO.setPassport(passport);
		}
		return responseVO;
	}

}
