package techpaliyal.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import javax.xml.transform.Result

class MainActivity : AppCompatActivity() {
var flag=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
           if(flag%2==0){
               button1.setText("X")
           } else{
               button1.setText("O")
           }

            flag ++
            result()
        }
        button2.setOnClickListener {
            if(flag%2==0){
                button2.setText("X")
            } else{
                button2.setText("O")
            }
            flag ++
            result()
        }
        button3.setOnClickListener {
            if(flag%2==0){
                button3.setText("X")
            } else{
                button3.setText("O")
            }
            flag ++
            result()
        }
        button4.setOnClickListener {
            if(flag%2==0){
                button4.setText("X")
            } else{
                button4.setText("O")
            }
            flag ++
            result()
        }
        button5.setOnClickListener {
            if(flag%2==0){
                button5.setText("X")
            } else{
                button5.setText("O")
            }
            flag ++
            result()
        }
        button6.setOnClickListener {
            if(flag%2==0){
                button6.setText("X")
            } else{
                button6.setText("O")
            }
            flag ++
            result()
        }
        button7.setOnClickListener {
            if(flag%2==0){
                button7.setText("X")
            } else{
                button7.setText("O")
            }
            flag ++
            result()
        }
        button8.setOnClickListener {
            if(flag%2==0){
                button8.setText("X")
            } else{
                button8.setText("O")
            }
            flag ++
            result()
        }
        button9.setOnClickListener {
            if(flag%2==0){
                button9.setText("X")
            } else{
                button9.setText("O")
            }
            flag ++
            result()
        }
        button10.setOnClickListener{
            button1.setText("")
            button2.setText("")
            button3.setText("")
            button4.setText("")
            button5.setText("")
            button6.setText("")
            button7.setText("")
            button8.setText("")
            button9.setText("")
            flag=0
        }
    }
    fun Res() {

    }
    var result = {
        var s1=button1.text
        var s2=button2.text
        var s3=button3.text
        var s4=button4.text
        var s5=button5.text
        var s6=button6.text
        var s7=button7.text
        var s8=button8.text
        var s9=button9.text

        if(s1==s2&&s1==s3&&s3!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
        if(s4==s5&&s4==s6&&s4!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
        if(s7==s8&&s7==s9&&s7!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
        if(s1==s4&&s1==s7&&s1!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
        if(s2==s5&&s2==s8&&s2!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
        if(s3==s6&&s3==s9&&s3!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
        if(s1==s5&&s1==s9&&s1!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
        if(s3==s5&&s3==s7&&s3!=""){
            Toast.makeText(applicationContext,"Wins",20).show();
        }
    }

}
