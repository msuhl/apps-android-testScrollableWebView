package dk.tv2.testscrollablewebview

import android.content.pm.ApplicationInfo
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.NestedScrollView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.webview_fragment.*

class WebViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.webview_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initWebview("https://tv2.dk")
//        initWebview("https://nyheder.tv2.dk/node/1395002/chromeless")
    }

    fun initWebview(url: String) {

        embeddedWebview.settings.javaScriptEnabled = true
        embeddedWebview.settings.loadWithOverviewMode = true
        embeddedWebview.settings.useWideViewPort = true
        embeddedWebview.webChromeClient = WebChromeClient()
        embeddedWebview.webViewClient = object : WebViewClient() {
        }
        // enable remote debugging
        WebView.setWebContentsDebuggingEnabled(true)

        embeddedWebview.loadUrl(url)
    }

//    override fun onScrollChange(p0: NestedScrollView?, p1: Int, p2: Int, p3: Int, p4: Int) {
////        embeddedWebview.evaluateJavascript()
//    }

    companion object {
        fun newInstance(): WebViewFragment = WebViewFragment()
    }
}