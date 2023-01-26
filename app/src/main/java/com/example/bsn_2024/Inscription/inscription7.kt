package com.example.bsn_2024
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bsn_2024.databinding.PageInscription7Binding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Inscription7 : Fragment() {

    private var _binding: PageInscription7Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = PageInscription7Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Back7.setOnClickListener{
            findNavController().navigate(R.id.retour_genre)
        }
        binding.continuerCGuMenuPrinc.setOnClickListener{
            findNavController().navigate(R.id.continuerCGu_MenuPrinc)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}