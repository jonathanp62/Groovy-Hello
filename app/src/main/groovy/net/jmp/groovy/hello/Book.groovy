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
    /** The title. */
    private String title

    /** The author. */
    private String author

    /**
     * The default constructor.
     */
    def Book() {
    }

    /**
     * A constructor.
     *
     * @param   title   java.lang.String
     * @param   author  java.lang.String
     */
    def Book(final String title, final String author) {
        assert title != null
        assert author != null

        this.title = new String(title)
        this.author = new String(author)
    }

    /**
     * Set the title.
     *
     * @param   title   java.lang.String
     */
    void setTitle(final String title) {
        assert title != null

        this.title = new String(title)
    }

    /**
     * Set the author.
     *
     * @param   author  java.lang.String
     */
    void setAuthor(final String author) {
        assert author != null

        this.author = new String(author)
    }

    /**
     * Get the title.
     *
     * @return  java.lang.String
     */
    String getTitle() {
        return new String(this.title)
    }

    /**
     * Get the author.
     *
     * @return  java.lang.String
     */
    String getAuthor() {
        return new String(this.author)
    }

    /**
     * The toString method.
     *
     * @return  java.lang.String
     */
    String toString() {
        return "Book: Title=" + this.title + "; Author=" + author
    }
}
