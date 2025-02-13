package net.jmp.groovy.hello

/*
 * (#)TestLibrarySpock.groovy   0.2.0   02/13/2025
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
 * @version 0.2.0
 * @since   0.1.0
 */
class TestLibrarySpock extends Specification {
    def "Library with default constructor"() {
        given: "A new library"
        def library = new Library()

        when: "The default constructor creates an empty list of books"
        def books = library.books

        then: "The list of books is non-null"
        books != null

        and: "The list of books is empty"
        books.isEmpty()
    }

    def "Library and setting books"() {
        given: "A new library with books added"
        def library = new Library()

        def newBooks = [ new Book('The Assault on Reason', 'Al Gore'),
                      new Book('The Bourne Identity', 'Robert Ludlum'),
                      new Book('The Da Vinci Code', 'Dan Brown'),
                      new Book('The Hunt for Red October', 'Tom Clancy') ]

        library.books = newBooks

        when: "The library has a list of books that is not empty"
        def books = library.books

        then: "The list of books is non-null"
        books != null

        and: "The list of books has four elements"
        books.size() == 4

        and: "The list of books matches what was set"
        books.get(0).author == 'Al Gore'
        books.get(1).author == 'Robert Ludlum'
        books.get(2).author == 'Dan Brown'
        books.get(3).author == 'Tom Clancy'
        books.get(0).title == 'The Assault on Reason'
        books.get(1).title == 'The Bourne Identity'
        books.get(2).title == 'The Da Vinci Code'
        books.get(3).title == 'The Hunt for Red October'
    }

    def "Library with supplied constructor"() {
        given: "A new library with books set in the constructor"
        def newBooks = [ new Book('The Assault on Reason', 'Al Gore'),
                         new Book('The Bourne Identity', 'Robert Ludlum'),
                         new Book('The Da Vinci Code', 'Dan Brown'),
                         new Book('The Hunt for Red October', 'Tom Clancy') ]

        def library = new Library(newBooks)

        when: "The library has a list of books that is not empty"
        def books = library.books

        then: "The list of books is non-null"
        books != null

        and: "The list of books has four elements"
        books.size() == 4

        and: "The list of books matches what was set"
        books.get(0).author == 'Al Gore'
        books.get(1).author == 'Robert Ludlum'
        books.get(2).author == 'Dan Brown'
        books.get(3).author == 'Tom Clancy'
        books.get(0).title == 'The Assault on Reason'
        books.get(1).title == 'The Bourne Identity'
        books.get(2).title == 'The Da Vinci Code'
        books.get(3).title == 'The Hunt for Red October'
    }

    def "Library with a book added"() {
        given: "A new library with one book set in the constructor"
        def library = new Library()
        def book = new Book('The Assault on Reason', 'Al Gore')

        library.addBook(book)

        when: "The library has a list of books that is not empty"
        def books = library.books

        then: "The list of books is non-null"
        books != null

        and: "The list of books has one element"
        books.size() == 1

        and: "The list of books matches what was set"
        books.get(0).author == 'Al Gore'
        books.get(0).title == 'The Assault on Reason'
    }
}
