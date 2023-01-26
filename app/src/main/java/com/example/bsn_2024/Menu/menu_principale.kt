package com.example.bsn_2024.Menu
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bsn_2024.R
import com.example.bsn_2024.databinding.MainMenuBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class menu_principale : Fragment() {

    private var _binding: MainMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MainMenuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonProfil.setOnClickListener{
            findNavController().navigate(R.id.Menu_Profil)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}