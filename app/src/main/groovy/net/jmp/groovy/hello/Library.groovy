package net.jmp.groovy.hello

/*
 * (#)Library.groovy    0.1.0   02/12/2025
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
 * The library class.
 *
 * @version 0.1.0
 * @since   0.1.0
 */
class Library {
    /** The list of books. */
    private List<Book> books = []

    /**
     * The default constructor.
     */
    def Library() {
    }

    /**
     * A constructor.
     *
     * @param   books   java.util.List<net.jmp.groovy.hello.Book>
     */
    def Library(final List<Book> books) {
        this.books = books
    }

    /**
     * Add a book.
     *
     * @param   book    net.jmp.groovy.hello.Book
     */
    void addBook(final Book book) {
        this.books << book  // Same as this.books.add(book)
    }

    /**
     * Get the books.
     *
     * @return  java.util.List<net.jmp.groovy.hello.Book>
     */
    List<Book> getBooks() {
        return this.books
    }

    /**
     * Set the books.
     *
     * @param   books   java.util.List<net.jmp.groovy.hello.Book>
     */
    void setBooks(final List<Book> books) {
        this.books = books
    }
}
