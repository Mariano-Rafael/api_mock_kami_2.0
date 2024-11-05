package pgmais.ia.api_mock_kami_20.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pgmais.ia.api_mock_kami_20.models.Debt;

import java.util.List;

@Repository
public interface DebtRepository extends JpaRepository<Debt, Long> {
    List<Debt> findDebtsByDocument(String document);
}



