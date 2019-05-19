package streamsExercises;

import java.util.Objects;

public class Book {
    private int bookId;
    private String title;
    private String isbnNumber;
    private int year;
    private BookBindingType typeOfBinding;


    public Book(int bookId, String title, String isbnNumber, int year, BookBindingType typeOfBinding) {
        this.bookId = bookId;
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.year = year;
        this.typeOfBinding = typeOfBinding;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId &&
                year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(isbnNumber, book.isbnNumber) &&
                typeOfBinding == book.typeOfBinding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, isbnNumber, year, typeOfBinding);
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public int getBookId() {
        return bookId;
    }

    public BookBindingType getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isbnNumber='" + isbnNumber + '\'' +
                ", year=" + year +
                ", typeOfBinding=" + typeOfBinding +
                '}';
    }
}
