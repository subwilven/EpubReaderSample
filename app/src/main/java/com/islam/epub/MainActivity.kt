package com.islam.epub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.folioreader.FolioReader


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val folioReader = FolioReader.get()
       // folioReader.openBook(R.raw.recipes);
        folioReader.openBook("file:///android_asset/recipes.epub")

    }
}
