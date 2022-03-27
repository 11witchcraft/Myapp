package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(),View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1:Button=findViewById(R.id.button1)
        val button2:Button=findViewById(R.id.button2)
        val button3:Button=findViewById(R.id.button3)
        val button4:Button=findViewById(R.id.button4)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button1 ->{
                val editText:EditText=findViewById(R.id.editText1)
                val inputText = editText.text.toString()
               Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            }
            R.id.button2 ->{
                val imageView:ImageView=findViewById(R.id.imageView1)
                imageView.setImageResource(R.drawable.img_2)
            }
            R.id.button3 ->{
                //                if (progressBar.visibility == View.VISIBLE) {
//                    progressBar.visibility = View.GONE
//                } else {
//                    progressBar.visibility = View.VISIBLE
//                }
                val progressBar:ProgressBar=findViewById(R.id.progressBar1)
                progressBar.progress = progressBar.progress + 10
                if(progressBar.progress >=100){
                    progressBar.visibility= View.GONE
                }
                else{
                    progressBar.visibility=View.VISIBLE
                }
            }
            R.id.button4 -> {


                AlertDialog.Builder(this).apply {
                    setTitle("对话框")
                    setMessage("这些很重要！")
                    setCancelable(false)
                    setPositiveButton("取消") { dialog, which ->
                    }
                    setNegativeButton("好的") { dialog, which ->
                    }
                    show()
                }
            }
        }
    }
}