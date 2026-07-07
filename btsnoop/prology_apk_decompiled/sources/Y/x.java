package Y;

import T.C0087h;
import T.C0095p;
import T.H;
import a0.AbstractC0121a;
import a0.a0;
import a0.b0;
import a0.d0;
import a0.e0;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.prology.R;
import d1.C0232b;
import e.AbstractC0248a;
import e1.G;
import e1.InterfaceC0256B;
import f.AbstractC0266a;
import f2.I;
import f2.Y;
import f2.c0;
import j.C0360o;
import j.l0;
import j0.C0373b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import l0.InterfaceC0402a;
import m0.C0413B;
import m0.C0414C;
import m0.C0425f;
import m0.C0426g;
import m0.C0432m;
import m0.RunnableC0431l;
import m0.RunnableC0434o;
import p1.AbstractC0462a;
import q0.C0491x;
import q0.F;
import q0.J;
import q0.Z;
import u1.C0582b;

/* loaded from: classes.dex */
public final class x implements N1.j, L2.o, J, f0.f, V0.l, y0.i, InterfaceC0256B, h0.p, io.flutter.plugin.platform.i, K2.j, j0.i, u0.p, y0.q, u1.h, u3.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3064l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3065m;

    /* renamed from: n, reason: collision with root package name */
    public Object f3066n;

    public /* synthetic */ x(char c4, int i4) {
        this.f3064l = i4;
    }

    @Override // K2.j
    public void A(int i4) {
        io.flutter.plugin.platform.n nVar = (io.flutter.plugin.platform.n) this.f3066n;
        if (nVar.K(i4) != null) {
            nVar.f6357A.A(i4);
        } else {
            ((io.flutter.plugin.platform.o) this.f3065m).f6379H.A(i4);
        }
    }

    @Override // y0.i
    public y0.h B(y0.l lVar, long j4) {
        int a4;
        y0.h hVar;
        long j5 = lVar.f9089o;
        int min = (int) Math.min(20000L, lVar.f9088n - j5);
        W.r rVar = (W.r) this.f3066n;
        rVar.D(min);
        lVar.p(rVar.f2694a, 0, min, false);
        int i4 = -1;
        int i5 = -1;
        long j6 = -9223372036854775807L;
        while (rVar.a() >= 4) {
            if (D0.b.a(rVar.f2694a, rVar.f2695b) != 442) {
                rVar.H(1);
            } else {
                rVar.H(4);
                long c4 = e1.y.c(rVar);
                if (c4 != -9223372036854775807L) {
                    long b4 = ((W.w) this.f3065m).b(c4);
                    if (b4 > j4) {
                        if (j6 == -9223372036854775807L) {
                            return new y0.h(-1, b4, j5);
                        }
                        hVar = new y0.h(0, -9223372036854775807L, j5 + i5);
                    } else if (100000 + b4 > j4) {
                        hVar = new y0.h(0, -9223372036854775807L, j5 + rVar.f2695b);
                    } else {
                        i5 = rVar.f2695b;
                        j6 = b4;
                    }
                    return hVar;
                }
                int i6 = rVar.f2696c;
                if (rVar.a() >= 10) {
                    rVar.H(9);
                    int u4 = rVar.u() & 7;
                    if (rVar.a() >= u4) {
                        rVar.H(u4);
                        if (rVar.a() >= 4) {
                            if (D0.b.a(rVar.f2694a, rVar.f2695b) == 443) {
                                rVar.H(4);
                                int A4 = rVar.A();
                                if (rVar.a() < A4) {
                                    rVar.G(i6);
                                } else {
                                    rVar.H(A4);
                                }
                            }
                            while (true) {
                                if (rVar.a() < 4 || (a4 = D0.b.a(rVar.f2694a, rVar.f2695b)) == 442 || a4 == 441 || (a4 >>> 8) != 1) {
                                    break;
                                }
                                rVar.H(4);
                                if (rVar.a() < 2) {
                                    rVar.G(i6);
                                    break;
                                }
                                rVar.G(Math.min(rVar.f2696c, rVar.f2695b + rVar.A()));
                            }
                        } else {
                            rVar.G(i6);
                        }
                    } else {
                        rVar.G(i6);
                    }
                } else {
                    rVar.G(i6);
                }
                i4 = rVar.f2695b;
            }
        }
        return j6 != -9223372036854775807L ? new y0.h(-2, j6, j5 + i4) : y0.h.f9069d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Type inference failed for: r0v6, types: [k3.m, java.lang.Object] */
    @Override // u3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(u3.e r7, b3.InterfaceC0190d r8) {
        /*
            r6 = this;
            int r0 = r6.f3064l
            switch(r0) {
                case 28: goto L23;
                default: goto L5;
            }
        L5:
            k3.m r0 = new k3.m
            r0.<init>()
            R2.r r1 = new R2.r
            java.lang.Object r2 = r6.f3066n
            I.q r2 = (I.C0048q) r2
            r1.<init>(r0, r7, r2)
            java.lang.Object r7 = r6.f3065m
            u3.m r7 = (u3.m) r7
            java.lang.Object r7 = r7.C(r1, r8)
            c3.a r8 = c3.EnumC0225a.f4710l
            if (r7 != r8) goto L20
            goto L22
        L20:
            Z2.g r7 = Z2.g.f3186a
        L22:
            return r7
        L23:
            boolean r0 = r8 instanceof u3.j
            if (r0 == 0) goto L36
            r0 = r8
            u3.j r0 = (u3.j) r0
            int r1 = r0.f8620p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L36
            int r1 = r1 - r2
            r0.f8620p = r1
            goto L3b
        L36:
            u3.j r0 = new u3.j
            r0.<init>(r6, r8)
        L3b:
            java.lang.Object r8 = r0.f8619o
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f8620p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L63
            if (r2 == r4) goto L57
            if (r2 != r3) goto L4f
            p1.AbstractC0462a.P(r8)
            Z2.g r1 = Z2.g.f3186a
            goto L99
        L4f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L57:
            v3.n r7 = r0.f8623t
            u3.e r2 = r0.s
            Y.x r4 = r0.f8622r
            p1.AbstractC0462a.P(r8)     // Catch: java.lang.Throwable -> L61
            goto L86
        L61:
            r8 = move-exception
            goto L9e
        L63:
            p1.AbstractC0462a.P(r8)
            v3.n r8 = new v3.n
            b3.i r2 = r0.f4989m
            k3.h.b(r2)
            r8.<init>(r7, r2)
            java.lang.Object r2 = r6.f3065m     // Catch: java.lang.Throwable -> L9a
            I.o r2 = (I.C0046o) r2     // Catch: java.lang.Throwable -> L9a
            r0.f8622r = r6     // Catch: java.lang.Throwable -> L9a
            r0.s = r7     // Catch: java.lang.Throwable -> L9a
            r0.f8623t = r8     // Catch: java.lang.Throwable -> L9a
            r0.f8620p = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r2.h(r8, r0)     // Catch: java.lang.Throwable -> L9a
            if (r2 != r1) goto L83
            goto L99
        L83:
            r4 = r6
            r2 = r7
            r7 = r8
        L86:
            r7.m()
            java.lang.Object r7 = r4.f3066n
            u3.q r7 = (u3.q) r7
            r8 = 0
            r0.f8622r = r8
            r0.s = r8
            r0.f8623t = r8
            r0.f8620p = r3
            r7.C(r2, r0)
        L99:
            return r1
        L9a:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L9e:
            r7.m()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.x.C(u3.e, b3.d):java.lang.Object");
    }

    @Override // q0.J
    public void D(int i4, F f4, C0491x c0491x, n0.g gVar) {
        Pair R3 = R(i4, f4);
        if (R3 != null) {
            ((e0) this.f3066n).f3442i.c(new a0(this, R3, c0491x, gVar, 2));
        }
    }

    @Override // y0.i
    public void E() {
        byte[] bArr = W.y.f2714f;
        W.r rVar = (W.r) this.f3066n;
        rVar.getClass();
        rVar.E(bArr, bArr.length);
    }

    @Override // q0.J
    public void H(int i4, F f4, C0491x c0491x, n0.g gVar) {
        Pair R3 = R(i4, f4);
        if (R3 != null) {
            ((e0) this.f3066n).f3442i.c(new a0(this, R3, c0491x, gVar, 0));
        }
    }

    @Override // L2.o
    public void I(L2.n nVar, K2.k kVar) {
        Toast toast;
        k3.h.e(nVar, "call");
        String str = nVar.f1094a;
        if (!k3.h.a(str, "showToast")) {
            if (!k3.h.a(str, "cancel")) {
                kVar.c();
                return;
            }
            Toast toast2 = (Toast) this.f3066n;
            if (toast2 != null) {
                toast2.cancel();
                this.f3066n = null;
            }
            kVar.b(Boolean.TRUE);
            return;
        }
        String valueOf = String.valueOf(nVar.a("msg"));
        String valueOf2 = String.valueOf(nVar.a("length"));
        String valueOf3 = String.valueOf(nVar.a("gravity"));
        Number number = (Number) nVar.a("bgcolor");
        Number number2 = (Number) nVar.a("textcolor");
        Number number3 = (Number) nVar.a("fontSize");
        String str2 = (String) nVar.a("fontAsset");
        int i4 = valueOf3.equals("top") ? 48 : valueOf3.equals("center") ? 17 : 80;
        boolean equals = valueOf2.equals("long");
        Context context = (Context) this.f3065m;
        if (number != null) {
            Object systemService = context.getSystemService("layout_inflater");
            k3.h.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            textView.setText(valueOf);
            Drawable drawable = context.getDrawable(R.drawable.corner);
            k3.h.b(drawable);
            drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
            textView.setBackground(drawable);
            if (number3 != null) {
                textView.setTextSize(number3.floatValue());
            }
            if (number2 != null) {
                textView.setTextColor(number2.intValue());
            }
            Toast toast3 = new Toast(context);
            this.f3066n = toast3;
            toast3.setDuration(equals ? 1 : 0);
            if (str2 != null) {
                AssetManager assets = context.getAssets();
                k3.h.d(assets, "getAssets(...)");
                String a4 = ((F2.f) android.support.v4.media.session.t.n0().f3734m).a(str2);
                k3.h.d(a4, "getLookupKeyForAsset(...)");
                textView.setTypeface(Typeface.createFromAsset(assets, a4));
            }
            Toast toast4 = (Toast) this.f3066n;
            if (toast4 != null) {
                toast4.setView(inflate);
            }
        } else {
            Log.d("KARTHIK", "showToast: " + number + " " + number2 + " " + number3 + " " + str2);
            Toast makeText = Toast.makeText(context, valueOf, equals ? 1 : 0);
            this.f3066n = makeText;
            if (Build.VERSION.SDK_INT < 30) {
                View view = makeText != null ? makeText.getView() : null;
                k3.h.b(view);
                View findViewById = view.findViewById(android.R.id.message);
                k3.h.d(findViewById, "findViewById(...)");
                TextView textView2 = (TextView) findViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    AssetManager assets2 = context.getAssets();
                    k3.h.d(assets2, "getAssets(...)");
                    String a5 = ((F2.f) android.support.v4.media.session.t.n0().f3734m).a(str2);
                    k3.h.d(a5, "getLookupKeyForAsset(...)");
                    textView2.setTypeface(Typeface.createFromAsset(assets2, a5));
                }
            }
        }
        try {
            if (i4 == 17) {
                Toast toast5 = (Toast) this.f3066n;
                if (toast5 != null) {
                    toast5.setGravity(i4, 0, 0);
                }
            } else if (i4 != 48) {
                Toast toast6 = (Toast) this.f3066n;
                if (toast6 != null) {
                    toast6.setGravity(i4, 0, 100);
                }
            } else {
                Toast toast7 = (Toast) this.f3066n;
                if (toast7 != null) {
                    toast7.setGravity(i4, 0, 100);
                }
            }
        } catch (Exception unused) {
        }
        if (context instanceof Activity) {
            k3.h.c(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new F2.c(1, this));
        } else {
            Toast toast8 = (Toast) this.f3066n;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (toast = (Toast) this.f3066n) != null) {
            toast.addCallback(new Y2.b(this));
        }
        kVar.b(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:19:0x004d, B:23:0x005a, B:24:0x005c, B:30:0x0069, B:33:0x007e, B:36:0x00a9, B:37:0x0123, B:41:0x00ce, B:44:0x0071, B:45:0x0072, B:26:0x005d, B:28:0x0063), top: B:18:0x004d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:19:0x004d, B:23:0x005a, B:24:0x005c, B:30:0x0069, B:33:0x007e, B:36:0x00a9, B:37:0x0123, B:41:0x00ce, B:44:0x0071, B:45:0x0072, B:26:0x005d, B:28:0x0063), top: B:18:0x004d, inners: #0 }] */
    @Override // N1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.x.J(java.lang.Object, java.lang.Object):void");
    }

    @Override // io.flutter.plugin.platform.i
    public SurfaceView K(int i4) {
        io.flutter.plugin.platform.n nVar = (io.flutter.plugin.platform.n) this.f3066n;
        return nVar.K(i4) != null ? nVar.K(i4) : ((io.flutter.plugin.platform.o) this.f3065m).K(i4);
    }

    @Override // q0.J
    public void L(int i4, F f4, C0491x c0491x, n0.g gVar, IOException iOException, boolean z4) {
        Pair R3 = R(i4, f4);
        if (R3 != null) {
            ((e0) this.f3066n).f3442i.c(new b0(this, R3, c0491x, gVar, iOException, z4, 0));
        }
    }

    public void M() {
        l0 l0Var;
        ImageView imageView = (ImageView) this.f3065m;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = j.B.f6553a;
        }
        if (drawable == null || (l0Var = (l0) this.f3066n) == null) {
            return;
        }
        C0360o.c(drawable, l0Var, imageView.getDrawableState());
    }

    public void N() {
        this.f3065m = null;
        this.f3066n = null;
    }

    @Override // j0.i
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public j0.c G(j0.h hVar) {
        MediaCodec mediaCodec;
        j0.k y4;
        int i4;
        j0.c cVar;
        String str = hVar.f6827a.f6833a;
        j0.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                C0095p c0095p = hVar.f6829c;
                int i5 = W.y.f2709a;
                try {
                    if (i5 >= 34) {
                        if (i5 < 35) {
                            if (H.k(c0095p.f2325m)) {
                            }
                        }
                        y4 = new Y(12, mediaCodec);
                        i4 = 4;
                        cVar = new j0.c(mediaCodec, (HandlerThread) ((C0373b) this.f3065m).get(), y4);
                        Trace.endSection();
                        j0.c.a(cVar, hVar.f6828b, hVar.f6830d, hVar.f6831e, i4);
                        return cVar;
                    }
                    Trace.endSection();
                    j0.c.a(cVar, hVar.f6828b, hVar.f6830d, hVar.f6831e, i4);
                    return cVar;
                } catch (Exception e4) {
                    e = e4;
                    cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                y4 = new j0.e(mediaCodec, (HandlerThread) ((C0373b) this.f3066n).get());
                i4 = 0;
                cVar = new j0.c(mediaCodec, (HandlerThread) ((C0373b) this.f3065m).get(), y4);
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e6) {
            e = e6;
            mediaCodec = null;
        }
    }

    public View P(int i4, int i5, int i6, int i7) {
        int s;
        int i8;
        int t4;
        View o2;
        int left;
        int i9;
        int right;
        int i10;
        k1.r rVar = (k1.r) this.f3065m;
        switch (rVar.f7025a) {
            case 0:
                s = rVar.f7026b.s();
                break;
            default:
                s = rVar.f7026b.u();
                break;
        }
        switch (rVar.f7025a) {
            case 0:
                k1.s sVar = rVar.f7026b;
                i8 = sVar.f7032f;
                t4 = sVar.t();
                break;
            default:
                k1.s sVar2 = rVar.f7026b;
                i8 = sVar2.f7033g;
                t4 = sVar2.r();
                break;
        }
        int i11 = i8 - t4;
        int i12 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            switch (rVar.f7025a) {
                case 0:
                    o2 = rVar.f7026b.o(i4);
                    break;
                default:
                    o2 = rVar.f7026b.o(i4);
                    break;
            }
            switch (rVar.f7025a) {
                case 0:
                    k1.t tVar = (k1.t) o2.getLayoutParams();
                    rVar.f7026b.getClass();
                    left = o2.getLeft() - ((k1.t) o2.getLayoutParams()).f7034a.left;
                    i9 = ((ViewGroup.MarginLayoutParams) tVar).leftMargin;
                    break;
                default:
                    k1.t tVar2 = (k1.t) o2.getLayoutParams();
                    rVar.f7026b.getClass();
                    left = o2.getTop() - ((k1.t) o2.getLayoutParams()).f7034a.top;
                    i9 = ((ViewGroup.MarginLayoutParams) tVar2).topMargin;
                    break;
            }
            int i13 = left - i9;
            switch (rVar.f7025a) {
                case 0:
                    k1.t tVar3 = (k1.t) o2.getLayoutParams();
                    rVar.f7026b.getClass();
                    right = o2.getRight() + ((k1.t) o2.getLayoutParams()).f7034a.right;
                    i10 = ((ViewGroup.MarginLayoutParams) tVar3).rightMargin;
                    break;
                default:
                    k1.t tVar4 = (k1.t) o2.getLayoutParams();
                    rVar.f7026b.getClass();
                    right = o2.getBottom() + ((k1.t) o2.getLayoutParams()).f7034a.bottom;
                    i10 = ((ViewGroup.MarginLayoutParams) tVar4).bottomMargin;
                    break;
            }
            int i14 = right + i10;
            C0087h c0087h = (C0087h) this.f3066n;
            c0087h.f2246b = s;
            c0087h.f2247c = i11;
            c0087h.f2248d = i13;
            c0087h.f2249e = i14;
            if (i6 != 0) {
                c0087h.f2245a = i6;
                if (c0087h.a()) {
                    return o2;
                }
            }
            if (i7 != 0) {
                c0087h.f2245a = i7;
                if (c0087h.a()) {
                    view = o2;
                }
            }
            i4 += i12;
        }
        return view;
    }

    public androidx.lifecycle.x Q(Class cls, String str) {
        k3.h.e(str, "key");
        throw null;
    }

    public Pair R(int i4, F f4) {
        F f5;
        d0 d0Var = (d0) this.f3065m;
        F f6 = null;
        if (f4 != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= d0Var.f3416c.size()) {
                    f5 = null;
                    break;
                }
                if (((F) d0Var.f3416c.get(i5)).f7671d == f4.f7671d) {
                    Object obj = d0Var.f3415b;
                    int i6 = AbstractC0121a.f3383d;
                    f5 = f4.a(Pair.create(obj, f4.f7668a));
                    break;
                }
                i5++;
            }
            if (f5 == null) {
                return null;
            }
            f6 = f5;
        }
        return Pair.create(Integer.valueOf(i4 + d0Var.f3417d), f6);
    }

    public synchronized Map S() {
        try {
            if (((Map) this.f3066n) == null) {
                this.f3066n = Collections.unmodifiableMap(new HashMap((HashMap) this.f3065m));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f3066n;
    }

    public void T(int i4) {
        int resourceId;
        ImageView imageView = (ImageView) this.f3065m;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0248a.f5002e;
        android.support.v4.media.session.t q02 = android.support.v4.media.session.t.q0(context, null, iArr, i4);
        C.x.c(imageView, imageView.getContext(), iArr, null, (TypedArray) q02.f3735n, i4);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) q02.f3735n;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0266a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = j.B.f6553a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(q02.e0(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(j.B.c(typedArray.getInt(3, -1), null));
            }
            q02.u0();
        } catch (Throwable th) {
            q02.u0();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(Y.x r12) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.x.U(Y.x):void");
    }

    public void V(Y y4) {
        C0432m c0432m = (C0432m) this.f3066n;
        if (c0432m.f7260x != null) {
            return;
        }
        I i4 = (I) y4.f5535m;
        if (!i4.isEmpty() && !i4.contains(2)) {
            c0432m.f7250l.F("DESCRIBE not supported.", null);
            return;
        }
        Uri uri = c0432m.s;
        c0432m.f7256r.k(c0432m.f7259v, uri);
    }

    public void W() {
        C0432m c0432m = (C0432m) this.f3066n;
        W.a.j(c0432m.f7262z == 2);
        c0432m.f7262z = 1;
        c0432m.f7248C = false;
        long j4 = c0432m.f7249D;
        if (j4 != -9223372036854775807L) {
            c0432m.i(W.y.Z(j4));
        }
    }

    public void X(x xVar) {
        m0.r rVar;
        C0425f c0425f;
        C0432m c0432m = (C0432m) this.f3066n;
        int i4 = c0432m.f7262z;
        W.a.j(i4 == 1 || i4 == 2);
        c0432m.f7262z = 2;
        if (c0432m.f7260x == null) {
            long j4 = c0432m.w / 2;
            RunnableC0431l runnableC0431l = new RunnableC0431l(c0432m, j4);
            c0432m.f7260x = runnableC0431l;
            if (!runnableC0431l.f7244n) {
                runnableC0431l.f7244n = true;
                runnableC0431l.f7242l.postDelayed(runnableC0431l, j4);
            }
        }
        c0432m.f7249D = -9223372036854775807L;
        Y y4 = c0432m.f7251m;
        long M3 = W.y.M(((C0413B) xVar.f3065m).f7138a);
        I i5 = (I) xVar.f3066n;
        y4.getClass();
        ArrayList arrayList = new ArrayList(i5.size());
        for (int i6 = 0; i6 < i5.size(); i6++) {
            String path = ((C0414C) i5.get(i6)).f7142c.getPath();
            W.a.h(path);
            arrayList.add(path);
        }
        int i7 = 0;
        while (true) {
            rVar = (m0.r) y4.f5535m;
            if (i7 >= m0.r.n(rVar).size()) {
                break;
            }
            if (!arrayList.contains(((m0.p) m0.r.n(rVar).get(i7)).a().getPath())) {
                m0.u uVar = (m0.u) m0.r.o(rVar).f5535m;
                uVar.f7301x = false;
                uVar.v();
                if (m0.r.q(rVar)) {
                    rVar.f7277B = true;
                    m0.r.d(rVar);
                    m0.r.t(rVar);
                    m0.r.k(rVar);
                }
            }
            i7++;
        }
        for (int i8 = 0; i8 < i5.size(); i8++) {
            C0414C c0414c = (C0414C) i5.get(i8);
            Uri uri = c0414c.f7142c;
            int i9 = 0;
            while (true) {
                ArrayList arrayList2 = rVar.f7287p;
                if (i9 >= arrayList2.size()) {
                    c0425f = null;
                    break;
                }
                if (!((m0.q) arrayList2.get(i9)).f7273d) {
                    m0.p pVar = ((m0.q) arrayList2.get(i9)).f7270a;
                    if (pVar.a().equals(uri)) {
                        c0425f = pVar.f7267b;
                        break;
                    }
                }
                i9++;
            }
            if (c0425f != null) {
                long j5 = c0414c.f7140a;
                if (j5 != -9223372036854775807L) {
                    C0426g c0426g = c0425f.s;
                    c0426g.getClass();
                    if (!c0426g.f7216h) {
                        c0425f.s.f7217i = j5;
                    }
                } else {
                    c0425f.getClass();
                }
                int i10 = c0414c.f7141b;
                C0426g c0426g2 = c0425f.s;
                c0426g2.getClass();
                if (!c0426g2.f7216h) {
                    c0425f.s.f7218j = i10;
                }
                if (m0.r.q(rVar) && m0.r.a(rVar) == m0.r.s(rVar)) {
                    c0425f.f7208v = M3;
                    c0425f.w = j5;
                }
            }
        }
        if (!m0.r.q(rVar)) {
            if (m0.r.f(rVar) == -9223372036854775807L || !rVar.f7282G) {
                return;
            }
            rVar.l(m0.r.f(rVar));
            m0.r.k(rVar);
            return;
        }
        if (m0.r.a(rVar) == m0.r.s(rVar)) {
            m0.r.d(rVar);
            m0.r.t(rVar);
        } else {
            m0.r.d(rVar);
            rVar.l(m0.r.s(rVar));
        }
    }

    public void Y(Y y4) {
        C0432m c0432m = (C0432m) this.f3066n;
        W.a.j(c0432m.f7262z != -1);
        c0432m.f7262z = 1;
        G0.c cVar = (G0.c) y4.f5535m;
        c0432m.f7259v = (String) cVar.f675n;
        c0432m.w = cVar.f674m;
        c0432m.f();
    }

    public void Z(int i4, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        ((Messenger) this.f3065m).send(obtain);
    }

    @Override // e1.InterfaceC0256B
    public void a(W.w wVar, y0.q qVar, G g4) {
    }

    public y0.F a0(int i4) {
        int i5 = 0;
        while (true) {
            int[] iArr = (int[]) this.f3065m;
            if (i5 >= iArr.length) {
                W.a.n("BaseMediaChunkOutput", "Unmatched track of type: " + i4);
                return new y0.n();
            }
            if (i4 == iArr[i5]) {
                return ((Z[]) this.f3066n)[i5];
            }
            i5++;
        }
    }

    @Override // K2.j
    public void c(int i4) {
        io.flutter.plugin.platform.n nVar = (io.flutter.plugin.platform.n) this.f3066n;
        if (nVar.K(i4) != null) {
            nVar.f6357A.c(i4);
        } else {
            ((io.flutter.plugin.platform.o) this.f3065m).f6379H.c(i4);
        }
    }

    @Override // e1.InterfaceC0256B
    public void d(W.r rVar) {
        e1.E e4;
        if (rVar.u() == 0 && (rVar.u() & 128) != 0) {
            rVar.H(6);
            int a4 = rVar.a() / 4;
            int i4 = 0;
            while (true) {
                e4 = (e1.E) this.f3066n;
                if (i4 >= a4) {
                    break;
                }
                W.q qVar = (W.q) this.f3065m;
                rVar.f(qVar.f2689d, 0, 4);
                qVar.q(0);
                int i5 = qVar.i(16);
                qVar.t(3);
                if (i5 == 0) {
                    qVar.t(13);
                } else {
                    int i6 = qVar.i(13);
                    if (e4.f5126h.get(i6) == null) {
                        e4.f5126h.put(i6, new e1.C(new T0.j(e4, i6)));
                        e4.f5132n++;
                    }
                }
                i4++;
            }
            if (e4.f5119a != 2) {
                e4.f5126h.remove(0);
            }
        }
    }

    @Override // K2.j
    public void e(K2.g gVar) {
        ((io.flutter.plugin.platform.o) this.f3065m).f6379H.e(gVar);
    }

    @Override // io.flutter.plugin.platform.i
    public void f() {
        ((io.flutter.plugin.platform.o) this.f3065m).f();
        ((io.flutter.plugin.platform.n) this.f3066n).f();
    }

    @Override // q0.J
    public void g(int i4, F f4, C0491x c0491x, n0.g gVar) {
        Pair R3 = R(i4, f4);
        if (R3 != null) {
            ((e0) this.f3066n).f3442i.c(new a0(this, R3, c0491x, gVar, 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0123, code lost:
    
        r1 = r5;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03a3, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0114, code lost:
    
        if (")".equals(d1.C0232b.b(r8, r11)) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, d1.c] */
    @Override // V0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(byte[] r20, int r21, int r22, V0.k r23, W.c r24) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.x.h(byte[], int, int, V0.k, W.c):void");
    }

    @Override // K2.j
    public void i(K2.i iVar, D1.f fVar) {
        if (((io.flutter.plugin.platform.n) this.f3066n).K(iVar.f993a) != null) {
            return;
        }
        ((io.flutter.plugin.platform.o) this.f3065m).f6379H.i(iVar, fVar);
    }

    @Override // h0.p
    public u0.p j(h0.l lVar, h0.i iVar) {
        ((F1.g) this.f3065m).getClass();
        return new x(20, new h0.o(lVar, iVar), (List) this.f3066n);
    }

    @Override // K2.j
    public void k(boolean z4) {
        ((io.flutter.plugin.platform.o) ((io.flutter.plugin.platform.o) this.f3065m).f6379H.f6356m).f6374C = z4;
    }

    @Override // K2.j
    public void l(K2.h hVar) {
        io.flutter.plugin.platform.n nVar = (io.flutter.plugin.platform.n) this.f3066n;
        if (nVar.K(hVar.f977a) != null) {
            nVar.f6357A.l(hVar);
        } else {
            ((io.flutter.plugin.platform.o) this.f3065m).f6379H.l(hVar);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public void m(io.flutter.view.g gVar) {
        ((io.flutter.plugin.platform.o) this.f3065m).f6387t.f6327a = gVar;
        ((io.flutter.plugin.platform.n) this.f3066n).s.f6327a = gVar;
    }

    @Override // K2.j
    public void n(int i4, double d4, double d5) {
        if (((io.flutter.plugin.platform.n) this.f3066n).K(i4) != null) {
            return;
        }
        ((io.flutter.plugin.platform.o) this.f3065m).f6379H.n(i4, d4, d5);
    }

    @Override // K2.j
    public void o(int i4, int i5) {
        io.flutter.plugin.platform.n nVar = (io.flutter.plugin.platform.n) this.f3066n;
        if (nVar.K(i4) != null) {
            nVar.f6357A.o(i4, i5);
        } else {
            ((io.flutter.plugin.platform.o) this.f3065m).f6379H.o(i4, i5);
        }
    }

    @Override // u0.p
    public Object p(Uri uri, j jVar) {
        InterfaceC0402a interfaceC0402a = (InterfaceC0402a) ((u0.p) this.f3065m).p(uri, jVar);
        List list = (List) this.f3066n;
        return (list == null || list.isEmpty()) ? interfaceC0402a : (InterfaceC0402a) interfaceC0402a.a(list);
    }

    @Override // h0.p
    public u0.p q() {
        return new x(20, ((F1.g) this.f3065m).q(), (List) this.f3066n);
    }

    @Override // io.flutter.plugin.platform.i
    public boolean r(int i4) {
        if (((io.flutter.plugin.platform.n) this.f3066n).K(i4) != null) {
            return false;
        }
        return ((io.flutter.plugin.platform.o) this.f3065m).r(i4);
    }

    @Override // y0.q
    public void s() {
        m0.r rVar = (m0.r) this.f3066n;
        rVar.f7284m.post(new RunnableC0434o(rVar, 0));
    }

    @Override // y0.q
    public void t(y0.z zVar) {
    }

    @Override // K2.j
    public long u(K2.g gVar) {
        return ((io.flutter.plugin.platform.o) this.f3065m).f6379H.u(gVar);
    }

    @Override // y0.q
    public y0.F v(int i4, int i5) {
        return (Z) this.f3065m;
    }

    @Override // V0.l
    public int w() {
        return 1;
    }

    @Override // q0.J
    public void x(int i4, F f4, n0.g gVar) {
        Pair R3 = R(i4, f4);
        if (R3 != null) {
            ((e0) this.f3066n).f3442i.c(new a0.Z(this, R3, gVar, 0));
        }
    }

    @Override // q0.J
    public void z(int i4, F f4, n0.g gVar) {
        Pair R3 = R(i4, f4);
        if (R3 != null) {
            ((e0) this.f3066n).f3442i.c(new a0.Z(this, R3, gVar, 1));
        }
    }

    public /* synthetic */ x(int i4, Object obj) {
        this.f3064l = i4;
        this.f3065m = obj;
    }

    public /* synthetic */ x(int i4, Object obj, Object obj2) {
        this.f3064l = i4;
        this.f3065m = obj;
        this.f3066n = obj2;
    }

    public /* synthetic */ x(Object obj, Object obj2, int i4, boolean z4) {
        this.f3064l = i4;
        this.f3066n = obj;
        this.f3065m = obj2;
    }

    public x(View view, InputMethodManager inputMethodManager, B2.r rVar) {
        this.f3064l = 13;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f3066n = view;
        this.f3065m = inputMethodManager;
        rVar.f185m = this;
    }

    public x(C0582b c0582b) {
        this.f3064l = 27;
        x xVar = new x(26, (byte) 0);
        this.f3065m = c0582b;
        this.f3066n = xVar;
    }

    public x(C0413B c0413b, c0 c0Var) {
        this.f3064l = 24;
        this.f3065m = c0413b;
        this.f3066n = I.j(c0Var);
    }

    public x(AbstractC0462a abstractC0462a, androidx.lifecycle.y yVar, E0.e eVar) {
        this.f3064l = 7;
        k3.h.e(abstractC0462a, "store");
        k3.h.e(eVar, "defaultCreationExtras");
        this.f3065m = yVar;
        this.f3066n = eVar;
    }

    public x(W.w wVar) {
        this.f3064l = 10;
        this.f3065m = wVar;
        this.f3066n = new W.r();
    }

    public x(int i4) {
        this.f3064l = 17;
        C0373b c0373b = new C0373b(i4, 0);
        C0373b c0373b2 = new C0373b(i4, 1);
        this.f3065m = c0373b;
        this.f3066n = c0373b2;
    }

    public x(int i4, byte b4) {
        this.f3064l = i4;
        switch (i4) {
            case 9:
                this.f3065m = new W.r();
                this.f3066n = new C0232b();
                return;
            case 26:
                this.f3065m = new ReentrantLock();
                this.f3066n = new LinkedHashMap();
                return;
            default:
                this.f3065m = new HashMap();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, T.h] */
    public x(k1.r rVar) {
        this.f3064l = 18;
        this.f3065m = rVar;
        ?? obj = new Object();
        obj.f2245a = 0;
        this.f3066n = obj;
    }

    public x(MediaCodec.CryptoInfo cryptoInfo) {
        this.f3064l = 3;
        this.f3065m = cryptoInfo;
        this.f3066n = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public x(C0432m c0432m) {
        this.f3064l = 21;
        this.f3066n = c0432m;
        this.f3065m = W.y.n(null);
    }

    public x(e1.E e4) {
        this.f3064l = 11;
        this.f3066n = e4;
        this.f3065m = new W.q(new byte[4], 4);
    }
}
