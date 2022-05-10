package mb.equipme_user_service.web.mappers;

import mb.equipme_user_service.domain.Localisation;
import mb.equipme_user_service.web.models.LocalisationDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface LocalisationMapper {

    @Mappings({
            @Mapping(target="id", source="localisation.id"),
            @Mapping(target="upc", source="localisation.upc"),
            @Mapping(target="city", source="localisation.city"),
            @Mapping(target="province", source="localisation.province")
    })
    LocalisationDto localisationToLocalisationDto(Localisation localisation);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="upc", source="dto.upc"),
            @Mapping(target="city", source="dto.city"),
            @Mapping(target="province", source="dto.province")
    })
    Localisation localisationDtoToLocalisation(LocalisationDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateLocalisationFromDto(LocalisationDto dto, @MappingTarget Localisation entity);
}
