package pgmais.ia.api_mock_kami_20.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.ALWAYS)
@Entity
@Table(name = "offers")
public class Offer {

    @Id
    private Long id;
    private Long clientId;
    private Long offerId;
    private String dueEmisionDate;
    private Double totalValue;
    private Double originalValue;
    private String dueDate;
    private Integer installmentNumber;
    private Double entryValue;
    private Double installmentValue;
    private String type;

    public Offer() {
    }

    public Offer(Long id, Long clientId, Long offerId, String dueEmisionDate, Double totalValue,
                 Double originalValue, String dueDate, Integer installmentNumber, Double entryValue,
                 Double installmentValue, String type) {
        this.id = id;
        this.clientId = clientId;
        this.offerId = offerId;
        this.dueEmisionDate = dueEmisionDate;
        this.totalValue = totalValue;
        this.originalValue = originalValue;
        this.dueDate = dueDate;
        this.installmentNumber = installmentNumber;
        this.entryValue = entryValue;
        this.installmentValue = installmentValue;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public String getDueEmisionDate() {
        return dueEmisionDate;
    }

    public void setDueEmisionDate(String dueEmisionDate) {
        this.dueEmisionDate = dueEmisionDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Double getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(Double originalValue) {
        this.originalValue = originalValue;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(Integer installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public Double getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Double entryValue) {
        this.entryValue = entryValue;
    }

    public Double getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(Double installmentValue) {
        this.installmentValue = installmentValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
