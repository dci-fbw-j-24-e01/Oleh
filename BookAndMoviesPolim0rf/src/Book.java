public class Book extends Product {

    protected String title;
    protected String author;


    public Book(int productId, int price, String title, String author) {
        setProductId(productId);
        setPrice(price);
        this.title = title;
        this.author = author;
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
}
