package com.dicoding.picodiploma.aurisproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.picodiploma.aurisproject.databinding.ItemLibraryBinding
import com.dicoding.picodiploma.aurisproject.utils.DataLibrary

class DataAdapter : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    private var listDataLibrary = ArrayList<DataLibrary>()

    fun setDataLibrary(library: List<DataLibrary>?){
        if (library == null) return
        this.listDataLibrary.clear()
        this.listDataLibrary.addAll(library)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLibraryBinding = ItemLibraryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemLibraryBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val library = listDataLibrary[position]
        holder.bind(library)
    }

    override fun getItemCount(): Int = listDataLibrary.size

    class ViewHolder(private val binding: ItemLibraryBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(library: DataLibrary){
            with(binding){
                tvTitle.text = library.title
                Glide.with(itemView.context)
                    .load(library.image)
                    .into(ivLibrary)
            }
        }

    }
}