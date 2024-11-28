public class Main {
    public static void main(String[] args)
    {
        BankDetails bankDetails = new BankDetails("1140823549854983541", "Pidors", "7831294237", "Lohi", "Novorossiska");
        bankDetails.setBillNumber("4021375218304912384843");
        Company company = new Company("Smart Lohi", bankDetails);
        bankDetails.setBillNumber("1274895443792384234234");
        System.out.println("Info of company: " + company);
        //
    }
}
