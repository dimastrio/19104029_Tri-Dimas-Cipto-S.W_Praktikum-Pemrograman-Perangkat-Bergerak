package id.dimas_19104029.intent

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.dimas_19104029.intent.databinding.FragmentFirstBinding
import id.dimas_19104029.intent.databinding.FragmentReadDataBinding

class FragmentReadData : Fragment() {

    private lateinit var binding: FragmentReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentReadDataBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null){
            val myName = arguments?.getString(EXTRA_NAMA)
            binding.tvMyData.text = "Nama Saya : $myName, NIM Saya: $nim"
        }

        binding.btnKembaliBeranda.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    var nim: Int? = null
    companion object {
        var EXTRA_NAMA = ""
    }
}