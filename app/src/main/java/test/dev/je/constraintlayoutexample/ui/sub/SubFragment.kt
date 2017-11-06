package test.dev.je.constraintlayoutexample.ui.sub

import android.os.Bundle
import android.view.View
import test.dev.je.constraintlayoutexample.R
import test.dev.je.constraintlayoutexample.extension.replaceFragment
import test.dev.je.constraintlayoutexample.ui.base.BaseFragment
import test.dev.je.constraintlayoutexample.ui.content.ContentFragment
import test.dev.je.constraintlayoutexample.ui.main.MainActivity

/**
 * Created by jieun on 2017. 10. 20..
 */
class SubFragment : BaseFragment(){
    override fun getLayoutResource(): Int = R.layout.fragment_sub

    companion object {
        val INSTANCE by lazy {
            SubFragment()
        }

        val TAG = "SubFragment"
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rootAct = activity as MainActivity
        rootAct.replaceFragment(ContentFragment.INSTANCE, R.id.layContentRootFrame,
                ContentFragment.TAG)
    }

}