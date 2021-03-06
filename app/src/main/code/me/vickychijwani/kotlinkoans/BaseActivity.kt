package me.vickychijwani.kotlinkoans

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.tsengvn.typekit.TypekitContextWrapper
import me.vickychijwani.kotlinkoans.util.logInfo


abstract class BaseActivity : AppCompatActivity() {

    private val LIFECYCLE_TAG = "Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onCreate" }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onCreate" }
    }

    override fun onStart() {
        super.onStart()
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onStart" }
    }

    override fun onResume() {
        super.onResume()
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onResume" }
    }

    override fun onPause() {
        super.onPause()
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onPause" }
    }

    override fun onStop() {
        super.onStop()
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onStop" }
    }

    override fun onDestroy() {
        super.onDestroy()
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onDestroy" }
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        logInfo(tag = LIFECYCLE_TAG) { "${this.javaClass.simpleName} onTrimMemory" }
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase))
    }

}
