package mb.equipme_user_service.services;

import mb.equipme_user_service.domain.Localisation;
import mb.equipme_user_service.repositories.LocalisationRepository;
import mb.equipme_user_service.web.mappers.LocalisationMapper;
import mb.equipme_user_service.web.models.LocalisationDto;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LocalisationServiceImpl implements LocalisationService {

    private LocalisationRepository localisationRepository;
    private LocalisationMapper mapper;

    public LocalisationServiceImpl(LocalisationRepository localisationRepository, LocalisationMapper mapper) {
        this.localisationRepository = localisationRepository;
        this.mapper = mapper;
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

    @Override
    public void updateLocalisation(LocalisationDto updatedLocalisation) {
        Localisation localisation = localisationRepository.findById(updatedLocalisation.getId()).orElse(null);
        mapper.updateLocalisationFromDto(updatedLocalisation, localisation);
        save(localisation);
    }
}
