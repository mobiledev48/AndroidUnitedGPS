package com.schoolbus.utility

import android.content.Context
import android.webkit.JavascriptInterface

class WebAppInterface(private val mContext: Context,val onGetStop: ((String) -> Unit)? = null,val onHideMap: (() -> Unit)? = null,val onShowMap: (() -> Unit)? = null) {

    /** Show a toast from the web page  */
    @JavascriptInterface
    fun loadStops(_busStopGeoJson: String) {
        onGetStop?.invoke(_busStopGeoJson)
    }

    @JavascriptInterface
    fun hideTomTom(){
        onHideMap?.invoke()
    }

    @JavascriptInterface
    fun showTomTom(){
        onShowMap?.invoke()
    }
}