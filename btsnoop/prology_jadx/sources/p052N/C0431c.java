package p052N;

/* renamed from: N.c */
/* loaded from: classes.dex */
public final class C0431c {

    /* renamed from: a */
    public final int f1220a;

    /* renamed from: b */
    public final int f1221b;

    /* renamed from: c */
    public final long f1222c;

    /* renamed from: d */
    public final byte[] f1223d;

    public C0431c(byte[] bArr, int i4, int i5) {
        this(-1L, bArr, i4, i5);
    }

    /* renamed from: a */
    public static p052N.C0431c m906a(long j4, java.nio.ByteOrder byteOrder) {
        long[] jArr = {j4};
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p052N.C0435g.f1232C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new p052N.C0431c(wrap.array(), 4, 1);
    }

    /* renamed from: b */
    public static p052N.C0431c m907b(p052N.C0433e c0433e, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p052N.C0435g.f1232C[5]]);
        wrap.order(byteOrder);
        p052N.C0433e c0433e2 = new p052N.C0433e[]{c0433e}[0];
        wrap.putInt((int) c0433e2.f1228a);
        wrap.putInt((int) c0433e2.f1229b);
        return new p052N.C0431c(wrap.array(), 5, 1);
    }

    /* renamed from: c */
    public static p052N.C0431c m908c(int i4, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p052N.C0435g.f1232C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i4}[0]);
        return new p052N.C0431c(wrap.array(), 3, 1);
    }

    /* renamed from: d */
    public final double m909d(java.nio.ByteOrder byteOrder) {
        java.lang.Object m912g = m912g(byteOrder);
        if (m912g == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
        }
        if (m912g instanceof java.lang.String) {
            return java.lang.Double.parseDouble((java.lang.String) m912g);
        }
        if (m912g instanceof long[]) {
            if (((long[]) m912g).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (m912g instanceof int[]) {
            if (((int[]) m912g).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (m912g instanceof double[]) {
            double[] dArr = (double[]) m912g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(m912g instanceof p052N.C0433e[])) {
            throw new java.lang.NumberFormatException("Couldn't find a double value");
        }
        p052N.C0433e[] c0433eArr = (p052N.C0433e[]) m912g;
        if (c0433eArr.length != 1) {
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        p052N.C0433e c0433e = c0433eArr[0];
        return c0433e.f1228a / c0433e.f1229b;
    }

    /* renamed from: e */
    public final int m910e(java.nio.ByteOrder byteOrder) {
        java.lang.Object m912g = m912g(byteOrder);
        if (m912g == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (m912g instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) m912g);
        }
        if (m912g instanceof long[]) {
            long[] jArr = (long[]) m912g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(m912g instanceof int[])) {
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) m912g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    /* renamed from: f */
    public final java.lang.String m911f(java.nio.ByteOrder byteOrder) {
        java.lang.Object m912g = m912g(byteOrder);
        if (m912g == null) {
            return null;
        }
        if (m912g instanceof java.lang.String) {
            return (java.lang.String) m912g;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = 0;
        if (m912g instanceof long[]) {
            long[] jArr = (long[]) m912g;
            while (i4 < jArr.length) {
                sb.append(jArr[i4]);
                i4++;
                if (i4 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (m912g instanceof int[]) {
            int[] iArr = (int[]) m912g;
            while (i4 < iArr.length) {
                sb.append(iArr[i4]);
                i4++;
                if (i4 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (m912g instanceof double[]) {
            double[] dArr = (double[]) m912g;
            while (i4 < dArr.length) {
                sb.append(dArr[i4]);
                i4++;
                if (i4 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(m912g instanceof p052N.C0433e[])) {
            return null;
        }
        p052N.C0433e[] c0433eArr = (p052N.C0433e[]) m912g;
        while (i4 < c0433eArr.length) {
            sb.append(c0433eArr[i4].f1228a);
            sb.append('/');
            sb.append(c0433eArr[i4].f1229b);
            i4++;
            if (i4 != c0433eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:158:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [N.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [N.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m912g(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p052N.C0431c.m912g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final java.lang.String toString() {
        return "(" + p052N.C0435g.f1231B[this.f1220a] + ", data length:" + this.f1223d.length + ")";
    }

    public C0431c(long j4, byte[] bArr, int i4, int i5) {
        this.f1220a = i4;
        this.f1221b = i5;
        this.f1222c = j4;
        this.f1223d = bArr;
    }
}
