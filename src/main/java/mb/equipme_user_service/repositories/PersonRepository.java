package mb.equipme_user_service.repositories;

import mb.equipme_user_service.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
}
