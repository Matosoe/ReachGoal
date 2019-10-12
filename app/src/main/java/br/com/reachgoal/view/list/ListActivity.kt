package br.com.reachgoal.view.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import br.com.reachgoal.R
import br.com.reachgoal.view.about.AboutActivity
import br.com.reachgoal.view.login.LoginActivity

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.form_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.action_about -> {
                menuAbout()
                return true
            }
            R.id.action_logout -> {
                logout()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun logout() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
    private fun menuAbout() {
        startActivity(Intent(this, AboutActivity::class.java))
    }

}
