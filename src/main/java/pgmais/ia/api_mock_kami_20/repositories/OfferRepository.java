package pgmais.ia.api_mock_kami_20.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pgmais.ia.api_mock_kami_20.models.Offer;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

    List<Offer> findOffersByClientIdAndType(Long clientId, String type);
}
