package mb.equipme_user_service.repositories;

import mb.equipme_user_service.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {
}
