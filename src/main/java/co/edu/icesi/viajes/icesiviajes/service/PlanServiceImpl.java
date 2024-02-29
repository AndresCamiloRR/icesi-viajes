package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.Plan;
import co.edu.icesi.viajes.icesiviajes.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public List<Plan> findAll() {
        return planRepository.findAll();
    }

    @Override
    public Optional<Plan> findById(Integer aInteger) {
        return planRepository.findById(aInteger);
    }

    @Override
    public Plan save(Plan entity) throws Exception {
        return planRepository.save(entity);
    }

    @Override
    public Plan update(Plan entity) throws Exception {
        return planRepository.save(entity);
    }

    @Override
    public void delete(Plan entity) throws Exception {
        planRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer aInteger) throws Exception {
        planRepository.deleteById(aInteger);
    }

    @Override
    public void validate(Plan entity) throws Exception {

    }

    @Override
    public Long count() {
        return planRepository.count();
    }
}
