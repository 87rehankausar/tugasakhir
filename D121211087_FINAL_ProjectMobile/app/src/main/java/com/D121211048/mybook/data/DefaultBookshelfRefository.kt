package com.D121211048.mybook.data

import com.D121211048.mybook.model.Book
import com.D121211048.mybook.network.BookshelfApiService

/**
 * Default Implementation of repository that retrieves volumes data from underlying data source.
 */
class DefaultBookshelfRepository(
    private val bookshelfApiService: BookshelfApiService
) : BookshelfRepository {
    /** Retrieves list of Volumes from underlying data source */
    // Notes: List<Book>? NULLABLE
    override suspend fun getBooks(query: String): List<Book>? {
        return try {
            val res = bookshelfApiService.getBooks(query)
            if (res.isSuccessful) {
                res.body()?.items ?: emptyList()
            } else {
                emptyList()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun getBook(id: String): Book? {
        return try {
            val res = bookshelfApiService.getBook(id)
            if (res.isSuccessful) {
                res.body()
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}