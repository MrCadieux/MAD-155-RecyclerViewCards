package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.adaptor.MyAdapter
import com.example.myrecyclerview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup what this looks like
        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 4,
                            LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        //all about the data
        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter

    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.pikachu, "Pikachu"))
        items.add(MyModel(R.drawable.bulbasaur, "Bulbasaur"))
        items.add(MyModel(R.drawable.diglett, "Diglett"))
        items.add(MyModel(R.drawable.evee, "Evee"))
        items.add(MyModel(R.drawable.squirtle, "Squirtle"))
        items.add(MyModel(R.drawable.poliwag, "Poliwag"))

        items.add(MyModel(R.drawable.caterpie, "Caterpie"))
        items.add(MyModel(R.drawable.jigglypuff, "Jigglypuff"))
        items.add(MyModel(R.drawable.oddish, "Oddish"))
        items.add(MyModel(R.drawable.charmander, "Charmander"))
        items.add(MyModel(R.drawable.squirtle, "Squirtle"))
        items.add(MyModel(R.drawable.poliwag, "Poliwag"))

        items.add(MyModel(R.drawable.pikachu, "Pikachu"))
        items.add(MyModel(R.drawable.bulbasaur, "Bulbasaur"))
        items.add(MyModel(R.drawable.diglett, "Diglett"))
        items.add(MyModel(R.drawable.evee, "Evee"))
        items.add(MyModel(R.drawable.squirtle, "Squirtle"))
        items.add(MyModel(R.drawable.poliwag, "Poliwag"))

        items.add(MyModel(R.drawable.caterpie, "Caterpie"))
        items.add(MyModel(R.drawable.jigglypuff, "Jigglypuff"))
        items.add(MyModel(R.drawable.oddish, "Oddish"))
        items.add(MyModel(R.drawable.charmander, "Charmander"))
        items.add(MyModel(R.drawable.squirtle, "Squirtle"))
        items.add(MyModel(R.drawable.poliwag, "Poliwag"))


        return items
    }



}