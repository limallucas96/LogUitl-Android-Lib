package br.com.lucas.logutil

import android.util.Log

class LogDebug {
    companion object {
        fun logDebug(message: String) {
            Log.d("LogDebug", message)
        }
    }
}