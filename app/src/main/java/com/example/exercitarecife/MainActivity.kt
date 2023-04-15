package com.example.exercitarecife
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercitarecife.databinding.ActivityMainBinding
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonRegister = binding.buttonRegister
        val buttonLogin = binding.buttonLogin
        val nomeLogin = binding.nameLogin

        buttonLogin.setOnClickListener {
            if (nomeLogin?.text.toString()=="Lucas") {
                val intent = Intent(this, MenuActivity::class.java)
                val nome = nomeLogin?.text.toString()
                intent.putExtra("nome", nome)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }
        }
        buttonRegister.setOnClickListener {
                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)
        }
    }
}


