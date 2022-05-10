package mb.equipme_user_service.services;

import mb.equipme_user_service.domain.Localisation;
import mb.equipme_user_service.web.models.LocalisationDto;

import java.util.UUID;

public interface LocalisationService extends BaseService<Localisation, UUID> {

    void updateLocalisation(LocalisationDto updatedLocalisation);
}
