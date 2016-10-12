package com.yangpeiyong.kotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val name = "Kotlin"
//        helloTxt.setText("Hello, $name")
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            val name = editText(){
                hint = "This is hint"
            }
            button("Say Hello") {
                width = wrapContent
                height = wrapContent
                onClick { toast("Hello, ${name.text}!") }
            }
        }
    }
}
