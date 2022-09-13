package desktop.calculo.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        supportActionBar !!.hide()
        nume.OnClickListener { AcrescentaUmaExpressao (String:"0",limpar_dados:true) }
        numero_1.setOnClickListener { AcrescentaUmaExpressao(String:"1",limpar_dados:true) }
        número_dois.setOnClickListener { AcrescentaUmaExpressao (String :"2",limpar_dados:true)}
        número_tres.setOnClickListener { AcrescentaUmaExpressao (String :”3”,limpar_dados:true)}
        número_quatro.setOnClickListener { AcrescentaUmaExpressao (String :”4”,limpar_dados:true)}
        número_cinco.setOnClickListener { AcrescentaUmaExpressao (String :”5”,limpar_dados:true)}
        número_seis.setOnClickListener { AcrescentaUmaExpressao (String :”6”,limpar_dados:true)}
        número_sete.setOnClickListener { AcrescentaUmaExpressao (String :”7”,limpar_dados:true)}
        número_oito.setOnClickListener { AcrescentaUmaExpressao (String :”8”,limpar_dados:true)}
        número_nove.setOnClickListener { AcrescentaUmaExpressao(String :”9”,limpar_dados:true)}

        //operadores
        soma.setOnClickListener { AcresentarUmaExpressao (String :”+”,limpar_dados:false)}
        subtracao.setOnClickListener { AcresentarUmaExpressao (String :”-”,limpar_dados:false)}
        multiplicacao.setOnClickListener { AcresentarUmaExpressao (String :”*”,limpar_dados:false)}
        divisao.setOnClickListener { AcresentarUmaExpressao (String :”/”,limpar_dados:false)}limpa.setOnclickListener {it:view
            expressao.text = ""
            Resultado.text = ""

        }
        backspace.setOnclickListener {it:view
            val String = expressao.text.toString()
            if (String.isnotBlank()){
                expressao.text = string.substring(0,string.lenght-1
            }
            resultado.text =""
        }
    }
    fun AcrescentaUmaExpressao(string: String, limpar_dados : Boolean){

        if (resultado.text.isNotEmpty()){
            expressao.text = ""
        }
        if (limpar_dados){
            resultado.text = ""
            expressao.append(string)
        }else{
            expressao.append(resultado.text)
            expressao.append(string)
            resultado.text = ""
        }
    }
}


}

}