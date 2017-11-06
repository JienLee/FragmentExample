package test.dev.je.constraintlayoutexample.ui.main

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.TextView
import test.dev.je.constraintlayoutexample.R
import test.dev.je.constraintlayoutexample.extension.changeStartMargin
import test.dev.je.constraintlayoutexample.extension.replaceFragment
import test.dev.je.constraintlayoutexample.ui.base.BaseFragment
import test.dev.je.constraintlayoutexample.ui.sub.SubFragment

/**
 * Created by jieun on 2017. 10. 20..
 */
class MainFragment : BaseFragment(){
    override fun getLayoutResource(): Int  = R.layout.fragment_main

    companion object {
        val INSTANCE by lazy {
            MainFragment()
        }

        val TAG = "MainFragment"
    }

    private val TXT_CONTENTS by lazy {
        activity.findViewById<TextView>(R.id.txtContents)
    }

    private val BTN_CHANGE by lazy {
        activity.findViewById<Button>(R.id.btnChange)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtParams  = TXT_CONTENTS.layoutParams as ConstraintLayout.LayoutParams
        val margin20 = resources.getDimension(R.dimen.margin_20).toInt()
        txtParams.changeStartMargin(TXT_CONTENTS, margin20)

        BTN_CHANGE.setOnClickListener{
            val mainAct = activity as MainActivity
            mainAct.replaceFragment(SubFragment.INSTANCE, R.id.layFragmentRootFrame, SubFragment.TAG)
        }
    }

}