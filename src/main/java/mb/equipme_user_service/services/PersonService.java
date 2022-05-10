package mb.equipme_user_service.services;

import mb.equipme_user_service.domain.Person;
import mb.equipme_user_service.web.models.PersonDto;
import java.util.UUID;

public interface PersonService  extends BaseService<Person, UUID> {

    void updatePerson(PersonDto updatedPerson);
}
