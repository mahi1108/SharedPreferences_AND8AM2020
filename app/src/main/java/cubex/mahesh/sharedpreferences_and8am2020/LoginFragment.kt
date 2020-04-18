package cubex.mahesh.sharedpreferences_and8am2020

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.login_frag.*
import kotlinx.android.synthetic.main.login_frag.view.*

class LoginFragment : Fragment() {

    var spf:SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.login_frag,
            container,false)

        spf = activity?.getSharedPreferences(
            "and8am2020", Context.MODE_PRIVATE)
        var isKsignIn = spf?.getBoolean("ksign",false)
        if(isKsignIn!!){
            var fManager = activity?.supportFragmentManager
            var fTx = fManager?.beginTransaction()
            fTx?.add(R.id.flayout, WelcomeFragment())
            fTx?.commit()
        }

        v.login.setOnClickListener {

            var uname = editText.text.toString()
            var pass = editText2.text.toString()
            var spf_uname = spf?.getString("uname",
                "no value")
            var spf_pass = spf?.getString("pass",
                "no value")
            if( uname.equals(spf_uname) && pass.equals(spf_pass))
            {
                if(ksign.isChecked){
                    var spe = spf?.edit()
                    spe?.putBoolean("ksign",true)
                    spe?.commit()
                }
                var fManager = activity?.supportFragmentManager
                var fTx = fManager?.beginTransaction()
                fTx?.add(R.id.flayout, WelcomeFragment())
                fTx?.addToBackStack("true")
                fTx?.commit()
            }else{
                Toast.makeText(activity,
                    "User Doesn't Exist",
                    Toast.LENGTH_LONG).show()
            }
        }

        v.register.setOnClickListener {
            var fManager = activity?.supportFragmentManager
            var fTx = fManager?.beginTransaction()
            fTx?.add(R.id.flayout, RegisterFragment())
            fTx?.addToBackStack("true")
            fTx?.commit()
        }

        return v;
    }

}