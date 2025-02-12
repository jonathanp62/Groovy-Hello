package net.jmp.groovy.hello

/*
 * (#)App.groovy    0.1.0   02/12/2025
 *
 * @author   Jonathan Parker
 *
 * MIT License
 *
 * Copyright (c) 2025 Jonathan M. Parker
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * The main application class.
 *
 * @version 0.1.0
 * @since   0.1.0
 */
class App {
    /**
     * Return a greeting.
     *
     * @return  java.lang.String
     */
    String getGreeting() {
        return 'Hello World!'
    }

    /**
     * The run method.
     */
    private void run() {
        def greeting = this.greeting

        println greeting

        this.librarian()
    }

    /**
     * The librarian method.
     */
    private void librarian() {
        def library = new Library()

        def books = [ new Book('The Assault on Reason', 'Al Gore'),
                      new Book('The Bourne Identity', 'Robert Ludlum'),
                      new Book('The Da Vinci Code', 'Dan Brown'),
                      new Book('The Hunt for Red October', 'Tom Clancy') ]

        library.books = books

        library.addBook(new Book('The Hunger Games', 'Suzanne Collins'))

        library.books.each {book -> println "Book: ${book.title} by ${book.author}."}
        library.books.each {book -> println "${book.toString()}"}
    }

    /**
     * The main method.
     * @param   args    java.lang.String[]
     */
    static void main(String[] args) {
        new App().run()
    }
}
