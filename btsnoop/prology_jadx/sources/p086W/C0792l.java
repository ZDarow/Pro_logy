package p086W;

/* renamed from: W.l */
/* loaded from: classes.dex */
public final class C0792l {

    /* renamed from: a */
    public int f2765a;

    /* renamed from: b */
    public int f2766b;

    /* renamed from: c */
    public int f2767c;

    /* renamed from: d */
    public java.lang.Object f2768d;

    public C0792l() {
        int highestOneBit = java.lang.Integer.bitCount(8) != 1 ? java.lang.Integer.highestOneBit(7) << 1 : 8;
        this.f2767c = highestOneBit - 1;
        this.f2768d = new int[highestOneBit];
    }

    /* renamed from: f */
    public static void m1446f(int i4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("androidAdjustRemoteVolume", p190s2.C2151k.m4275q("direction", java.lang.Integer.valueOf(i4)), null);
    }

    /* renamed from: g */
    public static void m1447g(int i4) {
        p034H2.C0247a c0247a = com.ryanheise.audioservice.AudioService.f4961L;
        if (c0247a == null) {
            return;
        }
        c0247a.m656a("androidSetRemoteVolume", p190s2.C2151k.m4275q("volumeIndex", java.lang.Integer.valueOf(i4)), null);
    }

    /* renamed from: A */
    public void m1448A(int i4) {
        if (((androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d).mo2518b() != i4) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2649e();
        }
    }

    /* renamed from: B */
    public void m1449B(int i4) {
        if ((this.f2765a & 7) != i4) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
    }

    /* renamed from: C */
    public boolean m1450C() {
        int i4;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (abstractC1111j.mo2519c() || (i4 = this.f2765a) == this.f2766b) {
            return false;
        }
        return abstractC1111j.mo2540x(i4);
    }

    /* renamed from: a */
    public void m1451a(int i4) {
        int[] iArr = (int[]) this.f2768d;
        int i5 = this.f2766b;
        iArr[i5] = i4;
        int i6 = this.f2767c & (i5 + 1);
        this.f2766b = i6;
        int i7 = this.f2765a;
        if (i6 == i7) {
            int length = iArr.length;
            int i8 = length - i7;
            int i9 = length << 1;
            if (i9 < 0) {
                throw new java.lang.RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i9];
            p105a3.AbstractC1020c.m2046h0(0, i7, length, iArr, iArr2);
            p105a3.AbstractC1020c.m2046h0(i8, 0, this.f2765a, (int[]) this.f2768d, iArr2);
            this.f2768d = iArr2;
            this.f2765a = 0;
            this.f2766b = length;
            this.f2767c = i9 - 1;
        }
    }

    /* renamed from: b */
    public int m1452b() {
        int i4 = this.f2767c;
        if (i4 != 0) {
            this.f2765a = i4;
            this.f2767c = 0;
        } else {
            this.f2765a = ((androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d).mo2537u();
        }
        int i5 = this.f2765a;
        if (i5 == 0 || i5 == this.f2766b) {
            return Integer.MAX_VALUE;
        }
        return i5 >>> 3;
    }

    /* renamed from: c */
    public android.media.VolumeProvider m1453c() {
        if (((android.media.VolumeProvider) this.f2768d) == null) {
            int i4 = android.os.Build.VERSION.SDK_INT;
            int i5 = this.f2766b;
            int i6 = this.f2765a;
            if (i4 >= 30) {
                this.f2768d = new p064Q.C0552x(this, i6, i5, this.f2767c);
            } else {
                this.f2768d = new p064Q.C0553y(this, i6, i5, this.f2767c);
            }
        }
        return (android.media.VolumeProvider) this.f2768d;
    }

    /* renamed from: d */
    public void m1454d(java.lang.Object obj, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V, androidx.datastore.preferences.protobuf.C1119n c1119n) {
        int i4 = this.f2766b;
        this.f2766b = ((this.f2765a >>> 3) << 3) | 4;
        try {
            interfaceC1088V.mo2402c(obj, this, c1119n);
            if (this.f2765a == this.f2766b) {
            } else {
                throw new java.io.IOException("Failed to parse the message.");
            }
        } finally {
            this.f2766b = i4;
        }
    }

    /* renamed from: e */
    public void m1455e(java.lang.Object obj, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V, androidx.datastore.preferences.protobuf.C1119n c1119n) {
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        int mo2538v = abstractC1111j.mo2538v();
        if (abstractC1111j.f4253a >= 100) {
            throw new java.io.IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int mo2521e = abstractC1111j.mo2521e(mo2538v);
        abstractC1111j.f4253a++;
        interfaceC1088V.mo2402c(obj, this, c1119n);
        abstractC1111j.mo2517a(0);
        abstractC1111j.f4253a--;
        abstractC1111j.mo2520d(mo2521e);
    }

    /* renamed from: h */
    public void m1456h(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Boolean.valueOf(abstractC1111j.mo2522f()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Boolean.valueOf(abstractC1111j.mo2522f()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: i */
    public androidx.datastore.preferences.protobuf.C1105g m1457i() {
        m1449B(2);
        return ((androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d).mo2523g();
    }

    /* renamed from: j */
    public void m1458j(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        if ((this.f2765a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(m1457i());
            androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: k */
    public void m1459k(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 1) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2538v = abstractC1111j.mo2538v();
            if ((mo2538v & 7) != 0) {
                throw new java.io.IOException("Failed to parse the message.");
            }
            int mo2518b = abstractC1111j.mo2518b() + mo2538v;
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Double.valueOf(abstractC1111j.mo2524h()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Double.valueOf(abstractC1111j.mo2524h()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: l */
    public void m1460l(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2525i()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2525i()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: m */
    public java.lang.Object m1461m(androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q0, java.lang.Class cls, androidx.datastore.preferences.protobuf.C1119n c1119n) {
        int ordinal = enumC1126q0.ordinal();
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        switch (ordinal) {
            case 0:
                m1449B(1);
                return java.lang.Double.valueOf(abstractC1111j.mo2524h());
            case 1:
                m1449B(5);
                return java.lang.Float.valueOf(abstractC1111j.mo2528l());
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                m1449B(0);
                return java.lang.Long.valueOf(abstractC1111j.mo2530n());
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                m1449B(0);
                return java.lang.Long.valueOf(abstractC1111j.mo2539w());
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                m1449B(0);
                return java.lang.Integer.valueOf(abstractC1111j.mo2529m());
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                m1449B(1);
                return java.lang.Long.valueOf(abstractC1111j.mo2527k());
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                m1449B(5);
                return java.lang.Integer.valueOf(abstractC1111j.mo2526j());
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                m1449B(0);
                return java.lang.Boolean.valueOf(abstractC1111j.mo2522f());
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                m1449B(2);
                return abstractC1111j.mo2536t();
            case 9:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case 10:
                m1449B(2);
                androidx.datastore.preferences.protobuf.InterfaceC1088V m2422a = androidx.datastore.preferences.protobuf.C1085S.f4182c.m2422a(cls);
                androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g = m2422a.mo2406g();
                m1455e(mo2406g, m2422a, c1119n);
                m2422a.mo2407h(mo2406g);
                return mo2406g;
            case 11:
                return m1457i();
            case 12:
                m1449B(0);
                return java.lang.Integer.valueOf(abstractC1111j.mo2538v());
            case 13:
                m1449B(0);
                return java.lang.Integer.valueOf(abstractC1111j.mo2525i());
            case 14:
                m1449B(5);
                return java.lang.Integer.valueOf(abstractC1111j.mo2531o());
            case 15:
                m1449B(1);
                return java.lang.Long.valueOf(abstractC1111j.mo2532p());
            case 16:
                m1449B(0);
                return java.lang.Integer.valueOf(abstractC1111j.mo2533q());
            case 17:
                m1449B(0);
                return java.lang.Long.valueOf(abstractC1111j.mo2534r());
        }
    }

    /* renamed from: n */
    public void m1462n(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 == 2) {
            int mo2538v = abstractC1111j.mo2538v();
            if ((mo2538v & 3) != 0) {
                throw new java.io.IOException("Failed to parse the message.");
            }
            int mo2518b = abstractC1111j.mo2518b() + mo2538v;
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2526j()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            return;
        }
        if (i4 != 5) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2526j()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: o */
    public void m1463o(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 1) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2538v = abstractC1111j.mo2538v();
            if ((mo2538v & 7) != 0) {
                throw new java.io.IOException("Failed to parse the message.");
            }
            int mo2518b = abstractC1111j.mo2518b() + mo2538v;
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2527k()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2527k()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: p */
    public void m1464p(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 == 2) {
            int mo2538v = abstractC1111j.mo2538v();
            if ((mo2538v & 3) != 0) {
                throw new java.io.IOException("Failed to parse the message.");
            }
            int mo2518b = abstractC1111j.mo2518b() + mo2538v;
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Float.valueOf(abstractC1111j.mo2528l()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            return;
        }
        if (i4 != 5) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Float.valueOf(abstractC1111j.mo2528l()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: q */
    public void m1465q(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2529m()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2529m()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: r */
    public void m1466r(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2530n()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2530n()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: s */
    public void m1467s(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 == 2) {
            int mo2538v = abstractC1111j.mo2538v();
            if ((mo2538v & 3) != 0) {
                throw new java.io.IOException("Failed to parse the message.");
            }
            int mo2518b = abstractC1111j.mo2518b() + mo2538v;
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2531o()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            return;
        }
        if (i4 != 5) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2531o()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: t */
    public void m1468t(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 1) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2538v = abstractC1111j.mo2538v();
            if ((mo2538v & 7) != 0) {
                throw new java.io.IOException("Failed to parse the message.");
            }
            int mo2518b = abstractC1111j.mo2518b() + mo2538v;
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2532p()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2532p()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: u */
    public void m1469u(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2533q()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2533q()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: v */
    public void m1470v(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2534r()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2534r()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: w */
    public void m1471w(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w, boolean z4) {
        java.lang.String mo2535s;
        int mo2537u;
        if ((this.f2765a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
        do {
            androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
            if (z4) {
                m1449B(2);
                mo2535s = abstractC1111j.mo2536t();
            } else {
                m1449B(2);
                mo2535s = abstractC1111j.mo2535s();
            }
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(mo2535s);
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: x */
    public void m1472x(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2538v()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Integer.valueOf(abstractC1111j.mo2538v()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: y */
    public void m1473y(androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w) {
        int mo2537u;
        int i4 = this.f2765a & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) this.f2768d;
        if (i4 != 0) {
            if (i4 != 2) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            int mo2518b = abstractC1111j.mo2518b() + abstractC1111j.mo2538v();
            do {
                ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2539w()));
            } while (abstractC1111j.mo2518b() < mo2518b);
            m1448A(mo2518b);
            return;
        }
        do {
            ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w).add(java.lang.Long.valueOf(abstractC1111j.mo2539w()));
            if (abstractC1111j.mo2519c()) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == this.f2765a);
        this.f2767c = mo2537u;
    }

    /* renamed from: z */
    public long m1474z() {
        int i4 = this.f2766b;
        if (i4 == 0) {
            throw new java.util.NoSuchElementException();
        }
        int i5 = this.f2765a;
        long j4 = ((long[]) this.f2768d)[i5];
        this.f2765a = (i5 + 1) & this.f2767c;
        this.f2766b = i4 - 1;
        return j4;
    }

    public C0792l(androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j) {
        this.f2767c = 0;
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a;
        this.f2768d = abstractC1111j;
        abstractC1111j.f4254b = this;
    }
}
