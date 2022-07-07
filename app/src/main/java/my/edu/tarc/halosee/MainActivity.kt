package my.edu.tarc.halosee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Module level
    override fun onCreate(savedInstanceState: Bundle?) {
        //Local level
        super.onCreate(savedInstanceState)

        /**
         * display UI
         * R = resources (res folder)
         */
        setContentView(R.layout.activity_main)

        //Declare variable to link program and UI
        //val = value, var = variable
        val textViewMessage = findViewById<TextView>(R.id.textViewMessage);
        //val textViewMessage2 : TextView = findViewById(R.id.textViewMessage);

        val buttonShowMessage : Button = findViewById(R.id.buttonShowMessage);
        val imageViewQR : ImageView = findViewById(R.id.imageViewQR);

        var boolClick = false
        buttonShowMessage.setOnClickListener {
            boolClick = !boolClick
            //textViewMessage.text = "Hello"
            //textViewMessage.text = getString(R.string.greeting)
            if(boolClick){
                textViewMessage.text = String.format("%s", getString(R.string.greeting))
                imageViewQR.visibility = View.VISIBLE;
            }else{
                imageViewQR.visibility = View.INVISIBLE;
            }
        }
    }
}