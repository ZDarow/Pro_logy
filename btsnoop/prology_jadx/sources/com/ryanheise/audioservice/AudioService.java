package com.ryanheise.audioservice;

/* loaded from: classes.dex */
public class AudioService extends p064Q.AbstractServiceC0548t {

    /* renamed from: J */
    public static com.ryanheise.audioservice.AudioService f4959J;

    /* renamed from: K */
    public static android.app.PendingIntent f4960K;

    /* renamed from: L */
    public static p034H2.C0247a f4961L;

    /* renamed from: M */
    public static java.util.ArrayList f4962M = new java.util.ArrayList();

    /* renamed from: N */
    public static final java.util.HashMap f4963N = new java.util.HashMap();

    /* renamed from: A */
    public android.support.v4.media.MediaMetadataCompat f4964A;

    /* renamed from: B */
    public android.graphics.Bitmap f4965B;

    /* renamed from: C */
    public java.lang.String f4966C;

    /* renamed from: D */
    public p190s2.C2141a f4967D;

    /* renamed from: F */
    public boolean f4969F;

    /* renamed from: H */
    public p086W.C0792l f4971H;

    /* renamed from: t */
    public p190s2.C2143c f4973t;

    /* renamed from: u */
    public android.os.PowerManager.WakeLock f4974u;

    /* renamed from: v */
    public android.support.v4.media.session.C1061t f4975v;

    /* renamed from: z */
    public int[] f4979z;

    /* renamed from: w */
    public java.util.ArrayList f4976w = new java.util.ArrayList();

    /* renamed from: x */
    public final java.util.ArrayList f4977x = new java.util.ArrayList();

    /* renamed from: y */
    public final java.util.ArrayList f4978y = new java.util.ArrayList();

    /* renamed from: E */
    public boolean f4968E = false;

    /* renamed from: I */
    public int f4972I = 1;

    /* renamed from: G */
    public final android.os.Handler f4970G = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // p064Q.AbstractServiceC0548t
    /* renamed from: b */
    public final p008B1.C0026d mo1057b(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = null;
        java.lang.Boolean valueOf = bundle == null ? null : java.lang.Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = java.lang.Boolean.FALSE;
        }
        p190s2.C2143c c2143c = this.f4973t;
        if (c2143c.f8551o != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c2143c.f8551o);
                android.os.Bundle bundle3 = new android.os.Bundle();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    try {
                        try {
                            try {
                                try {
                                    bundle3.putInt(next, jSONObject.getInt(next));
                                } catch (java.lang.Exception unused) {
                                    bundle3.putString(next, jSONObject.getString(next));
                                }
                            } catch (java.lang.Exception unused2) {
                                bundle3.putBoolean(next, jSONObject.getBoolean(next));
                            }
                        } catch (java.lang.Exception unused3) {
                            java.lang.System.out.println("Unsupported extras value for key " + next);
                        }
                    } catch (java.lang.Exception unused4) {
                        bundle3.putDouble(next, jSONObject.getDouble(next));
                    }
                }
                bundle2 = bundle3;
            } catch (java.lang.Exception e4) {
                e4.printStackTrace();
            }
        }
        return new p008B1.C0026d(valueOf.booleanValue() ? "recent" : "root", bundle2);
    }

    @Override // p064Q.AbstractServiceC0548t
    /* renamed from: c */
    public final void mo1058c(java.lang.String str, p064Q.AbstractC0541m abstractC0541m, android.os.Bundle bundle) {
        if (f4961L == null) {
            abstractC0541m.m1054e(new java.util.ArrayList());
            return;
        }
        if (p190s2.C2151k.f8573t != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("parentMediaId", str);
            hashMap.put("options", p190s2.C2151k.m4270k(bundle));
            p190s2.C2151k.f8573t.m656a("getChildren", hashMap, new p190s2.C2148h(abstractC0541m, 0));
        }
        abstractC0541m.mo1038a();
    }

    @Override // p064Q.AbstractServiceC0548t
    /* renamed from: d */
    public final void mo1059d(java.lang.String str, p064Q.AbstractC0541m abstractC0541m) {
        if (f4961L == null) {
            abstractC0541m.m1054e(null);
            return;
        }
        if (p190s2.C2151k.f8573t != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("mediaId", str);
            p190s2.C2151k.f8573t.m656a("getMediaItem", hashMap, new p190s2.C2148h(abstractC0541m, 1));
        }
        abstractC0541m.mo1038a();
    }

    /* renamed from: f */
    public final android.app.PendingIntent m2939f(long j4) {
        int i4 = j4 == 4 ? 91 : j4 == 2 ? 130 : j4 == 4 ? 126 : j4 == 2 ? 127 : j4 == 32 ? 87 : j4 == 16 ? 88 : j4 == 1 ? 86 : j4 == 64 ? 90 : j4 == 8 ? 89 : j4 == 512 ? 85 : 0;
        if (i4 == 0) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.ryanheise.audioservice.MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new android.view.KeyEvent(0, i4));
        return android.app.PendingIntent.getBroadcast(this, i4, intent, 67108864);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [E0.e, R.c, java.lang.Object] */
    /* renamed from: g */
    public final android.app.Notification m2940g() {
        int[] iArr = this.f4979z;
        if (iArr == null) {
            int min = java.lang.Math.min(3, this.f4977x.size());
            int[] iArr2 = new int[min];
            for (int i4 = 0; i4 < min; i4++) {
                iArr2[i4] = i4;
            }
            iArr = iArr2;
        }
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService("notification");
        if (notificationManager.getNotificationChannel(this.f4966C) == null) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(this.f4966C, this.f4973t.f8540d, 2);
            notificationChannel.setShowBadge(this.f4973t.f8544h);
            java.lang.String str = this.f4973t.f8541e;
            if (str != null) {
                notificationChannel.setDescription(str);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        p183r.C2035c c2035c = new p183r.C2035c(this, this.f4966C);
        c2035c.f8282p = 1;
        c2035c.f8276j = false;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.ryanheise.audioservice.MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        c2035c.f8285s.deleteIntent = android.app.PendingIntent.getBroadcast(this, 0, intent, 67108864);
        c2035c.f8285s.icon = m2942i(this.f4973t.f8543g);
        android.support.v4.media.MediaMetadataCompat mediaMetadataCompat = this.f4964A;
        if (mediaMetadataCompat != null) {
            android.support.v4.media.MediaDescriptionCompat m2062d = mediaMetadataCompat.m2062d();
            java.lang.CharSequence charSequence = m2062d.f3761m;
            if (charSequence != null) {
                c2035c.f8271e = p183r.C2035c.m4084b(charSequence);
            }
            java.lang.CharSequence charSequence2 = m2062d.f3762n;
            if (charSequence2 != null) {
                c2035c.f8272f = p183r.C2035c.m4084b(charSequence2);
            }
            java.lang.CharSequence charSequence3 = m2062d.f3763o;
            if (charSequence3 != null) {
                c2035c.f8278l = p183r.C2035c.m4084b(charSequence3);
            }
            synchronized (this) {
                try {
                    android.graphics.Bitmap bitmap = this.f4965B;
                    if (bitmap != null) {
                        c2035c.m4087d(bitmap);
                    }
                } finally {
                }
            }
        }
        if (this.f4973t.f8545i) {
            c2035c.f8273g = ((android.support.v4.media.session.C1049h) ((android.support.v4.media.session.C1061t) this.f4975v.f3862n).f3861m).f3831a.getSessionActivity();
        }
        int i5 = this.f4973t.f8542f;
        if (i5 != -1) {
            c2035c.f8281o = i5;
        }
        java.util.Iterator it = this.f4977x.iterator();
        while (it.hasNext()) {
            p183r.C2033a c2033a = (p183r.C2033a) it.next();
            if (c2033a != null) {
                c2035c.f8268b.add(c2033a);
            }
        }
        ?? obj = new java.lang.Object();
        obj.f1771b = null;
        obj.f1772c = ((android.support.v4.media.session.C1056o) this.f4975v.f3861m).f3846c;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            obj.f1771b = iArr;
        }
        if (this.f4973t.f8546j) {
            m2939f(1L);
            c2035c.m4086c(2, true);
        }
        c2035c.m4088e(obj);
        return c2035c.m4085a();
    }

    /* renamed from: h */
    public final void m2941h(p190s2.C2143c c2143c) {
        this.f4973t = c2143c;
        java.lang.String str = c2143c.f8539c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f4966C = str;
        if (c2143c.f8550n != null) {
            android.content.Context applicationContext = getApplicationContext();
            android.content.Intent intent = new android.content.Intent((java.lang.String) null);
            intent.setComponent(new android.content.ComponentName(applicationContext, c2143c.f8550n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            f4960K = android.app.PendingIntent.getActivity(applicationContext, 1000, intent, 201326592);
        } else {
            f4960K = null;
        }
        if (c2143c.f8538b) {
            return;
        }
        ((android.support.v4.media.session.C1056o) this.f4975v.f3861m).f3844a.setMediaButtonReceiver(null);
    }

    /* renamed from: i */
    public final int m2942i(java.lang.String str) {
        java.lang.String[] split = str.split("/");
        java.lang.String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:7:0x000c, B:46:0x001f, B:48:0x0025, B:50:0x0038, B:51:0x0040, B:53:0x0046, B:54:0x004a, B:11:0x0054, B:13:0x0060, B:16:0x00c8, B:19:0x006b, B:21:0x0071, B:23:0x007b, B:24:0x0086, B:27:0x00a3, B:29:0x00aa, B:31:0x00b0, B:32:0x0094, B:33:0x0098, B:35:0x009c, B:37:0x00a0, B:40:0x007f, B:42:0x00bb, B:43:0x00c0), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m2943j(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            s2.a r0 = r9.f4967D
            java.lang.Object r0 = r0.get(r10)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r1 = 0
            android.net.Uri r2 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = "content"
            java.lang.String r4 = r2.getScheme()     // Catch: java.lang.Exception -> L3d
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L3d
            r4 = -1
            if (r3 == 0) goto L66
            if (r11 == 0) goto L54
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            r5 = 29
            if (r11 < r5) goto L54
            android.util.Size r11 = new android.util.Size     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            r0 = 192(0xc0, float:2.69E-43)
            r11.<init>(r0, r0)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            android.content.ContentResolver r0 = r9.getContentResolver()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            android.util.Size r5 = new android.util.Size     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            s2.c r6 = r9.f4973t     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            int r6 = r6.f8548l     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r6 != r4) goto L40
            int r6 = r11.getWidth()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            goto L40
        L3d:
            r10 = move-exception
            goto Lce
        L40:
            s2.c r7 = r9.f4973t     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            int r7 = r7.f8549m     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r7 != r4) goto L4a
            int r7 = r11.getHeight()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
        L4a:
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            android.graphics.Bitmap r0 = p146j0.AbstractC1710n.m3669b(r0, r2, r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r0 != 0) goto L66
            return r1
        L54:
            android.content.ContentResolver r11 = r9.getContentResolver()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r2, r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r11 == 0) goto L65
            java.io.FileDescriptor r11 = r11.getFileDescriptor()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            goto L67
        L65:
            return r1
        L66:
            r11 = r1
        L67:
            if (r3 == 0) goto L6b
            if (r11 == 0) goto Lc8
        L6b:
            s2.c r0 = r9.f4973t     // Catch: java.lang.Exception -> L3d
            int r0 = r0.f8548l     // Catch: java.lang.Exception -> L3d
            if (r0 == r4) goto Lb9
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L3d
            r0.<init>()     // Catch: java.lang.Exception -> L3d
            r3 = 1
            r0.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L3d
            if (r11 == 0) goto L7f
            android.graphics.BitmapFactory.decodeFileDescriptor(r11, r1, r0)     // Catch: java.lang.Exception -> L3d
            goto L86
        L7f:
            java.lang.String r4 = r2.getPath()     // Catch: java.lang.Exception -> L3d
            android.graphics.BitmapFactory.decodeFile(r4, r0)     // Catch: java.lang.Exception -> L3d
        L86:
            s2.c r4 = r9.f4973t     // Catch: java.lang.Exception -> L3d
            int r5 = r4.f8548l     // Catch: java.lang.Exception -> L3d
            int r4 = r4.f8549m     // Catch: java.lang.Exception -> L3d
            int r6 = r0.outHeight     // Catch: java.lang.Exception -> L3d
            int r7 = r0.outWidth     // Catch: java.lang.Exception -> L3d
            if (r6 > r4) goto L94
            if (r7 <= r5) goto La3
        L94:
            int r6 = r6 / 2
            int r7 = r7 / 2
        L98:
            int r8 = r6 / r3
            if (r8 < r4) goto La3
            int r8 = r7 / r3
            if (r8 < r5) goto La3
            int r3 = r3 * 2
            goto L98
        La3:
            r0.inSampleSize = r3     // Catch: java.lang.Exception -> L3d
            r3 = 0
            r0.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L3d
            if (r11 == 0) goto Lb0
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFileDescriptor(r11, r1, r0)     // Catch: java.lang.Exception -> L3d
        Lae:
            r0 = r11
            goto Lc8
        Lb0:
            java.lang.String r11 = r2.getPath()     // Catch: java.lang.Exception -> L3d
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r11, r0)     // Catch: java.lang.Exception -> L3d
            goto Lae
        Lb9:
            if (r11 == 0) goto Lc0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r11)     // Catch: java.lang.Exception -> L3d
            goto Lc8
        Lc0:
            java.lang.String r11 = r2.getPath()     // Catch: java.lang.Exception -> L3d
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r11)     // Catch: java.lang.Exception -> L3d
        Lc8:
            s2.a r11 = r9.f4967D     // Catch: java.lang.Exception -> L3d
            r11.put(r10, r0)     // Catch: java.lang.Exception -> L3d
            return r0
        Lce:
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.m2943j(java.lang.String, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: k */
    public final synchronized void m2944k(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        try {
            java.lang.String m2063e = mediaMetadataCompat.m2063e("artCacheFile");
            if (m2063e != null) {
                this.f4965B = m2943j(m2063e, null);
                p043K2.C0339o c0339o = new p043K2.C0339o(mediaMetadataCompat);
                c0339o.m748F("android.media.metadata.ALBUM_ART", this.f4965B);
                c0339o.m748F("android.media.metadata.DISPLAY_ICON", this.f4965B);
                mediaMetadataCompat = new android.support.v4.media.MediaMetadataCompat((android.os.Bundle) c0339o.f1048m);
            } else {
                java.lang.String m2063e2 = mediaMetadataCompat.m2063e("android.media.metadata.DISPLAY_ICON_URI");
                if (m2063e2 == null || !m2063e2.startsWith("content:")) {
                    this.f4965B = null;
                } else {
                    this.f4965B = m2943j(m2063e2, mediaMetadataCompat.m2063e("loadThumbnailUri"));
                    p043K2.C0339o c0339o2 = new p043K2.C0339o(mediaMetadataCompat);
                    c0339o2.m748F("android.media.metadata.ALBUM_ART", this.f4965B);
                    c0339o2.m748F("android.media.metadata.DISPLAY_ICON", this.f4965B);
                    mediaMetadataCompat = new android.support.v4.media.MediaMetadataCompat((android.os.Bundle) c0339o2.f1048m);
                }
            }
            this.f4964A = mediaMetadataCompat;
            android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f4975v.f3861m;
            c1056o.f3851h = mediaMetadataCompat;
            if (mediaMetadataCompat.f3774m == null) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.f3774m = (android.media.MediaMetadata) android.media.MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            c1056o.f3844a.setMetadata(mediaMetadataCompat.f3774m);
            this.f4970G.removeCallbacksAndMessages(null);
            this.f4970G.post(new p026F2.RunnableC0226c(10, this));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Type inference failed for: r3v2, types: [W.l, java.lang.Object] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2945l(int r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6) {
        /*
            r2 = this;
            r0 = 1
            if (r3 != r0) goto L22
            android.support.v4.media.session.t r3 = r2.f4975v
            java.lang.Object r3 = r3.f3861m
            android.support.v4.media.session.o r3 = (android.support.v4.media.session.C1056o) r3
            r3.getClass()
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder
            r4.<init>()
            r5 = 3
            r4.setLegacyStreamType(r5)
            android.media.session.MediaSession r3 = r3.f3844a
            android.media.AudioAttributes r4 = r4.build()
            r3.setPlaybackToLocal(r4)
            r3 = 0
            r2.f4971H = r3
            goto L87
        L22:
            r0 = 2
            if (r3 != r0) goto L87
            W.l r3 = r2.f4971H
            if (r3 == 0) goto L4c
            int r3 = r4.intValue()
            W.l r0 = r2.f4971H
            int r0 = r0.f2765a
            if (r3 != r0) goto L4c
            int r3 = r5.intValue()
            W.l r0 = r2.f4971H
            int r1 = r0.f2766b
            if (r3 == r1) goto L3e
            goto L4c
        L3e:
            int r3 = r6.intValue()
            r0.f2767c = r3
            android.media.VolumeProvider r4 = r0.m1453c()
            p064Q.AbstractC0554z.m1061a(r4, r3)
            goto L65
        L4c:
            W.l r3 = new W.l
            int r4 = r4.intValue()
            int r5 = r5.intValue()
            int r6 = r6.intValue()
            r3.<init>()
            r3.f2765a = r4
            r3.f2766b = r5
            r3.f2767c = r6
            r2.f4971H = r3
        L65:
            android.support.v4.media.session.t r3 = r2.f4975v
            W.l r4 = r2.f4971H
            if (r4 == 0) goto L7c
            java.lang.Object r3 = r3.f3861m
            android.support.v4.media.session.o r3 = (android.support.v4.media.session.C1056o) r3
            r3.getClass()
            android.media.VolumeProvider r4 = r4.m1453c()
            android.media.session.MediaSession r3 = r3.f3844a
            r3.setPlaybackToRemote(r4)
            goto L87
        L7c:
            r3.getClass()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "volumeProvider may not be null!"
            r3.<init>(r4)
            throw r3
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.m2945l(int, java.lang.Integer, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x01cd, code lost:
    
        if (r33.f4968E != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01d0, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01d1, code lost:
    
        r17 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01d6, code lost:
    
        if (r33.f4968E != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0207  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2946m(java.util.ArrayList r34, long r35, int[] r37, int r38, boolean r39, long r40, long r42, float r44, long r45, java.lang.Integer r47, java.lang.String r48, int r49, int r50, boolean r51, java.lang.Long r52) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.m2946m(java.util.ArrayList, long, int[], int, boolean, long, long, float, long, java.lang.Integer, java.lang.String, int, int, boolean, java.lang.Long):void");
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [s2.a, android.util.LruCache] */
    @Override // p064Q.AbstractServiceC0548t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f4959J = this;
        this.f4969F = false;
        this.f4968E = false;
        this.f4972I = 1;
        this.f4975v = new android.support.v4.media.session.C1061t(this);
        m2941h(new p190s2.C2143c(getApplicationContext()));
        ((android.support.v4.media.session.C1056o) this.f4975v.f3861m).f3844a.setFlags(7);
        this.f4975v.m2248z0(new android.support.v4.media.session.PlaybackStateCompat(0, 0L, 0L, 0.0f, 3669711L, 0, null, 0L, new java.util.ArrayList(), -1L, null));
        android.support.v4.media.session.C1061t c1061t = this.f4975v;
        ((android.support.v4.media.session.C1056o) c1061t.f3861m).m2192e(new p190s2.C2142b(this), new android.os.Handler());
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = ((android.support.v4.media.session.C1056o) this.f4975v.f3861m).f3846c;
        if (mediaSessionCompat$Token == null) {
            throw new java.lang.IllegalArgumentException("Session token may not be null");
        }
        if (this.f1628r != null) {
            throw new java.lang.IllegalStateException("The session token has already been set");
        }
        this.f1628r = mediaSessionCompat$Token;
        p064Q.C0539k c0539k = this.f1622l;
        ((p064Q.AbstractServiceC0548t) c0539k.f1584d).f1627q.m1055a(new p054N1.RunnableC0462q(3, c0539k, mediaSessionCompat$Token));
        this.f4975v.m2205A0(f4962M);
        this.f4974u = ((android.os.PowerManager) getSystemService("power")).newWakeLock(1, com.ryanheise.audioservice.AudioService.class.getName());
        this.f4967D = new android.util.LruCache(((int) (java.lang.Runtime.getRuntime().maxMemory() / 1024)) / 8);
        p190s2.C2151k.m4273o(this);
        java.lang.System.out.println("flutterEngine warmed up");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r2 = (p013C2.C0138c) ((java.util.HashMap) p009B2.C0061r.m262i().f188m).get("audio_service_engine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r2.m473a();
        p009B2.C0061r.m262i().m274m("audio_service_engine", null);
     */
    @Override // p064Q.AbstractServiceC0548t, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.onDestroy():void");
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i4, int i5) {
        android.support.v4.media.session.C1061t c1061t = this.f4975v;
        int i6 = com.ryanheise.audioservice.MediaButtonReceiver.f4980a;
        if (c1061t == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return 2;
        }
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        android.support.v4.media.session.C1061t c1061t2 = (android.support.v4.media.session.C1061t) c1061t.f3862n;
        if (keyEvent != null) {
            ((android.support.v4.media.session.C1049h) c1061t2.f3861m).f3831a.dispatchMediaButtonEvent(keyEvent);
            return 2;
        }
        c1061t2.getClass();
        throw new java.lang.IllegalArgumentException("KeyEvent may not be null");
    }

    @Override // android.app.Service
    public final void onTaskRemoved(android.content.Intent intent) {
        p034H2.C0247a c0247a = f4961L;
        if (c0247a != null) {
            c0247a.m656a("onTaskRemoved", p190s2.C2151k.m4275q(new java.lang.Object[0]), null);
        }
        super.onTaskRemoved(intent);
    }
}
