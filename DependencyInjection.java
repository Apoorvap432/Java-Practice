//main example of dependency injection in java 
public class DependencyInjection{
    public static void main(String[] args) {
        BookService bookService = new BookService();
        BookStore bookStore = new BookStore(bookService);

        System.out.println(bookStore.getBooks());
    }
}



//without dependency injection

// public class DependencyInjection {
//     private BookService bookService;

//     public DependencyInjection(){
//         this.bookService = new bookService();
//     }

//     public list<Book> getBooks(){
//         return bookService.getBooks();
//     }
// }




//with dependency injection

// public class BookStore {
//     private BookService bookService;

//     public BookStore(BookService bookService){
//         this.bookService = bookService;
//     }
// }


