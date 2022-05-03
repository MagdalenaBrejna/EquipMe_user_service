package mb.equipme_user_service.repositories;

import mb.equipme_user_service.domain.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface LocalisationRepository extends JpaRepository<Localisation, UUID> {
}
