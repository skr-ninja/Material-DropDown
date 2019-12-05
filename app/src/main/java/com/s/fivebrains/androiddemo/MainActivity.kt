package com.s.fivebrains.androiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView


class MainActivity : AppCompatActivity() {

    var COUNTRIES = arrayOf("India", "Nepal", "China", "USA")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this,
            R.layout.dropdown_menu_popup_item,
            COUNTRIES
        )

       val editTextFilledExposedDropdown = findViewById<AutoCompleteTextView>(R.id.filled_exposed_dropdown)

        editTextFilledExposedDropdown.setAdapter(adapter)



        val editTextFilledExposedDropdown1 = findViewById<AutoCompleteTextView>(R.id.filled_exposed_dropdown1)

        editTextFilledExposedDropdown1.setAdapter(adapter)


        val editTextFilledExposedDropdown2 = findViewById<AutoCompleteTextView>(R.id.filled_exposed_dropdown2)

        editTextFilledExposedDropdown2.setAdapter(adapter)


        val editTextFilledExposedDropdown3 = findViewById<AutoCompleteTextView>(R.id.filled_exposed_dropdown3)

        editTextFilledExposedDropdown3.setAdapter(adapter)
    }
}
