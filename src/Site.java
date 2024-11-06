public abstract class Site {
    protected static final double TAX_RATE = 0.13;
    private double _units;
    private double _rate;
    public Site(){
        
    }
    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
    public abstract double getTaxAmount();

    public abstract double getBaseAmount();
}
