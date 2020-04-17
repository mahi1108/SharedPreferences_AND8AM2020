package cubex.mahesh.sharedpreferences_and8am2020

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.register.view.*

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.register,
            container,false)

        v.reg_button.setOnClickListener {

            var spf = activity?.getSharedPreferences(
                "and8am2020",
                Context.MODE_PRIVATE)
            var spe = spf?.edit()
            spe?.putString("uname",v.reg_uname.text.toString())
            spe?.putString("pass",v.reg_pass.text.toString())
            spe?.putString("mno",v.reg_mno.text.toString())
            spe?.putString("email",v.reg_email.text.toString())
            spe?.commit()
        }

        return v;
    }

}