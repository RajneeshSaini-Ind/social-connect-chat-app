package com.example.lockdownchatapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    fun loginClickNavHeader(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
       // Toast.makeText(this, "Clicked loginClickNavHeader fun..", Toast.LENGTH_LONG).show()
    }
    fun homeLoginClicked(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        // Toast.makeText(this, "Clicked loginClickNavHeader fun..", Toast.LENGTH_LONG).show()
    }

    fun addChannelButton(view: View) {
        Toast.makeText(this, "Clicked addChannelButton fun..", Toast.LENGTH_LONG).show()
    }
    fun sendMessageButtonClicked(view: View){
        Toast.makeText(this, "Clicked addChannelButton fun..", Toast.LENGTH_LONG).show()
    }

}
