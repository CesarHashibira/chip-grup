package com.cesar.chip

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chipGroup: ChipGroup = findViewById(R.id.chipGroup)

        // Agrega un Listener para manejar la selección de los Chips
        chipGroup.setOnCheckedChangeListener { group, checkedId ->
            val chip: Chip? = findViewById(checkedId)

            // Maneja la selección del Chip
            chip?.let {
                val mensaje = "Opción seleccionada: ${it.text}"
                Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
