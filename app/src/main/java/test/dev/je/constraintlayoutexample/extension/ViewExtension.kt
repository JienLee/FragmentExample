package test.dev.je.constraintlayoutexample.extension

import android.support.constraint.ConstraintLayout
import android.view.View

/**
 * Created by je944 on 2017-10-17.
 */
fun ConstraintLayout.LayoutParams.changeStartMargin(target: View, margin: Int){
    marginStart = margin
    target.layoutParams = this
}

fun ConstraintLayout.LayoutParams.changeEndMargin(target: View, margin: Int){
    marginEnd = margin
    target.layoutParams = this
}