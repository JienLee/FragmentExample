package test.dev.je.constraintlayoutexample.ui.other

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView
import test.dev.je.constraintlayoutexample.R
import test.dev.je.constraintlayoutexample.ui.base.BaseActivity

/**
 * Created by jieun on 2017. 10. 31..
 */
class OtherActivity : BaseActivity() {

    private val TXT_CONTENT by lazy {
        findViewById<TextView>(R.id.txtContent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents)
        TXT_CONTENT.text = "Content : number - ${ intent.getStringExtra("contents") }"
    }
}