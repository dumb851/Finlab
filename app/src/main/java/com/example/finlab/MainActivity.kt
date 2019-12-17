package com.example.finlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(main_toolbar)

        navController = findNavController(R.id.main_nav_host_fragment)
        appBarConfiguration = AppBarConfiguration.
            //Pass the ids of fragments from nav_graph which you d'ont want to show back button in toolbar
            Builder(R.id.navigation_accounts, R.id.navigation_dashboard, R.id.navigation_calendar,
                R.id.navigation_budgets, R.id.navigation_categories)
            //Pass the drawer layout id from activity xml
            .setDrawerLayout(main_drawer_layout)
            .build()

        //Setup toolbar with back button and drawer icon according to appBarConfiguration
        setupActionBarWithNavController(navController, appBarConfiguration)

        burger_navigation_view.setupWithNavController(navController)
        bottom_navigation_view.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //invalidateOptionsMenu() trigger onCreateOptionsMenu
        val addButtonIsVisible = true

        menuInflater.inflate(R.menu.menu_main_toolbar, menu)

        menu?.findItem(R.id.action_add)?.isVisible = addButtonIsVisible

        return super.onCreateOptionsMenu(menu)
    }

    //Setup appBarConfiguration for back arrow
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }

    override fun onBackPressed() {
        when { //If drawer layout is open close that on back pressed
            main_drawer_layout.isDrawerOpen(GravityCompat.START) -> {
                main_drawer_layout.closeDrawer(GravityCompat.START)
            }
            else -> {
                super.onBackPressed() //If drawer is already in closed condition then go back
            }
        }
    }
}