package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClock = findViewById<Button>(R.id.btnTime)
        val buttonExam = findViewById<Button>(R.id.btnExam)
        val buttonValidate = findViewById<Button>(R.id.btnValidate)

        buttonClock.setOnClickListener {
                  replaceFrameWithFragment(Clock_Fragment())
        }

        buttonExam.setOnClickListener {
            replaceFrameWithFragment(Exam_Fragment())

        }
        buttonValidate.setOnClickListener {
            replaceFrameWithFragment(LoginFragment())
        }
    }

    private fun replaceFrameWithFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout , fragment)
        fragmentTransaction.commit()

    }
}