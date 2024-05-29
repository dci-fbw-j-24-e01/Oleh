public class ChildrensBook extends Book {
    private String recommendedAgeInfo;

    public ChildrensBook(long productId, String title, String author, int price, String recommendedAgeInfo) throws IncorrectProductIdException {
        super(productId, title, author, price);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRecommended Age: " + getRecommendedAgeInfo();
    }
}
