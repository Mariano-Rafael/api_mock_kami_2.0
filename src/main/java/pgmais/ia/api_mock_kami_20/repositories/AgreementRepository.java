package pgmais.ia.api_mock_kami_20.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pgmais.ia.api_mock_kami_20.models.Agreement;
import java.util.List;

@Repository
public interface AgreementRepository extends JpaRepository<Agreement, Long> {

    List<Agreement> findAgreementByClientIdAndOfferId(Integer offerID, Integer clientId);

}
