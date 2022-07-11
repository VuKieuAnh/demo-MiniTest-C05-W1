import model.Book;
import model.FictionBook;
import model.ProgrammingBook;

public class BookManager {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new ProgrammingBook("CG01", "Toi di code dao", 12, "TG1", "Java1", "All");
        books[1] = new ProgrammingBook("CG02", "Toi di code dao 1", 102, "TG1", "java", "All");
        books[2] = new FictionBook("CG03", "Yeu em suot doi", 10, "TG3", "Ngon tinh");
        int count = countByLanguage(books, "PHP");
        System.out.println(count);
    }

    //Phương thức tính tổng tiền của 10 cuốn sách
    //ten pt: getSumTotalPrice
    //du lieu tra ve: int
    //tham so: 1 mang Book
    //nhiem vu
    public static int getSumTotalPrice(Book books[]){
        int sum=0;
        for (int i = 0; i < books.length; i++) {
            sum+=books[i].getPrice();
        }
        return sum;
    }
//    đếm số sách ProgrammingBook có language là "Java".
    //ten pt: countJava
    //du lieu tra ve: int
    //tham so: 1 mang Book
    //nhiem vu
    public static int countJava(Book book[]){
        int count=0;
        for (int i = 0; i < book.length; i++) {
//           ep kieu Book -> ProgrammingBook
            if (book[i] instanceof ProgrammingBook){
               String language = ((ProgrammingBook)book[i]).getLanguage();
               if (language.equals("Java")) {
                   count++;
               }
            }
        }
        return count;
    }
    public static int countByLanguage(Book book[], String language){
        int count=0;
        for (int i = 0; i < book.length; i++) {
//           ep kieu Book -> ProgrammingBook
            if (book[i] instanceof ProgrammingBook){
               String language1 = ((ProgrammingBook)book[i]).getLanguage();
               if (language1.equals(language)) {
                   count++;
               }
            }
        }
        return count;
    }

}
