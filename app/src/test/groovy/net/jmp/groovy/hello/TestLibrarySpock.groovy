package net.jmp.groovy.hello

/*
 * (#)TestLibrarySpock.groovy   0.1.0   02/12/2025
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

import spock.lang.Specification

/**
 * The Spock test class for the library class.
 *
 * @version 0.1.0
 * @since   0.1.0
 */
class TestLibrarySpock extends Specification {
    def "Library with default constructor"() {
        setup:
        def library = new Library()

        when:
        def books = library.books

        then:
        books != null
        books.size() == 0
    }

    def "Library and setting books"() {
        setup:
        def library = new Library()

        def newBooks = [ new Book('The Assault on Reason', 'Al Gore'),
                      new Book('The Bourne Identity', 'Robert Ludlum'),
                      new Book('The Da Vinci Code', 'Dan Brown'),
                      new Book('The Hunt for Red October', 'Tom Clancy') ]

        library.books = newBooks

        when:
        def books = library.books

        then:
        books != null
        books.size() == 4
    }

    def "Library with supplied constructor"() {
        setup:
        def newBooks = [ new Book('The Assault on Reason', 'Al Gore'),
                         new Book('The Bourne Identity', 'Robert Ludlum'),
                         new Book('The Da Vinci Code', 'Dan Brown'),
                         new Book('The Hunt for Red October', 'Tom Clancy') ]

        def library = new Library(newBooks)

        when:
        def books = library.books

        then:
        books != null
        books.size() == 4
    }

    def "Library with a book added"() {
        setup:
        def library = new Library()
        def book = new Book('The Assault on Reason', 'Al Gore')

        library.addBook(book)

        when:
        def books = library.books

        then:
        books != null
        books.size() == 1
    }
}
