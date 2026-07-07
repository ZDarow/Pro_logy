package L2;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class v implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final v f1099a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L2.v] */
    static {
        u uVar = u.f1096a;
        f1099a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, L2.t] */
    @Override // L2.q
    public final ByteBuffer a(n nVar) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        u uVar = u.f1096a;
        uVar.k(byteArrayOutputStream, nVar.f1094a);
        uVar.k(byteArrayOutputStream, nVar.f1095b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, L2.t] */
    @Override // L2.q
    public final ByteBuffer b(Object obj) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        u.f1096a.k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // L2.q
    public final n c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        u uVar = u.f1096a;
        Object e4 = uVar.e(byteBuffer);
        Object e5 = uVar.e(byteBuffer);
        if (!(e4 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new n(e5, (String) e4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L46
            goto L1e
        L11:
            L2.u r0 = L2.u.f1096a
            java.lang.Object r0 = r0.e(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            L2.u r0 = L2.u.f1096a
            java.lang.Object r1 = r0.e(r5)
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r0 = r0.e(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L46
            if (r2 == 0) goto L36
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L46
        L36:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L46
            L2.j r5 = new L2.j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r2, r0)
            throw r5
        L46:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.v.d(java.nio.ByteBuffer):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, L2.t] */
    @Override // L2.q
    public final ByteBuffer e(String str, String str2) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        u uVar = u.f1096a;
        uVar.k(byteArrayOutputStream, "error");
        uVar.k(byteArrayOutputStream, str);
        byteArrayOutputStream.write(0);
        uVar.k(byteArrayOutputStream, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, L2.t] */
    @Override // L2.q
    public final ByteBuffer f(String str, String str2, Object obj) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        u uVar = u.f1096a;
        uVar.k(byteArrayOutputStream, str);
        uVar.k(byteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            uVar.k(byteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            uVar.k(byteArrayOutputStream, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
}
