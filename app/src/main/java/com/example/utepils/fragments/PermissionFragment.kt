package com.example.utepils.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.platform.ComposeView
import com.example.utepils.permission.PermissionTestUI
import com.example.utepils.permission.PermissionTestViewModel

class PermissionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            setContent {
                val scaffoldState = rememberScaffoldState()
                val permissionTestViewModel = PermissionTestViewModel()
                PermissionTestUI(scaffoldState, permissionTestViewModel)
            }
        }
    }
}