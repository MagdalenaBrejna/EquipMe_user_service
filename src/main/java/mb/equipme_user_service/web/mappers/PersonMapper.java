package mb.equipme_user_service.web.mappers;

import mb.equipme_user_service.domain.Person;
import mb.equipme_user_service.web.models.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PersonMapper {

    @Mappings({
            @Mapping(target="id", source="person.id"),
            @Mapping(target="upc", source="person.upc"),
            @Mapping(target="name", source="person.name"),
            @Mapping(target="lastname", source="person.lastname"),
            @Mapping(target="localisationId", source="person.localisationId"),
            @Mapping(target="email", source="person.email"),
            @Mapping(target="password", source="person.password"),
            @Mapping(target="telephone", source="person.telephone"),
            @Mapping(target="userImage", source="person.userImage"),
            @Mapping(target="getNotification", source="person.getNotification"),
            @Mapping(target="userBankAccountNumber", source="person.userBankAccountNumber")
    })
    PersonDto personToPersonDto(Person person);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="upc", source="dto.upc"),
            @Mapping(target="name", source="dto.name"),
            @Mapping(target="lastname", source="dto.lastname"),
            @Mapping(target="localisationId", source="dto.localisationId"),
            @Mapping(target="email", source="dto.email"),
            @Mapping(target="password", source="dto.password"),
            @Mapping(target="telephone", source="dto.telephone"),
            @Mapping(target="userImage", source="dto.userImage"),
            @Mapping(target="getNotification", source="dto.getNotification"),
            @Mapping(target="userBankAccountNumber", source="dto.userBankAccountNumber")
    })
    Person personDtoToPerson(PersonDto dto);
}
