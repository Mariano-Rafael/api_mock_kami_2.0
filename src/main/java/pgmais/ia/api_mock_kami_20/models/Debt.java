package pgmais.ia.api_mock_kami_20.models;

import jakarta.persistence.*;

@Entity
@Table(name = "client_debts")
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Debt() {

    }

    // getters e setters

    public Long getId() {
        return id;
    }


    public int getClientId() {
        return clientId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public void setPaymentValue(double paymentValue) {
        this.paymentValue = paymentValue;
    }

    public void setOriginalValue(double originalValue) {
        this.originalValue = originalValue;
    }

    public void setAllowRenegociation(boolean allowRenegociation) {
        this.allowRenegociation = allowRenegociation;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setOverDueDays(int overDueDays) {
        this.overDueDays = overDueDays;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public void setMinimumInstallmentNumber(int minimumInstallmentNumber) {
        this.minimumInstallmentNumber = minimumInstallmentNumber;
    }

    public void setMaximumInstallmentNumber(int maximumInstallmentNumber) {
        this.maximumInstallmentNumber = maximumInstallmentNumber;
    }

    public void setMinimumInstallmentDueDate(String minimumInstallmentDueDate) {
        this.minimumInstallmentDueDate = minimumInstallmentDueDate;
    }

    public void setMaximumInstallmentDueDate(String maximumInstallmentDueDate) {
        this.maximumInstallmentDueDate = maximumInstallmentDueDate;
    }

    public String getDocument() {
        return document;
    }

    public String getClientName() {
        return clientName;
    }

    public String getContract() {
        return contract;
    }

    public double getPaymentValue() {
        return paymentValue;
    }

    public double getOriginalValue() {
        return originalValue;
    }

    public boolean isAllowRenegociation() {
        return allowRenegociation;
    }

    public String getProduct() {
        return product;
    }

    public String getStatus() {
        return status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getOverDueDays() {
        return overDueDays;
    }

    public String getClientCode() {
        return clientCode;
    }

    public int getMinimumInstallmentNumber() {
        return minimumInstallmentNumber;
    }

    public int getMaximumInstallmentNumber() {
        return maximumInstallmentNumber;
    }

    public String getMinimumInstallmentDueDate() {
        return minimumInstallmentDueDate;
    }

    public String getMaximumInstallmentDueDate() {
        return maximumInstallmentDueDate;
    }

}

