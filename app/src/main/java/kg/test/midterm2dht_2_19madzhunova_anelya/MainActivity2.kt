package kg.test.midterm2dht_2_19madzhunova_anelya

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Button = findViewById<Button>(R.id.button)

        Button.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}