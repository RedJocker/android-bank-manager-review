package org.hyperskill.bankmanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import org.hyperskill.bankmanager.R
import org.hyperskill.bankmanager.model.UserViewModel

class DepositFundsScreen: Fragment() {

    val userViewModel by viewModels<UserViewModel>(ownerProducer = { activity as MainActivity })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,

    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.deposit_funds_screen, container, false)
    }
}