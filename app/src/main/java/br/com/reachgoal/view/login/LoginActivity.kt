package br.com.reachgoal.view.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.reachgoal.view.signin.SingInActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(br.com.reachgoal.R.layout.activity_login)

        btSignin.setOnClickListener {
            val nextScreen = Intent(this, SingInActivity::class.java)
            startActivity(nextScreen)
            finish()
        }
    }
}
