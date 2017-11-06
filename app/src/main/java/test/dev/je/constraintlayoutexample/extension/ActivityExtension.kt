package test.dev.je.constraintlayoutexample.extension

import android.app.Activity
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by je944 on 2017-10-17.
 */
fun AppCompatActivity.replaceFragment(fragment: Fragment, fragRootLayId: Int, tag: String){
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(fragRootLayId, fragment, tag)
    transaction.commitAllowingStateLoss()
}