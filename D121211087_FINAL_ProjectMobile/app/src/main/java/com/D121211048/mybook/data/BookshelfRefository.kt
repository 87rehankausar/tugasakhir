package com.D121211048.mybook.data

import com.D121211048.mybook.model.Book

/**
 * Repository retrieves volume data from underlying data source.
 */
interface BookshelfRepository {
    /** Retrieves list of books from underlying data source */
    // Notes: List<Book>? NULLABLE
    suspend fun getBooks(query: String): List<Book>?

    suspend fun getBook(id: String): Book?
}