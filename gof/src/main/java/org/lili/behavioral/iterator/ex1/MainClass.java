package org.lili.behavioral.iterator.ex1;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lili on 2017/8/4
 */
public class MainClass {
    public static void main(String[] args) {
        BookList bookList = new BookList();

        Book book1 = new Book("010203","Java编程思想",90);
        Book book2 = new Book("010204","Java从入门到精通",60);

        bookList.addBook(book1);
        bookList.addBook(book2);

        System.out.println("容器内部实现遍历.......");
        while(bookList.hasNext()) {
			Book book = bookList.getNext();
			book.display();
		}

        System.out.println("调用者实现遍历.....");
        List<Book> bookDateList = bookList.getBookList();
		for(int i = 0; i < bookDateList.size(); i++) {
			Book book = bookDateList.get(i);
			book.display();
		}


        System.out.println("使用迭代器设计实现遍历.........");
        BookList bookList2 = new BookList();
        bookList2.addBook(book1);
        bookList2.addBook(book2);
        Iterator iterator = bookList2.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            book.display();
        }
    }
}
