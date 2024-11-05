package pgmais.ia.api_mock_kami_20.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pgmais.ia.api_mock_kami_20.models.Agreement;
import pgmais.ia.api_mock_kami_20.repositories.AgreementRepository;

import java.util.List;

@Service
public class AgreementService {

    @Autowired
    private AgreementRepository agreementRepository;

    public List<Agreement> findAgreementByClientIdAndOfferId(Integer clientId, Integer offerId) {
        return agreementRepository.findAgreementByClientIdAndOfferId(clientId, offerId);
    }
}
