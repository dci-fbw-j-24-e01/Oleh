public class IncorrectProductIdException  extends Exception{
    private long productId;


    public IncorrectProductIdException(long productId) {
        this.productId = productId;
    }
   
   
    @Override
    public String getMessage(){
        return String.format("The product ID " + productId + " not good");
    }
}
