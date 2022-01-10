package com.gdsciiita.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.gdsciiita.android.adapter.MemberListAdapter
import com.gdsciiita.android.adapter.ProjectListAdapter
import com.gdsciiita.android.databinding.ActivityMainBinding
import com.gdsciiita.android.viewmodel.ProjectViewModel
import com.gdsciiita.android.viewmodel.ProjectViewModelFactory
import com.gdsciiita.android.viewmodel.TeamViewModel
import com.gdsciiita.android.viewmodel.TeamViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment
        val navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(binding.bottomNav.menu)
        setupActionBarWithNavController(navController, appBarConfiguration)
        setupWithNavController(binding.bottomNav, navController)

    }

}