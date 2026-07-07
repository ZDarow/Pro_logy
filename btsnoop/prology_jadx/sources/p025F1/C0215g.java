package p025F1;

/* renamed from: F1.g */
/* loaded from: classes.dex */
public final class C0215g implements p077T0.InterfaceC0719g, p083V0.InterfaceC0772j, p197u0.InterfaceC2229p, p136h0.InterfaceC1499p, p137h1.InterfaceC1501a, p142i1.InterfaceC1538c, p146j0.InterfaceC1722z, p161m0.InterfaceC1847d {

    /* renamed from: l */
    public static p025F1.C0215g f609l;

    /* renamed from: m */
    public static p025F1.C0215g f610m;

    public /* synthetic */ C0215g(java.lang.Object obj) {
    }

    /* renamed from: A */
    public static java.lang.Object m579A(java.lang.String str, android.database.Cursor cursor) {
        return str.equals("_id") ? android.os.Build.VERSION.SDK_INT >= 30 ? java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex(str))) : java.lang.Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str))) : cursor.getString(cursor.getColumnIndex(str));
    }

    /* renamed from: B */
    public static java.lang.Object m580B(java.lang.String str, android.database.Cursor cursor) {
        int hashCode = str.hashCode();
        return (hashCode == -825358278 ? str.equals("date_modified") : hashCode == 94650 ? str.equals("_id") : hashCode == 857618735 && str.equals("date_added")) ? java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex(str))) : cursor.getString(cursor.getColumnIndex(str));
    }

    /* renamed from: C */
    public static void m581C(android.net.Uri uri, java.util.HashMap hashMap) {
        p154k3.AbstractC1803h.m3779e(uri, "uri");
        java.io.File file = new java.io.File(java.lang.String.valueOf(hashMap.get("_data")));
        java.lang.String name = file.getName();
        p154k3.AbstractC1803h.m3778d(name, "getName(...)");
        int m4079m0 = p182q3.AbstractC2032i.m4079m0(name, ".");
        if (m4079m0 != -1) {
            name = name.substring(0, m4079m0);
            p154k3.AbstractC1803h.m3778d(name, "substring(...)");
        }
        hashMap.put("_display_name_wo_ext", name);
        hashMap.put("file_extension", p139h3.AbstractC1508a.m3334Q(file));
        android.net.Uri withAppendedId = android.content.ContentUris.withAppendedId(uri, java.lang.Long.parseLong(java.lang.String.valueOf(hashMap.get("_id"))));
        p154k3.AbstractC1803h.m3778d(withAppendedId, "withAppendedId(...)");
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
    
        if (p154k3.AbstractC1803h.m3775a(r3.getString(r3.getColumnIndex(r2)), "0") == false) goto L55;
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
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m582D(java.lang.String r2, android.database.Cursor r3) {
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
            boolean r2 = p154k3.AbstractC1803h.m3775a(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: p025F1.C0215g.m582D(java.lang.String, android.database.Cursor):java.lang.Object");
    }

    /* renamed from: t */
    public static byte[] m583t(p129f2.AbstractC1393I abstractC1393I, long j4) {
        p011C.C0111c c0111c = new p011C.C0111c(11);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(abstractC1393I.size());
        java.util.Iterator<E> it = abstractC1393I.iterator();
        while (it.hasNext()) {
            arrayList.add((android.os.Bundle) c0111c.apply(it.next()));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j4);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, B3.a] */
    /* renamed from: u */
    public static p010B3.C0081l m584u(java.lang.String str, boolean z4) {
        p154k3.AbstractC1803h.m3779e(str, "<this>");
        p010B3.C0071b c0071b = p014C3.AbstractC0145b.f390a;
        ?? obj = new java.lang.Object();
        obj.m305p(str);
        return p014C3.AbstractC0145b.m498d(obj, z4);
    }

    /* renamed from: v */
    public static p010B3.C0081l m585v(java.io.File file) {
        java.lang.String str = p010B3.C0081l.f255m;
        java.lang.String file2 = file.toString();
        p154k3.AbstractC1803h.m3778d(file2, "toString()");
        return m584u(file2, false);
    }

    /* renamed from: w */
    public static int m586w(int i4, java.lang.String str, android.content.ContentResolver contentResolver) {
        android.net.Uri contentUri;
        p154k3.AbstractC1803h.m3779e(contentResolver, "resolver");
        if (i4 == 0) {
            contentUri = android.provider.MediaStore.Audio.Genres.Members.getContentUri("external", java.lang.Long.parseLong(str));
            p154k3.AbstractC1803h.m3776b(contentUri);
        } else {
            contentUri = android.provider.MediaStore.Audio.Playlists.Members.getContentUri("external", java.lang.Long.parseLong(str));
            p154k3.AbstractC1803h.m3776b(contentUri);
        }
        android.database.Cursor query = contentResolver.query(contentUri, null, null, null, null);
        int count = query != null ? query.getCount() : -1;
        if (query != null) {
            query.close();
        }
        return count;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m587x(java.lang.String r2, android.database.Cursor r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: p025F1.C0215g.m587x(java.lang.String, android.database.Cursor):java.lang.Object");
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
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m588y(java.lang.String r2, android.database.Cursor r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: p025F1.C0215g.m588y(java.lang.String, android.database.Cursor):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:(9:(1:(1:(1:7))(1:9))|40|11|12|(1:(1:38)(1:37))(1:15)|16|(5:18|19|20|(1:27)(1:25)|26)|(1:32)|33)(1:41))(1:42)|10|11|12|(0)|(0)|38|16|(0)|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m589z(int r14, java.lang.Number r15, android.content.ContentResolver r16) {
        /*
            r0 = r14
            java.lang.String r1 = "id"
            r2 = r15
            p154k3.AbstractC1803h.m3779e(r15, r1)
            java.lang.String r1 = "resolver"
            r3 = r16
            p154k3.AbstractC1803h.m3779e(r3, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: p025F1.C0215g.m589z(int, java.lang.Number, android.content.ContentResolver):java.lang.String");
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: a */
    public long mo590a(p215y0.C2400l c2400l) {
        return -1L;
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: b */
    public boolean mo50b(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: c */
    public int mo51c() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // p083V0.InterfaceC0772j
    /* renamed from: d */
    public p083V0.InterfaceC0774l mo591d(p076T.C0702p c0702p) {
        throw new java.lang.IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p083V0.InterfaceC0772j
    /* renamed from: e */
    public int mo592e(p076T.C0702p c0702p) {
        return 1;
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: f */
    public android.media.MediaCodecInfo mo54f(int i4) {
        return android.media.MediaCodecList.getCodecInfoAt(i4);
    }

    @Override // p137h1.InterfaceC1501a
    /* renamed from: g */
    public java.lang.CharSequence mo593g(androidx.preference.Preference preference) {
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) preference;
        listPreference.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            return listPreference.f4378l.getString(com.prology.R.string.not_set);
        }
        return null;
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: h */
    public p215y0.InterfaceC2414z mo594h() {
        return new p002A0.C0004b(-9223372036854775807L);
    }

    @Override // p142i1.InterfaceC1538c
    /* renamed from: i */
    public void mo595i(int i4, java.io.Serializable serializable) {
        java.lang.String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
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
            android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) serializable);
        } else {
            android.util.Log.d("ProfileInstaller", str);
        }
    }

    @Override // p136h0.InterfaceC1499p
    /* renamed from: j */
    public p197u0.InterfaceC2229p mo596j(p136h0.C1495l c1495l, p136h0.C1492i c1492i) {
        return new p136h0.C1498o(c1495l, c1492i);
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: k */
    public boolean mo57k(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // p161m0.InterfaceC1847d
    /* renamed from: l */
    public p161m0.InterfaceC1848e mo597l(int i4) {
        p161m0.C1842G c1842g = new p161m0.C1842G();
        c1842g.mo1686b(p176p1.AbstractC1949a.m3945x(i4 * 2));
        return c1842g;
    }

    @Override // p142i1.InterfaceC1538c
    /* renamed from: m */
    public void mo598m() {
        android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: n */
    public void mo599n(long j4) {
    }

    @Override // p083V0.InterfaceC0772j
    /* renamed from: o */
    public boolean mo600o(p076T.C0702p c0702p) {
        return false;
    }

    @Override // p197u0.InterfaceC2229p
    /* renamed from: p */
    public java.lang.Object mo601p(android.net.Uri uri, p094Y.C0872j c0872j) {
        return java.lang.Long.valueOf(p086W.AbstractC0805y.m1595P(new java.io.BufferedReader(new java.io.InputStreamReader(c0872j)).readLine()));
    }

    @Override // p136h0.InterfaceC1499p
    /* renamed from: q */
    public p197u0.InterfaceC2229p mo602q() {
        return new p136h0.C1498o(p136h0.C1495l.f6140l, null);
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: r */
    public boolean mo60r() {
        return false;
    }

    /* renamed from: s */
    public java.lang.String m603s(java.util.List list) {
        p154k3.AbstractC1803h.m3779e(list, "list");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        java.lang.String encodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        p154k3.AbstractC1803h.m3778d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public C0215g() {
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
    }
}
