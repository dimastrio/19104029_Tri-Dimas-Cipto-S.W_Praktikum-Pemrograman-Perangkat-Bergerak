package id.dimas_19104029.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.dimas_19104029.intent.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        
        val mFragmentManager = supportFragmentManager
        val mFirstFragment = FirstFragment()
        val fragment = mFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)
        if (fragment !is FirstFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + FirstFragment::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frameContainer, mFirstFragment, FirstFragment::class.java.simpleName)
                .commit()
        }

    }
}