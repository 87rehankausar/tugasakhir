package com.D121211048.mybook

import android.app.Application
import com.D121211048.mybook.di.AppContainer
import com.D121211048.mybook.di.DefaultAppContainer

class BookshelfApplication: Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}