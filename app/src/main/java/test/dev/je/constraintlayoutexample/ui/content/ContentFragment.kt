package test.dev.je.constraintlayoutexample.ui.content

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import test.dev.je.constraintlayoutexample.R
import test.dev.je.constraintlayoutexample.ui.base.BaseFragment
import test.dev.je.constraintlayoutexample.ui.other.OtherActivity

/**
 * Created by jieun on 2017. 10. 25..
 */
class ContentFragment : BaseFragment(){
    override fun getLayoutResource(): Int  = R.layout.fragment_content

    private val LAY_CONTENT_RECYCLER by lazy {
        activity.findViewById<RecyclerView>(R.id.layContentRecycler)
    }

    private val CONTENT_ADAPTER by lazy {
        ContentAdapter(activity, listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"), {
            Toast.makeText(context, "click ${it} item", Toast.LENGTH_LONG).show()

            val intent = Intent(activity,  OtherActivity::class.java)
            intent.putExtra("contents", it.toString())
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        })
    }
    companion object {
        val INSTANCE by lazy {
            ContentFragment()
        }

        val TAG = "ContentFragment"
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(activity)

        LAY_CONTENT_RECYCLER.layoutManager = layoutManager

        LAY_CONTENT_RECYCLER.adapter = CONTENT_ADAPTER

    }
}