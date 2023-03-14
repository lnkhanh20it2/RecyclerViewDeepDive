package com.example.recyclerviewdeepdive

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdeepdive.databinding.ItemLargeNewsBinding
import com.example.recyclerviewdeepdive.model.LargeNews

class LargeNewsViewHolder(
    private val binding: ItemLargeNewsBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(largeNews: LargeNews) {
        binding.largeNews = largeNews
    }
}