package pgmais.ia.api_mock_kami_20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pgmais.ia.api_mock_kami_20.models.Agreement;
import pgmais.ia.api_mock_kami_20.models.AgreementRequest;
import pgmais.ia.api_mock_kami_20.services.AgreementService;

import java.util.List;

public class AgreementController {

    @Autowired
    private AgreementService agreementService;

    @Autowired
    public AgreementController(AgreementService agreementService) {
        this.agreementService = agreementService;
    }

    @PostMapping("/offers")
    public ResponseEntity<?> findAgreementByClientIdAndOfferId(@RequestBody AgreementRequest agreementRequest) {

        Integer clientId = agreementRequest.getClientId();
        Integer offerId = agreementRequest.getOfferId();

        List<Agreement> offers = agreementService.findAgreementByClientIdAndOfferId(clientId, offerId);

        if (offers.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum acordo encontrado para o cliente" +
                    " informado");
        } else {
            return ResponseEntity.ok(offers);
        }
    }
}
