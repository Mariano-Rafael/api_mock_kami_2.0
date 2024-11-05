package pgmais.ia.api_mock_kami_20.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pgmais.ia.api_mock_kami_20.models.Offer;
import pgmais.ia.api_mock_kami_20.repositories.OfferRepository;

import java.util.List;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    public List<Offer> findByClientIdAndType(Long clientId, String type) {
        return offerRepository.findOffersByClientIdAndType(clientId, type);

    }
}
