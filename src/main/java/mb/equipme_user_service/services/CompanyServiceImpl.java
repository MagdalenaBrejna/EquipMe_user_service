package mb.equipme_user_service.services;

import mb.equipme_user_service.domain.Company;
import mb.equipme_user_service.repositories.CompanyRepository;
import mb.equipme_user_service.services.CompanyService;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAll() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    @Override
    public Company findById(UUID companyUUID) {
        return companyRepository.findById(companyUUID).orElse(null);
    }

    @Transactional
    @Override
    public Company save(Company newCompany) {
        return companyRepository.save(newCompany);
    }

    @Transactional
    @Override
    public void delete(Company companyToDelete) {
        companyRepository.delete(companyToDelete);
    }

    @Transactional
    @Override
    public void deleteById(UUID companyUUID) {
        companyRepository.deleteById(companyUUID);
    }
}
