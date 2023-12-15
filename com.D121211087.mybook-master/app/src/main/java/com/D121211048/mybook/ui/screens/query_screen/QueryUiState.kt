package com.D121211048.mybook.ui.screens.query_screen

import com.D121211048.mybook.model.Book

sealed interface QueryUiState {
    data class Success(val bookshelfList: List<Book>) : QueryUiState
    object Error : QueryUiState
    object Loading : QueryUiState
}