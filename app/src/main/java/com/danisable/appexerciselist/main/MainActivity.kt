package com.danisable.appexerciselist.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.domain.model.News
import com.danisable.appexerciselist.fragment.GalleryFragment
import com.danisable.appexerciselist.fragment.NewsFragment
import com.danisable.appexerciselist.fragment.SettingsFragment
import com.danisable.appexerciselist.fragment.details.NewsDFragment
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerNews
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(NewsFragment(),this)
        bottomNavigation.setOnNavigationItemSelectedListener (this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_news -> replaceFragment(NewsFragment(),this)
            R.id.menu_gallery -> replaceFragment(GalleryFragment(),this)
            R.id.menu_settings -> replaceFragment(SettingsFragment(),this)
        }
        return false
    }

    private fun replaceFragment(fragment: Fragment, context: Context){
        val sm = supportFragmentManager.beginTransaction()

        sm.apply {
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            replace(R.id.container, fragment)
            addToBackStack(null)
            commit()
        }
    }
}