package pgmais.ia.api_mock_kami_20.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.ALWAYS)
@Entity
@Table(name = "agreements")
public class Agreement {
    @Id
    private Long id;
    private Integer clientId;
    private Integer offerId;
    private String dueDate;
    private Double totalValue;
    private Integer installmentNumber;
    private Double entryValue;
    private Double installmentValue;
    private String digitableLine;

    public Agreement() {
    }

    public Agreement(Long id, Integer clientId, Integer offerId, String dueDate, Double totalValue, Integer installmentNumber,
                     Double entryValue, Double installmentValue, String digitableLine) {
        this.id = id;
        this.offerId = offerId;
        this.dueDate = dueDate;
        this.totalValue = totalValue;
        this.installmentNumber = installmentNumber;
        this.entryValue = entryValue;
        this.installmentValue = installmentValue;
        this.digitableLine = digitableLine;
        this.clientId = clientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
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

    public String getDigitableLine() {
        return digitableLine;
    }

    public void setDigitableLine(String digitableLine) {
        this.digitableLine = digitableLine;
    }
}
