public class BankDetails {
    private final String billNumber;
    private final String correspondenceBill;
    private final String bankNumber;
    private final String bankName;
    private final String city;


    public BankDetails(String billNumber, String correspondenceBill, String bankNumber, String bankName, String city) {
        this.billNumber = billNumber;
        this.correspondenceBill = correspondenceBill;
        this.bankNumber = bankNumber;
        this.bankName = bankName;
        this.city = city;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public BankDetails setBillNumber(String billNumber) {
        return new BankDetails(billNumber, correspondenceBill, bankNumber, bankName, city);
    }

    public String getCorrespondenceBill() {
        return correspondenceBill;
    }

    public BankDetails setCorrespondenceBill(String correspondenceBill) {
        return new BankDetails(billNumber, correspondenceBill, bankNumber, bankName, city);
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public BankDetails setBankNumber(String bankNumber) {
        return new BankDetails(billNumber, correspondenceBill, bankNumber, bankName, city);
    }

    public String getBankName() {
        return bankName;
    }

    public BankDetails setBankName(String bankName) {
        return new BankDetails(billNumber, correspondenceBill, bankNumber, bankName, city);
    }

    public String getCity() {
        return city;
    }

    public BankDetails setCity(String city) {
        return new BankDetails(billNumber, correspondenceBill, bankNumber, bankName, city);
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "billNumber='" + billNumber + '\'' +
                ", correspondenceBill='" + correspondenceBill + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", bankName='" + bankName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
