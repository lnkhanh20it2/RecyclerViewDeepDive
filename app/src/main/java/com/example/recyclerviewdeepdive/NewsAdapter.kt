package com.example.recyclerviewdeepdive

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdeepdive.databinding.ItemLargeNewsBinding
import com.example.recyclerviewdeepdive.databinding.ItemShortNewsBinding
import com.example.recyclerviewdeepdive.model.LargeNews
import com.example.recyclerviewdeepdive.model.News
import com.example.recyclerviewdeepdive.model.ShortNews

class NewsAdapter(private val newList: List<News>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var bindingLargeNews: ItemLargeNewsBinding
    private lateinit var bindingShortNews: ItemShortNewsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            NewsType.SHORT_NEWS.value -> {
                bindingShortNews = ItemShortNewsBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                ShortNewsViewHolder(bindingShortNews)
            }
            NewsType.SHORT_NEWS.value -> {
                bindingLargeNews = ItemLargeNewsBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                LargeNewsViewHolder(bindingLargeNews)
            }
            else -> {
                bindingLargeNews = ItemLargeNewsBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                LargeNewsViewHolder(bindingLargeNews)
            }
        }

    override fun getItemCount(): Int = newList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (newList[position]) {
            is ShortNews -> {
                (holder as ShortNewsViewHolder).bind(newList[position] as ShortNews)
            }
            is LargeNews -> {
                (holder as LargeNewsViewHolder).bind(newList[position] as LargeNews)
            }
        }
    }

    override fun getItemViewType(position: Int): Int =
        when (newList[position]) {
            is ShortNews -> {
                NewsType.SHORT_NEWS.value
            }
            is LargeNews -> {
                NewsType.LARGE_NEWS.value
            }
            else -> {
                NewsType.LARGE_NEWS.value
            }
        }

}