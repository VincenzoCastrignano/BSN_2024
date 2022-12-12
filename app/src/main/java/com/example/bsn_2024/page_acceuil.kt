package com.example.bsn_2024
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bsn_2024.databinding.PageAccueil2Binding



/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class PageAcceuil2 : Fragment() {

    private var _binding: PageAccueil2Binding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = PageAccueil2Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.connexionButton.setOnClickListener {
            findNavController().navigate(R.id.action_page_acceuil2_to_page_connexion1)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}