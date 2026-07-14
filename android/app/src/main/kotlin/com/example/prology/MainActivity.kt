package com.example.prology

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine

class MainActivity : FlutterActivity() {
    private var sppPlugin: SppPlugin? = null

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        sppPlugin = SppPlugin()
        sppPlugin?.registerWith(flutterEngine)
    }

    override fun cleanUpFlutterEngine(flutterEngine: FlutterEngine) {
        sppPlugin?.dispose()
        sppPlugin = null
        super.cleanUpFlutterEngine(flutterEngine)
    }
}
