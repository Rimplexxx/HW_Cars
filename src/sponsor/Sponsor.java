package sponsor;

public class Sponsor {

    private final String name;
    private final int supportAmount;
    private final boolean company;

    public Sponsor(String name, int supportAmount, boolean company) {
        this.name = name;
        this.supportAmount = supportAmount;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public boolean isCompany() {
        return company;
    }

    public void provideSponsorship() {
        System.out.println("Спонсор " + name + " спонсирует заезд на сумму " + supportAmount);
    }

    @Override
    public String toString() {
        String companyOrNot = company == true ? "; спонсор является компанией" : "; спонсор является юридическим лицом";
        return "Спонсор: " + name +
                "; сумма поддержки: " + supportAmount +
                companyOrNot;
    }
}
