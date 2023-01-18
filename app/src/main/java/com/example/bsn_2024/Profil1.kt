package com.example.bsn_2024
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bsn_2024.databinding.ProfilBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Profil1 : Fragment() {

    private var _binding: ProfilBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ProfilBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.BackMenu.setOnClickListener {
            findNavController().navigate(R.id.Profil_menu)
        }
        binding.imageProfil2.setOnClickListener{
            findNavController().navigate(R.id.Profil_monProfil)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}