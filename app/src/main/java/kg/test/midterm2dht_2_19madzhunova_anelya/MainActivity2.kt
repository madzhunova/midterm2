package kg.test.midterm2dht_2_19madzhunova_anelya

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kg.test.midterm2dht_2_19madzhunova_anelya.databinding.ActivityMainBinding


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val Button = findViewById<Button>(R.id.button)

        Button.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}