package com.D121211048.mybook.di

import com.D121211048.mybook.data.BookshelfRepository
import com.D121211048.mybook.network.BookshelfApiService

/**
 * Dependency Injection container at the application level.
 */
interface AppContainer {
    val bookshelfApiService: BookshelfApiService
    val bookshelfRepository: BookshelfRepository
}