package com.example.bsn_2024.Inscription
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bsn_2024.R
import com.example.bsn_2024.databinding.PageInscription5Binding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Inscription5 : Fragment() {

    private var _binding: PageInscription5Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = PageInscription5Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Back5.setOnClickListener{
            findNavController().navigate(R.id.retour_prenom)
        }

        binding.continuerDDNGenre.setOnClickListener{
            findNavController().navigate(R.id.continuerPrenom_DDN)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}