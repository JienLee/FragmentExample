package test.dev.je.constraintlayoutexample.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import test.dev.je.constraintlayoutexample.R
import test.dev.je.constraintlayoutexample.extension.replaceFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(MainFragment.INSTANCE, R.id.layFragmentRootFrame, MainFragment.TAG)
    }
}