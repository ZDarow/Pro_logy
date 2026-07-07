package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.L */
/* loaded from: classes.dex */
public abstract class AbstractC1079L {

    /* renamed from: a */
    public static final char[] f4161a;

    static {
        char[] cArr = new char[80];
        f4161a = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m2379a(int i4, java.lang.StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(f4161a, 0, i5);
            i4 -= i5;
        }
    }

    /* renamed from: b */
    public static void m2380b(java.lang.StringBuilder sb, int i4, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                m2380b(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m2380b(sb, i4, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m2379a(i4, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (java.lang.Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            androidx.datastore.preferences.protobuf.C1105g c1105g = androidx.datastore.preferences.protobuf.C1105g.f4226n;
            sb.append(p101a.AbstractC0936a.m1815w(new androidx.datastore.preferences.protobuf.C1105g(((java.lang.String) obj).getBytes(androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.C1105g) {
            sb.append(": \"");
            sb.append(p101a.AbstractC0936a.m1815w((androidx.datastore.preferences.protobuf.C1105g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC1132v) {
            sb.append(" {");
            m2381c((androidx.datastore.preferences.protobuf.AbstractC1132v) obj, sb, i4 + 2);
            sb.append("\n");
            m2379a(i4, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i6 = i4 + 2;
        m2380b(sb, i6, "key", entry.getKey());
        m2380b(sb, i6, "value", entry.getValue());
        sb.append("\n");
        m2379a(i4, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a8, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01be, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L74;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2381c(androidx.datastore.preferences.protobuf.AbstractC1132v r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1079L.m2381c(androidx.datastore.preferences.protobuf.v, java.lang.StringBuilder, int):void");
    }
}
