public class MovieWithDirector extends Movie {

    private String director;

    public MovieWithDirector(long productId, String title, MovieGenre genre, int price, String director) throws IncorrectProductIdException {
        super(productId, title, genre, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDirector: " + getDirector();
    }
}
