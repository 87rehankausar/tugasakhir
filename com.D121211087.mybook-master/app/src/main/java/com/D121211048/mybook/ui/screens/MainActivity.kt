package com.D121211048.mybook.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.D121211048.mybook.ui.BookshelfApp
import com.D121211048.mybook.ui.theme.BookshelfTheme
//import com.google.android.material.color.DynamicColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //DynamicColors.applyToActivitiesIfAvailable(this);
        setContent {
            BookshelfTheme {
                //val viewModel : HomeViewModel = viewModel(factory = HomeViewModel.Factory)
                //BookshelfApp(viewModel)

                BookshelfApp()
            }
        }
    }
}