package com.example.contactbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.contactbook.adatpter.ItemAdapter
import com.example.contactbook.data.DataSource
import com.example.contactbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // DataBinind geht auch als lateinit
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val deineListe = DataSource().loadData()

        val recyclerView = binding.item_layout

        recyclerView.adapter = ItemAdapter(this, deineListe)


        /*binding.fanRecycler.setHasFixedSize(true)*/

        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.fanRecycler)
    }
}
