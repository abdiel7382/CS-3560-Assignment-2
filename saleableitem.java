public interface SaleableItem{
    public abstract void  sellCopy(){
        System.out.println("Selling a " + SaleableItem + " here");
    }
}