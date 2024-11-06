
public class ResidentialSite extends Site{

    private int _units;
    private int _rate;
    public ResidentialSite() {
        super();
    }

    @Override
    public double getBaseAmount() {
        return _units * _rate;
    }



    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
