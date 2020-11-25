package com.andrewkarachun0304.dagger2testapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.andrewkarachun0304.dagger2testapp.R
import com.andrewkarachun0304.dagger2testapp.database.entity.People
import com.squareup.picasso.Picasso

class PeopleAdapter (val listener: OnClickListener) :
    RecyclerView.Adapter<PeopleAdapter.PeopleVH>() {

    private var peopleList = ArrayList<People>()

    fun updateList(list: List<People>) {
        peopleList = list as ArrayList<People>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleVH {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.people_item, parent, false)
        return PeopleVH(view)
    }

    override fun onBindViewHolder(holder: PeopleVH, position: Int) {
        holder.bind(peopleList[position])
    }

    override fun getItemCount() = peopleList.size

    inner class PeopleVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView
        private val nameTv: TextView
        private val ageTv: TextView

        init {
            with(itemView) {
                imageView = findViewById(R.id.image_view)
                nameTv = findViewById(R.id.name_tv)
                ageTv = findViewById(R.id.age_tv)
                setOnClickListener {
                    listener.onClick(peopleList[layoutPosition])
                }
            }
        }

        @SuppressLint("SetTextI18n")
        fun bind(people: People) {
            with(people) {
                nameTv.text = "Name: $name"
                ageTv.text = "Age: $age"
                Picasso.get().load(R.drawable.ic_launcher_background).into(imageView)
            }
        }

    }

    interface OnClickListener {
        fun onClick(people: People)
    }
}
