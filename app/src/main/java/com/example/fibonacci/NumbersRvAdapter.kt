package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRvAdapter(var numbers:List<Int>):RecyclerView.Adapter<NumbersRvAdapter.NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersRvAdapter.NumbersViewHolder {
val view =LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumbersViewHolder(view)
    }
    override fun onBindViewHolder(holder: NumbersRvAdapter.NumbersViewHolder, position: Int) {
        holder.tvNumber.text = numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumbers)

}
}
