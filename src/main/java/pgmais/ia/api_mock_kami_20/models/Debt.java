package pgmais.ia.api_mock_kami_20.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.ALWAYS)
@Entity
@Table(name = "debts")
public class Debt {
    @Id
    private Long id;
    private int clientId;
    private String document;
    private String clientName;
    private String contract;
    private double paymentValue;
    private double originalValue;
    private boolean allowRenegociation;
    private String product;
    private String status;
    private String dueDate;
    private int overDueDays;
    private String clientCode;
    private int minimumInstallmentNumber;
    private int maximumInstallmentNumber;
    private String minimumInstallmentDueDate;
    private String maximumInstallmentDueDate;

    // construtor

    public Debt() {
    }

    public Debt(Long id, int clientId, String document, String clientName, String contract, double paymentValue,
                double originalValue, boolean allowRenegociation, String product, String status, String dueDate,
                int overDueDays, String clientCode, int minimumInstallmentNumber, int maximumInstallmentNumber,
                String minimumInstallmentDueDate, String maximumInstallmentDueDate) {
        this.id = id;
        this.clientId = clientId;
        this.document = document;
        this.clientName = clientName;
        this.contract = contract;
        this.paymentValue = paymentValue;
        this.originalValue = originalValue;
        this.allowRenegociation = allowRenegociation;
        this.product = product;
        this.status = status;
        this.dueDate = dueDate;
        this.overDueDays = overDueDays;
        this.clientCode = clientCode;
        this.minimumInstallmentNumber = minimumInstallmentNumber;
        this.maximumInstallmentNumber = maximumInstallmentNumber;
        this.minimumInstallmentDueDate = minimumInstallmentDueDate;
        this.maximumInstallmentDueDate = maximumInstallmentDueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public double getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(double paymentValue) {
        this.paymentValue = paymentValue;
    }

    public double getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(double originalValue) {
        this.originalValue = originalValue;
    }

    public boolean isAllowRenegociation() {
        return allowRenegociation;
    }

    public void setAllowRenegociation(boolean allowRenegociation) {
        this.allowRenegociation = allowRenegociation;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getOverDueDays() {
        return overDueDays;
    }

    public void setOverDueDays(int overDueDays) {
        this.overDueDays = overDueDays;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public int getMinimumInstallmentNumber() {
        return minimumInstallmentNumber;
    }

    public void setMinimumInstallmentNumber(int minimumInstallmentNumber) {
        this.minimumInstallmentNumber = minimumInstallmentNumber;
    }

    public int getMaximumInstallmentNumber() {
        return maximumInstallmentNumber;
    }

    public void setMaximumInstallmentNumber(int maximumInstallmentNumber) {
        this.maximumInstallmentNumber = maximumInstallmentNumber;
    }

    public String getMinimumInstallmentDueDate() {
        return minimumInstallmentDueDate;
    }

    public void setMinimumInstallmentDueDate(String minimumInstallmentDueDate) {
        this.minimumInstallmentDueDate = minimumInstallmentDueDate;
    }

    public String getMaximumInstallmentDueDate() {
        return maximumInstallmentDueDate;
    }

    public void setMaximumInstallmentDueDate(String maximumInstallmentDueDate) {
        this.maximumInstallmentDueDate = maximumInstallmentDueDate;
    }
}

