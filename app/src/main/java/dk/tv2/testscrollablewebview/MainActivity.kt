package dk.tv2.testscrollablewebview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dk.tv2.testscrollablewebview.utils.replaceFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(WebViewFragment.newInstance())
    }
}
