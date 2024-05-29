public class Book extends Product {
    private String title;
    private String author;

    public Book(long productId, String title, String author, int price) throws IncorrectProductIdException {
        if (productId < 0){
            throw new IncorrectProductIdException(productId);
        }
        setProductId(productId);
        this.title = title;
        this.author = author;
        setPrice(price);
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
    public int compareTo(Product o) {
        return 0;
    }
}
