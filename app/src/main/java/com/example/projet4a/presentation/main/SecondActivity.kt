package com.example.projet4a.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projet4a.R
import com.example.projet4a.data.local.models.ExampleItem
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val exampleList = generateDummyList(500)

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    private fun generateDummyList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable = when (i % 20) {
                0 -> R.drawable.aphelios
                1 -> R.drawable.ashe
                2 -> R.drawable.caitlyn
                3 -> R.drawable.corki
                4 -> R.drawable.draven
                5 -> R.drawable.ezreal
                6 -> R.drawable.graves
                7 -> R.drawable.jhin
                8 -> R.drawable.jinx
                9 -> R.drawable.kaisa
                10 -> R.drawable.kalista
                11 -> R.drawable.kogmaw
                12 -> R.drawable.lucian
                13 -> R.drawable.missfortune
                14 -> R.drawable.quinn
                15 -> R.drawable.sivir
                16 -> R.drawable.tristana
                17 -> R.drawable.twitch
                18 -> R.drawable.varus
                19 -> R.drawable.vayne
                else -> R.drawable.xayah


            }

            //val item= ExampleItem(drawable," aphelios", "AD Carry")
            val item = ArrayList<ExampleItem>()

            item.add(ExampleItem(R.drawable.aphelios, "Aphelios", "AD Carry"))
            item.add(ExampleItem(R.drawable.ashe, "Ashe", "AD Carry"))
            item.add(ExampleItem(R.drawable.caitlyn, "Caitlyn", "AD Carry"))
            item.add(ExampleItem(R.drawable.corki, "Corki", "AD Carry"))
            item.add(ExampleItem(R.drawable.draven, "Draven", "AD Carry"))
            item.add(ExampleItem(R.drawable.ezreal, "Ezreal", "AD Carry"))
            item.add(ExampleItem(R.drawable.graves, "Graves", "AD Carry"))
            item.add(ExampleItem(R.drawable.jhin, "Jhin", "AD Carry"))
            item.add(ExampleItem(R.drawable.jinx, "Jinx", "AD Carry"))
            item.add(ExampleItem(R.drawable.kaisa, "Kai'Sa", "AD Carry"))
            item.add(ExampleItem(R.drawable.kalista, "Kalista", "AD Carry"))
            item.add(ExampleItem(R.drawable.kogmaw, "Kog'Maw", "AD Carry"))
            item.add(ExampleItem(R.drawable.lucian, "Lucian", "AD Carry"))
            item.add(ExampleItem(R.drawable.missfortune, "Miss Fortune", "AD Carry"))
            item.add(ExampleItem(R.drawable.quinn, "Quinn", "AD Carry"))
            item.add(ExampleItem(R.drawable.sivir, "Sivir", "AD Carry"))
            item.add(ExampleItem(R.drawable.tristana, "Tristana", "AD Carry"))
            item.add(ExampleItem(R.drawable.twitch, "Twitch", "AD Carry"))
            item.add(ExampleItem(R.drawable.varus, "Varus", "AD Carry"))
            item.add(ExampleItem(R.drawable.vayne, "Vayne", "AD Carry"))
            item.add(ExampleItem(R.drawable.xayah, "Xayah", "AD Carry"))


            list += item
        }
        return list
    }


}