package com.example.bsn_2024.Inscription
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bsn_2024.R
import com.example.bsn_2024.databinding.PageInscription2Binding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Inscription2 : Fragment() {

    private var _binding: PageInscription2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = PageInscription2Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button13.setOnClickListener {
            findNavController().navigate(R.id.action_email_to_telephone)
        }
        binding.Back2.setOnClickListener{
            findNavController().navigate(R.id.retour_page_Acceuil)
        }
        binding.buttonContinuerInscriptionEmail.setOnClickListener{
            findNavController().navigate(R.id.email_Mdp)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}