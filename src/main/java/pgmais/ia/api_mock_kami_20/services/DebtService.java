package pgmais.ia.api_mock_kami_20.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pgmais.ia.api_mock_kami_20.models.Debt;
import pgmais.ia.api_mock_kami_20.repositories.DebtRepository;

import java.util.List;

@Service
public class DebtService {
    private final DebtRepository debtRepository;


    public DebtService(DebtRepository debtRepository) {
        this.debtRepository = debtRepository;
    }

    public List<Debt> findDebtsByDocument(String document) {
        return debtRepository.findByDocument(document);
    }
}

