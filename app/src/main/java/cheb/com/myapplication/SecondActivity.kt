package cheb.com.myapplication

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        /*if (intent.hasExtra("KEY")) {
            val a = intent.getIntExtra("KEY", 0)
            textView.text = a.toString()
            val user: User = intent.getSerializableExtra("USER") as User
            textView.text = user.toString()

        }
        button2.setOnClickListener {
            val a = intent.getIntExtra("KEY", 0) * 2
            val newIntent = Intent()
            newIntent.putExtra("KEY", a)
            setResult(Activity.RESULT_FIRST_USER, newIntent)
            finish()
        }*/

        val sp: SharedPreferences = getSharedPreferences("TEST", Context.MODE_PRIVATE)
        val c = sp.getInt("KEY1", 0)
        textView.text = c.toString()
        //sp.edit().putInt("KEY1", 14).commit()
    }
}
