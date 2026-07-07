package p009B2;

/* renamed from: B2.B */
/* loaded from: classes.dex */
public final class C0031B implements p009B2.InterfaceC0035F {

    /* renamed from: l */
    public final p047L2.InterfaceC0376f f113l;

    /* renamed from: m */
    public final java.util.HashMap f114m = new java.util.HashMap();

    /* renamed from: n */
    public final java.util.HashMap f115n;

    /* renamed from: o */
    public final p009B2.C0032C f116o;

    /* JADX WARN: Type inference failed for: r4v2, types: [B2.J, java.lang.Object] */
    public C0031B(p047L2.InterfaceC0376f interfaceC0376f) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f115n = hashMap;
        this.f116o = new p009B2.C0032C();
        this.f113l = interfaceC0376f;
        p009B2.C0037H c0037h = p009B2.AbstractC0040K.f128a;
        ?? obj = new java.lang.Object();
        obj.f127a = false;
        p009B2.C0039J c0039j = new p009B2.C0039J[]{obj}[0];
        c0039j.getClass();
        hashMap.put(4294967556L, c0039j);
    }

    /* renamed from: a */
    public final void m114a(p009B2.C0068y c0068y, final p009B2.C0033D c0033d) {
        long j4;
        long j5;
        byte[] bArr = null;
        p047L2.InterfaceC0375e interfaceC0375e = c0033d == null ? null : new p047L2.InterfaceC0375e() { // from class: B2.z
            @Override // p047L2.InterfaceC0375e
            /* renamed from: a */
            public final void mo289a(java.nio.ByteBuffer byteBuffer) {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = java.lang.Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    android.util.Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                p009B2.C0033D.this.m120c(bool.booleanValue());
            }
        };
        try {
            java.lang.String str = c0068y.f226g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(c0068y.f220a);
            int i4 = c0068y.f221b;
            if (i4 == 1) {
                j4 = 0;
            } else if (i4 == 2) {
                j4 = 1;
            } else {
                if (i4 != 3) {
                    throw null;
                }
                j4 = 2;
            }
            allocateDirect.putLong(j4);
            allocateDirect.putLong(c0068y.f222c);
            allocateDirect.putLong(c0068y.f223d);
            allocateDirect.putLong(c0068y.f224e ? 1L : 0L);
            int i5 = c0068y.f225f;
            if (i5 == 1) {
                j5 = 0;
            } else if (i5 == 2) {
                j5 = 1;
            } else if (i5 == 3) {
                j5 = 2;
            } else if (i5 == 4) {
                j5 = 3;
            } else {
                if (i5 != 5) {
                    throw null;
                }
                j5 = 4;
            }
            allocateDirect.putLong(j5);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f113l.mo267a("flutter/keydata", allocateDirect, interfaceC0375e);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ed  */
    /* JADX WARN: Type inference failed for: r0v27, types: [B2.y, java.lang.Object] */
    @Override // p009B2.InterfaceC0035F
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo105b(final android.view.KeyEvent r30, p009B2.C0033D r31) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009B2.C0031B.mo105b(android.view.KeyEvent, B2.D):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [B2.y, java.lang.Object] */
    /* renamed from: c */
    public final void m115c(boolean z4, java.lang.Long l4, java.lang.Long l5, long j4) {
        ?? obj = new java.lang.Object();
        obj.f220a = j4;
        obj.f221b = z4 ? 1 : 2;
        obj.f223d = l4.longValue();
        obj.f222c = l5.longValue();
        obj.f226g = null;
        obj.f224e = true;
        obj.f225f = 1;
        if (l5.longValue() != 0 && l4.longValue() != 0) {
            if (!z4) {
                l4 = null;
            }
            m116d(l5, l4);
        }
        m114a(obj, null);
    }

    /* renamed from: d */
    public final void m116d(java.lang.Long l4, java.lang.Long l5) {
        java.util.HashMap hashMap = this.f114m;
        if (l5 != null) {
            if (((java.lang.Long) hashMap.put(l4, l5)) != null) {
                throw new java.lang.AssertionError("The key was not empty");
            }
        } else if (((java.lang.Long) hashMap.remove(l4)) == null) {
            throw new java.lang.AssertionError("The key was empty");
        }
    }
}
