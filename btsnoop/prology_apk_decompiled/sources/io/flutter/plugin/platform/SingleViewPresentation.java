package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes.dex */
public class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C0344a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private q rootView;
    private boolean startFocused;
    private final t state;
    private int viewId;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, io.flutter.plugin.platform.t] */
    public SingleViewPresentation(Context context, Display display, f fVar, C0344a c0344a, int i4, View.OnFocusChangeListener onFocusChangeListener) {
        super(new r(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0344a;
        this.viewId = i4;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        ?? obj = new Object();
        this.state = obj;
        obj.f6401a = fVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public t detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        q qVar = this.rootView;
        if (qVar != null) {
            qVar.removeAllViews();
        }
        return this.state;
    }

    public f getView() {
        return this.state.f6401a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        t tVar = this.state;
        if (tVar.f6403c == null) {
            tVar.f6403c = new p(getContext());
        }
        if (this.state.f6402b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            t tVar2 = this.state;
            tVar2.f6402b = new B(windowManager, tVar2.f6403c);
        }
        this.container = new FrameLayout(getContext());
        s sVar = new s(getContext(), this.state.f6402b, this.outerContext);
        SurfaceView surfaceView = ((U2.a) this.state.f6401a).f2523a;
        if (surfaceView.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) surfaceView.getContext()).setBaseContext(sVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(surfaceView);
        q qVar = new q(getContext(), this.accessibilityEventsDelegate, surfaceView);
        this.rootView = qVar;
        qVar.addView(this.container);
        this.rootView.addView(this.state.f6403c);
        surfaceView.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            surfaceView.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C0344a c0344a, t tVar, View.OnFocusChangeListener onFocusChangeListener, boolean z4) {
        super(new r(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0344a;
        this.state = tVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z4;
    }
}
