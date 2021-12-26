package id.dimas_19104029.lifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPage = findViewById<Button>(R.id.btn_page)
        btnPage.setOnClickListener{
            val intent = Intent(this, Halaman2Activity::class.java)
            startActivity(intent)
        }
    }


    fun printState(msg : String){
        Log.d("ActivityState", msg)// Logcat, muncul di Logcat Android Studio
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show() //Toast, muncul di UI App
    }

    override fun onStart() {
        super.onStart()
        printState("Halaman satu Start")
    }

    override fun onResume() {
        super.onResume()
        printState("Halaman satu onResume")
    }

    override fun onPause() {
        super.onPause()
        printState("Halaman satu onPause")
    }

    override fun onStop() {
        super.onStop()
        printState("Halaman satu onStop")
    }

    override fun onRestart() {
        super.onRestart()
        printState("Halaman satu onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman satu onDestroy")
    }


}

