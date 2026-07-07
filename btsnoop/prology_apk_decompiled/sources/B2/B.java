package B2;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class B implements F {

    /* renamed from: l, reason: collision with root package name */
    public final L2.f f110l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f111m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f112n;

    /* renamed from: o, reason: collision with root package name */
    public final C f113o;

    /* JADX WARN: Type inference failed for: r4v2, types: [B2.J, java.lang.Object] */
    public B(L2.f fVar) {
        HashMap hashMap = new HashMap();
        this.f112n = hashMap;
        this.f113o = new C();
        this.f110l = fVar;
        H h4 = K.f125a;
        ?? obj = new Object();
        obj.f124a = false;
        J j4 = new J[]{obj}[0];
        j4.getClass();
        hashMap.put(4294967556L, j4);
    }

    public final void a(y yVar, final D d4) {
        long j4;
        long j5;
        byte[] bArr = null;
        L2.e eVar = d4 == null ? null : new L2.e() { // from class: B2.z
            @Override // L2.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                D.this.c(bool.booleanValue());
            }
        };
        try {
            String str = yVar.f221g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(yVar.f215a);
            int i4 = yVar.f216b;
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
            allocateDirect.putLong(yVar.f217c);
            allocateDirect.putLong(yVar.f218d);
            allocateDirect.putLong(yVar.f219e ? 1L : 0L);
            int i5 = yVar.f220f;
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
            this.f110l.a("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ed  */
    /* JADX WARN: Type inference failed for: r0v27, types: [B2.y, java.lang.Object] */
    @Override // B2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final android.view.KeyEvent r30, B2.D r31) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.B.b(android.view.KeyEvent, B2.D):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [B2.y, java.lang.Object] */
    public final void c(boolean z4, Long l4, Long l5, long j4) {
        ?? obj = new Object();
        obj.f215a = j4;
        obj.f216b = z4 ? 1 : 2;
        obj.f218d = l4.longValue();
        obj.f217c = l5.longValue();
        obj.f221g = null;
        obj.f219e = true;
        obj.f220f = 1;
        if (l5.longValue() != 0 && l4.longValue() != 0) {
            if (!z4) {
                l4 = null;
            }
            d(l5, l4);
        }
        a(obj, null);
    }

    public final void d(Long l4, Long l5) {
        HashMap hashMap = this.f111m;
        if (l5 != null) {
            if (((Long) hashMap.put(l4, l5)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l4)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
