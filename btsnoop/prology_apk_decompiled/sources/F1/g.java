package F1;

import C.C0016c;
import T.C0095p;
import W.y;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.prology.R;
import f2.G;
import f2.I;
import f2.c0;
import h1.InterfaceC0316a;
import j0.z;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m0.C0418G;
import m0.InterfaceC0423d;
import m0.InterfaceC0424e;
import p1.AbstractC0462a;
import u0.p;

/* loaded from: classes.dex */
public final class g implements T0.g, V0.j, p, h0.p, InterfaceC0316a, i1.c, z, InterfaceC0423d {

    /* renamed from: l, reason: collision with root package name */
    public static g f599l;

    /* renamed from: m, reason: collision with root package name */
    public static g f600m;

    public /* synthetic */ g(Object obj) {
    }

    public static Object A(String str, Cursor cursor) {
        return str.equals("_id") ? Build.VERSION.SDK_INT >= 30 ? Long.valueOf(cursor.getLong(cursor.getColumnIndex(str))) : Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str))) : cursor.getString(cursor.getColumnIndex(str));
    }

    public static Object B(String str, Cursor cursor) {
        int hashCode = str.hashCode();
        return (hashCode == -825358278 ? str.equals("date_modified") : hashCode == 94650 ? str.equals("_id") : hashCode == 857618735 && str.equals("date_added")) ? Long.valueOf(cursor.getLong(cursor.getColumnIndex(str))) : cursor.getString(cursor.getColumnIndex(str));
    }

    public static void C(Uri uri, HashMap hashMap) {
        k3.h.e(uri, "uri");
        File file = new File(String.valueOf(hashMap.get("_data")));
        String name = file.getName();
        k3.h.d(name, "getName(...)");
        int m02 = q3.i.m0(name, ".");
        if (m02 != -1) {
            name = name.substring(0, m02);
            k3.h.d(name, "substring(...)");
        }
        hashMap.put("_display_name_wo_ext", name);
        hashMap.put("file_extension", h3.a.Q(file));
        Uri withAppendedId = ContentUris.withAppendedId(uri, Long.parseLong(String.valueOf(hashMap.get("_id"))));
        k3.h.d(withAppendedId, "withAppendedId(...)");
        hashMap.put("_uri", withAppendedId.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 30) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return java.lang.Integer.valueOf(r3.getInt(r3.getColumnIndex(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        if (r2.equals("is_podcast") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (k3.h.a(r3.getString(r3.getColumnIndex(r2)), "0") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        if (r2.equals("date_added") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r2.equals("artist_id") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        if (r2.equals("is_music") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r2.equals("track") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r2.equals("is_alarm") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if (r2.equals("_size") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        if (r2.equals("_id") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r2.equals("is_notification") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r2.equals("date_modified") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r2.equals("is_audiobook") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        if (r2.equals("is_ringtone") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        if (r2.equals("duration") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2.equals("bookmark") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00e3, code lost:
    
        return java.lang.Integer.valueOf(r3.getInt(r3.getColumnIndex(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2.equals("album_id") == false) goto L59;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object D(java.lang.String r2, android.database.Cursor r3) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -1992012396: goto Lc6;
                case -1971613929: goto La7;
                case -1122494742: goto L9e;
                case -825358278: goto L95;
                case -138798624: goto L8c;
                case 94650: goto L63;
                case 91265248: goto L59;
                case 107864828: goto L4f;
                case 110621003: goto L45;
                case 119232208: goto L3b;
                case 574519571: goto L31;
                case 857618735: goto L27;
                case 1094741231: goto L1d;
                case 1532078315: goto L13;
                case 2005378358: goto L9;
                default: goto L7;
            }
        L7:
            goto Lce
        L9:
            java.lang.String r0 = "bookmark"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld7
            goto Lce
        L13:
            java.lang.String r0 = "album_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6c
            goto Lce
        L1d:
            java.lang.String r0 = "is_podcast"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb0
            goto Lce
        L27:
            java.lang.String r0 = "date_added"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld7
            goto Lce
        L31:
            java.lang.String r0 = "artist_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6c
            goto Lce
        L3b:
            java.lang.String r0 = "is_music"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb0
            goto Lce
        L45:
            java.lang.String r0 = "track"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld7
            goto Lce
        L4f:
            java.lang.String r0 = "is_alarm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb0
            goto Lce
        L59:
            java.lang.String r0 = "_size"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld7
            goto Lce
        L63:
            java.lang.String r0 = "_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6c
            goto Lce
        L6c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L7f
            int r2 = r3.getColumnIndex(r2)
            long r2 = r3.getLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto Le3
        L7f:
            int r2 = r3.getColumnIndex(r2)
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto Le3
        L8c:
            java.lang.String r0 = "is_notification"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb0
            goto Lce
        L95:
            java.lang.String r0 = "date_modified"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld7
            goto Lce
        L9e:
            java.lang.String r0 = "is_audiobook"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb0
            goto Lce
        La7:
            java.lang.String r0 = "is_ringtone"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb0
            goto Lce
        Lb0:
            int r2 = r3.getColumnIndex(r2)
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r3 = "0"
            boolean r2 = k3.h.a(r2, r3)
            if (r2 == 0) goto Lc3
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        Lc3:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        Lc6:
            java.lang.String r0 = "duration"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld7
        Lce:
            int r2 = r3.getColumnIndex(r2)
            java.lang.String r2 = r3.getString(r2)
            goto Le3
        Ld7:
            int r2 = r3.getColumnIndex(r2)
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        Le3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.g.D(java.lang.String, android.database.Cursor):java.lang.Object");
    }

    public static byte[] t(I i4, long j4) {
        C0016c c0016c = new C0016c(11);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i4.size());
        Iterator<E> it = i4.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) c0016c.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j4);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, B3.a] */
    public static B3.l u(String str, boolean z4) {
        k3.h.e(str, "<this>");
        B3.b bVar = C3.b.f382a;
        ?? obj = new Object();
        obj.p(str);
        return C3.b.d(obj, z4);
    }

    public static B3.l v(File file) {
        String str = B3.l.f250m;
        String file2 = file.toString();
        k3.h.d(file2, "toString()");
        return u(file2, false);
    }

    public static int w(int i4, String str, ContentResolver contentResolver) {
        Uri contentUri;
        k3.h.e(contentResolver, "resolver");
        if (i4 == 0) {
            contentUri = MediaStore.Audio.Genres.Members.getContentUri("external", Long.parseLong(str));
            k3.h.b(contentUri);
        } else {
            contentUri = MediaStore.Audio.Playlists.Members.getContentUri("external", Long.parseLong(str));
            k3.h.b(contentUri);
        }
        Cursor query = contentResolver.query(contentUri, null, null, null, null);
        int count = query != null ? query.getCount() : -1;
        if (query != null) {
            query.close();
        }
        return count;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object x(java.lang.String r2, android.database.Cursor r3) {
        /*
            int r0 = r2.hashCode()
            r1 = -1870445000(0xffffffff90834638, float:-5.177858E-29)
            if (r0 == r1) goto L46
            r1 = 94650(0x171ba, float:1.32633E-40)
            if (r0 == r1) goto L1d
            r1 = 574519571(0x223e7913, float:2.5813898E-18)
            if (r0 == r1) goto L14
            goto L4e
        L14:
            java.lang.String r0 = "artist_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4e
            goto L26
        L1d:
            java.lang.String r0 = "_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L26
            goto L4e
        L26:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L39
            int r2 = r3.getColumnIndex(r2)
            long r2 = r3.getLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L63
        L39:
            int r2 = r3.getColumnIndex(r2)
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L63
        L46:
            java.lang.String r0 = "numsongs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
        L4e:
            int r2 = r3.getColumnIndex(r2)
            java.lang.String r2 = r3.getString(r2)
            goto L63
        L57:
            int r2 = r3.getColumnIndex(r2)
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.g.x(java.lang.String, android.database.Cursor):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        return java.lang.Integer.valueOf(r3.getInt(r3.getColumnIndex(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r2.equals("number_of_tracks") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2.equals("number_of_albums") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object y(java.lang.String r2, android.database.Cursor r3) {
        /*
            int r0 = r2.hashCode()
            r1 = -1862973830(0xffffffff90f5467a, float:-9.674405E-29)
            if (r0 == r1) goto L46
            r1 = 94650(0x171ba, float:1.32633E-40)
            if (r0 == r1) goto L1d
            r1 = 1882545622(0x70355dd6, float:2.2452091E29)
            if (r0 == r1) goto L14
            goto L4e
        L14:
            java.lang.String r0 = "number_of_albums"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
            goto L4e
        L1d:
            java.lang.String r0 = "_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L26
            goto L4e
        L26:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L39
            int r2 = r3.getColumnIndex(r2)
            long r2 = r3.getLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L63
        L39:
            int r2 = r3.getColumnIndex(r2)
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L63
        L46:
            java.lang.String r0 = "number_of_tracks"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
        L4e:
            int r2 = r3.getColumnIndex(r2)
            java.lang.String r2 = r3.getString(r2)
            goto L63
        L57:
            int r2 = r3.getColumnIndex(r2)
            int r2 = r3.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.g.y(java.lang.String, android.database.Cursor):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:(9:(1:(1:(1:7))(1:9))|40|11|12|(1:(1:38)(1:37))(1:15)|16|(5:18|19|20|(1:27)(1:25)|26)|(1:32)|33)(1:41))(1:42)|10|11|12|(0)|(0)|38|16|(0)|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String z(int r14, java.lang.Number r15, android.content.ContentResolver r16) {
        /*
            r0 = r14
            java.lang.String r1 = "id"
            r2 = r15
            k3.h.e(r15, r1)
            java.lang.String r1 = "resolver"
            r3 = r16
            k3.h.e(r3, r1)
            r1 = 3
            r8 = 1
            r9 = 4
            r10 = 2
            r11 = 0
            if (r0 == 0) goto L27
            if (r0 == r8) goto L24
            if (r0 == r10) goto L1e
            if (r0 == r1) goto L20
            if (r0 == r9) goto L1e
            return r11
        L1e:
            r5 = r11
            goto L2a
        L20:
            java.lang.String r4 = "artist_id=?"
        L22:
            r5 = r4
            goto L2a
        L24:
            java.lang.String r4 = "album_id=?"
            goto L22
        L27:
            java.lang.String r4 = "_id=?"
            goto L22
        L2a:
            java.lang.String r4 = "audio_id"
            java.lang.String r6 = "external"
            java.lang.String r7 = "_data"
            if (r0 != r10) goto L4d
            if (r5 != 0) goto L4d
            long r12 = r15.longValue()     // Catch: java.lang.Exception -> L86
            android.net.Uri r5 = android.provider.MediaStore.Audio.Playlists.Members.getContentUri(r6, r12)     // Catch: java.lang.Exception -> L86
            java.lang.String[] r4 = new java.lang.String[]{r7, r4}     // Catch: java.lang.Exception -> L86
            r7 = 0
            r6 = 0
            r12 = 0
            r2 = r16
            r3 = r5
            r5 = r6
            r6 = r12
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L86
            goto L87
        L4d:
            if (r0 != r9) goto L6a
            if (r5 != 0) goto L6a
            long r12 = r15.longValue()     // Catch: java.lang.Exception -> L86
            android.net.Uri r5 = android.provider.MediaStore.Audio.Genres.Members.getContentUri(r6, r12)     // Catch: java.lang.Exception -> L86
            java.lang.String[] r4 = new java.lang.String[]{r7, r4}     // Catch: java.lang.Exception -> L86
            r7 = 0
            r6 = 0
            r12 = 0
            r2 = r16
            r3 = r5
            r5 = r6
            r6 = r12
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L86
            goto L87
        L6a:
            android.net.Uri r4 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L86
            java.lang.String r6 = "_id"
            java.lang.String[] r6 = new java.lang.String[]{r7, r6}     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = r15.toString()     // Catch: java.lang.Exception -> L86
            java.lang.String[] r7 = new java.lang.String[]{r2}     // Catch: java.lang.Exception -> L86
            r12 = 0
            r2 = r16
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r12
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L86
            goto L87
        L86:
            r2 = r11
        L87:
            if (r2 == 0) goto Laf
            r2.moveToFirst()
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L9e
            r4 = 29
            if (r3 < r4) goto La0
            if (r0 == r10) goto L98
            if (r0 == r1) goto L98
            if (r0 != r9) goto La0
        L98:
            java.lang.String r0 = r2.getString(r8)     // Catch: java.lang.Exception -> L9e
        L9c:
            r11 = r0
            goto Laf
        L9e:
            r0 = move-exception
            goto La6
        La0:
            r0 = 0
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Exception -> L9e
            goto L9c
        La6:
            java.lang.String r1 = "on_audio_error"
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r1, r0)
        Laf:
            if (r2 == 0) goto Lb4
            r2.close()
        Lb4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.g.z(int, java.lang.Number, android.content.ContentResolver):java.lang.String");
    }

    @Override // T0.g
    public long a(y0.l lVar) {
        return -1L;
    }

    @Override // j0.z
    public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // j0.z
    public int c() {
        return MediaCodecList.getCodecCount();
    }

    @Override // V0.j
    public V0.l d(C0095p c0095p) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // V0.j
    public int e(C0095p c0095p) {
        return 1;
    }

    @Override // j0.z
    public MediaCodecInfo f(int i4) {
        return MediaCodecList.getCodecInfoAt(i4);
    }

    @Override // h1.InterfaceC0316a
    public CharSequence g(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f4227l.getString(R.string.not_set);
        }
        return null;
    }

    @Override // T0.g
    public y0.z h() {
        return new A0.b(-9223372036854775807L);
    }

    @Override // i1.c
    public void i(int i4, Serializable serializable) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // h0.p
    public p j(h0.l lVar, h0.i iVar) {
        return new h0.o(lVar, iVar);
    }

    @Override // j0.z
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // m0.InterfaceC0423d
    public InterfaceC0424e l(int i4) {
        C0418G c0418g = new C0418G();
        c0418g.b(AbstractC0462a.x(i4 * 2));
        return c0418g;
    }

    @Override // i1.c
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // T0.g
    public void n(long j4) {
    }

    @Override // V0.j
    public boolean o(C0095p c0095p) {
        return false;
    }

    @Override // u0.p
    public Object p(Uri uri, Y.j jVar) {
        return Long.valueOf(y.P(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // h0.p
    public p q() {
        return new h0.o(h0.l.f5923l, null);
    }

    @Override // j0.z
    public boolean r() {
        return false;
    }

    public String s(List list) {
        k3.h.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        k3.h.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public g() {
        G g4 = I.f5510m;
        c0 c0Var = c0.f5550p;
    }
}
