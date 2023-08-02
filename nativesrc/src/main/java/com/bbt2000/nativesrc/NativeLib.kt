package com.bbt2000.nativesrc

class NativeLib {

    /**
     * A native method that is implemented by the 'nativesrc' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'nativesrc' library on application startup.
        init {
            System.loadLibrary("nativesrc")
        }
    }
}