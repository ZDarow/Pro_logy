package io.flutter.view;

import B2.s;
import I.C0044m;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.media.session.t;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g extends AccessibilityNodeProvider {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f6506z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f6507a;

    /* renamed from: b, reason: collision with root package name */
    public final t f6508b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f6509c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f6510d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f6511e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f6512f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f6513g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f6514h;

    /* renamed from: i, reason: collision with root package name */
    public f f6515i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f6516j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f6517k;

    /* renamed from: l, reason: collision with root package name */
    public int f6518l;

    /* renamed from: m, reason: collision with root package name */
    public String f6519m;

    /* renamed from: n, reason: collision with root package name */
    public f f6520n;

    /* renamed from: o, reason: collision with root package name */
    public f f6521o;

    /* renamed from: p, reason: collision with root package name */
    public f f6522p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f6523q;

    /* renamed from: r, reason: collision with root package name */
    public int f6524r;
    public B2.r s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6525t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6526u;

    /* renamed from: v, reason: collision with root package name */
    public final a f6527v;
    public final b w;

    /* renamed from: x, reason: collision with root package name */
    public final c f6528x;

    /* renamed from: y, reason: collision with root package name */
    public final s f6529y;

    public g(View view, t tVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.i iVar) {
        int i4;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f6513g = new HashMap();
        this.f6514h = new HashMap();
        this.f6518l = 0;
        this.f6523q = new ArrayList();
        this.f6524r = 0;
        this.f6525t = false;
        this.f6526u = false;
        this.f6527v = new a(this);
        b bVar = new b(this);
        this.w = bVar;
        s sVar = new s(this, new Handler(), 2);
        this.f6529y = sVar;
        this.f6507a = view;
        this.f6508b = tVar;
        this.f6509c = accessibilityManager;
        this.f6512f = contentResolver;
        this.f6510d = accessibilityViewEmbedder;
        this.f6511e = iVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f6528x = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.f6518l |= 128;
        sVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, sVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i4 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i4 == Integer.MAX_VALUE || i4 < 300) {
                this.f6518l &= -9;
            } else {
                this.f6518l |= 8;
            }
            ((FlutterJNI) tVar.f3735n).setAccessibilityFeatures(this.f6518l);
        }
        iVar.m(this);
    }

    public static String d(ByteBuffer byteBuffer, String[] strArr) {
        int i4 = byteBuffer.getInt();
        if (i4 == -1) {
            return null;
        }
        return strArr[i4];
    }

    public final boolean a(SurfaceView surfaceView, View view, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6510d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(surfaceView, view, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(surfaceView, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f6517k = recordFlutterId;
            this.f6520n = null;
            return true;
        }
        if (eventType == 128) {
            this.f6522p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f6516j = recordFlutterId;
            this.f6515i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f6517k = null;
        this.f6516j = null;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, io.flutter.view.e] */
    public final e b(int i4) {
        HashMap hashMap = this.f6514h;
        e eVar = (e) hashMap.get(Integer.valueOf(i4));
        if (eVar != null) {
            return eVar;
        }
        ?? obj = new Object();
        obj.f6452c = -1;
        obj.f6451b = i4;
        obj.f6450a = 267386881 + i4;
        hashMap.put(Integer.valueOf(i4), obj);
        return obj;
    }

    public final f c(int i4) {
        HashMap hashMap = this.f6513g;
        f fVar = (f) hashMap.get(Integer.valueOf(i4));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        fVar2.f6482b = i4;
        hashMap.put(Integer.valueOf(i4), fVar2);
        return fVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        int i5;
        String str;
        String str2;
        String str3;
        int i6;
        j(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6510d;
        if (i4 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i4);
        }
        HashMap hashMap = this.f6513g;
        View view = this.f6507a;
        if (i4 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        f fVar = (f) hashMap.get(Integer.valueOf(i4));
        if (fVar == null) {
            return null;
        }
        int c4 = f.c(fVar);
        io.flutter.plugin.platform.i iVar = this.f6511e;
        if (c4 != -1 && iVar.r(f.c(fVar))) {
            SurfaceView K3 = iVar.K(f.c(fVar));
            if (K3 == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(K3, f.a(fVar), f.d(fVar));
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i4);
        int i7 = Build.VERSION.SDK_INT;
        obtain2.setImportantForAccessibility((fVar.D(12) || (f.t(fVar) == null && fVar.f6485d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        if (f.e(fVar) != null) {
            obtain2.setViewIdResourceName(f.e(fVar));
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i4);
        obtain2.setFocusable(f.f(fVar));
        f fVar2 = this.f6520n;
        if (fVar2 != null) {
            obtain2.setFocused(f.a(fVar2) == i4);
        }
        f fVar3 = this.f6515i;
        if (fVar3 != null) {
            obtain2.setAccessibilityFocused(f.a(fVar3) == i4);
        }
        if (f.g(fVar, 5)) {
            obtain2.setPassword(f.g(fVar, 11));
            if (!f.g(fVar, 21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!f.g(fVar, 21));
            if (f.h(fVar) != -1 && f.i(fVar) != -1) {
                obtain2.setTextSelection(f.h(fVar), f.i(fVar));
            }
            f fVar4 = this.f6515i;
            if (fVar4 != null && f.a(fVar4) == i4) {
                obtain2.setLiveRegion(1);
            }
            if (f.j(fVar, d.f6445v)) {
                obtain2.addAction(256);
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (f.j(fVar, d.w)) {
                obtain2.addAction(512);
                i6 = 1;
            }
            if (f.j(fVar, d.f6432F)) {
                obtain2.addAction(256);
                i6 |= 2;
            }
            if (f.j(fVar, d.f6433G)) {
                obtain2.addAction(512);
                i6 |= 2;
            }
            obtain2.setMovementGranularities(i6);
            if (f.k(fVar) >= 0) {
                obtain2.setMaxTextLength(f.k(fVar) + ((f.l(fVar) == null ? 0 : f.l(fVar).length()) - f.m(fVar)));
            }
        }
        if (f.j(fVar, d.f6446x)) {
            obtain2.addAction(131072);
        }
        if (f.j(fVar, d.f6447y)) {
            obtain2.addAction(16384);
        }
        if (f.j(fVar, d.f6448z)) {
            obtain2.addAction(65536);
        }
        if (f.j(fVar, d.f6427A)) {
            obtain2.addAction(32768);
        }
        if (f.j(fVar, d.f6434H)) {
            obtain2.addAction(2097152);
        }
        if (f.g(fVar, 4)) {
            obtain2.setClassName("android.widget.Button");
        }
        if (f.g(fVar, 15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (f.j(fVar, d.f6431E)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        if (f.n(fVar) != null) {
            obtain2.setParent(view, f.a(f.n(fVar)));
        } else {
            obtain2.setParent(view);
        }
        if (f.o(fVar) != -1) {
            obtain2.setTraversalAfter(view, f.o(fVar));
        }
        Rect d4 = f.d(fVar);
        if (f.n(fVar) != null) {
            Rect d5 = f.d(f.n(fVar));
            Rect rect = new Rect(d4);
            rect.offset(-d5.left, -d5.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(d4);
        }
        Rect rect2 = new Rect(d4);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        obtain2.setEnabled(!f.g(fVar, 7) || f.g(fVar, 8));
        if (f.j(fVar, d.f6437m)) {
            if (f.p(fVar) != null) {
                str3 = f.p(fVar).f6454e;
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, str3));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (f.g(fVar, 24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (f.j(fVar, d.f6438n)) {
            if (f.q(fVar) != null) {
                str2 = f.q(fVar).f6454e;
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, str2));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        d dVar = d.f6439o;
        boolean j4 = f.j(fVar, dVar);
        d dVar2 = d.f6442r;
        d dVar3 = d.f6441q;
        d dVar4 = d.f6440p;
        if (j4 || f.j(fVar, dVar3) || f.j(fVar, dVar4) || f.j(fVar, dVar2)) {
            obtain2.setScrollable(true);
            if (f.g(fVar, 19)) {
                if (f.j(fVar, dVar) || f.j(fVar, dVar4)) {
                    if (k(fVar)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, f.b(fVar), false));
                    } else {
                        obtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (k(fVar)) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(f.b(fVar), 0, false));
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (f.j(fVar, dVar) || f.j(fVar, dVar3)) {
                obtain2.addAction(4096);
            }
            if (f.j(fVar, dVar4) || f.j(fVar, dVar2)) {
                obtain2.addAction(8192);
            }
        }
        d dVar5 = d.s;
        boolean j5 = f.j(fVar, dVar5);
        d dVar6 = d.f6443t;
        if (j5 || f.j(fVar, dVar6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (f.j(fVar, dVar5)) {
                obtain2.addAction(4096);
            }
            if (f.j(fVar, dVar6)) {
                obtain2.addAction(8192);
            }
        }
        if (f.g(fVar, 16)) {
            obtain2.setLiveRegion(1);
        }
        if (f.g(fVar, 5)) {
            obtain2.setText(f.r(fVar));
            if (i7 >= 28) {
                obtain2.setHintText(f.s(fVar));
            }
        } else if (!f.g(fVar, 12)) {
            CharSequence t4 = f.t(fVar);
            if (i7 < 28 && f.u(fVar) != null) {
                t4 = ((Object) (t4 != null ? t4 : "")) + "\n" + f.u(fVar);
            }
            if (t4 != null) {
                obtain2.setContentDescription(t4);
            }
        }
        if (i7 >= 28 && f.u(fVar) != null) {
            obtain2.setTooltipText(f.u(fVar));
            if (f.t(fVar) == null) {
                obtain2.setContentDescription(f.u(fVar));
            }
        }
        boolean g4 = f.g(fVar, 1);
        boolean g5 = f.g(fVar, 17);
        obtain2.setCheckable(g4 || g5);
        if (g4) {
            obtain2.setChecked(f.g(fVar, 2));
            if (f.g(fVar, 9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (g5) {
            obtain2.setChecked(f.g(fVar, 18));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(f.g(fVar, 3));
        if (i7 >= 36 && f.g(fVar, 27)) {
            obtain2.setExpandedState(f.g(fVar, 28) ? 3 : 1);
            if (f.j(fVar, d.f6435I)) {
                obtain2.addAction(262144);
            }
            if (f.j(fVar, d.J)) {
                obtain2.addAction(524288);
            }
        }
        if (i7 >= 28) {
            obtain2.setHeading(f.v(fVar) > 0);
        }
        f fVar5 = this.f6515i;
        if (fVar5 == null || f.a(fVar5) != i4) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        if (f.w(fVar) != null) {
            Iterator it = f.w(fVar).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                i5 = eVar.f6450a;
                str = eVar.f6453d;
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(i5, str));
            }
        }
        Iterator it2 = f.x(fVar).iterator();
        while (it2.hasNext()) {
            f fVar6 = (f) it2.next();
            if (!f.g(fVar6, 14)) {
                if (f.c(fVar6) != -1) {
                    SurfaceView K4 = iVar.K(f.c(fVar6));
                    if (!iVar.r(f.c(fVar6))) {
                        K4.setImportantForAccessibility(0);
                        obtain2.addChild(K4);
                    }
                }
                obtain2.addChild(view, f.a(fVar6));
            }
        }
        return obtain2;
    }

    public final AccessibilityEvent e(int i4, int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        View view = this.f6507a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i4);
        return obtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z4) {
        f E3;
        if (!this.f6509c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f6513g;
        if (hashMap.isEmpty()) {
            return false;
        }
        f E4 = ((f) hashMap.get(0)).E(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z4);
        if (E4 != null && E4.f6490i != -1) {
            if (z4) {
                return false;
            }
            return this.f6510d.onAccessibilityHoverEvent(E4.f6482b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x3 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (!hashMap.isEmpty() && (E3 = ((f) hashMap.get(0)).E(new float[]{x3, y4, 0.0f, 1.0f}, z4)) != this.f6522p) {
                if (E3 != null) {
                    h(E3.f6482b, 128);
                }
                f fVar = this.f6522p;
                if (fVar != null) {
                    h(fVar.f6482b, 256);
                }
                this.f6522p = E3;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            f fVar2 = this.f6522p;
            if (fVar2 != null) {
                h(fVar2.f6482b, 256);
                this.f6522p = null;
            }
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i4) {
        if (i4 == 1) {
            f fVar = this.f6520n;
            if (fVar != null) {
                return createAccessibilityNodeInfo(fVar.f6482b);
            }
            Integer num = this.f6517k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i4 != 2) {
            return null;
        }
        f fVar2 = this.f6515i;
        if (fVar2 != null) {
            return createAccessibilityNodeInfo(fVar2.f6482b);
        }
        Integer num2 = this.f6516j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g(f fVar, int i4, Bundle bundle, boolean z4) {
        int i5;
        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i7 = fVar.f6488g;
        int i8 = fVar.f6489h;
        if (i8 >= 0 && i7 >= 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 == 8 || i6 == 16) {
                            if (z4) {
                                fVar.f6489h = fVar.f6499r.length();
                            } else {
                                fVar.f6489h = 0;
                            }
                        }
                    } else if (z4 && i8 < fVar.f6499r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(fVar.f6499r.substring(fVar.f6489h));
                        if (matcher.find()) {
                            fVar.f6489h += matcher.start(1);
                        } else {
                            fVar.f6489h = fVar.f6499r.length();
                        }
                    } else if (!z4 && fVar.f6489h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(fVar.f6499r.substring(0, fVar.f6489h));
                        if (matcher2.find()) {
                            fVar.f6489h = matcher2.start(1);
                        } else {
                            fVar.f6489h = 0;
                        }
                    }
                } else if (z4 && i8 < fVar.f6499r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(fVar.f6499r.substring(fVar.f6489h));
                    matcher3.find();
                    if (matcher3.find()) {
                        fVar.f6489h += matcher3.start(1);
                    } else {
                        fVar.f6489h = fVar.f6499r.length();
                    }
                } else if (!z4 && fVar.f6489h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(fVar.f6499r.substring(0, fVar.f6489h));
                    if (matcher4.find()) {
                        fVar.f6489h = matcher4.start(1);
                    }
                }
            } else if (z4 && i8 < fVar.f6499r.length()) {
                fVar.f6489h++;
            } else if (!z4 && (i5 = fVar.f6489h) > 0) {
                fVar.f6489h = i5 - 1;
            }
            if (!z5) {
                fVar.f6488g = fVar.f6489h;
            }
        }
        if (i7 != fVar.f6488g || i8 != fVar.f6489h) {
            String str = fVar.f6499r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent e4 = e(fVar.f6482b, 8192);
            e4.getText().add(str);
            e4.setFromIndex(fVar.f6488g);
            e4.setToIndex(fVar.f6489h);
            e4.setItemCount(str.length());
            i(e4);
        }
        t tVar = this.f6508b;
        if (i6 == 1) {
            if (z4) {
                d dVar = d.f6445v;
                if (f.j(fVar, dVar)) {
                    tVar.Z(i4, dVar, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                d dVar2 = d.w;
                if (f.j(fVar, dVar2)) {
                    tVar.Z(i4, dVar2, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 2) {
            if (z4) {
                d dVar3 = d.f6432F;
                if (f.j(fVar, dVar3)) {
                    tVar.Z(i4, dVar3, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                d dVar4 = d.f6433G;
                if (f.j(fVar, dVar4)) {
                    tVar.Z(i4, dVar4, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 4 || i6 == 8 || i6 == 16) {
            return true;
        }
        return false;
    }

    public final void h(int i4, int i5) {
        if (this.f6509c.isEnabled()) {
            i(e(i4, i5));
        }
    }

    public final void i(AccessibilityEvent accessibilityEvent) {
        if (this.f6509c.isEnabled()) {
            View view = this.f6507a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void j(boolean z4) {
        if (this.f6525t == z4) {
            return;
        }
        this.f6525t = z4;
        if (z4) {
            this.f6518l |= 1;
        } else {
            this.f6518l &= -2;
        }
        ((FlutterJNI) this.f6508b.f3735n).setAccessibilityFeatures(this.f6518l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(io.flutter.view.f r3) {
        /*
            r2 = this;
            int r0 = r3.f6491j
            if (r0 <= 0) goto L31
            io.flutter.view.f r0 = r2.f6515i
            r1 = 0
            if (r0 == 0) goto L17
            io.flutter.view.f r0 = r0.f6471R
        Lb:
            if (r0 == 0) goto L13
            if (r0 != r3) goto L10
            goto L14
        L10:
            io.flutter.view.f r0 = r0.f6471R
            goto Lb
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            goto L2f
        L17:
            io.flutter.view.f r3 = r2.f6515i
            if (r3 == 0) goto L2f
            io.flutter.view.f r3 = r3.f6471R
        L1d:
            if (r3 == 0) goto L2c
            r0 = 19
            boolean r0 = r3.D(r0)
            if (r0 == 0) goto L29
            r1 = r3
            goto L2c
        L29:
            io.flutter.view.f r3 = r3.f6471R
            goto L1d
        L2c:
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.g.k(io.flutter.view.f):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i5, Bundle bundle) {
        if (i4 >= 65536) {
            boolean performAction = this.f6510d.performAction(i4, i5, bundle);
            if (performAction && i5 == 128) {
                this.f6516j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f6513g;
        f fVar = (f) hashMap.get(Integer.valueOf(i4));
        if (fVar == null) {
            return false;
        }
        d dVar = d.s;
        d dVar2 = d.f6443t;
        t tVar = this.f6508b;
        switch (i5) {
            case 16:
                tVar.Y(i4, d.f6437m);
                return true;
            case 32:
                tVar.Y(i4, d.f6438n);
                return true;
            case 64:
                if (this.f6515i == null) {
                    this.f6507a.invalidate();
                }
                this.f6515i = fVar;
                tVar.Y(i4, d.f6428B);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(fVar.f6482b));
                ((C0044m) tVar.f3734m).q(hashMap2, null);
                h(i4, 32768);
                if (f.j(fVar, dVar) || f.j(fVar, dVar2)) {
                    h(i4, 4);
                }
                return true;
            case 128:
                f fVar2 = this.f6515i;
                if (fVar2 != null && fVar2.f6482b == i4) {
                    this.f6515i = null;
                }
                Integer num = this.f6516j;
                if (num != null && num.intValue() == i4) {
                    this.f6516j = null;
                }
                tVar.Y(i4, d.f6429C);
                h(i4, 65536);
                return true;
            case 256:
                return g(fVar, i4, bundle, true);
            case 512:
                return g(fVar, i4, bundle, false);
            case 4096:
                d dVar3 = d.f6441q;
                if (f.j(fVar, dVar3)) {
                    tVar.Y(i4, dVar3);
                } else {
                    d dVar4 = d.f6439o;
                    if (f.j(fVar, dVar4)) {
                        tVar.Y(i4, dVar4);
                    } else {
                        if (!f.j(fVar, dVar)) {
                            return false;
                        }
                        fVar.f6499r = fVar.f6500t;
                        fVar.s = fVar.f6501u;
                        h(i4, 4);
                        tVar.Y(i4, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.f6442r;
                if (f.j(fVar, dVar5)) {
                    tVar.Y(i4, dVar5);
                } else {
                    d dVar6 = d.f6440p;
                    if (f.j(fVar, dVar6)) {
                        tVar.Y(i4, dVar6);
                    } else {
                        if (!f.j(fVar, dVar2)) {
                            return false;
                        }
                        fVar.f6499r = fVar.f6502v;
                        fVar.s = fVar.w;
                        h(i4, 4);
                        tVar.Y(i4, dVar2);
                    }
                }
                return true;
            case 16384:
                tVar.Y(i4, d.f6447y);
                return true;
            case 32768:
                tVar.Y(i4, d.f6427A);
                return true;
            case 65536:
                tVar.Y(i4, d.f6448z);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(fVar.f6489h));
                    hashMap3.put("extent", Integer.valueOf(fVar.f6489h));
                }
                tVar.Z(i4, d.f6446x, hashMap3);
                f fVar3 = (f) hashMap.get(Integer.valueOf(i4));
                fVar3.f6488g = ((Integer) hashMap3.get("base")).intValue();
                fVar3.f6489h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                tVar.Y(i4, d.f6435I);
                return true;
            case 524288:
                tVar.Y(i4, d.J);
                return true;
            case 1048576:
                tVar.Y(i4, d.f6431E);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                tVar.Z(i4, d.f6434H, string);
                fVar.f6499r = string;
                fVar.s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                tVar.Y(i4, d.f6444u);
                return true;
            default:
                e eVar = (e) this.f6514h.get(Integer.valueOf(i5 - 267386881));
                if (eVar == null) {
                    return false;
                }
                tVar.Z(i4, d.f6430D, Integer.valueOf(eVar.f6451b));
                return true;
        }
    }
}
