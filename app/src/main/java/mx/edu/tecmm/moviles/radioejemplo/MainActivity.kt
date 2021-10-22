package mx.edu.tecmm.moviles.radioejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtResultado: TextView;
    lateinit var txtnumero1: EditText;
    lateinit var txtnumero2: EditText;
    lateinit var rdSuma: RadioButton;
    lateinit var rdresta: RadioButton;
    lateinit var rdmulti: RadioButton;
    lateinit var rddivi: RadioButton;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResultado = findViewById(R.id.txtResultado)
        txtnumero1 = findViewById(R.id.txtNumero1)
        txtnumero2 = findViewById(R.id.txtNumero2)
        rdSuma = findViewById(R.id.rdSuma)
        rdresta = findViewById(R.id.rdResta)
        rdmulti = findViewById(R.id.rdmulti)
        rddivi = findViewById(R.id.rddivi)

    }

    fun presiono(view: View){
        val num1 = txtnumero1.text.toString().toInt()
        val num2 = txtnumero2.text.toString().toInt()
        var res:Int  = 0
        if (rdSuma.isChecked){
            res = num1 + num2
        } else if (rdresta.isChecked){
            res = num1 - num2
        } else if (rdmulti.isChecked){
            res = num1 * num2
        } else if (rddivi.isChecked){
            res = num1 / num2
        }

        txtResultado.text ="$res"
    }
}