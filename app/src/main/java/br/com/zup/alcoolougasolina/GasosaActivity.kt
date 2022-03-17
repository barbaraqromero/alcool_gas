package br.com.zup.alcoolougasolina

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GasosaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gasosa)

        val button = findViewById<Button>(R.id.button_calculate)
        val editTextAlcool = findViewById<EditText>(R.id.editTextAlcool)
        val editTextGasolina = findViewById<EditText>(R.id.editTextGasolina)
        val textViewResult = findViewById<TextView>(R.id.text_view_result)


        button.setOnClickListener {
            val precoAlcool = editTextAlcool.text.toString().toDouble()
            val precoGasolina = editTextGasolina.text.toString().toDouble()
            var resultado = precoAlcool / precoGasolina

            if (resultado < 0.7) {
                textViewResult.text = "Álcool é melhor!"
            }
            if (resultado > 0.7) {
                textViewResult.text = "Gasolina é melhor!"
            }
            if (precoAlcool == precoGasolina) {
                textViewResult.text = "Qualquer um serve!"
            }
        }
    }

}
