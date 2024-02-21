package com.example.topgames

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gamesList:ArrayList<GameModel>): RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        //Initialization of views and widgets
        lateinit var gameImg: ImageView
        lateinit var gameTitle: TextView

        init{
           gameImg= itemView.findViewById(R.id.cardView)
           gameTitle = itemView.findViewById(R.id.cardTxt)
           itemView.setOnClickListener(){
               Toast.makeText(
                   itemView.context, "You Chose: ${gamesList[adapterPosition].txtCard}", Toast.LENGTH_SHORT
               ).show()
           }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return gamesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameImg.setImageResource(gamesList[position].img)
        holder.gameTitle.text = gamesList[position].txtCard
    }

}