package org.lili.behavioral.iterator.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by lili on 2017/8/4
 */
public class BookList {
    private List<Book> bookList;
    private int index;


    public BookList() {
        this.bookList = new ArrayList<Book>();
        bookList.iterator();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void deleteBook(Book book){
        int bookIndex = bookList.indexOf(book);
        bookList.remove(bookIndex);
    }

    //由容器自己实现遍历
    public boolean hasNext(){
        if(index >= bookList.size()){
            return false;
        }
        return true;
    }

    public Book getNext(){
        return bookList.get(index++);
    }

    //由调用者实现遍历，直接暴露数据细节给外部
    public List<Book> getBookList(){
        return bookList;
    }

    //迭代器模式  JDK已经实现了   细节隐藏很深 迭代器实现类
//    Iterator
    public Iterator iterator(){
        return new Itr();
    }

    //可以同时提供多个种类的迭代器
    public ListIterator listIterator(){
        return new ListItr();
    }

    //私有内部类可以访问外部类的属性和方法
    private class Itr implements Iterator {

        public boolean hasNext() {
            //需要得到容器内部信息  index和boolList
            if(index>=bookList.size()){
                return false;
            }
            return true;
        }

        public Object next() {
            return bookList.get(index++);
        }

        public void remove() {

        }

    }

    private class ListItr implements ListIterator {
        public boolean hasNext() {
            return false;
        }

        public Object next() {
            return null;
        }

        public boolean hasPrevious() {
            return false;
        }

        public Object previous() {
            return null;
        }

        public int nextIndex() {
            return 0;
        }

        public int previousIndex() {
            return 0;
        }

        public void remove() {

        }

        public void set(Object o) {

        }

        public void add(Object o) {

        }
    }


}
