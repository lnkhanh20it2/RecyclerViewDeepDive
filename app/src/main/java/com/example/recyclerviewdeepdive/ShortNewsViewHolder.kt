package com.example.recyclerviewdeepdive

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdeepdive.databinding.ItemShortNewsBinding
import com.example.recyclerviewdeepdive.model.ShortNews

class ShortNewsViewHolder(
    private val binding: ItemShortNewsBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(shortNews: ShortNews) {
        binding.shortNews = shortNews
    }
}