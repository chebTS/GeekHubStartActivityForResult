package cheb.com.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            val t = savedInstanceState.getInt("temp", 4)
            button.text = t.toString()
        }
        button.setOnClickListener {

            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
            sendIntent.type = "text/plain"
            startActivity(sendIntent)



            /*        val newIntent: Intent = Intent(this, SecondActivity::class.java)
                    newIntent.putExtra("KEY", 12)
                    val user: User = User(1, "Vasia")
                    newIntent.putExtra("USER", user)*/
/*
            val bundle: Bundle = Bundle()
            bundle.putInt("KEY2", 13)
            newIntent.putExtras(bundle)
*/

            //startActivityForResult(newIntent, 123)

            /*val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "TEST")
            sendIntent.type = "text/plain"
            if (sendIntent.resolveActivity(packageManager) != null) {
                startActivity(sendIntent)
            }*/
/*
            val sp: SharedPreferences = getSharedPreferences("TEST", Context.MODE_PRIVATE)
            sp.edit().putInt("KEY1", 14).commit()

            startActivity(newIntent)*/

        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putInt("temp", 2)
        super.onSaveInstanceState(outState)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {

        super.onSaveInstanceState(outState, outPersistentState)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 123) {
            Log.i("TAG", resultCode.toString())
            if (data != null) {
                if (data.hasExtra("KEY")) {
                    val b = data.extras.getInt("KEY", 0)
                    Log.i("TAG", b.toString())
                }
            }
        }
    }
}
