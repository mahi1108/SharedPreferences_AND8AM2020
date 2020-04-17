package cubex.mahesh.sharedpreferences_and8am2020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.login_frag.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.login_frag,
            container,false)

        v.login.setOnClickListener {

        }

        v.register.setOnClickListener {
            var fManager = activity?.supportFragmentManager
            var fTx = fManager?.beginTransaction()
            fTx?.add(R.id.flayout, RegisterFragment())
            fTx?.commit()
        }

        return v;
    }

}