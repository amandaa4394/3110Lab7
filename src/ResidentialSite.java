

public class ResidentialSite extends Site{

    private int _units;
    private int _rate;
    public ResidentialSite() {
        super();
    }

    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
