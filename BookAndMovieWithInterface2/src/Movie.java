public class Movie extends Product {

    protected String title;
    protected MovieGenre genre;

    public Movie(int productId, int price, String title, MovieGenre genre) {
        setProductId(productId);
        setPrice(price);
        this.title = title;
        this.genre = genre;
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
    public String toString() {
        return "--- Movie Details ---" +
                "\nId: " + getProductId() +
                "\nTitle: " + getTitle() +
                "\nGenre: " + getGenre() +
                "\nPrice: " + getPrice();

    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }
}
