package test.dev.je.constraintlayoutexample.ui.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by jieun on 2017. 10. 20..
 */
abstract class BaseFragment : Fragment() {
    @LayoutRes
    abstract fun getLayoutResource():Int

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
            = inflater?.inflate(getLayoutResource(), container, false)
}
