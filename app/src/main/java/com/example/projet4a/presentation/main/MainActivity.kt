package com.example.projet4a.presentation.main

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.projet4a.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.loginLiveData.observe(this, Observer {
            when(it){
                is LoginSuccess -> {
                    //TODO Navigate
                }
                /*LoginError -> {
                    MaterialAlertDialogBuilder(this)
                            .setTitle("Erreur")
                            .setMessage("Compte inconnu")
                            .setPositiveButton("Ok") { dialog, which ->
                                dialog.dismiss()
                            }
                            .show()

                }*/
            }
        })
        login_button.setOnClickListener {
            mainViewModel.onClickedLogin(login_edit.text.toString().trim(), password_edit.text.toString())
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}