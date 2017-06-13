package me.vickychijwani.kotlinkoans.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.design.widget.BottomSheetBehavior
import android.view.View

fun browse(activity: Activity, url: String) {
    activity.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
}

fun BottomSheetBehavior<*>.isExpanded() = (state == BottomSheetBehavior.STATE_EXPANDED)
fun BottomSheetBehavior<*>.isCollapsed() = (state == BottomSheetBehavior.STATE_COLLAPSED)
fun BottomSheetBehavior<*>.expand() { state = BottomSheetBehavior.STATE_EXPANDED }
fun BottomSheetBehavior<*>.collapse() { state = BottomSheetBehavior.STATE_COLLAPSED }

fun BottomSheetBehavior<*>.toggleState() {
    if (this.state == BottomSheetBehavior.STATE_COLLAPSED) {
        this.state = BottomSheetBehavior.STATE_EXPANDED
    } else {
        this.state = BottomSheetBehavior.STATE_COLLAPSED
    }
}

fun View.show() { visibility = View.VISIBLE }
fun View.hide() { visibility = View.GONE }
fun View.invisible() { visibility = View.INVISIBLE }


fun getScreenWidth(context: Context): Int {
    return context.resources.displayMetrics.widthPixels
}

fun getScreenHeight(context: Context): Int {
    return context.resources.displayMetrics.heightPixels
}