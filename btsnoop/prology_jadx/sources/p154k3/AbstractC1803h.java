package p154k3;

/* renamed from: k3.h */
/* loaded from: classes.dex */
public abstract class AbstractC1803h {

    /* renamed from: a */
    public static final java.lang.Object[] f7367a = new java.lang.Object[0];

    /* renamed from: a */
    public static boolean m3775a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m3776b(java.lang.Object obj) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException();
        m3781g(nullPointerException, p154k3.AbstractC1803h.class.getName());
        throw nullPointerException;
    }

    /* renamed from: c */
    public static void m3777c(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str);
        m3781g(nullPointerException, p154k3.AbstractC1803h.class.getName());
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m3778d(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str.concat(" must not be null"));
        m3781g(nullPointerException, p154k3.AbstractC1803h.class.getName());
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m3779e(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.String name = p154k3.AbstractC1803h.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            java.lang.StackTraceElement stackTraceElement = stackTrace[i4];
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m3781g(nullPointerException, p154k3.AbstractC1803h.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return "kotlin.Double";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0211, code lost:
    
        if (r9.equals("java.lang.Long") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return "kotlin.Long";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022c, code lost:
    
        if (r9.equals("java.lang.Byte") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return "kotlin.Byte";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0239, code lost:
    
        if (r9.equals("java.lang.Boolean") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return "kotlin.Boolean";
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0254, code lost:
    
        if (r9.equals("java.lang.Character") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return "kotlin.Char";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0261, code lost:
    
        if (r9.equals("short") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return "kotlin.Short";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x026e, code lost:
    
        if (r9.equals("float") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return "kotlin.Float";
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0297, code lost:
    
        if (r9.equals("boolean") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a1, code lost:
    
        if (r9.equals("long") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ab, code lost:
    
        if (r9.equals("char") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b5, code lost:
    
        if (r9.equals("byte") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02f3, code lost:
    
        if (r9.equals("java.lang.Short") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02fd, code lost:
    
        if (r9.equals("java.lang.Float") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x032f, code lost:
    
        if (r9.equals("double") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cc, code lost:
    
        if (r9.equals("java.lang.Double") == false) goto L261;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037f A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3780f(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p154k3.AbstractC1803h.m3780f(java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public static void m3781g(java.lang.RuntimeException runtimeException, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i4 = i5;
            }
        }
        runtimeException.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i4 + 1, length));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return "Double";
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d6, code lost:
    
        if (r10.equals("kotlin.jvm.internal.StringCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fc, code lost:
    
        if (r10.equals("kotlin.jvm.internal.FloatCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0206, code lost:
    
        if (r10.equals("java.lang.Long") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return "Long";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0221, code lost:
    
        if (r10.equals("java.lang.Byte") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return "Byte";
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022e, code lost:
    
        if (r10.equals("java.lang.Boolean") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return "Boolean";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023b, code lost:
    
        if (r10.equals("kotlin.jvm.internal.EnumCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0245, code lost:
    
        if (r10.equals("java.lang.Character") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return "Char";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0252, code lost:
    
        if (r10.equals("short") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:?, code lost:
    
        return "Short";
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025f, code lost:
    
        if (r10.equals("float") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return "Float";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026c, code lost:
    
        if (r10.equals("kotlin.jvm.internal.ShortCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0284, code lost:
    
        if (r10.equals("boolean") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x028e, code lost:
    
        if (r10.equals("long") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0298, code lost:
    
        if (r10.equals("char") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a2, code lost:
    
        if (r10.equals("byte") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c4, code lost:
    
        if (r10.equals("kotlin.jvm.internal.LongCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ce, code lost:
    
        if (r10.equals("kotlin.jvm.internal.CharCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d8, code lost:
    
        if (r10.equals("java.lang.Short") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e2, code lost:
    
        if (r10.equals("java.lang.Float") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0308, code lost:
    
        if (r10.equals("kotlin.jvm.internal.ByteCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0311, code lost:
    
        if (r10.equals("double") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x035f, code lost:
    
        if (r10.equals("kotlin.jvm.internal.DoubleCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
    
        if (r10.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return "Companion";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        if (r10.equals("kotlin.jvm.internal.BooleanCompanionObject") == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c9, code lost:
    
        if (r10.equals("java.lang.Double") == false) goto L253;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0361 A[ORIG_RETURN, RETURN] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3782h(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p154k3.AbstractC1803h.m3782h(java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    public static void m3783i(java.lang.String str) {
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("lateinit property " + str + " has not been initialized");
        m3781g(runtimeException, p154k3.AbstractC1803h.class.getName());
        throw runtimeException;
    }

    /* renamed from: j */
    public static final java.lang.Object[] m3784j(java.util.Collection collection) {
        int size = collection.size();
        java.lang.Object[] objArr = f7367a;
        if (size == 0) {
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            objArr2[i4] = it.next();
            if (i5 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    i6 = 2147483645;
                    if (i5 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i6);
                m3778d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i5);
                m3778d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i4 = i5;
        }
    }

    /* renamed from: k */
    public static final java.lang.Object[] m3785k(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i4 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            m3777c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (java.lang.Object[]) newInstance;
        }
        while (true) {
            int i5 = i4 + 1;
            objArr2[i4] = it.next();
            if (i5 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    i6 = 2147483645;
                    if (i5 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i6);
                m3778d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i5] = null;
                    return objArr;
                }
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i5);
                m3778d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i4 = i5;
        }
    }
}
