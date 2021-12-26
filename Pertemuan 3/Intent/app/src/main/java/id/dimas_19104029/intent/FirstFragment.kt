package id.dimas_19104029.intent

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import id.dimas_19104029.intent.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            btnToSecondFragment.setOnClickListener {
                val nama = inputNama.text.toString()
                if (nama.isEmpty()){
                    inputNama.error = "Nama Tidak Boleh Kosong"
                    return@setOnClickListener
                }

                val nim = inputNim.text.toString()
                if (nim.isEmpty()){
                    inputNim.error = "Nim Tidak Boleh Kosong"
                    return@setOnClickListener
                }

                val mReadDataFragment = FragmentReadData()
                val mBundle = Bundle()
                mBundle.putString(FragmentReadData.EXTRA_NAMA, nama)
                mReadDataFragment.arguments = mBundle
                mReadDataFragment.nim = nim.toInt()

                val mFragmentManager = fragmentManager as FragmentManager
                mFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameContainer, mReadDataFragment, FragmentReadData::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()

            }
        }
    }

    companion object {

    }


}