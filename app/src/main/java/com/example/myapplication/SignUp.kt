package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.SignUpBinding
import androidx.appcompat.app.AppCompatActivity

import com.google.android.material.textfield.TextInputLayout


class SignUp : Fragment(), View.OnClickListener {

    var firstNameStr : String = ""

    /**
     * A simple [Fragment] subclass as the default destination in the navigation.
     */

        private var _binding: SignUpBinding? = null

        // This property is only valid between onCreateView and
        // onDestroyView.
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?

        ): View? {

            _binding = SignUpBinding.inflate(inflater, container, false)
            return binding.root

        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)


        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }



    override fun onClick(v: View) {
        method2();
    }

    fun method2 () {
        println("test")
    }





}



