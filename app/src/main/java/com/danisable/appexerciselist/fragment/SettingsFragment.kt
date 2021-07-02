package com.danisable.appexerciselist.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.domain.model.Settings
import com.danisable.appexerciselist.presentation.adapter.SettingsAdapter
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerSettings

import kotlinx.android.synthetic.main.fragment_settings.view.*


class SettingsFragment : Fragment(), ListenerSettings {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_settings, container, false)
        val adapter = SettingsAdapter(view.context, com.danisable.appexerciselist.presentation.data.settings.Settings.getSettings(), this)
        view.rvSettings.setHasFixedSize(true)
        view.rvSettings.layoutManager = LinearLayoutManager(
            view.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        //view.rvSettings.layoutManager = GridLayoutManager(view.context,3)
        view.rvSettings.adapter = adapter
        return view
    }

    override fun onClickSettings(Settings: Settings) {
        TODO("Not yet implemented")
    }
}