package android.support.v4.media.session;

import B2.AbstractActivityC0003d;
import B2.B;
import B2.E;
import B2.x;
import C.AbstractC0018e;
import I.C0044m;
import L.k;
import R2.C0070f;
import R2.C0072h;
import R2.InterfaceC0071g;
import R2.K;
import R2.L;
import R2.M;
import R2.O;
import T.C0094o;
import T.C0095p;
import T.H;
import W.y;
import a.AbstractC0110a;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.t;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import com.prology.R;
import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.MediaButtonReceiver;
import d1.C0234d;
import e1.G;
import e1.InterfaceC0256B;
import f.AbstractC0266a;
import f2.AbstractC0275C;
import f2.I;
import f2.Y;
import f2.c0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugins.urllauncher.WebViewActivity;
import j0.C0372a;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k1.AbstractC0379a;
import m.AbstractC0409a;
import m.AbstractC0410b;
import m.AbstractC0411c;
import n.C0443f;
import n.C0446i;
import org.xmlpull.v1.XmlPullParserException;
import p1.AbstractC0462a;
import q0.T;
import r.C0496a;
import r.C0498c;
import s2.C0548e;
import t.AbstractC0558e;
import t.InterfaceC0554a;
import t2.C0570a;
import u.AbstractC0575c;
import w0.C0591a;
import y0.F;
import y0.z;

/* loaded from: classes.dex */
public final class t implements L2.i, L2.d, InterfaceC0071g, u3.d, y0.q, V0.d, InterfaceC0256B, j0.j, L2.o {

    /* renamed from: p, reason: collision with root package name */
    public static int f3731p;

    /* renamed from: q, reason: collision with root package name */
    public static t f3732q;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3733l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3734m;

    /* renamed from: n, reason: collision with root package name */
    public Object f3735n;

    /* renamed from: o, reason: collision with root package name */
    public Object f3736o;

    public /* synthetic */ t(int i4, boolean z4) {
        this.f3733l = i4;
    }

    public static void C0(L2.f fVar, final t tVar) {
        S2.c cVar = S2.c.f2055d;
        F1.g gVar = null;
        C0044m c0044m = new C0044m(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar, gVar);
        if (tVar != null) {
            final int i4 = 0;
            c0044m.r(new L2.b(tVar) { // from class: S2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ t f2057m;

                {
                    this.f2057m = tVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            t tVar2 = this.f2057m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, tVar2.T((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.c0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            t tVar3 = this.f2057m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.c0(th2);
                            }
                            if (((AbstractActivityC0003d) tVar3.f3736o) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0003d) tVar3.f3736o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", t.c0(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            dVar.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            t tVar4 = this.f2057m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, tVar4.t0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.c0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            t tVar5 = this.f2057m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, tVar5.D0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.c0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        default:
                            t tVar6 = this.f2057m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                tVar6.getClass();
                                ((Context) tVar6.f3734m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0110a.c0(th5);
                            }
                            dVar.e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0044m.r(null);
        }
        C0044m c0044m2 = new C0044m(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar, gVar);
        if (tVar != null) {
            final int i5 = 1;
            c0044m2.r(new L2.b(tVar) { // from class: S2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ t f2057m;

                {
                    this.f2057m = tVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            t tVar2 = this.f2057m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, tVar2.T((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.c0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            t tVar3 = this.f2057m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.c0(th2);
                            }
                            if (((AbstractActivityC0003d) tVar3.f3736o) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0003d) tVar3.f3736o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", t.c0(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            dVar.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            t tVar4 = this.f2057m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, tVar4.t0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.c0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            t tVar5 = this.f2057m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, tVar5.D0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.c0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        default:
                            t tVar6 = this.f2057m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                tVar6.getClass();
                                ((Context) tVar6.f3734m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0110a.c0(th5);
                            }
                            dVar.e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0044m2.r(null);
        }
        C0044m c0044m3 = new C0044m(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar, gVar);
        if (tVar != null) {
            final int i6 = 2;
            c0044m3.r(new L2.b(tVar) { // from class: S2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ t f2057m;

                {
                    this.f2057m = tVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    Boolean bool;
                    switch (i6) {
                        case 0:
                            t tVar2 = this.f2057m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, tVar2.T((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.c0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            t tVar3 = this.f2057m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.c0(th2);
                            }
                            if (((AbstractActivityC0003d) tVar3.f3736o) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0003d) tVar3.f3736o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", t.c0(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            dVar.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            t tVar4 = this.f2057m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, tVar4.t0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.c0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            t tVar5 = this.f2057m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, tVar5.D0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.c0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        default:
                            t tVar6 = this.f2057m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                tVar6.getClass();
                                ((Context) tVar6.f3734m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0110a.c0(th5);
                            }
                            dVar.e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0044m3.r(null);
        }
        C0044m c0044m4 = new C0044m(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar, gVar);
        if (tVar != null) {
            final int i7 = 3;
            c0044m4.r(new L2.b(tVar) { // from class: S2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ t f2057m;

                {
                    this.f2057m = tVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    Boolean bool;
                    switch (i7) {
                        case 0:
                            t tVar2 = this.f2057m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, tVar2.T((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.c0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            t tVar3 = this.f2057m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.c0(th2);
                            }
                            if (((AbstractActivityC0003d) tVar3.f3736o) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0003d) tVar3.f3736o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", t.c0(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            dVar.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            t tVar4 = this.f2057m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, tVar4.t0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.c0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            t tVar5 = this.f2057m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, tVar5.D0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.c0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        default:
                            t tVar6 = this.f2057m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                tVar6.getClass();
                                ((Context) tVar6.f3734m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0110a.c0(th5);
                            }
                            dVar.e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0044m4.r(null);
        }
        C0044m c0044m5 = new C0044m(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar, gVar);
        if (tVar == null) {
            c0044m5.r(null);
        } else {
            final int i8 = 4;
            c0044m5.r(new L2.b(tVar) { // from class: S2.d

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ t f2057m;

                {
                    this.f2057m = tVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            t tVar2 = this.f2057m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, tVar2.T((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.c0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            t tVar3 = this.f2057m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.c0(th2);
                            }
                            if (((AbstractActivityC0003d) tVar3.f3736o) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0003d) tVar3.f3736o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", t.c0(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            dVar.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            t tVar4 = this.f2057m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, tVar4.t0((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.c0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            t tVar5 = this.f2057m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, tVar5.D0());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.c0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        default:
                            t tVar6 = this.f2057m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                tVar6.getClass();
                                ((Context) tVar6.f3734m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0110a.c0(th5);
                            }
                            dVar.e(arrayList7);
                            return;
                    }
                }
            });
        }
    }

    public static Bundle E0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b0(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void b0(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(t.class.getClassLoader());
        }
    }

    public static Bundle c0(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, A2.a, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v0, types: [F2.f, java.lang.Object] */
    public static t n0() {
        if (f3732q == null) {
            Object obj = new Object();
            ?? obj2 = new Object();
            obj2.f80a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(obj2);
            FlutterJNI flutterJNI = new FlutterJNI();
            ?? obj3 = new Object();
            obj3.f643a = false;
            obj3.f647e = flutterJNI;
            obj3.f648f = newCachedThreadPool;
            t tVar = new t(1, false);
            tVar.f3734m = obj3;
            tVar.f3735n = obj;
            tVar.f3736o = newCachedThreadPool;
            f3732q = tVar;
        }
        return f3732q;
    }

    public static t q0(Context context, AttributeSet attributeSet, int[] iArr, int i4) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    public static void y0(Activity activity, t tVar) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, tVar);
        activity.setMediaController(tVar != null ? new MediaController(activity, (MediaSession.Token) ((MediaSessionCompat$Token) tVar.f3735n).f3675m) : null);
    }

    @Override // j0.j
    public void A(int i4) {
        ((MediaCodec) this.f3734m).setVideoScalingMode(i4);
    }

    public void A0(ArrayList arrayList) {
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) it.next();
                if (mediaSessionCompat$QueueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j4 = mediaSessionCompat$QueueItem.f3671m;
                if (hashSet.contains(Long.valueOf(j4))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + j4, new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j4));
            }
        }
        o oVar = (o) this.f3734m;
        oVar.f3723g = arrayList;
        MediaSession mediaSession = oVar.f3717a;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) it2.next();
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.f3672n;
            if (queueItem == null) {
                queueItem = r.a(mediaSessionCompat$QueueItem2.f3670l.e(), mediaSessionCompat$QueueItem2.f3671m);
                mediaSessionCompat$QueueItem2.f3672n = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    @Override // V0.d
    public long B(int i4) {
        W.a.e(i4 >= 0);
        long[] jArr = (long[]) this.f3736o;
        W.a.e(i4 < jArr.length);
        return jArr[i4];
    }

    public void B0(L2.i iVar) {
        ((L2.f) this.f3734m).g((String) this.f3735n, iVar == null ? null : new t(this, iVar));
    }

    @Override // u3.d
    public Object C(u3.e eVar, InterfaceC0190d interfaceC0190d) {
        Object C4 = ((u3.d) this.f3734m).C(new R2.r(eVar, (M.d) this.f3735n, (K) this.f3736o), interfaceC0190d);
        return C4 == EnumC0225a.f4710l ? C4 : Z2.g.f3186a;
    }

    @Override // R2.InterfaceC0071g
    public void D(String str, boolean z4, C0072h c0072h) {
        V(c0072h).edit().putBoolean(str, z4).apply();
    }

    public Boolean D0() {
        String str;
        List emptyList = Collections.emptyList();
        PackageManager packageManager = ((Context) this.f3734m).getPackageManager();
        List arrayList = emptyList == null ? new ArrayList() : emptyList;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (emptyList != null) {
                arrayList2.addAll(emptyList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        return Boolean.valueOf(str != null);
    }

    @Override // L2.i
    public void E() {
        F1.k kVar;
        Context context = (Context) this.f3735n;
        if (context == null || (kVar = (F1.k) this.f3736o) == null) {
            return;
        }
        context.unregisterReceiver(kVar);
    }

    @Override // R2.InterfaceC0071g
    public Map F(List list, C0072h c0072h) {
        Object value;
        Map<String, ?> all = V(c0072h).getAll();
        k3.h.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (L.b(entry.getKey(), entry.getValue(), list != null ? a3.d.j0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c4 = L.c(value, (F1.g) this.f3736o);
                k3.h.c(c4, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c4);
            }
        }
        return hashMap;
    }

    @Override // R2.InterfaceC0071g
    public void G(String str, double d4, C0072h c0072h) {
        V(c0072h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).apply();
    }

    @Override // L2.i
    public void H(Object obj, L2.h hVar) {
        if (((Context) this.f3735n) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        F1.k kVar = new F1.k(hVar);
        this.f3736o = kVar;
        AbstractC0462a.K((Context) this.f3735n, kVar, intentFilter);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
    
        if (q3.i.p0(r4, "generic") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0275, code lost:
    
        if (r3.equals("init") == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191 A[LOOP:1: B:23:0x018b->B:25:0x0191, LOOP_END] */
    @Override // L2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(L2.n r13, K2.k r14) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.t.I(L2.n, K2.k):void");
    }

    @Override // R2.InterfaceC0071g
    public void J(String str, List list, C0072h c0072h) {
        V(c0072h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((F1.g) this.f3736o).s(list))).apply();
    }

    @Override // R2.InterfaceC0071g
    public Double K(String str, C0072h c0072h) {
        SharedPreferences V3 = V(c0072h);
        if (!V3.contains(str)) {
            return null;
        }
        Object c4 = L.c(V3.getString(str, ""), (F1.g) this.f3736o);
        k3.h.c(c4, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c4;
    }

    @Override // R2.InterfaceC0071g
    public Long L(String str, C0072h c0072h) {
        long j4;
        SharedPreferences V3 = V(c0072h);
        if (!V3.contains(str)) {
            return null;
        }
        try {
            j4 = V3.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j4 = V3.getInt(str, 0);
        }
        return Long.valueOf(j4);
    }

    @Override // j0.j
    public MediaFormat M() {
        return ((MediaCodec) this.f3734m).getOutputFormat();
    }

    @Override // R2.InterfaceC0071g
    public O N(String str, C0072h c0072h) {
        SharedPreferences V3 = V(c0072h);
        if (!V3.contains(str)) {
            return null;
        }
        String string = V3.getString(str, "");
        k3.h.b(string);
        return q3.i.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new O(string, M.f1795o) : q3.i.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new O(null, M.f1794n) : new O(null, M.f1796p);
    }

    @Override // R2.InterfaceC0071g
    public void O(String str, String str2, C0072h c0072h) {
        V(c0072h).edit().putString(str, str2).apply();
    }

    @Override // R2.InterfaceC0071g
    public List P(List list, C0072h c0072h) {
        Map<String, ?> all = V(c0072h).getAll();
        k3.h.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            k3.h.d(key, "<get-key>(...)");
            if (L.b(key, entry.getValue(), list != null ? a3.d.j0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return a3.d.h0(linkedHashMap.keySet());
    }

    @Override // V0.d
    public int Q() {
        return ((long[]) this.f3736o).length;
    }

    @Override // L2.d
    public void R(ByteBuffer byteBuffer, D2.g gVar) {
        t tVar = (t) this.f3736o;
        L2.n c4 = ((L2.v) tVar.f3736o).c(byteBuffer);
        String str = c4.f1094a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f3735n;
        Object obj = c4.f1095b;
        String str2 = (String) tVar.f3735n;
        L2.v vVar = (L2.v) tVar.f3736o;
        L2.i iVar = (L2.i) this.f3734m;
        if (!equals) {
            if (!str.equals("cancel")) {
                gVar.a(null);
                return;
            }
            if (((L2.g) atomicReference.getAndSet(null)) == null) {
                gVar.a(vVar.f("error", "No active stream to cancel", null));
                return;
            }
            try {
                iVar.E();
                gVar.a(vVar.b(null));
                return;
            } catch (RuntimeException e4) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e4);
                gVar.a(vVar.f("error", e4.getMessage(), null));
                return;
            }
        }
        L2.h hVar = new L2.h(this);
        if (((L2.g) atomicReference.getAndSet(hVar)) != null) {
            try {
                iVar.E();
            } catch (RuntimeException e5) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e5);
            }
        }
        try {
            iVar.H(obj, hVar);
            gVar.a(vVar.b(null));
        } catch (RuntimeException e6) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e6);
            gVar.a(vVar.f("error", e6.getMessage(), null));
        }
    }

    public String S(String str, long j4, int i4, long j5) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3734m;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f3736o;
            if (i5 >= size) {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((String) arrayList2.get(i5));
            if (((Integer) arrayList.get(i5)).intValue() == 1) {
                sb.append(str);
            } else {
                int intValue = ((Integer) arrayList.get(i5)).intValue();
                ArrayList arrayList3 = (ArrayList) this.f3735n;
                if (intValue == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i5), Long.valueOf(j4)));
                } else if (((Integer) arrayList.get(i5)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i5), Integer.valueOf(i4)));
                } else if (((Integer) arrayList.get(i5)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i5), Long.valueOf(j5)));
                }
            }
            i5++;
        }
    }

    public Boolean T(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((x) this.f3735n).f214m).getPackageManager());
        return (resolveActivity == null ? null : resolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    public void U(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f3735n;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f3736o).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences V(C0072h c0072h) {
        String str = c0072h.f1813a;
        Context context = (Context) this.f3735n;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            k3.h.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        k3.h.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void W(boolean z4) {
        for (O.d dVar : ((O.g) this.f3734m).f()) {
            if (dVar != null && z4) {
                dVar.f1338n.W(true);
            }
        }
    }

    public void X(boolean z4) {
        for (O.d dVar : ((O.g) this.f3734m).f()) {
            if (dVar != null && z4) {
                dVar.f1338n.X(true);
            }
        }
    }

    public void Y(int i4, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f3735n).dispatchSemanticsAction(i4, dVar);
    }

    public void Z(int i4, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f3735n).dispatchSemanticsAction(i4, dVar, serializable);
    }

    @Override // e1.InterfaceC0256B
    public void a(W.w wVar, y0.q qVar, G g4) {
        this.f3735n = wVar;
        g4.a();
        g4.c();
        F v4 = qVar.v(g4.f5142c, 5);
        this.f3736o = v4;
        v4.c((C0095p) this.f3734m);
    }

    public void a0() {
        HashMap hashMap = (HashMap) this.f3736o;
        Iterator it = new ArrayList(hashMap.values()).iterator();
        while (it.hasNext()) {
            ((C0570a) it.next()).H();
        }
        hashMap.clear();
    }

    @Override // j0.j
    public void b(int i4, Z.b bVar, long j4, int i5) {
        ((MediaCodec) this.f3734m).queueSecureInputBuffer(i4, 0, bVar.f3136i, j4, i5);
    }

    @Override // j0.j
    public void c(Bundle bundle) {
        ((MediaCodec) this.f3734m).setParameters(bundle);
    }

    @Override // e1.InterfaceC0256B
    public void d(W.r rVar) {
        long d4;
        long j4;
        W.a.k((W.w) this.f3735n);
        int i4 = y.f2709a;
        W.w wVar = (W.w) this.f3735n;
        synchronized (wVar) {
            try {
                long j5 = wVar.f2706c;
                d4 = j5 != -9223372036854775807L ? j5 + wVar.f2705b : wVar.d();
            } finally {
            }
        }
        W.w wVar2 = (W.w) this.f3735n;
        synchronized (wVar2) {
            j4 = wVar2.f2705b;
        }
        if (d4 == -9223372036854775807L || j4 == -9223372036854775807L) {
            return;
        }
        C0095p c0095p = (C0095p) this.f3734m;
        if (j4 != c0095p.f2330r) {
            C0094o a4 = c0095p.a();
            a4.f2295q = j4;
            C0095p c0095p2 = new C0095p(a4);
            this.f3734m = c0095p2;
            ((F) this.f3736o).c(c0095p2);
        }
        int a5 = rVar.a();
        ((F) this.f3736o).a(rVar, a5, 0);
        ((F) this.f3736o).b(d4, 1, a5, 0, null);
    }

    public int d0(int i4, int i5) {
        ArrayList arrayList = (ArrayList) this.f3735n;
        int size = arrayList.size();
        while (i5 < size) {
            ((AbstractC0379a) arrayList.get(i5)).getClass();
            i5++;
        }
        return i4;
    }

    @Override // j0.j
    public void e(int i4, int i5, long j4, int i6) {
        ((MediaCodec) this.f3734m).queueInputBuffer(i4, 0, i5, j4, i6);
    }

    public ColorStateList e0(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f3735n;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            Object obj = AbstractC0266a.f5451a;
            ColorStateList colorStateList = ((Context) this.f3734m).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i4);
    }

    @Override // j0.j
    public int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f3734m;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && y.f2709a < 21) {
                this.f3736o = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public long f0() {
        y0.l lVar = (y0.l) this.f3736o;
        if (lVar != null) {
            return lVar.f9089o;
        }
        return -1L;
    }

    @Override // j0.j
    public void flush() {
        ((MediaCodec) this.f3734m).flush();
    }

    @Override // V0.d
    public int g(long j4) {
        long[] jArr = (long[]) this.f3736o;
        int b4 = y.b(jArr, j4, false);
        if (b4 < jArr.length) {
            return b4;
        }
        return -1;
    }

    public Drawable g0(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f3735n;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) ? typedArray.getDrawable(i4) : AbstractC0266a.a((Context) this.f3734m, resourceId);
    }

    @Override // R2.InterfaceC0071g
    public void h(List list, C0072h c0072h) {
        SharedPreferences V3 = V(c0072h);
        SharedPreferences.Editor edit = V3.edit();
        k3.h.d(edit, "edit(...)");
        Map<String, ?> all = V3.getAll();
        k3.h.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (L.b(str, all.get(str), list != null ? a3.d.j0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        k3.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            k3.h.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    public Typeface h0(int i4, int i5, S0.g gVar) {
        int i6 = 12;
        int resourceId = ((TypedArray) this.f3735n).getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f3736o) == null) {
            this.f3736o = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f3736o;
        Object obj = AbstractC0558e.f8287a;
        Context context = (Context) this.f3734m;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            gVar.b();
            return null;
        }
        int i7 = typedValue.assetCookie;
        C0446i c0446i = AbstractC0575c.f8477b;
        Typeface typeface = (Typeface) c0446i.a(AbstractC0575c.b(resources, resourceId, charSequence2, i7, i5));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new W.m(i6, gVar, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                InterfaceC0554a w = U1.a.w(resources.getXml(resourceId), resources);
                if (w != null) {
                    return AbstractC0575c.a(context, w, resources, resourceId, charSequence2, typedValue.assetCookie, i5, gVar);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                gVar.b();
                return null;
            }
            int i8 = typedValue.assetCookie;
            Typeface f4 = AbstractC0575c.f8476a.f(context, resources, resourceId, charSequence2, i5);
            if (f4 != null) {
                c0446i.b(AbstractC0575c.b(resources, resourceId, charSequence2, i8, i5), f4);
            }
            if (f4 != null) {
                new Handler(Looper.getMainLooper()).post(new W.m(i6, gVar, f4));
            } else {
                gVar.b();
            }
            return f4;
        } catch (IOException e4) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e4);
            gVar.b();
            return null;
        } catch (XmlPullParserException e5) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e5);
            gVar.b();
            return null;
        }
    }

    @Override // R2.InterfaceC0071g
    public void i(String str, String str2, C0072h c0072h) {
        V(c0072h).edit().putString(str, str2).apply();
    }

    public View i0(int i4) {
        return ((RecyclerView) ((Y) this.f3734m).f5535m).getChildAt(i4);
    }

    @Override // j0.j
    public void j(long j4, int i4) {
        ((MediaCodec) this.f3734m).releaseOutputBuffer(i4, j4);
    }

    public int j0() {
        return ((RecyclerView) ((Y) this.f3734m).f5535m).getChildCount();
    }

    @Override // j0.j
    public ByteBuffer k(int i4) {
        return y.f2709a >= 21 ? ((MediaCodec) this.f3734m).getInputBuffer(i4) : ((ByteBuffer[]) this.f3735n)[i4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [B2.D, java.lang.Object] */
    public boolean k0(KeyEvent keyEvent) {
        if (((HashSet) this.f3735n).remove(keyEvent)) {
            return false;
        }
        B2.F[] fArr = (B2.F[]) this.f3734m;
        if (fArr.length <= 0) {
            r0(keyEvent);
            return true;
        }
        E e4 = new E(this, keyEvent);
        for (B b4 : fArr) {
            ?? obj = new Object();
            obj.f116b = e4;
            obj.f115a = false;
            b4.b(keyEvent, obj);
        }
        return true;
    }

    @Override // j0.j
    public void l(Surface surface) {
        ((MediaCodec) this.f3734m).setOutputSurface(surface);
    }

    public boolean l0() {
        String trim;
        if (((String) this.f3736o) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f3735n;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f3736o = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f3734m).readLine();
            this.f3736o = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f3736o = trim;
        } while (trim.isEmpty());
        return true;
    }

    @Override // R2.InterfaceC0071g
    public Boolean m(String str, C0072h c0072h) {
        SharedPreferences V3 = V(c0072h);
        if (V3.contains(str)) {
            return Boolean.valueOf(V3.getBoolean(str, true));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [f2.F, f2.C] */
    public void m0(Y.h hVar, Uri uri, Map map, long j4, long j5, T t4) {
        boolean z4;
        boolean z5 = true;
        y0.l lVar = new y0.l(hVar, j4, j5);
        this.f3736o = lVar;
        if (((y0.o) this.f3735n) != null) {
            return;
        }
        y0.o[] a4 = ((y0.r) this.f3734m).a(uri, map);
        int length = a4.length;
        f2.G g4 = I.f5510m;
        f2.r.e("expectedSize", length);
        ?? abstractC0275C = new AbstractC0275C(length);
        if (a4.length == 1) {
            this.f3735n = a4[0];
        } else {
            int length2 = a4.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                y0.o oVar = a4[i4];
                try {
                } catch (EOFException unused) {
                    z4 = ((y0.o) this.f3735n) != null || lVar.f9089o == j4;
                } catch (Throwable th) {
                    if (((y0.o) this.f3735n) == null && lVar.f9089o != j4) {
                        z5 = false;
                    }
                    W.a.j(z5);
                    lVar.f9091q = 0;
                    throw th;
                }
                if (oVar.k(lVar)) {
                    this.f3735n = oVar;
                    lVar.f9091q = 0;
                    break;
                } else {
                    abstractC0275C.d(oVar.j());
                    z4 = ((y0.o) this.f3735n) != null || lVar.f9089o == j4;
                    W.a.j(z4);
                    lVar.f9091q = 0;
                    i4++;
                }
            }
            if (((y0.o) this.f3735n) == null) {
                String str = "None of the available extractors (" + new e2.f(", ").b(f2.r.w(I.k(a4), new b0.d(16))) + ") could read the stream.";
                uri.getClass();
                c0 g5 = abstractC0275C.g();
                T.I i5 = new T.I(str, null, false, 1);
                I.j(g5);
                throw i5;
            }
        }
        ((y0.o) this.f3735n).g(t4);
    }

    @Override // R2.InterfaceC0071g
    public String n(String str, C0072h c0072h) {
        SharedPreferences V3 = V(c0072h);
        if (V3.contains(str)) {
            return V3.getString(str, "");
        }
        return null;
    }

    @Override // j0.j
    public void o(w0.l lVar, Handler handler) {
        ((MediaCodec) this.f3734m).setOnFrameRenderedListener(new C0372a(this, lVar, 1), handler);
    }

    public boolean o0() {
        return ((o) this.f3734m).f3717a.isActive();
    }

    @Override // R2.InterfaceC0071g
    public void p(String str, long j4, C0072h c0072h) {
        V(c0072h).edit().putLong(str, j4).apply();
    }

    public String p0() {
        if (!l0()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f3736o;
        this.f3736o = null;
        return str;
    }

    @Override // j0.j
    public void r(int i4, boolean z4) {
        ((MediaCodec) this.f3734m).releaseOutputBuffer(i4, z4);
    }

    public void r0(KeyEvent keyEvent) {
        InputConnection inputConnection;
        B2.G g4 = (B2.G) this.f3736o;
        if (g4 != null) {
            io.flutter.plugin.editing.k kVar = ((B2.u) g4).f209v;
            boolean z4 = false;
            if (kVar.f6301b.isAcceptingText() && (inputConnection = kVar.f6309j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.d) {
                    io.flutter.plugin.editing.d dVar = (io.flutter.plugin.editing.d) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z4 = dVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z4 = dVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z4 = dVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z4 = dVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = dVar.f6266e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    dVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z4 = true;
                                }
                            }
                            io.flutter.plugin.editing.g gVar = dVar.f6265d;
                            int selectionStart = Selection.getSelectionStart(gVar);
                            int selectionEnd = Selection.getSelectionEnd(gVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = Math.min(selectionStart, selectionEnd);
                                int max = Math.max(selectionStart, selectionEnd);
                                dVar.beginBatchEdit();
                                if (min != max) {
                                    gVar.delete(min, max);
                                }
                                gVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                                int i4 = min + 1;
                                dVar.setSelection(i4, i4);
                                dVar.endBatchEdit();
                                z4 = true;
                            }
                        }
                    }
                } else {
                    z4 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (z4) {
                return;
            }
            HashSet hashSet = (HashSet) this.f3735n;
            hashSet.add(keyEvent);
            ((B2.u) g4).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    @Override // j0.j
    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.f3734m;
        this.f3735n = null;
        this.f3736o = null;
        try {
            int i4 = y.f2709a;
            if (i4 >= 30 && i4 < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // y0.q
    public void s() {
        ((y0.q) this.f3734m).s();
    }

    public void s0(Activity activity, u1.j jVar) {
        k3.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f3735n;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f3736o;
        try {
            if (jVar.equals((u1.j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((x1.j) ((C0591a) this.f3734m).f8747l).f8985b.iterator();
            while (it.hasNext()) {
                x1.i iVar = (x1.i) it.next();
                if (iVar.f8979a.equals(activity)) {
                    iVar.f8981c = jVar;
                    iVar.f8980b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // y0.q
    public void t(z zVar) {
        ((y0.q) this.f3734m).t(zVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0069. Please report as an issue. */
    public Boolean t0(String str, Boolean bool, S2.e eVar, S2.a aVar) {
        ActivityOptions activityOptions;
        if (((AbstractActivityC0003d) this.f3736o) == null) {
            throw new S2.b();
        }
        Bundle c02 = c0(eVar.f2060c);
        if (bool.booleanValue()) {
            Iterator it = eVar.f2060c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    char c4 = 65535;
                    switch (lowerCase.hashCode()) {
                        case -1423461112:
                            if (!lowerCase.equals("accept")) {
                                break;
                            } else {
                                c4 = 0;
                                break;
                            }
                        case -1229727188:
                            if (!lowerCase.equals("content-language")) {
                                break;
                            } else {
                                c4 = 1;
                                break;
                            }
                        case 785670158:
                            if (!lowerCase.equals("content-type")) {
                                break;
                            } else {
                                c4 = 2;
                                break;
                            }
                        case 802785917:
                            if (!lowerCase.equals("accept-language")) {
                                break;
                            } else {
                                c4 = 3;
                                break;
                            }
                    }
                    switch (c4) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) this.f3736o;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f2053a.booleanValue() ? 1 : 0);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    int i4 = Build.VERSION.SDK_INT;
                    String a4 = AbstractC0410b.a();
                    if (!TextUtils.isEmpty(a4)) {
                        Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                        if (!bundleExtra.containsKey("Accept-Language")) {
                            bundleExtra.putString("Accept-Language", a4);
                            intent.putExtra("com.android.browser.headers", bundleExtra);
                        }
                    }
                    if (i4 >= 34) {
                        activityOptions = AbstractC0409a.a();
                        AbstractC0411c.a(activityOptions, false);
                    } else {
                        activityOptions = null;
                    }
                    Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
                    intent.putExtra("com.android.browser.headers", c02);
                    try {
                        intent.setData(parse);
                        abstractActivityC0003d.startActivity(intent, bundle2);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        AbstractActivityC0003d abstractActivityC0003d2 = (AbstractActivityC0003d) this.f3736o;
        boolean booleanValue = eVar.f2058a.booleanValue();
        boolean booleanValue2 = eVar.f2059b.booleanValue();
        int i5 = WebViewActivity.f6418p;
        try {
            ((AbstractActivityC0003d) this.f3736o).startActivity(new Intent(abstractActivityC0003d2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", c02));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public String toString() {
        switch (this.f3733l) {
            case 9:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            case 24:
                return ((G0.c) this.f3735n).toString() + ", hidden list:" + ((ArrayList) this.f3736o).size();
            default:
                return super.toString();
        }
    }

    @Override // j0.j
    public ByteBuffer u(int i4) {
        return y.f2709a >= 21 ? ((MediaCodec) this.f3734m).getOutputBuffer(i4) : ((ByteBuffer[]) this.f3736o)[i4];
    }

    public void u0() {
        ((TypedArray) this.f3735n).recycle();
    }

    @Override // y0.q
    public F v(int i4, int i5) {
        y0.q qVar = (y0.q) this.f3734m;
        if (i5 != 3) {
            return qVar.v(i4, i5);
        }
        SparseArray sparseArray = (SparseArray) this.f3736o;
        V0.o oVar = (V0.o) sparseArray.get(i4);
        if (oVar != null) {
            return oVar;
        }
        V0.o oVar2 = new V0.o(qVar.v(i4, i5), (V0.j) this.f3735n);
        sparseArray.put(i4, oVar2);
        return oVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = r3.f84l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f84l = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v0(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L42
            java.lang.Object r2 = r8.get(r1)
            k1.a r2 = (k1.AbstractC0379a) r2
            r2.getClass()
            java.lang.Object r3 = r7.f3734m
            B.c r3 = (B.c) r3
            r3.getClass()
            java.lang.String r4 = "instance"
            k3.h.e(r2, r4)
            int r4 = r3.f84l
            r5 = 0
        L1f:
            java.lang.Object r6 = r3.f85m
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r5 >= r4) goto L34
            r6 = r6[r5]
            if (r6 == r2) goto L2c
            int r5 = r5 + 1
            goto L1f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r8.<init>(r0)
            throw r8
        L34:
            int r4 = r3.f84l
            int r5 = r6.length
            if (r4 >= r5) goto L3f
            r6[r4] = r2
            int r4 = r4 + 1
            r3.f84l = r4
        L3f:
            int r1 = r1 + 1
            goto L5
        L42:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.t.v0(java.util.ArrayList):void");
    }

    @Override // V0.d
    public List w(long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (true) {
            List list = (List) this.f3734m;
            if (i4 >= list.size()) {
                break;
            }
            int i5 = i4 * 2;
            long[] jArr = (long[]) this.f3735n;
            if (jArr[i5] <= j4 && j4 < jArr[i5 + 1]) {
                C0234d c0234d = (C0234d) list.get(i4);
                V.b bVar = c0234d.f4946a;
                if (bVar.f2566e == -3.4028235E38f) {
                    arrayList2.add(c0234d);
                } else {
                    arrayList.add(bVar);
                }
            }
            i4++;
        }
        Collections.sort(arrayList2, new W0.d(3));
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            V.b bVar2 = ((C0234d) arrayList2.get(i6)).f4946a;
            arrayList.add(new V.b(bVar2.f2562a, bVar2.f2563b, bVar2.f2564c, bVar2.f2565d, (-1) - i6, 1, bVar2.f2568g, bVar2.f2569h, bVar2.f2570i, bVar2.f2575n, bVar2.f2576o, bVar2.f2571j, bVar2.f2572k, bVar2.f2573l, bVar2.f2574m, bVar2.f2577p, bVar2.f2578q));
        }
        return arrayList;
    }

    public void w0(C0548e c0548e) {
        if (c0548e == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.f3736o).add(c0548e)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        c0548e.b(handler);
        h hVar = (h) this.f3734m;
        hVar.f3704a.registerCallback(c0548e.f8234a, handler);
        synchronized (hVar.f3705b) {
            if (hVar.f3708e.d() != null) {
                g gVar = new g(c0548e);
                hVar.f3707d.put(c0548e, gVar);
                c0548e.f8236c = gVar;
                try {
                    hVar.f3708e.d().k(gVar);
                    c0548e.a(13, null, null);
                } catch (RemoteException e4) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e4);
                }
            } else {
                c0548e.f8236c = null;
                hVar.f3706c.add(c0548e);
            }
        }
    }

    @Override // R2.InterfaceC0071g
    public ArrayList x(String str, C0072h c0072h) {
        List list;
        SharedPreferences V3 = V(c0072h);
        ArrayList arrayList = null;
        if (V3.contains(str)) {
            String string = V3.getString(str, "");
            k3.h.b(string);
            if (q3.i.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !q3.i.p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) L.c(V3.getString(str, ""), (F1.g) this.f3736o)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public void x0(boolean z4) {
        ((o) this.f3734m).f3717a.setActive(z4);
        Iterator it = ((ArrayList) this.f3736o).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // j0.j
    public int z() {
        return ((MediaCodec) this.f3734m).dequeueInputBuffer(0L);
    }

    public void z0(PlaybackStateCompat playbackStateCompat) {
        o oVar = (o) this.f3734m;
        oVar.f3722f = playbackStateCompat;
        synchronized (oVar.f3720d) {
            for (int beginBroadcast = oVar.f3721e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) oVar.f3721e.getBroadcastItem(beginBroadcast)).a0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            oVar.f3721e.finishBroadcast();
        }
        MediaSession mediaSession = oVar.f3717a;
        if (playbackStateCompat.w == null) {
            PlaybackState.Builder d4 = u.d();
            u.x(d4, playbackStateCompat.f3683l, playbackStateCompat.f3684m, playbackStateCompat.f3686o, playbackStateCompat.s);
            u.u(d4, playbackStateCompat.f3685n);
            u.s(d4, playbackStateCompat.f3687p);
            u.v(d4, playbackStateCompat.f3689r);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f3690t) {
                PlaybackState.CustomAction customAction2 = customAction.f3697p;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e4 = u.e(customAction.f3693l, customAction.f3694m, customAction.f3695n);
                    u.w(e4, customAction.f3696o);
                    customAction2 = u.b(e4);
                }
                u.a(d4, customAction2);
            }
            u.t(d4, playbackStateCompat.f3691u);
            v.b(d4, playbackStateCompat.f3692v);
            playbackStateCompat.w = u.c(d4);
        }
        mediaSession.setPlaybackState(playbackStateCompat.w);
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i4) {
        this.f3733l = i4;
        this.f3734m = obj;
        this.f3735n = obj2;
        this.f3736o = obj3;
    }

    public t(Context context, L2.f fVar) {
        this.f3733l = 27;
        this.f3736o = new HashMap();
        this.f3734m = context;
        this.f3735n = fVar;
    }

    public t(ArrayList arrayList) {
        this.f3733l = 17;
        this.f3734m = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f3735n = new long[arrayList.size() * 2];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0234d c0234d = (C0234d) arrayList.get(i4);
            int i5 = i4 * 2;
            long[] jArr = (long[]) this.f3735n;
            jArr[i5] = c0234d.f4947b;
            jArr[i5 + 1] = c0234d.f4948c;
        }
        long[] jArr2 = (long[]) this.f3735n;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f3736o = copyOf;
        Arrays.sort(copyOf);
    }

    public t(String str) {
        this.f3733l = 19;
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l(str);
        this.f3734m = new C0095p(c0094o);
    }

    public t(L2.f fVar, String str) {
        this.f3733l = 7;
        L2.v vVar = L2.v.f1099a;
        this.f3734m = fVar;
        this.f3735n = str;
        this.f3736o = vVar;
    }

    public t(Y y4) {
        this.f3733l = 24;
        this.f3734m = y4;
        this.f3735n = new G0.c(5);
        this.f3736o = new ArrayList();
    }

    public t(y0.q qVar, V0.j jVar) {
        this.f3733l = 14;
        this.f3734m = qVar;
        this.f3735n = jVar;
        this.f3736o = new SparseArray();
    }

    public t(Context context) {
        this.f3733l = 13;
        x xVar = new x(8, context);
        this.f3734m = context;
        this.f3735n = xVar;
    }

    public t(y0.r rVar) {
        this.f3733l = 25;
        this.f3734m = rVar;
    }

    public t(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f3733l = 18;
        this.f3736o = arrayList;
        this.f3734m = arrayList2;
        this.f3735n = arrayList3;
    }

    public t(Context context, TypedArray typedArray) {
        this.f3733l = 21;
        this.f3734m = context;
        this.f3735n = typedArray;
    }

    public t(C0498c c0498c) {
        Bundle bundle;
        int i4;
        ArrayList arrayList;
        Bundle bundle2;
        int i5;
        this.f3733l = 26;
        new ArrayList();
        this.f3736o = new Bundle();
        this.f3735n = c0498c;
        Context context = c0498c.f7959a;
        Notification.Builder builder = new Notification.Builder(context, c0498c.f7975q);
        this.f3734m = builder;
        Notification notification = c0498c.s;
        Resources resources = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0498c.f7963e).setContentText(c0498c.f7964f).setContentInfo(null).setContentIntent(c0498c.f7965g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        IconCompat iconCompat = c0498c.f7966h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        builder.setSubText(c0498c.f7970l).setUsesChronometer(false).setPriority(c0498c.f7967i);
        Iterator it = c0498c.f7960b.iterator();
        while (it.hasNext()) {
            C0496a c0496a = (C0496a) it.next();
            int i6 = Build.VERSION.SDK_INT;
            if (c0496a.f7952b == null && (i5 = c0496a.f7955e) != 0) {
                c0496a.f7952b = IconCompat.b(null, "", i5);
            }
            IconCompat iconCompat2 = c0496a.f7952b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.e(null) : null, c0496a.f7956f, c0496a.f7957g);
            Bundle bundle3 = c0496a.f7951a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z4 = c0496a.f7953c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            builder2.setAllowGeneratedReplies(z4);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i6 >= 28) {
                AbstractC0018e.m(builder2);
            }
            if (i6 >= 29) {
                r.d.d(builder2);
            }
            if (i6 >= 31) {
                r.e.c(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0496a.f7954d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f3734m).addAction(builder2.build());
        }
        Bundle bundle4 = c0498c.f7972n;
        if (bundle4 != null) {
            ((Bundle) this.f3736o).putAll(bundle4);
        }
        int i7 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f3734m).setShowWhen(c0498c.f7968j);
        ((Notification.Builder) this.f3734m).setLocalOnly(c0498c.f7971m);
        ((Notification.Builder) this.f3734m).setGroup(null);
        ((Notification.Builder) this.f3734m).setSortKey(null);
        ((Notification.Builder) this.f3734m).setGroupSummary(false);
        ((Notification.Builder) this.f3734m).setCategory(null);
        ((Notification.Builder) this.f3734m).setColor(c0498c.f7973o);
        ((Notification.Builder) this.f3734m).setVisibility(c0498c.f7974p);
        ((Notification.Builder) this.f3734m).setPublicVersion(null);
        ((Notification.Builder) this.f3734m).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = c0498c.f7977t;
        ArrayList arrayList3 = c0498c.f7961c;
        if (i7 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C0443f c0443f = new C0443f(arrayList2.size() + arrayList.size());
                    c0443f.addAll(arrayList);
                    c0443f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c0443f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) this.f3734m).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = c0498c.f7962d;
        if (arrayList4.size() > 0) {
            if (c0498c.f7972n == null) {
                c0498c.f7972n = new Bundle();
            }
            Bundle bundle5 = c0498c.f7972n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList4.size()) {
                String num = Integer.toString(i8);
                C0496a c0496a2 = (C0496a) arrayList4.get(i8);
                Bundle bundle8 = new Bundle();
                if (c0496a2.f7952b == null && (i4 = c0496a2.f7955e) != 0) {
                    c0496a2.f7952b = IconCompat.b(resources, "", i4);
                }
                IconCompat iconCompat3 = c0496a2.f7952b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", c0496a2.f7956f);
                bundle8.putParcelable("actionIntent", c0496a2.f7957g);
                Bundle bundle9 = c0496a2.f7951a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0496a2.f7953c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c0496a2.f7954d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i8++;
                resources = null;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (c0498c.f7972n == null) {
                c0498c.f7972n = new Bundle();
            }
            c0498c.f7972n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f3736o).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i9 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f3734m).setExtras(c0498c.f7972n);
        ((Notification.Builder) this.f3734m).setRemoteInputHistory(null);
        ((Notification.Builder) this.f3734m).setBadgeIconType(0);
        ((Notification.Builder) this.f3734m).setSettingsText(null);
        ((Notification.Builder) this.f3734m).setShortcutId(null);
        ((Notification.Builder) this.f3734m).setTimeoutAfter(0L);
        ((Notification.Builder) this.f3734m).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(c0498c.f7975q)) {
            ((Notification.Builder) this.f3734m).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i9 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i9 >= 29) {
            r.d.b((Notification.Builder) this.f3734m, c0498c.f7976r);
            r.d.c((Notification.Builder) this.f3734m);
        }
    }

    public t(F1.g gVar) {
        this.f3733l = 23;
        this.f3734m = new B.c(30);
        this.f3736o = new ArrayList();
        this.f3735n = new ArrayList();
        new L1.g(24, this);
    }

    public t(MediaCodec mediaCodec) {
        this.f3733l = 22;
        this.f3734m = mediaCodec;
        if (y.f2709a < 21) {
            this.f3735n = mediaCodec.getInputBuffers();
            this.f3736o = mediaCodec.getOutputBuffers();
        }
    }

    public t(D2.b bVar, FlutterJNI flutterJNI) {
        this.f3733l = 4;
        B2.r rVar = new B2.r(13, this);
        C0044m c0044m = new C0044m(bVar, "flutter/accessibility", L2.u.f1096a, null);
        this.f3734m = c0044m;
        c0044m.r(rVar);
        this.f3735n = flutterJNI;
    }

    public t(B2.G g4) {
        this.f3733l = 2;
        this.f3735n = new HashSet();
        this.f3736o = g4;
        B2.u uVar = (B2.u) g4;
        this.f3734m = new B2.F[]{new B(uVar.getBinaryMessenger()), new B1.d(new K2.b(uVar.getBinaryMessenger()))};
        new B2.r(uVar.getBinaryMessenger()).f185m = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, U.g] */
    public t(U.d[] dVarArr) {
        this.f3733l = 16;
        c0.O o2 = new c0.O();
        ?? obj = new Object();
        obj.f2500c = 1.0f;
        obj.f2501d = 1.0f;
        U.b bVar = U.b.f2465e;
        obj.f2502e = bVar;
        obj.f2503f = bVar;
        obj.f2504g = bVar;
        obj.f2505h = bVar;
        ByteBuffer byteBuffer = U.d.f2470a;
        obj.f2508k = byteBuffer;
        obj.f2509l = byteBuffer.asShortBuffer();
        obj.f2510m = byteBuffer;
        obj.f2499b = -1;
        U.d[] dVarArr2 = new U.d[dVarArr.length + 2];
        this.f3734m = dVarArr2;
        System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
        this.f3735n = o2;
        this.f3736o = obj;
        dVarArr2[dVarArr.length] = o2;
        dVarArr2[dVarArr.length + 1] = obj;
    }

    public t(int i4) {
        this.f3733l = i4;
        switch (i4) {
            case 9:
                this.f3736o = new ArrayList();
                this.f3734m = new O.g(0);
                new ArrayList();
                new L1.g(this);
                this.f3735n = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new ArrayList();
                k3.h.e(this, "fragmentManager");
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                final int i5 = 0;
                new B.a(this) { // from class: O.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t f1348b;

                    {
                        this.f1348b = this;
                    }

                    @Override // B.a
                    public final void accept(Object obj) {
                        switch (i5) {
                            case 0:
                                t tVar = this.f1348b;
                                tVar.getClass();
                                tVar.W(false);
                                return;
                            case 1:
                                t tVar2 = this.f1348b;
                                tVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    tVar2.X(false);
                                    return;
                                }
                                return;
                            case k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                        }
                    }
                };
                final int i6 = 1;
                new B.a(this) { // from class: O.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t f1348b;

                    {
                        this.f1348b = this;
                    }

                    @Override // B.a
                    public final void accept(Object obj) {
                        switch (i6) {
                            case 0:
                                t tVar = this.f1348b;
                                tVar.getClass();
                                tVar.W(false);
                                return;
                            case 1:
                                t tVar2 = this.f1348b;
                                tVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    tVar2.X(false);
                                    return;
                                }
                                return;
                            case k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                        }
                    }
                };
                final int i7 = 2;
                new B.a(this) { // from class: O.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t f1348b;

                    {
                        this.f1348b = this;
                    }

                    @Override // B.a
                    public final void accept(Object obj) {
                        switch (i7) {
                            case 0:
                                t tVar = this.f1348b;
                                tVar.getClass();
                                tVar.W(false);
                                return;
                            case 1:
                                t tVar2 = this.f1348b;
                                tVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    tVar2.X(false);
                                    return;
                                }
                                return;
                            case k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                        }
                    }
                };
                final int i8 = 3;
                new B.a(this) { // from class: O.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t f1348b;

                    {
                        this.f1348b = this;
                    }

                    @Override // B.a
                    public final void accept(Object obj) {
                        switch (i8) {
                            case 0:
                                t tVar = this.f1348b;
                                tVar.getClass();
                                tVar.W(false);
                                return;
                            case 1:
                                t tVar2 = this.f1348b;
                                tVar2.getClass();
                                if (((Integer) obj).intValue() == 80) {
                                    tVar2.X(false);
                                    return;
                                }
                                return;
                            case k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                this.f1348b.getClass();
                                throw null;
                        }
                    }
                };
                new ArrayDeque();
                new F.b(5, this);
                return;
            default:
                this.f3734m = new ConcurrentLinkedQueue();
                return;
        }
    }

    public t(t tVar, L2.i iVar) {
        this.f3733l = 6;
        this.f3736o = tVar;
        this.f3735n = new AtomicReference(null);
        this.f3734m = iVar;
    }

    public t(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f3733l = 15;
        if (mediaSessionCompat$Token != null) {
            this.f3736o = Collections.synchronizedSet(new HashSet());
            this.f3735n = mediaSessionCompat$Token;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3734m = new h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f3734m = new h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public t(L2.f fVar, Context context, F1.g gVar) {
        this.f3733l = 11;
        k3.h.e(fVar, "messenger");
        k3.h.e(context, "context");
        this.f3734m = fVar;
        this.f3735n = context;
        this.f3736o = gVar;
        try {
            InterfaceC0071g.f1812b.getClass();
            C0070f.b(fVar, this, "shared_preferences");
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e4);
        }
    }

    public t(C0591a c0591a) {
        this.f3733l = 28;
        this.f3734m = c0591a;
        this.f3735n = new ReentrantLock();
        this.f3736o = new WeakHashMap();
    }

    public t(AudioService audioService) {
        ComponentName componentName;
        this.f3733l = 0;
        this.f3736o = new ArrayList();
        if (!TextUtils.isEmpty("media-session")) {
            int i4 = MediaButtonReceiver.f4801a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(audioService.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = audioService.getPackageManager().queryBroadcastReceivers(intent, 0);
            PendingIntent pendingIntent = null;
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (queryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(audioService, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 29) {
                this.f3734m = new o(audioService);
            } else if (i5 >= 28) {
                this.f3734m = new o(audioService);
            } else {
                this.f3734m = new o(audioService);
            }
            ((o) this.f3734m).e(new m(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            ((o) this.f3734m).f3717a.setMediaButtonReceiver(pendingIntent);
            this.f3735n = new t(audioService, ((o) this.f3734m).f3719c);
            if (f3731p == 0) {
                f3731p = (int) (TypedValue.applyDimension(1, 320.0f, audioService.getResources().getDisplayMetrics()) + 0.5f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public t(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f3733l = 20;
        this.f3735n = arrayDeque;
        this.f3734m = bufferedReader;
    }
}
