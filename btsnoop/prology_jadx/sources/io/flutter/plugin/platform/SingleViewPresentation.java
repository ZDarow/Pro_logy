package io.flutter.plugin.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@androidx.annotation.Keep
/* loaded from: classes.dex */
public class SingleViewPresentation extends android.app.Presentation {
    private static final java.lang.String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.C1578a accessibilityEventsDelegate;
    private android.widget.FrameLayout container;
    private final android.view.View.OnFocusChangeListener focusChangeListener;
    private final android.content.Context outerContext;
    private io.flutter.plugin.platform.C1594q rootView;
    private boolean startFocused;
    private final io.flutter.plugin.platform.C1597t state;
    private int viewId;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, io.flutter.plugin.platform.t] */
    public SingleViewPresentation(android.content.Context context, android.view.Display display, io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f, io.flutter.plugin.platform.C1578a c1578a, int i4, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super(new io.flutter.plugin.platform.C1595r(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1578a;
        this.viewId = i4;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        ?? obj = new java.lang.Object();
        this.state = obj;
        obj.f6640a = interfaceC1583f;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public io.flutter.plugin.platform.C1597t detachState() {
        android.widget.FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        io.flutter.plugin.platform.C1594q c1594q = this.rootView;
        if (c1594q != null) {
            c1594q.removeAllViews();
        }
        return this.state;
    }

    public io.flutter.plugin.platform.InterfaceC1583f getView() {
        return this.state.f6640a;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        io.flutter.plugin.platform.C1597t c1597t = this.state;
        if (c1597t.f6642c == null) {
            c1597t.f6642c = new io.flutter.plugin.platform.C1593p(getContext());
        }
        if (this.state.f6641b == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
            io.flutter.plugin.platform.C1597t c1597t2 = this.state;
            c1597t2.f6641b = new io.flutter.plugin.platform.WindowManagerC1577B(windowManager, c1597t2.f6642c);
        }
        this.container = new android.widget.FrameLayout(getContext());
        io.flutter.plugin.platform.C1596s c1596s = new io.flutter.plugin.platform.C1596s(getContext(), this.state.f6641b, this.outerContext);
        android.view.SurfaceView surfaceView = ((p081U2.C0751a) this.state.f6640a).f2611a;
        if (surfaceView.getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) surfaceView.getContext()).setBaseContext(c1596s);
        } else {
            android.util.Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(surfaceView);
        io.flutter.plugin.platform.C1594q c1594q = new io.flutter.plugin.platform.C1594q(getContext(), this.accessibilityEventsDelegate, surfaceView);
        this.rootView = c1594q;
        c1594q.addView(this.container);
        this.rootView.addView(this.state.f6642c);
        surfaceView.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            surfaceView.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(android.content.Context context, android.view.Display display, io.flutter.plugin.platform.C1578a c1578a, io.flutter.plugin.platform.C1597t c1597t, android.view.View.OnFocusChangeListener onFocusChangeListener, boolean z4) {
        super(new io.flutter.plugin.platform.C1595r(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1578a;
        this.state = c1597t;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z4;
    }
}
