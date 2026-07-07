package com.ryanheise.audioservice;

import B1.d;
import F2.c;
import H2.a;
import N1.q;
import Q.m;
import Q.t;
import W.l;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.PowerManager;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.h;
import android.support.v4.media.session.o;
import android.util.LruCache;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import r.C0496a;
import r.C0498c;
import s2.C0544a;
import s2.C0545b;
import s2.C0546c;
import s2.C0551h;
import s2.k;

/* loaded from: classes.dex */
public class AudioService extends t {
    public static AudioService J;

    /* renamed from: K, reason: collision with root package name */
    public static PendingIntent f4782K;

    /* renamed from: L, reason: collision with root package name */
    public static a f4783L;

    /* renamed from: M, reason: collision with root package name */
    public static ArrayList f4784M = new ArrayList();

    /* renamed from: N, reason: collision with root package name */
    public static final HashMap f4785N = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    public MediaMetadataCompat f4786A;

    /* renamed from: B, reason: collision with root package name */
    public Bitmap f4787B;

    /* renamed from: C, reason: collision with root package name */
    public String f4788C;

    /* renamed from: D, reason: collision with root package name */
    public C0544a f4789D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4791F;

    /* renamed from: H, reason: collision with root package name */
    public l f4793H;

    /* renamed from: t, reason: collision with root package name */
    public C0546c f4795t;

    /* renamed from: u, reason: collision with root package name */
    public PowerManager.WakeLock f4796u;

    /* renamed from: v, reason: collision with root package name */
    public android.support.v4.media.session.t f4797v;

    /* renamed from: z, reason: collision with root package name */
    public int[] f4800z;
    public ArrayList w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f4798x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f4799y = new ArrayList();

    /* renamed from: E, reason: collision with root package name */
    public boolean f4790E = false;

    /* renamed from: I, reason: collision with root package name */
    public int f4794I = 1;

    /* renamed from: G, reason: collision with root package name */
    public final Handler f4792G = new Handler(Looper.getMainLooper());

    @Override // Q.t
    public final d b(Bundle bundle) {
        Bundle bundle2 = null;
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = Boolean.FALSE;
        }
        C0546c c0546c = this.f4795t;
        if (c0546c.f8232o != null) {
            try {
                JSONObject jSONObject = new JSONObject(c0546c.f8232o);
                Bundle bundle3 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        try {
                            try {
                                try {
                                    bundle3.putInt(next, jSONObject.getInt(next));
                                } catch (Exception unused) {
                                    bundle3.putString(next, jSONObject.getString(next));
                                }
                            } catch (Exception unused2) {
                                bundle3.putBoolean(next, jSONObject.getBoolean(next));
                            }
                        } catch (Exception unused3) {
                            System.out.println("Unsupported extras value for key " + next);
                        }
                    } catch (Exception unused4) {
                        bundle3.putDouble(next, jSONObject.getDouble(next));
                    }
                }
                bundle2 = bundle3;
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return new d(valueOf.booleanValue() ? "recent" : "root", bundle2);
    }

    @Override // Q.t
    public final void c(String str, m mVar, Bundle bundle) {
        if (f4783L == null) {
            mVar.e(new ArrayList());
            return;
        }
        if (k.f8253t != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("parentMediaId", str);
            hashMap.put("options", k.k(bundle));
            k.f8253t.a("getChildren", hashMap, new C0551h(mVar, 0));
        }
        mVar.a();
    }

    @Override // Q.t
    public final void d(String str, m mVar) {
        if (f4783L == null) {
            mVar.e(null);
            return;
        }
        if (k.f8253t != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("mediaId", str);
            k.f8253t.a("getMediaItem", hashMap, new C0551h(mVar, 1));
        }
        mVar.a();
    }

    public final PendingIntent f(long j4) {
        int i4 = j4 == 4 ? 91 : j4 == 2 ? 130 : j4 == 4 ? 126 : j4 == 2 ? 127 : j4 == 32 ? 87 : j4 == 16 ? 88 : j4 == 1 ? 86 : j4 == 64 ? 90 : j4 == 8 ? 89 : j4 == 512 ? 85 : 0;
        if (i4 == 0) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i4));
        return PendingIntent.getBroadcast(this, i4, intent, 67108864);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [E0.e, R.c, java.lang.Object] */
    public final Notification g() {
        int[] iArr = this.f4800z;
        if (iArr == null) {
            int min = Math.min(3, this.f4798x.size());
            int[] iArr2 = new int[min];
            for (int i4 = 0; i4 < min; i4++) {
                iArr2[i4] = i4;
            }
            iArr = iArr2;
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager.getNotificationChannel(this.f4788C) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(this.f4788C, this.f4795t.f8221d, 2);
            notificationChannel.setShowBadge(this.f4795t.f8225h);
            String str = this.f4795t.f8222e;
            if (str != null) {
                notificationChannel.setDescription(str);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        C0498c c0498c = new C0498c(this, this.f4788C);
        c0498c.f7974p = 1;
        c0498c.f7968j = false;
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        c0498c.s.deleteIntent = PendingIntent.getBroadcast(this, 0, intent, 67108864);
        c0498c.s.icon = i(this.f4795t.f8224g);
        MediaMetadataCompat mediaMetadataCompat = this.f4786A;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat d4 = mediaMetadataCompat.d();
            CharSequence charSequence = d4.f3637m;
            if (charSequence != null) {
                c0498c.f7963e = C0498c.b(charSequence);
            }
            CharSequence charSequence2 = d4.f3638n;
            if (charSequence2 != null) {
                c0498c.f7964f = C0498c.b(charSequence2);
            }
            CharSequence charSequence3 = d4.f3639o;
            if (charSequence3 != null) {
                c0498c.f7970l = C0498c.b(charSequence3);
            }
            synchronized (this) {
                try {
                    Bitmap bitmap = this.f4787B;
                    if (bitmap != null) {
                        c0498c.d(bitmap);
                    }
                } finally {
                }
            }
        }
        if (this.f4795t.f8226i) {
            c0498c.f7965g = ((h) ((android.support.v4.media.session.t) this.f4797v.f3735n).f3734m).f3704a.getSessionActivity();
        }
        int i5 = this.f4795t.f8223f;
        if (i5 != -1) {
            c0498c.f7973o = i5;
        }
        Iterator it = this.f4798x.iterator();
        while (it.hasNext()) {
            C0496a c0496a = (C0496a) it.next();
            if (c0496a != null) {
                c0498c.f7960b.add(c0496a);
            }
        }
        ?? obj = new Object();
        obj.f1712b = null;
        obj.f1713c = ((o) this.f4797v.f3734m).f3719c;
        if (Build.VERSION.SDK_INT < 33) {
            obj.f1712b = iArr;
        }
        if (this.f4795t.f8227j) {
            f(1L);
            c0498c.c(2, true);
        }
        c0498c.e(obj);
        return c0498c.a();
    }

    public final void h(C0546c c0546c) {
        this.f4795t = c0546c;
        String str = c0546c.f8220c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f4788C = str;
        if (c0546c.f8231n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, c0546c.f8231n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            f4782K = PendingIntent.getActivity(applicationContext, 1000, intent, 201326592);
        } else {
            f4782K = null;
        }
        if (c0546c.f8219b) {
            return;
        }
        ((o) this.f4797v.f3734m).f3717a.setMediaButtonReceiver(null);
    }

    public final int i(String str) {
        String[] split = str.split("/");
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:7:0x000c, B:46:0x001f, B:48:0x0025, B:50:0x0038, B:51:0x0040, B:53:0x0046, B:54:0x004a, B:11:0x0054, B:13:0x0060, B:16:0x00c8, B:19:0x006b, B:21:0x0071, B:23:0x007b, B:24:0x0086, B:27:0x00a3, B:29:0x00aa, B:31:0x00b0, B:32:0x0094, B:33:0x0098, B:35:0x009c, B:37:0x00a0, B:40:0x007f, B:42:0x00bb, B:43:0x00c0), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap j(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            s2.a r0 = r9.f4789D
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
            s2.c r6 = r9.f4795t     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            int r6 = r6.f8229l     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r6 != r4) goto L40
            int r6 = r11.getWidth()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            goto L40
        L3d:
            r10 = move-exception
            goto Lce
        L40:
            s2.c r7 = r9.f4795t     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            int r7 = r7.f8230m     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r7 != r4) goto L4a
            int r7 = r11.getHeight()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
        L4a:
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            android.graphics.Bitmap r0 = j0.n.b(r0, r2, r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
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
            s2.c r0 = r9.f4795t     // Catch: java.lang.Exception -> L3d
            int r0 = r0.f8229l     // Catch: java.lang.Exception -> L3d
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
            s2.c r4 = r9.f4795t     // Catch: java.lang.Exception -> L3d
            int r5 = r4.f8229l     // Catch: java.lang.Exception -> L3d
            int r4 = r4.f8230m     // Catch: java.lang.Exception -> L3d
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
            s2.a r11 = r9.f4789D     // Catch: java.lang.Exception -> L3d
            r11.put(r10, r0)     // Catch: java.lang.Exception -> L3d
            return r0
        Lce:
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.j(java.lang.String, java.lang.String):android.graphics.Bitmap");
    }

    public final synchronized void k(MediaMetadataCompat mediaMetadataCompat) {
        try {
            String e4 = mediaMetadataCompat.e("artCacheFile");
            if (e4 != null) {
                this.f4787B = j(e4, null);
                K2.o oVar = new K2.o(mediaMetadataCompat);
                oVar.F("android.media.metadata.ALBUM_ART", this.f4787B);
                oVar.F("android.media.metadata.DISPLAY_ICON", this.f4787B);
                mediaMetadataCompat = new MediaMetadataCompat((Bundle) oVar.f1009m);
            } else {
                String e5 = mediaMetadataCompat.e("android.media.metadata.DISPLAY_ICON_URI");
                if (e5 == null || !e5.startsWith("content:")) {
                    this.f4787B = null;
                } else {
                    this.f4787B = j(e5, mediaMetadataCompat.e("loadThumbnailUri"));
                    K2.o oVar2 = new K2.o(mediaMetadataCompat);
                    oVar2.F("android.media.metadata.ALBUM_ART", this.f4787B);
                    oVar2.F("android.media.metadata.DISPLAY_ICON", this.f4787B);
                    mediaMetadataCompat = new MediaMetadataCompat((Bundle) oVar2.f1009m);
                }
            }
            this.f4786A = mediaMetadataCompat;
            o oVar3 = (o) this.f4797v.f3734m;
            oVar3.f3724h = mediaMetadataCompat;
            if (mediaMetadataCompat.f3649m == null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.f3649m = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            oVar3.f3717a.setMetadata(mediaMetadataCompat.f3649m);
            this.f4792G.removeCallbacksAndMessages(null);
            this.f4792G.post(new c(10, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Type inference failed for: r3v2, types: [W.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6) {
        /*
            r2 = this;
            r0 = 1
            if (r3 != r0) goto L22
            android.support.v4.media.session.t r3 = r2.f4797v
            java.lang.Object r3 = r3.f3734m
            android.support.v4.media.session.o r3 = (android.support.v4.media.session.o) r3
            r3.getClass()
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder
            r4.<init>()
            r5 = 3
            r4.setLegacyStreamType(r5)
            android.media.session.MediaSession r3 = r3.f3717a
            android.media.AudioAttributes r4 = r4.build()
            r3.setPlaybackToLocal(r4)
            r3 = 0
            r2.f4793H = r3
            goto L87
        L22:
            r0 = 2
            if (r3 != r0) goto L87
            W.l r3 = r2.f4793H
            if (r3 == 0) goto L4c
            int r3 = r4.intValue()
            W.l r0 = r2.f4793H
            int r0 = r0.f2673a
            if (r3 != r0) goto L4c
            int r3 = r5.intValue()
            W.l r0 = r2.f4793H
            int r1 = r0.f2674b
            if (r3 == r1) goto L3e
            goto L4c
        L3e:
            int r3 = r6.intValue()
            r0.f2675c = r3
            android.media.VolumeProvider r4 = r0.c()
            Q.z.a(r4, r3)
            goto L65
        L4c:
            W.l r3 = new W.l
            int r4 = r4.intValue()
            int r5 = r5.intValue()
            int r6 = r6.intValue()
            r3.<init>()
            r3.f2673a = r4
            r3.f2674b = r5
            r3.f2675c = r6
            r2.f4793H = r3
        L65:
            android.support.v4.media.session.t r3 = r2.f4797v
            W.l r4 = r2.f4793H
            if (r4 == 0) goto L7c
            java.lang.Object r3 = r3.f3734m
            android.support.v4.media.session.o r3 = (android.support.v4.media.session.o) r3
            r3.getClass()
            android.media.VolumeProvider r4 = r4.c()
            android.media.session.MediaSession r3 = r3.f3717a
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
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.l(int, java.lang.Integer, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x01cd, code lost:
    
        if (r33.f4790E != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01d0, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01d1, code lost:
    
        r17 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01d6, code lost:
    
        if (r33.f4790E != false) goto L102;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.util.ArrayList r34, long r35, int[] r37, int r38, boolean r39, long r40, long r42, float r44, long r45, java.lang.Integer r47, java.lang.String r48, int r49, int r50, boolean r51, java.lang.Long r52) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.m(java.util.ArrayList, long, int[], int, boolean, long, long, float, long, java.lang.Integer, java.lang.String, int, int, boolean, java.lang.Long):void");
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [s2.a, android.util.LruCache] */
    @Override // Q.t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        J = this;
        this.f4791F = false;
        this.f4790E = false;
        this.f4794I = 1;
        this.f4797v = new android.support.v4.media.session.t(this);
        h(new C0546c(getApplicationContext()));
        ((o) this.f4797v.f3734m).f3717a.setFlags(7);
        this.f4797v.z0(new PlaybackStateCompat(0, 0L, 0L, 0.0f, 3669711L, 0, null, 0L, new ArrayList(), -1L, null));
        android.support.v4.media.session.t tVar = this.f4797v;
        ((o) tVar.f3734m).e(new C0545b(this), new Handler());
        MediaSessionCompat$Token mediaSessionCompat$Token = ((o) this.f4797v.f3734m).f3719c;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f1576r != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f1576r = mediaSessionCompat$Token;
        Q.k kVar = this.f1570l;
        ((t) kVar.f1533d).f1575q.a(new q(3, kVar, mediaSessionCompat$Token));
        this.f4797v.A0(f4784M);
        this.f4796u = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f4789D = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        k.o(this);
        System.out.println("flutterEngine warmed up");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r2 = (C2.c) ((java.util.HashMap) B2.r.i().f185m).get("audio_service_engine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r2.a();
        B2.r.i().m("audio_service_engine", null);
     */
    @Override // Q.t, android.app.Service
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
    public final int onStartCommand(Intent intent, int i4, int i5) {
        android.support.v4.media.session.t tVar = this.f4797v;
        int i6 = MediaButtonReceiver.f4801a;
        if (tVar == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return 2;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        android.support.v4.media.session.t tVar2 = (android.support.v4.media.session.t) tVar.f3735n;
        if (keyEvent != null) {
            ((h) tVar2.f3734m).f3704a.dispatchMediaButtonEvent(keyEvent);
            return 2;
        }
        tVar2.getClass();
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        a aVar = f4783L;
        if (aVar != null) {
            aVar.a("onTaskRemoved", k.q(new Object[0]), null);
        }
        super.onTaskRemoved(intent);
    }
}
