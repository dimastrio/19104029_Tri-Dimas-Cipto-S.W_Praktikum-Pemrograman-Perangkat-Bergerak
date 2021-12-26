package id.dimas_19104029.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.dimas_19104029.intent.databinding.ActivityIntentReadDataBinding

class IntentReadDataActivity : AppCompatActivity() {

    private lateinit var binding : ActivityIntentReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentReadDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val prodi = intent.getStringExtra(EXTRA_PRODI)
        binding.tvProdiSaya.text = "Prodi Saya Adalah $prodi"
    }

    companion object{
        const val EXTRA_PRODI = "extra_prodi"
    }

}