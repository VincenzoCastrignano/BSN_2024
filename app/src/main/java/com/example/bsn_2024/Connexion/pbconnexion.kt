package com.example.bsn_2024
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bsn_2024.databinding.Probleme1Binding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class probleme_connexion : Fragment() {

    private var _binding: Probleme1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = Probleme1Binding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}