package com.example.topgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. AdapterView
        val recycle :RecyclerView = findViewById(R.id.recyclerView)
        recycle.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //2. Data Source
        var games : ArrayList<GameModel> = ArrayList()
        val g1 = GameModel(R.drawable.card1,"Horizon Chase" )
        val g2 = GameModel(R.drawable.card2,"PUBG" )
        val g3 = GameModel(R.drawable.card3,"Head Ball 2" )
        val g4 = GameModel(R.drawable.card4,"Fifa 2022" )
        val g5 = GameModel(R.drawable.card5,"Fortnite" )
        val g6 = GameModel(R.drawable.card6,"Hooked on You" )

        games.add(g1)
        games.add(g2)
        games.add(g3)
        games.add(g4)
        games.add(g5)
        games.add(g6)


        //3.Adapter

        val adapter = GameAdapter(games)
        recycle.adapter = adapter
    }
}