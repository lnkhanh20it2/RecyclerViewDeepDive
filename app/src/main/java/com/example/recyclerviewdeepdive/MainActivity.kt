package com.example.recyclerviewdeepdive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdeepdive.databinding.ActivityMainBinding
import com.example.recyclerviewdeepdive.model.DummyData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val recyclerViewNews = binding.rvNews
        val largeNews = DummyData.getDummyData(this)
        val newsAdapter = NewsAdapter(largeNews)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerViewNews.adapter = newsAdapter
        recyclerViewNews.layoutManager = layoutManager
        recyclerViewNews.setHasFixedSize(true)
        recyclerViewNews.addItemDecoration(
            DividerItemDecoration(this, layoutManager.orientation)
        )
    }
}