package net.jmp.groovy.hello

/*
 * (#)Book.groovy   0.1.0   02/12/2025
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
 * The book class.
 *
 * @version 0.1.0
 * @since   0.1.0
 */
class Book {
    private String title
    private String author

    def Book() {
    }

    def Book(final String title, final String author) {
        assert title != null
        assert author != null

        this.title = new String(title)
        this.author = new String(author)
    }

    void setTitle(final String title) {
        assert title != null

        this.title = new String(title)
    }

    void setAuthor(final String author) {
        assert author != null

        this.author = new String(author)
    }

    String getTitle() {
        return new String(this.title)
    }

    String getAuthor() {
        return new String(this.author)
    }

    String toString() {
        return "Book: Title=" + this.title + "; Author=" + author
    }
}
