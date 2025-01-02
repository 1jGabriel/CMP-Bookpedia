package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.presentation.booklist.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    var searchQuery by remember { mutableStateOf("") }
    Box(
        Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookSearchBar(
            searchQuery = searchQuery,
            onSearchQueryChange = {
                searchQuery = it
            },
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}