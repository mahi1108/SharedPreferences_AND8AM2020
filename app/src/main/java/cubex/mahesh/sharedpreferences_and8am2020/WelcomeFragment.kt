package cubex.mahesh.sharedpreferences_and8am2020

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.welcome.*
import kotlinx.android.synthetic.main.welcome.view.*

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.welcome,
            container,false)
        var spf = activity?.getSharedPreferences(
            "and8am2020", Context.MODE_PRIVATE)
        var uname = spf?.getString("uname","no uname")
        v.welcome_msg?.text = "Welcome To : "+ uname
        return v;
    }

}