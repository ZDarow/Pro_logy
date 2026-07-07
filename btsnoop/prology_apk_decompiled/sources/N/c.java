package N;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1181a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1182b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1183c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1184d;

    public c(byte[] bArr, int i4, int i5) {
        this(-1L, bArr, i4, i5);
    }

    public static c a(long j4, ByteOrder byteOrder) {
        long[] jArr = {j4};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1193C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1193C[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f1189a);
        wrap.putInt((int) eVar2.f1190b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i4, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1193C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i4}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g4 instanceof String) {
            return Double.parseDouble((String) g4);
        }
        if (g4 instanceof long[]) {
            if (((long[]) g4).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof int[]) {
            if (((int[]) g4).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g4;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f1189a / eVar.f1190b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g4 instanceof String) {
            return Integer.parseInt((String) g4);
        }
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g4;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            return null;
        }
        if (g4 instanceof String) {
            return (String) g4;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            while (i4 < jArr.length) {
                sb.append(jArr[i4]);
                i4++;
                if (i4 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g4 instanceof int[]) {
            int[] iArr = (int[]) g4;
            while (i4 < iArr.length) {
                sb.append(iArr[i4]);
                i4++;
                if (i4 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            while (i4 < dArr.length) {
                sb.append(dArr[i4]);
                i4++;
                if (i4 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g4 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g4;
        while (i4 < eVarArr.length) {
            sb.append(eVarArr[i4].f1189a);
            sb.append('/');
            sb.append(eVarArr[i4].f1190b);
            i4++;
            if (i4 != eVarArr.length) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + g.f1192B[this.f1181a] + ", data length:" + this.f1184d.length + ")";
    }

    public c(long j4, byte[] bArr, int i4, int i5) {
        this.f1181a = i4;
        this.f1182b = i5;
        this.f1183c = j4;
        this.f1184d = bArr;
    }
}
