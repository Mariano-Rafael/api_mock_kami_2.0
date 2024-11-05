package pgmais.ia.api_mock_kami_20.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pgmais.ia.api_mock_kami_20.models.Debt;
import pgmais.ia.api_mock_kami_20.models.Offer;
import pgmais.ia.api_mock_kami_20.models.OfferRequest;
import pgmais.ia.api_mock_kami_20.services.OfferService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @PostMapping("/offers")
    public ResponseEntity<?> findByClientIdAndType(@RequestBody OfferRequest offerRequest) {

        Long clientId = offerRequest.getClientId();
        String type = offerRequest.getType();

        List<Offer> offers = offerService.findByClientIdAndType(clientId, type);

        if (offers.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma oferta encontrada para o cliente" +
                    " informado");
        } else {
            return ResponseEntity.ok(offers);
        }
    }

}
