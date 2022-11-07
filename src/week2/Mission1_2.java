package week2;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String bookName;
    private String author;

    public Book() {}

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println("[" + bookName + "| " + author + "]");
    }
}

public class Mission1_2 {
    public static void main(String[] args) {
        List<Book> onmaLibrary = new ArrayList<Book>();

        onmaLibrary.add(new Book("태백산맥", "조정래"));
        onmaLibrary.add(new Book("이기적유전자", "리처드 도킨즈"));
        onmaLibrary.add(new Book("자전거 도둑", "박완서"));
        onmaLibrary.add(new Book("토지", "박경리"));
        onmaLibrary.add(new Book("대변동", "제레드 다이아몬드"));

        List<Book> onmaLibraryCopy = onmaLibrary;

        List<Book> domaLibrary = new ArrayList<Book>();

        domaLibrary.addAll(onmaLibrary);

        onmaLibrary.set(2, new Book("그 많던 싱아는 누가 다 먹었을까", "박완서")); // (수정) 3번째 목록

        domaLibrary.add(new Book("사피엔스", "유발 하라리")); // (추가) 마지막 목록

        for(Book book : onmaLibrary) { // A
            book.showBookInfo();
        }

        System.out.println("================================");

        for(Book book : onmaLibraryCopy) { // A-1
            book.showBookInfo();
        }

        System.out.println("================================");

        for(Book book : domaLibrary) { // B
            book.showBookInfo();
        }

        /*
        ** 온마을(A) 도서관 **
        [태백산맥| 조정래]
        [이기적유전자| 리처드 도킨즈]
        [그 많던 싱아는 누가 다 먹었을까| 박완서]
        [토지| 박경리]
        [대변동| 제레드 다이아몬드]
        =================================
        ** A-1 **
        [태백산맥| 조정래]
        [이기적유전자| 리처드 도킨즈]
        [그 많던 싱아는 누가 다 먹었을까| 박완서]
        [토지| 박경리]
        [대변동| 제레드 다이아몬드]
        =================================
        ** 두마을(B) 도서관 **
        [태백산맥| 조정래]
        [이기적유전자| 리처드 도킨즈]
        [자전거 도둑| 박완서]
        [토지| 박경리]
        [대변동| 제레드 다이아몬드]
        [사피엔스| 유발 하라리]
        */
    }
}
