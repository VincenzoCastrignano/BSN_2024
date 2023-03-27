package com.example.bsn_2024.Profil
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bsn_2024.R
import com.example.bsn_2024.databinding.Profil1Binding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Profil2 : Fragment() {

    private var _binding: Profil1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = Profil1Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.BackMonprofilProfil.setOnClickListener{
            findNavController().navigate(R.id.Profil_MonProfil_Profil)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}