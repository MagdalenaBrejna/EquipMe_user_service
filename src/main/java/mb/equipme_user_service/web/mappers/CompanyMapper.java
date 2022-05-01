package mb.equipme_user_service.web.mappers;

import mb.equipme_user_service.domain.Company;
import mb.equipme_user_service.web.models.CompanyDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CompanyMapper {

    @Mappings({
            @Mapping(target="id", source="company.id"),
            @Mapping(target="upc", source="company.upc"),
            @Mapping(target="name", source="company.name"),
            @Mapping(target="NIP", source="company.NIP"),
            @Mapping(target="localisations", source="company.localisations"),
            @Mapping(target="email", source="company.email"),
            @Mapping(target="password", source="company.password"),
            @Mapping(target="telephone", source="company.telephone"),
            @Mapping(target="userImage", source="company.userImage"),
            @Mapping(target="getNotification", source="company.getNotification"),
            @Mapping(target="userBankAccountNumber", source="company.userBankAccountNumber")
    })
    CompanyDto companyToCompanyDto(Company company);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="upc", source="dto.upc"),
            @Mapping(target="name", source="dto.name"),
            @Mapping(target="NIP", source="dto.NIP"),
            @Mapping(target="localisations", source="dto.localisations"),
            @Mapping(target="email", source="dto.email"),
            @Mapping(target="password", source="dto.password"),
            @Mapping(target="telephone", source="dto.telephone"),
            @Mapping(target="userImage", source="dto.userImage"),
            @Mapping(target="getNotification", source="dto.getNotification"),
            @Mapping(target="userBankAccountNumber", source="dto.userBankAccountNumber")
    })
    Company companyDtoToCompany(CompanyDto dto);
}
