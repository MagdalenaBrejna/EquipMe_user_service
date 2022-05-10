package mb.equipme_user_service.services;

import mb.equipme_user_service.domain.Person;
import mb.equipme_user_service.repositories.PersonRepository;
import mb.equipme_user_service.web.mappers.PersonMapper;
import mb.equipme_user_service.web.models.PersonDto;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;
    private PersonMapper mapper;

    public PersonServiceImpl(PersonRepository personRepository, PersonMapper mapper) {
        this.personRepository = personRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        personRepository.findAll().forEach(people::add);
        return people;
    }

    @Override
    public Person findById(UUID personUUID) {
        return personRepository.findById(personUUID).orElse(null);
    }

    @Transactional
    @Override
    public Person save(Person newPerson) {
        return personRepository.save(newPerson);
    }

    @Transactional
    @Override
    public void delete(Person personToDelete) {
        personRepository.delete(personToDelete);
    }

    @Transactional
    @Override
    public void deleteById(UUID personUUID) {
        personRepository.deleteById(personUUID);
    }

    @Override
    public void updatePerson(PersonDto updatedPerson) {
        Person person = personRepository.findById(updatedPerson.getId()).orElse(null);
        mapper.updatePersonFromDto(updatedPerson, person);
        save(person);
    }
}
