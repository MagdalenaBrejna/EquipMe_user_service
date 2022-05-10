package mb.equipme_user_service.services;

import mb.equipme_user_service.domain.Company;
import mb.equipme_user_service.web.models.CompanyDto;

import java.util.UUID;

public interface CompanyService extends BaseService<Company, UUID> {

    void updateCompany(CompanyDto updatedCompany);
}
