package net.jmp.groovy.hello

/*
 * (#)TestBookSpock.groovy  0.2.0   02/13/2025
 * (#)TestBookSpock.groovy  0.1.0   02/12/2025
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
 * The Spock test class for the book class.
 *
 * @version 0.2.0
 * @since   0.1.0
 */
class TestBookSpock extends Specification {
    def "Book with default constructor"() {
        given: "A new book without an author or title"
        def book = new Book()

        book.author = 'Jonathan Parker'
        book.title = 'Learning Groovy'

        when: "The book has an author and title"
        def author = book.author
        def title = book.title

        then: "The author and title are not null"
        author != null
        title != null

        and: "The author and title match what was set"
        author == 'Jonathan Parker'
        title == 'Learning Groovy'
    }

    def "Book with supplied constructor"() {
        given: "A new book with an author and title"
        def book = new Book('Learning Groovy', 'Jonathan Parker')

        when: "The book has an author and title"
        def author = book.author
        def title = book.title

        then: "The author and title are not null"
        author != null
        title != null

        and: "The author and title match what was set"
        author == 'Jonathan Parker'
        title == 'Learning Groovy'
    }
}
