public class Movie extends Product {
    private String title;
    private MovieGenre genre;


    public Movie(long productId, String title, MovieGenre genre, int price) throws IncorrectProductIdException{
        if (productId < 0){
            throw new IncorrectProductIdException(productId);
        }
        setProductId(productId);
        this.title = title;
        this.genre = genre;
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    @Override
    public String toString() {
        return "--- Movie Details ---" +
            "\nId: " + getProductId() +
            "\nTitle: " + getTitle() +
            "\nGenre: " + getGenre() +
            "\nPrice: " + getPrice();
    }
}
