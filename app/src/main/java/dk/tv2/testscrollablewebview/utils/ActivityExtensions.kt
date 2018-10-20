package dk.tv2.testscrollablewebview.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import dk.tv2.testscrollablewebview.R

fun FragmentActivity.replaceFragment(
    fragment: Fragment,
    container: Int = R.id.content_container
) {
    supportFragmentManager.beginTransaction()
        .replace(container, fragment)
        .commit()
}