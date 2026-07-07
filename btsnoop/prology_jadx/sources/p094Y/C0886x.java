package p094Y;

/* renamed from: Y.x */
/* loaded from: classes.dex */
public final class C0886x implements p054N1.InterfaceC0455j, p047L2.InterfaceC0385o, p179q0.InterfaceC1968J, p127f0.InterfaceC1373f, p083V0.InterfaceC0774l, p215y0.InterfaceC2397i, p123e1.InterfaceC1320B, p136h0.InterfaceC1499p, io.flutter.plugin.platform.InterfaceC1586i, p043K2.InterfaceC0334j, p146j0.InterfaceC1705i, p197u0.InterfaceC2229p, p215y0.InterfaceC2405q, p198u1.InterfaceC2240h, p200u3.InterfaceC2250d {

    /* renamed from: l */
    public final /* synthetic */ int f3174l;

    /* renamed from: m */
    public java.lang.Object f3175m;

    /* renamed from: n */
    public java.lang.Object f3176n;

    public /* synthetic */ C0886x(char c4, int i4) {
        this.f3174l = i4;
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: A */
    public void mo731A(int i4) {
        io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f3176n;
        if (c1591n.mo1708K(i4) != null) {
            c1591n.f6592A.mo731A(i4);
        } else {
            ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo731A(i4);
        }
    }

    @Override // p215y0.InterfaceC2397i
    /* renamed from: B */
    public p215y0.C2396h mo523B(p215y0.C2400l c2400l, long j4) {
        int m525a;
        p215y0.C2396h c2396h;
        long j5 = c2400l.f9450o;
        int min = (int) java.lang.Math.min(20000L, c2400l.f9449n - j5);
        p086W.C0798r c0798r = (p086W.C0798r) this.f3176n;
        c0798r.m1534D(min);
        c2400l.mo634p(c0798r.f2786a, 0, min, false);
        int i4 = -1;
        int i5 = -1;
        long j6 = -9223372036854775807L;
        while (c0798r.m1539a() >= 4) {
            if (p016D0.C0166b.m525a(c0798r.f2786a, c0798r.f2787b) != 442) {
                c0798r.m1538H(1);
            } else {
                c0798r.m1538H(4);
                long m3110c = p123e1.C1351y.m3110c(c0798r);
                if (m3110c != -9223372036854775807L) {
                    long m1574b = ((p086W.C0803w) this.f3175m).m1574b(m3110c);
                    if (m1574b > j4) {
                        if (j6 == -9223372036854775807L) {
                            return new p215y0.C2396h(-1, m1574b, j5);
                        }
                        c2396h = new p215y0.C2396h(0, -9223372036854775807L, j5 + i5);
                    } else if (100000 + m1574b > j4) {
                        c2396h = new p215y0.C2396h(0, -9223372036854775807L, j5 + c0798r.f2787b);
                    } else {
                        i5 = c0798r.f2787b;
                        j6 = m1574b;
                    }
                    return c2396h;
                }
                int i6 = c0798r.f2788c;
                if (c0798r.m1539a() >= 10) {
                    c0798r.m1538H(9);
                    int m1559u = c0798r.m1559u() & 7;
                    if (c0798r.m1539a() >= m1559u) {
                        c0798r.m1538H(m1559u);
                        if (c0798r.m1539a() >= 4) {
                            if (p016D0.C0166b.m525a(c0798r.f2786a, c0798r.f2787b) == 443) {
                                c0798r.m1538H(4);
                                int m1531A = c0798r.m1531A();
                                if (c0798r.m1539a() < m1531A) {
                                    c0798r.m1537G(i6);
                                } else {
                                    c0798r.m1538H(m1531A);
                                }
                            }
                            while (true) {
                                if (c0798r.m1539a() < 4 || (m525a = p016D0.C0166b.m525a(c0798r.f2786a, c0798r.f2787b)) == 442 || m525a == 441 || (m525a >>> 8) != 1) {
                                    break;
                                }
                                c0798r.m1538H(4);
                                if (c0798r.m1539a() < 2) {
                                    c0798r.m1537G(i6);
                                    break;
                                }
                                c0798r.m1537G(java.lang.Math.min(c0798r.f2788c, c0798r.f2787b + c0798r.m1531A()));
                            }
                        } else {
                            c0798r.m1537G(i6);
                        }
                    } else {
                        c0798r.m1537G(i6);
                    }
                } else {
                    c0798r.m1537G(i6);
                }
                i4 = c0798r.f2787b;
            }
        }
        return j6 != -9223372036854775807L ? new p215y0.C2396h(-2, j6, j5 + i4) : p215y0.C2396h.f9430d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Type inference failed for: r0v6, types: [k3.m, java.lang.Object] */
    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo266C(p200u3.InterfaceC2251e r7, p110b3.InterfaceC1190d r8) {
        /*
            r6 = this;
            int r0 = r6.f3174l
            switch(r0) {
                case 28: goto L23;
                default: goto L5;
            }
        L5:
            k3.m r0 = new k3.m
            r0.<init>()
            R2.r r1 = new R2.r
            java.lang.Object r2 = r6.f3176n
            I.q r2 = (p035I.C0295q) r2
            r1.<init>(r0, r7, r2)
            java.lang.Object r7 = r6.f3175m
            u3.m r7 = (p200u3.C2259m) r7
            java.lang.Object r7 = r7.mo266C(r1, r8)
            c3.a r8 = p115c3.EnumC1252a.f4880l
            if (r7 != r8) goto L20
            goto L22
        L20:
            Z2.g r7 = p100Z2.C0934g.f3298a
        L22:
            return r7
        L23:
            boolean r0 = r8 instanceof p200u3.C2256j
            if (r0 == 0) goto L36
            r0 = r8
            u3.j r0 = (p200u3.C2256j) r0
            int r1 = r0.f8966p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L36
            int r1 = r1 - r2
            r0.f8966p = r1
            goto L3b
        L36:
            u3.j r0 = new u3.j
            r0.<init>(r6, r8)
        L3b:
            java.lang.Object r8 = r0.f8965o
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f8966p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L63
            if (r2 == r4) goto L57
            if (r2 != r3) goto L4f
            p176p1.AbstractC1949a.m3913P(r8)
            Z2.g r1 = p100Z2.C0934g.f3298a
            goto L99
        L4f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L57:
            v3.n r7 = r0.f8970t
            u3.e r2 = r0.f8969s
            Y.x r4 = r0.f8968r
            p176p1.AbstractC1949a.m3913P(r8)     // Catch: java.lang.Throwable -> L61
            goto L86
        L61:
            r8 = move-exception
            goto L9e
        L63:
            p176p1.AbstractC1949a.m3913P(r8)
            v3.n r8 = new v3.n
            b3.i r2 = r0.f5176m
            p154k3.AbstractC1803h.m3776b(r2)
            r8.<init>(r7, r2)
            java.lang.Object r2 = r6.f3175m     // Catch: java.lang.Throwable -> L9a
            I.o r2 = (p035I.C0293o) r2     // Catch: java.lang.Throwable -> L9a
            r0.f8968r = r6     // Catch: java.lang.Throwable -> L9a
            r0.f8969s = r7     // Catch: java.lang.Throwable -> L9a
            r0.f8970t = r8     // Catch: java.lang.Throwable -> L9a
            r0.f8966p = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r2.mo502h(r8, r0)     // Catch: java.lang.Throwable -> L9a
            if (r2 != r1) goto L83
            goto L99
        L83:
            r4 = r6
            r2 = r7
            r7 = r8
        L86:
            r7.m3032m()
            java.lang.Object r7 = r4.f3176n
            u3.q r7 = (p200u3.C2263q) r7
            r8 = 0
            r0.f8968r = r8
            r0.f8969s = r8
            r0.f8970t = r8
            r0.f8966p = r3
            r7.mo266C(r2, r0)
        L99:
            return r1
        L9a:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L9e:
            r7.m3032m()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0886x.mo266C(u3.e, b3.d):java.lang.Object");
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: D */
    public void mo683D(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        android.util.Pair m1714R = m1714R(i4, c1964f);
        if (m1714R != null) {
            ((p102a0.C0971e0) this.f3176n).f3562i.m1570c(new p102a0.RunnableC0963a0(this, m1714R, c2019x, c1891g, 2));
        }
    }

    @Override // p215y0.InterfaceC2397i
    /* renamed from: E */
    public void mo1023E() {
        byte[] bArr = p086W.AbstractC0805y.f2806f;
        p086W.C0798r c0798r = (p086W.C0798r) this.f3176n;
        c0798r.getClass();
        c0798r.m1535E(bArr, bArr.length);
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: H */
    public void mo684H(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        android.util.Pair m1714R = m1714R(i4, c1964f);
        if (m1714R != null) {
            ((p102a0.C0971e0) this.f3176n).f3562i.m1570c(new p102a0.RunnableC0963a0(this, m1714R, c2019x, c1891g, 0));
        }
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        android.widget.Toast toast;
        p154k3.AbstractC1803h.m3779e(c0384n, "call");
        java.lang.String str = c0384n.f1133a;
        if (!p154k3.AbstractC1803h.m3775a(str, "showToast")) {
            if (!p154k3.AbstractC1803h.m3775a(str, "cancel")) {
                c0335k.mo743c();
                return;
            }
            android.widget.Toast toast2 = (android.widget.Toast) this.f3176n;
            if (toast2 != null) {
                toast2.cancel();
                this.f3176n = null;
            }
            c0335k.mo742b(java.lang.Boolean.TRUE);
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(c0384n.m839a("msg"));
        java.lang.String valueOf2 = java.lang.String.valueOf(c0384n.m839a("length"));
        java.lang.String valueOf3 = java.lang.String.valueOf(c0384n.m839a("gravity"));
        java.lang.Number number = (java.lang.Number) c0384n.m839a("bgcolor");
        java.lang.Number number2 = (java.lang.Number) c0384n.m839a("textcolor");
        java.lang.Number number3 = (java.lang.Number) c0384n.m839a("fontSize");
        java.lang.String str2 = (java.lang.String) c0384n.m839a("fontAsset");
        int i4 = valueOf3.equals("top") ? 48 : valueOf3.equals("center") ? 17 : 80;
        boolean equals = valueOf2.equals("long");
        android.content.Context context = (android.content.Context) this.f3175m;
        if (number != null) {
            java.lang.Object systemService = context.getSystemService("layout_inflater");
            p154k3.AbstractC1803h.m3777c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.prology.R.layout.toast_custom, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.prology.R.id.text);
            textView.setText(valueOf);
            android.graphics.drawable.Drawable drawable = context.getDrawable(com.prology.R.drawable.corner);
            p154k3.AbstractC1803h.m3776b(drawable);
            drawable.setColorFilter(number.intValue(), android.graphics.PorterDuff.Mode.SRC_IN);
            textView.setBackground(drawable);
            if (number3 != null) {
                textView.setTextSize(number3.floatValue());
            }
            if (number2 != null) {
                textView.setTextColor(number2.intValue());
            }
            android.widget.Toast toast3 = new android.widget.Toast(context);
            this.f3176n = toast3;
            toast3.setDuration(equals ? 1 : 0);
            if (str2 != null) {
                android.content.res.AssetManager assets = context.getAssets();
                p154k3.AbstractC1803h.m3778d(assets, "getAssets(...)");
                java.lang.String m611a = ((p026F2.C0229f) android.support.v4.media.session.C1061t.m2201n0().f3861m).m611a(str2);
                p154k3.AbstractC1803h.m3778d(m611a, "getLookupKeyForAsset(...)");
                textView.setTypeface(android.graphics.Typeface.createFromAsset(assets, m611a));
            }
            android.widget.Toast toast4 = (android.widget.Toast) this.f3176n;
            if (toast4 != null) {
                toast4.setView(inflate);
            }
        } else {
            android.util.Log.d("KARTHIK", "showToast: " + number + " " + number2 + " " + number3 + " " + str2);
            android.widget.Toast makeText = android.widget.Toast.makeText(context, valueOf, equals ? 1 : 0);
            this.f3176n = makeText;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.view.View view = makeText != null ? makeText.getView() : null;
                p154k3.AbstractC1803h.m3776b(view);
                android.view.View findViewById = view.findViewById(android.R.id.message);
                p154k3.AbstractC1803h.m3778d(findViewById, "findViewById(...)");
                android.widget.TextView textView2 = (android.widget.TextView) findViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    android.content.res.AssetManager assets2 = context.getAssets();
                    p154k3.AbstractC1803h.m3778d(assets2, "getAssets(...)");
                    java.lang.String m611a2 = ((p026F2.C0229f) android.support.v4.media.session.C1061t.m2201n0().f3861m).m611a(str2);
                    p154k3.AbstractC1803h.m3778d(m611a2, "getLookupKeyForAsset(...)");
                    textView2.setTypeface(android.graphics.Typeface.createFromAsset(assets2, m611a2));
                }
            }
        }
        try {
            if (i4 == 17) {
                android.widget.Toast toast5 = (android.widget.Toast) this.f3176n;
                if (toast5 != null) {
                    toast5.setGravity(i4, 0, 0);
                }
            } else if (i4 != 48) {
                android.widget.Toast toast6 = (android.widget.Toast) this.f3176n;
                if (toast6 != null) {
                    toast6.setGravity(i4, 0, 100);
                }
            } else {
                android.widget.Toast toast7 = (android.widget.Toast) this.f3176n;
                if (toast7 != null) {
                    toast7.setGravity(i4, 0, 100);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (context instanceof android.app.Activity) {
            p154k3.AbstractC1803h.m3777c(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).runOnUiThread(new p026F2.RunnableC0226c(1, this));
        } else {
            android.widget.Toast toast8 = (android.widget.Toast) this.f3176n;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && (toast = (android.widget.Toast) this.f3176n) != null) {
            toast.addCallback(new p097Y2.C0915b(this));
        }
        c0335k.mo742b(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:19:0x004d, B:23:0x005a, B:24:0x005c, B:30:0x0069, B:33:0x007e, B:36:0x00a9, B:37:0x0123, B:41:0x00ce, B:44:0x0071, B:45:0x0072, B:26:0x005d, B:28:0x0063), top: B:18:0x004d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:19:0x004d, B:23:0x005a, B:24:0x005c, B:30:0x0069, B:33:0x007e, B:36:0x00a9, B:37:0x0123, B:41:0x00ce, B:44:0x0071, B:45:0x0072, B:26:0x005d, B:28:0x0063), top: B:18:0x004d, inners: #0 }] */
    @Override // p054N1.InterfaceC0455j
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo751J(java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0886x.mo751J(java.lang.Object, java.lang.Object):void");
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: K */
    public android.view.SurfaceView mo1708K(int i4) {
        io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f3176n;
        return c1591n.mo1708K(i4) != null ? c1591n.mo1708K(i4) : ((io.flutter.plugin.platform.C1592o) this.f3175m).mo1708K(i4);
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: L */
    public void mo685L(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g, java.io.IOException iOException, boolean z4) {
        android.util.Pair m1714R = m1714R(i4, c1964f);
        if (m1714R != null) {
            ((p102a0.C0971e0) this.f3176n).f3562i.m1570c(new p102a0.RunnableC0965b0(this, m1714R, c2019x, c1891g, iOException, z4, 0));
        }
    }

    /* renamed from: M */
    public void m1709M() {
        p145j.C1670l0 c1670l0;
        android.widget.ImageView imageView = (android.widget.ImageView) this.f3175m;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            android.graphics.Rect rect = p145j.AbstractC1623B.f6800a;
        }
        if (drawable == null || (c1670l0 = (p145j.C1670l0) this.f3176n) == null) {
            return;
        }
        p145j.C1675o.m3619c(drawable, c1670l0, imageView.getDrawableState());
    }

    /* renamed from: N */
    public void m1710N() {
        this.f3175m = null;
        this.f3176n = null;
    }

    @Override // p146j0.InterfaceC1705i
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public p146j0.C1699c mo820G(p146j0.C1704h c1704h) {
        android.media.MediaCodec mediaCodec;
        p146j0.InterfaceC1707k c1408y;
        int i4;
        p146j0.C1699c c1699c;
        java.lang.String str = c1704h.f7087a.f7093a;
        p146j0.C1699c c1699c2 = null;
        try {
            android.os.Trace.beginSection("createCodec:" + str);
            mediaCodec = android.media.MediaCodec.createByCodecName(str);
            try {
                p076T.C0702p c0702p = c1704h.f7089c;
                int i5 = p086W.AbstractC0805y.f2801a;
                try {
                    if (i5 >= 34) {
                        if (i5 < 35) {
                            if (p076T.AbstractC0665H.m1200k(c0702p.f2408m)) {
                            }
                        }
                        c1408y = new p129f2.C1408Y(12, mediaCodec);
                        i4 = 4;
                        c1699c = new p146j0.C1699c(mediaCodec, (android.os.HandlerThread) ((p146j0.C1698b) this.f3175m).get(), c1408y);
                        android.os.Trace.endSection();
                        p146j0.C1699c.m3653a(c1699c, c1704h.f7088b, c1704h.f7090d, c1704h.f7091e, i4);
                        return c1699c;
                    }
                    android.os.Trace.endSection();
                    p146j0.C1699c.m3653a(c1699c, c1704h.f7088b, c1704h.f7090d, c1704h.f7091e, i4);
                    return c1699c;
                } catch (java.lang.Exception e4) {
                    e = e4;
                    c1699c2 = c1699c;
                    if (c1699c2 != null) {
                        c1699c2.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                c1408y = new p146j0.C1701e(mediaCodec, (android.os.HandlerThread) ((p146j0.C1698b) this.f3176n).get());
                i4 = 0;
                c1699c = new p146j0.C1699c(mediaCodec, (android.os.HandlerThread) ((p146j0.C1698b) this.f3175m).get(), c1408y);
            } catch (java.lang.Exception e5) {
                e = e5;
            }
        } catch (java.lang.Exception e6) {
            e = e6;
            mediaCodec = null;
        }
    }

    /* renamed from: P */
    public android.view.View m1712P(int i4, int i5, int i6, int i7) {
        int m3742s;
        int i8;
        int m3743t;
        android.view.View m3739o;
        int left;
        int i9;
        int right;
        int i10;
        p152k1.C1779r c1779r = (p152k1.C1779r) this.f3175m;
        switch (c1779r.f7291a) {
            case 0:
                m3742s = c1779r.f7292b.m3742s();
                break;
            default:
                m3742s = c1779r.f7292b.m3744u();
                break;
        }
        switch (c1779r.f7291a) {
            case 0:
                p152k1.AbstractC1780s abstractC1780s = c1779r.f7292b;
                i8 = abstractC1780s.f7298f;
                m3743t = abstractC1780s.m3743t();
                break;
            default:
                p152k1.AbstractC1780s abstractC1780s2 = c1779r.f7292b;
                i8 = abstractC1780s2.f7299g;
                m3743t = abstractC1780s2.m3741r();
                break;
        }
        int i11 = i8 - m3743t;
        int i12 = i5 > i4 ? 1 : -1;
        android.view.View view = null;
        while (i4 != i5) {
            switch (c1779r.f7291a) {
                case 0:
                    m3739o = c1779r.f7292b.m3739o(i4);
                    break;
                default:
                    m3739o = c1779r.f7292b.m3739o(i4);
                    break;
            }
            switch (c1779r.f7291a) {
                case 0:
                    p152k1.C1781t c1781t = (p152k1.C1781t) m3739o.getLayoutParams();
                    c1779r.f7292b.getClass();
                    left = m3739o.getLeft() - ((p152k1.C1781t) m3739o.getLayoutParams()).f7300a.left;
                    i9 = ((android.view.ViewGroup.MarginLayoutParams) c1781t).leftMargin;
                    break;
                default:
                    p152k1.C1781t c1781t2 = (p152k1.C1781t) m3739o.getLayoutParams();
                    c1779r.f7292b.getClass();
                    left = m3739o.getTop() - ((p152k1.C1781t) m3739o.getLayoutParams()).f7300a.top;
                    i9 = ((android.view.ViewGroup.MarginLayoutParams) c1781t2).topMargin;
                    break;
            }
            int i13 = left - i9;
            switch (c1779r.f7291a) {
                case 0:
                    p152k1.C1781t c1781t3 = (p152k1.C1781t) m3739o.getLayoutParams();
                    c1779r.f7292b.getClass();
                    right = m3739o.getRight() + ((p152k1.C1781t) m3739o.getLayoutParams()).f7300a.right;
                    i10 = ((android.view.ViewGroup.MarginLayoutParams) c1781t3).rightMargin;
                    break;
                default:
                    p152k1.C1781t c1781t4 = (p152k1.C1781t) m3739o.getLayoutParams();
                    c1779r.f7292b.getClass();
                    right = m3739o.getBottom() + ((p152k1.C1781t) m3739o.getLayoutParams()).f7300a.bottom;
                    i10 = ((android.view.ViewGroup.MarginLayoutParams) c1781t4).bottomMargin;
                    break;
            }
            int i14 = right + i10;
            p076T.C0694h c0694h = (p076T.C0694h) this.f3176n;
            c0694h.f2326b = m3742s;
            c0694h.f2327c = i11;
            c0694h.f2328d = i13;
            c0694h.f2329e = i14;
            if (i6 != 0) {
                c0694h.f2325a = i6;
                if (c0694h.m1271a()) {
                    return m3739o;
                }
            }
            if (i7 != 0) {
                c0694h.f2325a = i7;
                if (c0694h.m1271a()) {
                    view = m3739o;
                }
            }
            i4 += i12;
        }
        return view;
    }

    /* renamed from: Q */
    public androidx.lifecycle.AbstractC1160x m1713Q(java.lang.Class cls, java.lang.String str) {
        p154k3.AbstractC1803h.m3779e(str, "key");
        throw null;
    }

    /* renamed from: R */
    public android.util.Pair m1714R(int i4, p179q0.C1964F c1964f) {
        p179q0.C1964F c1964f2;
        p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) this.f3175m;
        p179q0.C1964F c1964f3 = null;
        if (c1964f != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= c0969d0.f3534c.size()) {
                    c1964f2 = null;
                    break;
                }
                if (((p179q0.C1964F) c0969d0.f3534c.get(i5)).f7963d == c1964f.f7963d) {
                    java.lang.Object obj = c0969d0.f3533b;
                    int i6 = p102a0.AbstractC0962a.f3501d;
                    c1964f2 = c1964f.m3967a(android.util.Pair.create(obj, c1964f.f7960a));
                    break;
                }
                i5++;
            }
            if (c1964f2 == null) {
                return null;
            }
            c1964f3 = c1964f2;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(i4 + c0969d0.f3535d), c1964f3);
    }

    /* renamed from: S */
    public synchronized java.util.Map m1715S() {
        try {
            if (((java.util.Map) this.f3176n) == null) {
                this.f3176n = java.util.Collections.unmodifiableMap(new java.util.HashMap((java.util.HashMap) this.f3175m));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (java.util.Map) this.f3176n;
    }

    /* renamed from: T */
    public void m1716T(int i4) {
        int resourceId;
        android.widget.ImageView imageView = (android.widget.ImageView) this.f3175m;
        android.content.Context context = imageView.getContext();
        int[] iArr = p121e.AbstractC1299a.f5189e;
        android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(context, null, iArr, i4);
        p011C.AbstractC0132x.m463c(imageView, imageView.getContext(), iArr, null, (android.content.res.TypedArray) m2202q0.f3862n, i4);
        try {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            android.content.res.TypedArray typedArray = (android.content.res.TypedArray) m2202q0.f3862n;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = p126f.AbstractC1367a.m3116a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                android.graphics.Rect rect = p145j.AbstractC1623B.f6800a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(m2202q0.m2222e0(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(p145j.AbstractC1623B.m3578c(typedArray.getInt(3, -1), null));
            }
            m2202q0.m2243u0();
        } catch (java.lang.Throwable th) {
            m2202q0.m2243u0();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1717U(p094Y.C0886x r12) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0886x.m1717U(Y.x):void");
    }

    /* renamed from: V */
    public void m1718V(p129f2.C1408Y c1408y) {
        p161m0.C1856m c1856m = (p161m0.C1856m) this.f3176n;
        if (c1856m.f7535x != null) {
            return;
        }
        p129f2.AbstractC1393I abstractC1393I = (p129f2.AbstractC1393I) c1408y.f5729m;
        if (!abstractC1393I.isEmpty() && !abstractC1393I.contains(2)) {
            c1856m.f7523l.m3187F("DESCRIBE not supported.", null);
            return;
        }
        android.net.Uri uri = c1856m.f7530s;
        c1856m.f7529r.m1030k(c1856m.f7533v, uri);
    }

    /* renamed from: W */
    public void m1719W() {
        p161m0.C1856m c1856m = (p161m0.C1856m) this.f3176n;
        p086W.AbstractC0781a.m1421j(c1856m.f7537z == 2);
        c1856m.f7537z = 1;
        c1856m.f7521C = false;
        long j4 = c1856m.f7522D;
        if (j4 != -9223372036854775807L) {
            c1856m.m3819i(p086W.AbstractC0805y.m1605Z(j4));
        }
    }

    /* renamed from: X */
    public void m1720X(p094Y.C0886x c0886x) {
        p161m0.C1861r c1861r;
        p161m0.C1849f c1849f;
        p161m0.C1856m c1856m = (p161m0.C1856m) this.f3176n;
        int i4 = c1856m.f7537z;
        p086W.AbstractC0781a.m1421j(i4 == 1 || i4 == 2);
        c1856m.f7537z = 2;
        if (c1856m.f7535x == null) {
            long j4 = c1856m.f7534w / 2;
            p161m0.RunnableC1855l runnableC1855l = new p161m0.RunnableC1855l(c1856m, j4);
            c1856m.f7535x = runnableC1855l;
            if (!runnableC1855l.f7517n) {
                runnableC1855l.f7517n = true;
                runnableC1855l.f7515l.postDelayed(runnableC1855l, j4);
            }
        }
        c1856m.f7522D = -9223372036854775807L;
        p129f2.C1408Y c1408y = c1856m.f7524m;
        long m1592M = p086W.AbstractC0805y.m1592M(((p161m0.C1837B) c0886x.f3175m).f7408a);
        p129f2.AbstractC1393I abstractC1393I = (p129f2.AbstractC1393I) c0886x.f3176n;
        c1408y.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(abstractC1393I.size());
        for (int i5 = 0; i5 < abstractC1393I.size(); i5++) {
            java.lang.String path = ((p161m0.C1838C) abstractC1393I.get(i5)).f7412c.getPath();
            p086W.AbstractC0781a.m1419h(path);
            arrayList.add(path);
        }
        int i6 = 0;
        while (true) {
            c1861r = (p161m0.C1861r) c1408y.f5729m;
            if (i6 >= p161m0.C1861r.m3830n(c1861r).size()) {
                break;
            }
            if (!arrayList.contains(((p161m0.C1859p) p161m0.C1861r.m3830n(c1861r).get(i6)).m3823a().getPath())) {
                p161m0.C1864u c1864u = (p161m0.C1864u) p161m0.C1861r.m3831o(c1861r).f5729m;
                c1864u.f7580x = false;
                c1864u.m3839v();
                if (p161m0.C1861r.m3832q(c1861r)) {
                    c1861r.f7552B = true;
                    p161m0.C1861r.m3827d(c1861r);
                    p161m0.C1861r.m3834t(c1861r);
                    p161m0.C1861r.m3829k(c1861r);
                }
            }
            i6++;
        }
        for (int i7 = 0; i7 < abstractC1393I.size(); i7++) {
            p161m0.C1838C c1838c = (p161m0.C1838C) abstractC1393I.get(i7);
            android.net.Uri uri = c1838c.f7412c;
            int i8 = 0;
            while (true) {
                java.util.ArrayList arrayList2 = c1861r.f7562p;
                if (i8 >= arrayList2.size()) {
                    c1849f = null;
                    break;
                }
                if (!((p161m0.C1860q) arrayList2.get(i8)).f7548d) {
                    p161m0.C1859p c1859p = ((p161m0.C1860q) arrayList2.get(i8)).f7545a;
                    if (c1859p.m3823a().equals(uri)) {
                        c1849f = c1859p.f7542b;
                        break;
                    }
                }
                i8++;
            }
            if (c1849f != null) {
                long j5 = c1838c.f7410a;
                if (j5 != -9223372036854775807L) {
                    p161m0.C1850g c1850g = c1849f.f7477s;
                    c1850g.getClass();
                    if (!c1850g.f7489h) {
                        c1849f.f7477s.f7490i = j5;
                    }
                } else {
                    c1849f.getClass();
                }
                int i9 = c1838c.f7411b;
                p161m0.C1850g c1850g2 = c1849f.f7477s;
                c1850g2.getClass();
                if (!c1850g2.f7489h) {
                    c1849f.f7477s.f7491j = i9;
                }
                if (p161m0.C1861r.m3832q(c1861r) && p161m0.C1861r.m3826a(c1861r) == p161m0.C1861r.m3833s(c1861r)) {
                    c1849f.f7480v = m1592M;
                    c1849f.f7481w = j5;
                }
            }
        }
        if (!p161m0.C1861r.m3832q(c1861r)) {
            if (p161m0.C1861r.m3828f(c1861r) == -9223372036854775807L || !c1861r.f7557G) {
                return;
            }
            c1861r.mo2961l(p161m0.C1861r.m3828f(c1861r));
            p161m0.C1861r.m3829k(c1861r);
            return;
        }
        if (p161m0.C1861r.m3826a(c1861r) == p161m0.C1861r.m3833s(c1861r)) {
            p161m0.C1861r.m3827d(c1861r);
            p161m0.C1861r.m3834t(c1861r);
        } else {
            p161m0.C1861r.m3827d(c1861r);
            c1861r.mo2961l(p161m0.C1861r.m3833s(c1861r));
        }
    }

    /* renamed from: Y */
    public void m1721Y(p129f2.C1408Y c1408y) {
        p161m0.C1856m c1856m = (p161m0.C1856m) this.f3176n;
        p086W.AbstractC0781a.m1421j(c1856m.f7537z != -1);
        c1856m.f7537z = 1;
        p028G0.C0235c c0235c = (p028G0.C0235c) c1408y.f5729m;
        c1856m.f7533v = (java.lang.String) c0235c.f685n;
        c1856m.f7534w = c0235c.f684m;
        c1856m.m3816f();
    }

    /* renamed from: Z */
    public void m1722Z(int i4, android.os.Bundle bundle, android.os.Messenger messenger) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i4;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        ((android.os.Messenger) this.f3175m).send(obtain);
    }

    @Override // p123e1.InterfaceC1320B
    /* renamed from: a */
    public void mo1314a(p086W.C0803w c0803w, p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
    }

    /* renamed from: a0 */
    public p215y0.InterfaceC2387F m1723a0(int i4) {
        int i5 = 0;
        while (true) {
            int[] iArr = (int[]) this.f3175m;
            if (i5 >= iArr.length) {
                p086W.AbstractC0781a.m1425n("BaseMediaChunkOutput", "Unmatched track of type: " + i4);
                return new p215y0.C2402n();
            }
            if (i4 == iArr[i5]) {
                return ((p179q0.C1983Z[]) this.f3176n)[i5];
            }
            i5++;
        }
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: c */
    public void mo732c(int i4) {
        io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f3176n;
        if (c1591n.mo1708K(i4) != null) {
            c1591n.f6592A.mo732c(i4);
        } else {
            ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo732c(i4);
        }
    }

    @Override // p123e1.InterfaceC1320B
    /* renamed from: d */
    public void mo1317d(p086W.C0798r c0798r) {
        p123e1.C1323E c1323e;
        if (c0798r.m1559u() == 0 && (c0798r.m1559u() & 128) != 0) {
            c0798r.m1538H(6);
            int m1539a = c0798r.m1539a() / 4;
            int i4 = 0;
            while (true) {
                c1323e = (p123e1.C1323E) this.f3176n;
                if (i4 >= m1539a) {
                    break;
                }
                p086W.C0797q c0797q = (p086W.C0797q) this.f3175m;
                c0798r.m1544f(c0797q.f2781d, 0, 4);
                c0797q.m1526q(0);
                int m1518i = c0797q.m1518i(16);
                c0797q.m1529t(3);
                if (m1518i == 0) {
                    c0797q.m1529t(13);
                } else {
                    int m1518i2 = c0797q.m1518i(13);
                    if (c1323e.f5314h.get(m1518i2) == null) {
                        c1323e.f5314h.put(m1518i2, new p123e1.C1321C(new p077T0.C0722j(c1323e, m1518i2)));
                        c1323e.f5320n++;
                    }
                }
                i4++;
            }
            if (c1323e.f5307a != 2) {
                c1323e.f5314h.remove(0);
            }
        }
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: e */
    public void mo733e(p043K2.C0331g c0331g) {
        ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo733e(c0331g);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: f */
    public void mo1724f() {
        ((io.flutter.plugin.platform.C1592o) this.f3175m).mo1724f();
        ((io.flutter.plugin.platform.C1591n) this.f3176n).mo1724f();
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: g */
    public void mo691g(int i4, p179q0.C1964F c1964f, p179q0.C2019x c2019x, p166n0.C1891g c1891g) {
        android.util.Pair m1714R = m1714R(i4, c1964f);
        if (m1714R != null) {
            ((p102a0.C0971e0) this.f3176n).f3562i.m1570c(new p102a0.RunnableC0963a0(this, m1714R, c2019x, c1891g, 1));
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
    
        if (")".equals(p118d1.C1273b.m3006b(r8, r11)) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, d1.c] */
    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo692h(byte[] r20, int r21, int r22, p083V0.C0773k r23, p086W.InterfaceC0783c r24) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0886x.mo692h(byte[], int, int, V0.k, W.c):void");
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: i */
    public void mo734i(p043K2.C0333i c0333i, p017D1.C0173f c0173f) {
        if (((io.flutter.plugin.platform.C1591n) this.f3176n).mo1708K(c0333i.f1032a) != null) {
            return;
        }
        ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo734i(c0333i, c0173f);
    }

    @Override // p136h0.InterfaceC1499p
    /* renamed from: j */
    public p197u0.InterfaceC2229p mo596j(p136h0.C1495l c1495l, p136h0.C1492i c1492i) {
        ((p025F1.C0215g) this.f3175m).getClass();
        return new p094Y.C0886x(20, new p136h0.C1498o(c1495l, c1492i), (java.util.List) this.f3176n);
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: k */
    public void mo735k(boolean z4) {
        ((io.flutter.plugin.platform.C1592o) ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.f6591m).f6611C = z4;
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: l */
    public void mo736l(p043K2.C0332h c0332h) {
        io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f3176n;
        if (c1591n.mo1708K(c0332h.f1016a) != null) {
            c1591n.f6592A.mo736l(c0332h);
        } else {
            ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo736l(c0332h);
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: m */
    public void mo1725m(io.flutter.view.C1610g c1610g) {
        ((io.flutter.plugin.platform.C1592o) this.f3175m).f6625t.f6562a = c1610g;
        ((io.flutter.plugin.platform.C1591n) this.f3176n).f6600s.f6562a = c1610g;
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: n */
    public void mo737n(int i4, double d4, double d5) {
        if (((io.flutter.plugin.platform.C1591n) this.f3176n).mo1708K(i4) != null) {
            return;
        }
        ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo737n(i4, d4, d5);
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: o */
    public void mo738o(int i4, int i5) {
        io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f3176n;
        if (c1591n.mo1708K(i4) != null) {
            c1591n.f6592A.mo738o(i4, i5);
        } else {
            ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo738o(i4, i5);
        }
    }

    @Override // p197u0.InterfaceC2229p
    /* renamed from: p */
    public java.lang.Object mo601p(android.net.Uri uri, p094Y.C0872j c0872j) {
        p156l0.InterfaceC1821a interfaceC1821a = (p156l0.InterfaceC1821a) ((p197u0.InterfaceC2229p) this.f3175m).mo601p(uri, c0872j);
        java.util.List list = (java.util.List) this.f3176n;
        return (list == null || list.isEmpty()) ? interfaceC1821a : (p156l0.InterfaceC1821a) interfaceC1821a.mo3040a(list);
    }

    @Override // p136h0.InterfaceC1499p
    /* renamed from: q */
    public p197u0.InterfaceC2229p mo602q() {
        return new p094Y.C0886x(20, ((p025F1.C0215g) this.f3175m).mo602q(), (java.util.List) this.f3176n);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: r */
    public boolean mo1726r(int i4) {
        if (((io.flutter.plugin.platform.C1591n) this.f3176n).mo1708K(i4) != null) {
            return false;
        }
        return ((io.flutter.plugin.platform.C1592o) this.f3175m).mo1726r(i4);
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: s */
    public void mo637s() {
        p161m0.C1861r c1861r = (p161m0.C1861r) this.f3176n;
        c1861r.f7559m.post(new p161m0.RunnableC1858o(c1861r, 0));
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: t */
    public void mo638t(p215y0.InterfaceC2414z interfaceC2414z) {
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: u */
    public long mo739u(p043K2.C0331g c0331g) {
        return ((io.flutter.plugin.platform.C1592o) this.f3175m).f6616H.mo739u(c0331g);
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: v */
    public p215y0.InterfaceC2387F mo640v(int i4, int i5) {
        return (p179q0.C1983Z) this.f3175m;
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public int mo703w() {
        return 1;
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: x */
    public void mo704x(int i4, p179q0.C1964F c1964f, p166n0.C1891g c1891g) {
        android.util.Pair m1714R = m1714R(i4, c1964f);
        if (m1714R != null) {
            ((p102a0.C0971e0) this.f3176n).f3562i.m1570c(new p102a0.RunnableC0961Z(this, m1714R, c1891g, 0));
        }
    }

    @Override // p179q0.InterfaceC1968J
    /* renamed from: z */
    public void mo705z(int i4, p179q0.C1964F c1964f, p166n0.C1891g c1891g) {
        android.util.Pair m1714R = m1714R(i4, c1964f);
        if (m1714R != null) {
            ((p102a0.C0971e0) this.f3176n).f3562i.m1570c(new p102a0.RunnableC0961Z(this, m1714R, c1891g, 1));
        }
    }

    public /* synthetic */ C0886x(int i4, java.lang.Object obj) {
        this.f3174l = i4;
        this.f3175m = obj;
    }

    public /* synthetic */ C0886x(int i4, java.lang.Object obj, java.lang.Object obj2) {
        this.f3174l = i4;
        this.f3175m = obj;
        this.f3176n = obj2;
    }

    public /* synthetic */ C0886x(java.lang.Object obj, java.lang.Object obj2, int i4, boolean z4) {
        this.f3174l = i4;
        this.f3176n = obj;
        this.f3175m = obj2;
    }

    public C0886x(android.view.View view, android.view.inputmethod.InputMethodManager inputMethodManager, p009B2.C0061r c0061r) {
        this.f3174l = 13;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f3176n = view;
        this.f3175m = inputMethodManager;
        c0061r.f188m = this;
    }

    public C0886x(p198u1.C2234b c2234b) {
        this.f3174l = 27;
        p094Y.C0886x c0886x = new p094Y.C0886x(26, (byte) 0);
        this.f3175m = c2234b;
        this.f3176n = c0886x;
    }

    public C0886x(p161m0.C1837B c1837b, p129f2.C1415c0 c1415c0) {
        this.f3174l = 24;
        this.f3175m = c1837b;
        this.f3176n = p129f2.AbstractC1393I.m3162j(c1415c0);
    }

    public C0886x(p176p1.AbstractC1949a abstractC1949a, androidx.lifecycle.C1161y c1161y, p021E0.AbstractC0193e abstractC0193e) {
        this.f3174l = 7;
        p154k3.AbstractC1803h.m3779e(abstractC1949a, "store");
        p154k3.AbstractC1803h.m3779e(abstractC0193e, "defaultCreationExtras");
        this.f3175m = c1161y;
        this.f3176n = abstractC0193e;
    }

    public C0886x(p086W.C0803w c0803w) {
        this.f3174l = 10;
        this.f3175m = c0803w;
        this.f3176n = new p086W.C0798r();
    }

    public C0886x(int i4) {
        this.f3174l = 17;
        p146j0.C1698b c1698b = new p146j0.C1698b(i4, 0);
        p146j0.C1698b c1698b2 = new p146j0.C1698b(i4, 1);
        this.f3175m = c1698b;
        this.f3176n = c1698b2;
    }

    public C0886x(int i4, byte b4) {
        this.f3174l = i4;
        switch (i4) {
            case 9:
                this.f3175m = new p086W.C0798r();
                this.f3176n = new p118d1.C1273b();
                return;
            case 26:
                this.f3175m = new java.util.concurrent.locks.ReentrantLock();
                this.f3176n = new java.util.LinkedHashMap();
                return;
            default:
                this.f3175m = new java.util.HashMap();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, T.h] */
    public C0886x(p152k1.C1779r c1779r) {
        this.f3174l = 18;
        this.f3175m = c1779r;
        ?? obj = new java.lang.Object();
        obj.f2325a = 0;
        this.f3176n = obj;
    }

    public C0886x(android.media.MediaCodec.CryptoInfo cryptoInfo) {
        this.f3174l = 3;
        this.f3175m = cryptoInfo;
        this.f3176n = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public C0886x(p161m0.C1856m c1856m) {
        this.f3174l = 21;
        this.f3176n = c1856m;
        this.f3175m = p086W.AbstractC0805y.m1619n(null);
    }

    public C0886x(p123e1.C1323E c1323e) {
        this.f3174l = 11;
        this.f3176n = c1323e;
        this.f3175m = new p086W.C0797q(new byte[4], 4);
    }
}
