package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnFragmentActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRed.setOnClickListener { loadFragment(RojoFragment()) }
        btnBlue.setOnClickListener { loadFragment(AzulFragment()) }
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this,"El botón ha sido pulsado",Toast.LENGTH_SHORT).show()
    }

   private fun loadFragment(fragment:Fragment){
       val fragmentTransaction = supportFragmentManager.beginTransaction()
       fragmentTransaction.add(R.id.fragmentContainer,fragment)
       fragmentTransaction.addToBackStack(null)
       fragmentTransaction.commit()
   }

}