package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.g;

@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final g lifecycle;

    public HiddenLifecycleReference(g gVar) {
        this.lifecycle = gVar;
    }

    public g getLifecycle() {
        return this.lifecycle;
    }
}
