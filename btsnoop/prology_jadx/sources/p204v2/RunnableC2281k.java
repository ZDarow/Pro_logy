package p204v2;

/* renamed from: v2.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2281k implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f9039l;

    /* renamed from: m */
    public final /* synthetic */ p047L2.C0384n f9040m;

    /* renamed from: n */
    public final /* synthetic */ p043K2.C0335k f9041n;

    /* renamed from: o */
    public final /* synthetic */ p204v2.C2276f f9042o;

    public /* synthetic */ RunnableC2281k(p047L2.C0384n c0384n, p043K2.C0335k c0335k, p204v2.C2276f c2276f, int i4) {
        this.f9039l = i4;
        this.f9040m = c0384n;
        this.f9041n = c0335k;
        this.f9042o = c2276f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c4;
        final int i4 = 3;
        final int i5 = 2;
        final int i6 = 1;
        final int i7 = 0;
        p047L2.C0384n c0384n = this.f9040m;
        p043K2.C0335k c0335k = this.f9041n;
        final p204v2.C2276f c2276f = this.f9042o;
        switch (this.f9039l) {
            case 0:
                java.util.HashMap hashMap = p204v2.C2283m.f9051n;
                final p208w2.C2336b c2336b = new p208w2.C2336b(c0384n, c0335k);
                c2276f.m4475l(c2336b, new java.lang.Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                p204v2.C2276f c2276f2 = c2276f;
                                p208w2.C2336b c2336b2 = c2336b;
                                p047L2.C0384n c0384n2 = c2336b2.f9264n;
                                java.lang.Integer num = (java.lang.Integer) c0384n2.m839a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = java.lang.Boolean.TRUE.equals(c0384n2.m839a("cancel"));
                                if (p204v2.AbstractC2271a.m4461b(c2276f2.f9018d)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(c2276f2.m4471h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    android.util.Log.d("Sqflite", sb.toString());
                                }
                                java.util.HashMap hashMap2 = c2276f2.f9021g;
                                p204v2.C2280j c2280j = null;
                                if (equals) {
                                    p204v2.C2280j c2280j2 = (p204v2.C2280j) hashMap2.get(num);
                                    if (c2280j2 != null) {
                                        c2276f2.m4466b(c2280j2);
                                    }
                                    c2336b2.mo687c(null);
                                    return;
                                }
                                p204v2.C2280j c2280j3 = (p204v2.C2280j) hashMap2.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (c2280j3 == null) {
                                            throw new java.lang.IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        android.database.Cursor cursor = c2280j3.f9038c;
                                        java.util.HashMap m4464c = p204v2.C2276f.m4464c(cursor, java.lang.Integer.valueOf(c2280j3.f9037b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            m4464c.put("cursorId", num);
                                        }
                                        c2336b2.mo687c(m4464c);
                                        if (z4) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j3);
                                        return;
                                    } catch (java.lang.Exception e4) {
                                        c2276f2.m4472i(e4, c2336b2);
                                        if (c2280j3 != null) {
                                            c2276f2.m4466b(c2280j3);
                                        } else {
                                            c2280j = c2280j3;
                                        }
                                        if (0 != 0 || c2280j == null) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j);
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (0 == 0 && c2280j3 != null) {
                                        c2276f2.m4466b(c2280j3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c2276f.m4468e(c2336b);
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                c2276f.m4469f(c2336b);
                                return;
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                c2276f.m4467d(c2336b);
                                return;
                            default:
                                p204v2.C2276f c2276f3 = c2276f;
                                p196u.AbstractC2212g abstractC2212g = c2336b;
                                java.lang.Object mo4412i = abstractC2212g.mo4412i("inTransaction");
                                java.lang.Boolean bool = mo4412i instanceof java.lang.Boolean ? (java.lang.Boolean) mo4412i : null;
                                boolean z5 = java.lang.Boolean.TRUE.equals(bool) && abstractC2212g.mo4416m() && ((java.lang.Integer) abstractC2212g.mo4412i("transactionId")) == null;
                                if (z5) {
                                    int i8 = c2276f3.f9025k + 1;
                                    c2276f3.f9025k = i8;
                                    c2276f3.f9026l = java.lang.Integer.valueOf(i8);
                                }
                                if (!c2276f3.m4470g(abstractC2212g)) {
                                    if (z5) {
                                        c2276f3.f9026l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    java.util.HashMap hashMap3 = new java.util.HashMap();
                                    hashMap3.put("transactionId", c2276f3.f9026l);
                                    abstractC2212g.mo687c(hashMap3);
                                    return;
                                } else {
                                    if (java.lang.Boolean.FALSE.equals(bool)) {
                                        c2276f3.f9026l = null;
                                    }
                                    abstractC2212g.mo687c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                java.util.HashMap hashMap2 = p204v2.C2283m.f9051n;
                final p208w2.C2336b c2336b2 = new p208w2.C2336b(c0384n, c0335k);
                c2276f.m4475l(c2336b2, new java.lang.Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                p204v2.C2276f c2276f2 = c2276f;
                                p208w2.C2336b c2336b22 = c2336b2;
                                p047L2.C0384n c0384n2 = c2336b22.f9264n;
                                java.lang.Integer num = (java.lang.Integer) c0384n2.m839a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = java.lang.Boolean.TRUE.equals(c0384n2.m839a("cancel"));
                                if (p204v2.AbstractC2271a.m4461b(c2276f2.f9018d)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(c2276f2.m4471h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    android.util.Log.d("Sqflite", sb.toString());
                                }
                                java.util.HashMap hashMap22 = c2276f2.f9021g;
                                p204v2.C2280j c2280j = null;
                                if (equals) {
                                    p204v2.C2280j c2280j2 = (p204v2.C2280j) hashMap22.get(num);
                                    if (c2280j2 != null) {
                                        c2276f2.m4466b(c2280j2);
                                    }
                                    c2336b22.mo687c(null);
                                    return;
                                }
                                p204v2.C2280j c2280j3 = (p204v2.C2280j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (c2280j3 == null) {
                                            throw new java.lang.IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        android.database.Cursor cursor = c2280j3.f9038c;
                                        java.util.HashMap m4464c = p204v2.C2276f.m4464c(cursor, java.lang.Integer.valueOf(c2280j3.f9037b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            m4464c.put("cursorId", num);
                                        }
                                        c2336b22.mo687c(m4464c);
                                        if (z4) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j3);
                                        return;
                                    } catch (java.lang.Exception e4) {
                                        c2276f2.m4472i(e4, c2336b22);
                                        if (c2280j3 != null) {
                                            c2276f2.m4466b(c2280j3);
                                        } else {
                                            c2280j = c2280j3;
                                        }
                                        if (0 != 0 || c2280j == null) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j);
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (0 == 0 && c2280j3 != null) {
                                        c2276f2.m4466b(c2280j3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c2276f.m4468e(c2336b2);
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                c2276f.m4469f(c2336b2);
                                return;
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                c2276f.m4467d(c2336b2);
                                return;
                            default:
                                p204v2.C2276f c2276f3 = c2276f;
                                p196u.AbstractC2212g abstractC2212g = c2336b2;
                                java.lang.Object mo4412i = abstractC2212g.mo4412i("inTransaction");
                                java.lang.Boolean bool = mo4412i instanceof java.lang.Boolean ? (java.lang.Boolean) mo4412i : null;
                                boolean z5 = java.lang.Boolean.TRUE.equals(bool) && abstractC2212g.mo4416m() && ((java.lang.Integer) abstractC2212g.mo4412i("transactionId")) == null;
                                if (z5) {
                                    int i8 = c2276f3.f9025k + 1;
                                    c2276f3.f9025k = i8;
                                    c2276f3.f9026l = java.lang.Integer.valueOf(i8);
                                }
                                if (!c2276f3.m4470g(abstractC2212g)) {
                                    if (z5) {
                                        c2276f3.f9026l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    java.util.HashMap hashMap3 = new java.util.HashMap();
                                    hashMap3.put("transactionId", c2276f3.f9026l);
                                    abstractC2212g.mo687c(hashMap3);
                                    return;
                                } else {
                                    if (java.lang.Boolean.FALSE.equals(bool)) {
                                        c2276f3.f9026l = null;
                                    }
                                    abstractC2212g.mo687c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.HashMap hashMap3 = p204v2.C2283m.f9051n;
                final p208w2.C2336b c2336b3 = new p208w2.C2336b(c0384n, c0335k);
                c2276f.m4475l(c2336b3, new java.lang.Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                p204v2.C2276f c2276f2 = c2276f;
                                p208w2.C2336b c2336b22 = c2336b3;
                                p047L2.C0384n c0384n2 = c2336b22.f9264n;
                                java.lang.Integer num = (java.lang.Integer) c0384n2.m839a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = java.lang.Boolean.TRUE.equals(c0384n2.m839a("cancel"));
                                if (p204v2.AbstractC2271a.m4461b(c2276f2.f9018d)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(c2276f2.m4471h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    android.util.Log.d("Sqflite", sb.toString());
                                }
                                java.util.HashMap hashMap22 = c2276f2.f9021g;
                                p204v2.C2280j c2280j = null;
                                if (equals) {
                                    p204v2.C2280j c2280j2 = (p204v2.C2280j) hashMap22.get(num);
                                    if (c2280j2 != null) {
                                        c2276f2.m4466b(c2280j2);
                                    }
                                    c2336b22.mo687c(null);
                                    return;
                                }
                                p204v2.C2280j c2280j3 = (p204v2.C2280j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (c2280j3 == null) {
                                            throw new java.lang.IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        android.database.Cursor cursor = c2280j3.f9038c;
                                        java.util.HashMap m4464c = p204v2.C2276f.m4464c(cursor, java.lang.Integer.valueOf(c2280j3.f9037b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            m4464c.put("cursorId", num);
                                        }
                                        c2336b22.mo687c(m4464c);
                                        if (z4) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j3);
                                        return;
                                    } catch (java.lang.Exception e4) {
                                        c2276f2.m4472i(e4, c2336b22);
                                        if (c2280j3 != null) {
                                            c2276f2.m4466b(c2280j3);
                                        } else {
                                            c2280j = c2280j3;
                                        }
                                        if (0 != 0 || c2280j == null) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j);
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (0 == 0 && c2280j3 != null) {
                                        c2276f2.m4466b(c2280j3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c2276f.m4468e(c2336b3);
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                c2276f.m4469f(c2336b3);
                                return;
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                c2276f.m4467d(c2336b3);
                                return;
                            default:
                                p204v2.C2276f c2276f3 = c2276f;
                                p196u.AbstractC2212g abstractC2212g = c2336b3;
                                java.lang.Object mo4412i = abstractC2212g.mo4412i("inTransaction");
                                java.lang.Boolean bool = mo4412i instanceof java.lang.Boolean ? (java.lang.Boolean) mo4412i : null;
                                boolean z5 = java.lang.Boolean.TRUE.equals(bool) && abstractC2212g.mo4416m() && ((java.lang.Integer) abstractC2212g.mo4412i("transactionId")) == null;
                                if (z5) {
                                    int i8 = c2276f3.f9025k + 1;
                                    c2276f3.f9025k = i8;
                                    c2276f3.f9026l = java.lang.Integer.valueOf(i8);
                                }
                                if (!c2276f3.m4470g(abstractC2212g)) {
                                    if (z5) {
                                        c2276f3.f9026l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    java.util.HashMap hashMap32 = new java.util.HashMap();
                                    hashMap32.put("transactionId", c2276f3.f9026l);
                                    abstractC2212g.mo687c(hashMap32);
                                    return;
                                } else {
                                    if (java.lang.Boolean.FALSE.equals(bool)) {
                                        c2276f3.f9026l = null;
                                    }
                                    abstractC2212g.mo687c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.HashMap hashMap4 = p204v2.C2283m.f9051n;
                try {
                    c2276f.f9023i.setLocale(java.util.Locale.forLanguageTag((java.lang.String) c0384n.m839a("locale")));
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.Exception e4) {
                    c0335k.mo741a("sqlite_error", "Error calling setLocale: " + e4.getMessage(), null);
                    return;
                }
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                java.util.HashMap hashMap5 = p204v2.C2283m.f9051n;
                final p208w2.C2336b c2336b4 = new p208w2.C2336b(c0384n, c0335k);
                final int i8 = 4;
                c2276f.m4475l(c2336b4, new java.lang.Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case 0:
                                p204v2.C2276f c2276f2 = c2276f;
                                p208w2.C2336b c2336b22 = c2336b4;
                                p047L2.C0384n c0384n2 = c2336b22.f9264n;
                                java.lang.Integer num = (java.lang.Integer) c0384n2.m839a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = java.lang.Boolean.TRUE.equals(c0384n2.m839a("cancel"));
                                if (p204v2.AbstractC2271a.m4461b(c2276f2.f9018d)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(c2276f2.m4471h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    android.util.Log.d("Sqflite", sb.toString());
                                }
                                java.util.HashMap hashMap22 = c2276f2.f9021g;
                                p204v2.C2280j c2280j = null;
                                if (equals) {
                                    p204v2.C2280j c2280j2 = (p204v2.C2280j) hashMap22.get(num);
                                    if (c2280j2 != null) {
                                        c2276f2.m4466b(c2280j2);
                                    }
                                    c2336b22.mo687c(null);
                                    return;
                                }
                                p204v2.C2280j c2280j3 = (p204v2.C2280j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (c2280j3 == null) {
                                            throw new java.lang.IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        android.database.Cursor cursor = c2280j3.f9038c;
                                        java.util.HashMap m4464c = p204v2.C2276f.m4464c(cursor, java.lang.Integer.valueOf(c2280j3.f9037b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            m4464c.put("cursorId", num);
                                        }
                                        c2336b22.mo687c(m4464c);
                                        if (z4) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j3);
                                        return;
                                    } catch (java.lang.Exception e42) {
                                        c2276f2.m4472i(e42, c2336b22);
                                        if (c2280j3 != null) {
                                            c2276f2.m4466b(c2280j3);
                                        } else {
                                            c2280j = c2280j3;
                                        }
                                        if (0 != 0 || c2280j == null) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j);
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (0 == 0 && c2280j3 != null) {
                                        c2276f2.m4466b(c2280j3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c2276f.m4468e(c2336b4);
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                c2276f.m4469f(c2336b4);
                                return;
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                c2276f.m4467d(c2336b4);
                                return;
                            default:
                                p204v2.C2276f c2276f3 = c2276f;
                                p196u.AbstractC2212g abstractC2212g = c2336b4;
                                java.lang.Object mo4412i = abstractC2212g.mo4412i("inTransaction");
                                java.lang.Boolean bool = mo4412i instanceof java.lang.Boolean ? (java.lang.Boolean) mo4412i : null;
                                boolean z5 = java.lang.Boolean.TRUE.equals(bool) && abstractC2212g.mo4416m() && ((java.lang.Integer) abstractC2212g.mo4412i("transactionId")) == null;
                                if (z5) {
                                    int i82 = c2276f3.f9025k + 1;
                                    c2276f3.f9025k = i82;
                                    c2276f3.f9026l = java.lang.Integer.valueOf(i82);
                                }
                                if (!c2276f3.m4470g(abstractC2212g)) {
                                    if (z5) {
                                        c2276f3.f9026l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    java.util.HashMap hashMap32 = new java.util.HashMap();
                                    hashMap32.put("transactionId", c2276f3.f9026l);
                                    abstractC2212g.mo687c(hashMap32);
                                    return;
                                } else {
                                    if (java.lang.Boolean.FALSE.equals(bool)) {
                                        c2276f3.f9026l = null;
                                    }
                                    abstractC2212g.mo687c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                java.util.HashMap hashMap6 = p204v2.C2283m.f9051n;
                final p208w2.C2336b c2336b5 = new p208w2.C2336b(c0384n, c0335k);
                c2276f.m4475l(c2336b5, new java.lang.Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                p204v2.C2276f c2276f2 = c2276f;
                                p208w2.C2336b c2336b22 = c2336b5;
                                p047L2.C0384n c0384n2 = c2336b22.f9264n;
                                java.lang.Integer num = (java.lang.Integer) c0384n2.m839a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = java.lang.Boolean.TRUE.equals(c0384n2.m839a("cancel"));
                                if (p204v2.AbstractC2271a.m4461b(c2276f2.f9018d)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(c2276f2.m4471h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    android.util.Log.d("Sqflite", sb.toString());
                                }
                                java.util.HashMap hashMap22 = c2276f2.f9021g;
                                p204v2.C2280j c2280j = null;
                                if (equals) {
                                    p204v2.C2280j c2280j2 = (p204v2.C2280j) hashMap22.get(num);
                                    if (c2280j2 != null) {
                                        c2276f2.m4466b(c2280j2);
                                    }
                                    c2336b22.mo687c(null);
                                    return;
                                }
                                p204v2.C2280j c2280j3 = (p204v2.C2280j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (c2280j3 == null) {
                                            throw new java.lang.IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        android.database.Cursor cursor = c2280j3.f9038c;
                                        java.util.HashMap m4464c = p204v2.C2276f.m4464c(cursor, java.lang.Integer.valueOf(c2280j3.f9037b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            m4464c.put("cursorId", num);
                                        }
                                        c2336b22.mo687c(m4464c);
                                        if (z4) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j3);
                                        return;
                                    } catch (java.lang.Exception e42) {
                                        c2276f2.m4472i(e42, c2336b22);
                                        if (c2280j3 != null) {
                                            c2276f2.m4466b(c2280j3);
                                        } else {
                                            c2280j = c2280j3;
                                        }
                                        if (0 != 0 || c2280j == null) {
                                            return;
                                        }
                                        c2276f2.m4466b(c2280j);
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (0 == 0 && c2280j3 != null) {
                                        c2276f2.m4466b(c2280j3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c2276f.m4468e(c2336b5);
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                c2276f.m4469f(c2336b5);
                                return;
                            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                c2276f.m4467d(c2336b5);
                                return;
                            default:
                                p204v2.C2276f c2276f3 = c2276f;
                                p196u.AbstractC2212g abstractC2212g = c2336b5;
                                java.lang.Object mo4412i = abstractC2212g.mo4412i("inTransaction");
                                java.lang.Boolean bool = mo4412i instanceof java.lang.Boolean ? (java.lang.Boolean) mo4412i : null;
                                boolean z5 = java.lang.Boolean.TRUE.equals(bool) && abstractC2212g.mo4416m() && ((java.lang.Integer) abstractC2212g.mo4412i("transactionId")) == null;
                                if (z5) {
                                    int i82 = c2276f3.f9025k + 1;
                                    c2276f3.f9025k = i82;
                                    c2276f3.f9026l = java.lang.Integer.valueOf(i82);
                                }
                                if (!c2276f3.m4470g(abstractC2212g)) {
                                    if (z5) {
                                        c2276f3.f9026l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    java.util.HashMap hashMap32 = new java.util.HashMap();
                                    hashMap32.put("transactionId", c2276f3.f9026l);
                                    abstractC2212g.mo687c(hashMap32);
                                    return;
                                } else {
                                    if (java.lang.Boolean.FALSE.equals(bool)) {
                                        c2276f3.f9026l = null;
                                    }
                                    abstractC2212g.mo687c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                java.util.HashMap hashMap7 = p204v2.C2283m.f9051n;
                boolean equals = java.lang.Boolean.TRUE.equals(c0384n.m839a("noResult"));
                boolean equals2 = java.lang.Boolean.TRUE.equals(c0384n.m839a("continueOnError"));
                java.util.List list = (java.util.List) c0384n.m839a("operations");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    p208w2.C2335a c2335a = new p208w2.C2335a((java.util.Map) it.next(), equals);
                    java.lang.String mo4413j = c2335a.mo4413j();
                    mo4413j.getClass();
                    p035I.C0291m c0291m = c2335a.f9261n;
                    switch (mo4413j.hashCode()) {
                        case -1319569547:
                            if (mo4413j.equals("execute")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -1183792455:
                            if (mo4413j.equals("insert")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case -838846263:
                            if (mo4413j.equals("update")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 107944136:
                            if (mo4413j.equals("query")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    c4 = 65535;
                    switch (c4) {
                        case 0:
                            if (c2276f.m4470g(c2335a)) {
                                c2335a.mo687c(null);
                                c2335a.m4537q(arrayList);
                                break;
                            } else if (!equals2) {
                                c0335k.mo741a((java.lang.String) c0291m.f877m, (java.lang.String) c0291m.f878n, (java.util.HashMap) c0291m.f879o);
                                return;
                            } else {
                                c2335a.m4536p(arrayList);
                                break;
                            }
                        case 1:
                            if (c2276f.m4467d(c2335a)) {
                                c2335a.m4537q(arrayList);
                                break;
                            } else if (!equals2) {
                                c0335k.mo741a((java.lang.String) c0291m.f877m, (java.lang.String) c0291m.f878n, (java.util.HashMap) c0291m.f879o);
                                return;
                            } else {
                                c2335a.m4536p(arrayList);
                                break;
                            }
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            if (c2276f.m4469f(c2335a)) {
                                c2335a.m4537q(arrayList);
                                break;
                            } else if (!equals2) {
                                c0335k.mo741a((java.lang.String) c0291m.f877m, (java.lang.String) c0291m.f878n, (java.util.HashMap) c0291m.f879o);
                                return;
                            } else {
                                c2335a.m4536p(arrayList);
                                break;
                            }
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            if (c2276f.m4468e(c2335a)) {
                                c2335a.m4537q(arrayList);
                                break;
                            } else if (!equals2) {
                                c0335k.mo741a((java.lang.String) c0291m.f877m, (java.lang.String) c0291m.f878n, (java.util.HashMap) c0291m.f879o);
                                return;
                            } else {
                                c2335a.m4536p(arrayList);
                                break;
                            }
                        default:
                            c0335k.mo741a("bad_param", "Batch method '" + mo4413j + "' not supported", null);
                            return;
                    }
                }
                if (equals) {
                    c0335k.mo742b(null);
                    return;
                } else {
                    c0335k.mo742b(arrayList);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC2281k(p047L2.C0384n c0384n, p204v2.C2276f c2276f, p043K2.C0335k c0335k) {
        this.f9039l = 3;
        this.f9040m = c0384n;
        this.f9042o = c2276f;
        this.f9041n = c0335k;
    }

    public /* synthetic */ RunnableC2281k(p204v2.C2276f c2276f, p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        this.f9039l = 6;
        this.f9042o = c2276f;
        this.f9040m = c0384n;
        this.f9041n = c0335k;
    }
}
