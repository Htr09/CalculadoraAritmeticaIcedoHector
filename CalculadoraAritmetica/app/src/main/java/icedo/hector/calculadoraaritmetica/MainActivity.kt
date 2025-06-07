package icedo.hector.calculadoraaritmetica

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var num1:Float =0.0f
    var num2:Float =0.0f
    var operador:String =""
    lateinit var pantalla: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        pantalla=findViewById(R.id.txtPantalla)

        val ac:Button = findViewById(R.id.btnAC)
        val cero:Button = findViewById(R.id.btnCero)
        val uno:Button = findViewById(R.id.btnUno)
        val dos:Button = findViewById(R.id.btnDos)
        val tres:Button = findViewById(R.id.btnTres)
        val cuatro:Button = findViewById(R.id.btnCuatro)
        val cinco:Button = findViewById(R.id.btnCinco)
        val seis:Button = findViewById(R.id.btnSeis)
        val siete:Button = findViewById(R.id.btnSiete)


    }
}