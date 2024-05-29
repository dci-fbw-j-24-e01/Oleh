public class Movie implements Product, Comparable<Movie> {
    protected int productId;
    protected int price;
    protected String title;
    protected MovieGenre genre;

    public Movie(int productId, int price, String title, MovieGenre genre) {
        this.productId = productId;
        this.price = price;
        this.title = title;
        this.genre = genre;
    }

    public Movie() {

    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
//                "\nName" + () +
                "\nId: " + getProductId() +
                "\nTitle: " + getTitle() +
                "\nGenre: " + getGenre() +
                "\nPrice: " + getPrice();

    }

    @Override
    public void printDetails() {

        System.out.println(this);
    }

    @Override
    public int compareTo(Movie o) {

        return title.compareTo(o.title);
    }

}
