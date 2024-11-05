package pgmais.ia.api_mock_kami_20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pgmais.ia.api_mock_kami_20.models.Debt;
import pgmais.ia.api_mock_kami_20.models.DebtRequest;
import pgmais.ia.api_mock_kami_20.services.DebtService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DebtController {

    @Autowired
    private DebtService debtService;

    @Autowired
    public DebtController(DebtService debtService) {
        this.debtService = debtService;
    }

    @PostMapping("/debts")
    public ResponseEntity<?> getDebtsByDocument(@RequestBody DebtRequest debtRequest) {

        String document = debtRequest.getDocument();

        List<Debt> debts = debtService.findDebtsByDocument(document);

        if (debts.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma dívida encontrada para o CPF informado");
        } else {
            return ResponseEntity.ok(debts);
        }
    }
}
