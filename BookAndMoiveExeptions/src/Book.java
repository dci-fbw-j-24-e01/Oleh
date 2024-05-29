public class Book implements Product {
    protected int productId;
    protected int price;
    protected String title;
    protected String author;

    public Book(int productId, int price, String title, String author) throws IncorrectProductIdException {
        if (productId <= 0) {
            throw new IncorrectProductIdException();
        }
        this.productId = productId;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public Book() {

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "--- Book Details ---" +
                "\nId: " + getProductId() +
                "\nTitle: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nPrice: " + getPrice();
    }

    @Override
    public int compareTo(Movie movie) {
//        Book otherBook
        return 0;
    }
}
