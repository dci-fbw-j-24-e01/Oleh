public class Movie {
    private long productId;
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;


    public Movie(String title, MovieGenre genre, int price, long productId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.productId = productId;
    }

    public Movie(String title, MovieGenre genre, int price, String director, long productId ) {
        this(title, genre, price, productId);
        this.director = director;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void printMovieDetails() {
        System.out.println("ID " + productId);
        System.out.println("--- Movie Details ---");

        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Price: " + getPrice());
        if (getDirector() != null) {
            System.out.println("Director: " + getDirector());
        }
    }
}
