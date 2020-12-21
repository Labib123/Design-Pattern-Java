package Decorator;
abstract class SandwishDecorator implements Sandwish{

    private Sandwish sandwish;

    public SandwishDecorator(Sandwish sandwish){
        this.sandwish= sandwish;
    }

    @Override
    public double getCost(){
        return this.sandwish.getCost();
    }
    @Override
    public String getDescription(){
        return this.sandwish.getDescription();
    }

}