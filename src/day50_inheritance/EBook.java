package day50_inheritance;

public class EBook extends Book{
    int size;
    int pages;
    public void readBook() {
        System.out.println("I am reading EBook " + title + "by " + author);
        System.out.println("I bought " + title + " for " + price);
        System.out.println("Size = " + size);
        System.out.println("Pages = " + pages);
    }
}
