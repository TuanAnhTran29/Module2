public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    public BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook(){
        if (!isLoanedOut){
            if (book== null){
                book= new BookSingleton();
            }
            isLoanedOut= true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookSingleton){
        isLoanedOut= false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static BookSingleton getBook() {
        return book;
    }

    public static void setBook(BookSingleton book) {
        BookSingleton.book = book;
    }

    public static boolean isIsLoanedOut() {
        return isLoanedOut;
    }

    public static void setIsLoanedOut(boolean isLoanedOut) {
        BookSingleton.isLoanedOut = isLoanedOut;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
