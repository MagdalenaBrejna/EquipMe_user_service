package mb.equipme_user_service.services;

import mb.equipme_user_service.domain.Localisation;
import mb.equipme_user_service.repositories.LocalisationRepository;
import mb.equipme_user_service.services.LocalisationService;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LocalisationServiceImpl implements LocalisationService {

    LocalisationRepository localisationRepository;

    public LocalisationServiceImpl(LocalisationRepository localisationRepository) {
        this.localisationRepository = localisationRepository;
    }

    @Override
    public List<Localisation> findAll() {
        List<Localisation> localisations = new ArrayList<>();
        localisationRepository.findAll().forEach(localisations::add);
        return localisations;
    }

    @Override
    public Localisation findById(UUID localisationUUID) {
        return localisationRepository.findById(localisationUUID).orElse(null);
    }

    @Transactional
    @Override
    public Localisation save(Localisation newLocalisation) {
        return localisationRepository.save(newLocalisation);
    }

    @Transactional
    @Override
    public void delete(Localisation localisationToDelete) {
        localisationRepository.delete(localisationToDelete);
    }

    @Transactional
    @Override
    public void deleteById(UUID localisationUUID) {
        localisationRepository.deleteById(localisationUUID);
    }
}
