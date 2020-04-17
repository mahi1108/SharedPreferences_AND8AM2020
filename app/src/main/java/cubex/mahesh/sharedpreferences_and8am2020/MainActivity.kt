package cubex.mahesh.sharedpreferences_and8am2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = supportFragmentManager
        var fTx = fManager.beginTransaction()
        fTx.add(R.id.flayout, LoginFragment())
        fTx.commit()
    }
}
