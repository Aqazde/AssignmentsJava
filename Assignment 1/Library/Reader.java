
public class Reader {
    private String fullname;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private String name;
    private String author;
    public Reader(String fullname, int cardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        setCardNumber(cardNumber);
        setFaculty(faculty);
        setFullname(fullname);
        setPhoneNumber(phoneNumber);
        setDateOfBirth(dateOfBirth);
    }

    public void takeBook(int numOfBooks) {
        System.out.println(fullname + " took " + numOfBooks + " books.");
    }
    public void takeBook(String ...books) {
        System.out.print(fullname + " took books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i]);
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public void takeBook(Book ...books) {
        System.out.print(fullname + " took books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i].getName());
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public void returnBook(int numOfBooks) {
        System.out.println(fullname + " returned " + numOfBooks + " books.");
    }
    public void returnBook(String ...books) {
        System.out.print(fullname + " returned books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i]);
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public void returnBook(Book ...books) {
        System.out.print(fullname + " took books: ");
        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i].getName());
            if (i != books.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setCardNumber(int cardNumber) {
        this.libraryCardNumber = cardNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
