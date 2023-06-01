package com.example.dispositivosmoviles.ui.activies

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dispositivosmoviles.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    //reescribir la funcion onCreate que hereda de AppCompactActivity
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onStart() {
        super.onStart()
        initClass()
    }

    private fun initClass() {
        binding.boton1.setOnClickListener {
            binding.textBuscar.text = "El codigo ejecuta correctamente"
//Toast.makeText(this,
// "Este es un ejemplo",
// Toast.LENGTH_SHORT)
// .show()

            var f=Snackbar.make(binding.boton1,
                "Este es otro mensaje",
                Snackbar.LENGTH_LONG)
//f.setBackgroundTint(R.color.black).show()
            f.show()
        }
    }



}