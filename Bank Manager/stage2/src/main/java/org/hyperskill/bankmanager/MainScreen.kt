package org.hyperskill.bankmanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.hyperskill.bankmanager.databinding.MainScreenBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MainScreen : Fragment() {
    private var _binding: MainScreenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MainScreenBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mainLogInButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.mainSignUpButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_signUp3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}