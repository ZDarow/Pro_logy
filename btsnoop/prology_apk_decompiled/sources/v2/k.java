package v2;

import I.C0044m;
import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import u.AbstractC0579g;
import w2.C0606a;
import w2.C0607b;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8689l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L2.n f8690m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K2.k f8691n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f8692o;

    public /* synthetic */ k(L2.n nVar, K2.k kVar, f fVar, int i4) {
        this.f8689l = i4;
        this.f8690m = nVar;
        this.f8691n = kVar;
        this.f8692o = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c4;
        final int i4 = 3;
        final int i5 = 2;
        final int i6 = 1;
        final int i7 = 0;
        L2.n nVar = this.f8690m;
        K2.k kVar = this.f8691n;
        final f fVar = this.f8692o;
        switch (this.f8689l) {
            case 0:
                HashMap hashMap = m.f8700n;
                final C0607b c0607b = new C0607b(nVar, kVar);
                fVar.l(c0607b, new Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                f fVar2 = fVar;
                                C0607b c0607b2 = c0607b;
                                L2.n nVar2 = c0607b2.f8906n;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (AbstractC0589a.b(fVar2.f8668d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap2 = fVar2.f8671g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap2.get(num);
                                    if (jVar2 != null) {
                                        fVar2.b(jVar2);
                                    }
                                    c0607b2.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap2.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f8688c;
                                        HashMap c5 = f.c(cursor, Integer.valueOf(jVar3.f8687b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c5.put("cursorId", num);
                                        }
                                        c0607b2.c(c5);
                                        if (z4) {
                                            return;
                                        }
                                        fVar2.b(jVar3);
                                        return;
                                    } catch (Exception e4) {
                                        fVar2.i(e4, c0607b2);
                                        if (jVar3 != null) {
                                            fVar2.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        fVar2.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        fVar2.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                fVar.e(c0607b);
                                return;
                            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                fVar.f(c0607b);
                                return;
                            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                fVar.d(c0607b);
                                return;
                            default:
                                f fVar3 = fVar;
                                AbstractC0579g abstractC0579g = c0607b;
                                Object i8 = abstractC0579g.i("inTransaction");
                                Boolean bool = i8 instanceof Boolean ? (Boolean) i8 : null;
                                boolean z5 = Boolean.TRUE.equals(bool) && abstractC0579g.m() && ((Integer) abstractC0579g.i("transactionId")) == null;
                                if (z5) {
                                    int i9 = fVar3.f8675k + 1;
                                    fVar3.f8675k = i9;
                                    fVar3.f8676l = Integer.valueOf(i9);
                                }
                                if (!fVar3.g(abstractC0579g)) {
                                    if (z5) {
                                        fVar3.f8676l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", fVar3.f8676l);
                                    abstractC0579g.c(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        fVar3.f8676l = null;
                                    }
                                    abstractC0579g.c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                HashMap hashMap2 = m.f8700n;
                final C0607b c0607b2 = new C0607b(nVar, kVar);
                fVar.l(c0607b2, new Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                f fVar2 = fVar;
                                C0607b c0607b22 = c0607b2;
                                L2.n nVar2 = c0607b22.f8906n;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (AbstractC0589a.b(fVar2.f8668d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = fVar2.f8671g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        fVar2.b(jVar2);
                                    }
                                    c0607b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f8688c;
                                        HashMap c5 = f.c(cursor, Integer.valueOf(jVar3.f8687b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c5.put("cursorId", num);
                                        }
                                        c0607b22.c(c5);
                                        if (z4) {
                                            return;
                                        }
                                        fVar2.b(jVar3);
                                        return;
                                    } catch (Exception e4) {
                                        fVar2.i(e4, c0607b22);
                                        if (jVar3 != null) {
                                            fVar2.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        fVar2.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        fVar2.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                fVar.e(c0607b2);
                                return;
                            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                fVar.f(c0607b2);
                                return;
                            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                fVar.d(c0607b2);
                                return;
                            default:
                                f fVar3 = fVar;
                                AbstractC0579g abstractC0579g = c0607b2;
                                Object i8 = abstractC0579g.i("inTransaction");
                                Boolean bool = i8 instanceof Boolean ? (Boolean) i8 : null;
                                boolean z5 = Boolean.TRUE.equals(bool) && abstractC0579g.m() && ((Integer) abstractC0579g.i("transactionId")) == null;
                                if (z5) {
                                    int i9 = fVar3.f8675k + 1;
                                    fVar3.f8675k = i9;
                                    fVar3.f8676l = Integer.valueOf(i9);
                                }
                                if (!fVar3.g(abstractC0579g)) {
                                    if (z5) {
                                        fVar3.f8676l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", fVar3.f8676l);
                                    abstractC0579g.c(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        fVar3.f8676l = null;
                                    }
                                    abstractC0579g.c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                HashMap hashMap3 = m.f8700n;
                final C0607b c0607b3 = new C0607b(nVar, kVar);
                fVar.l(c0607b3, new Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                f fVar2 = fVar;
                                C0607b c0607b22 = c0607b3;
                                L2.n nVar2 = c0607b22.f8906n;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (AbstractC0589a.b(fVar2.f8668d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = fVar2.f8671g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        fVar2.b(jVar2);
                                    }
                                    c0607b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f8688c;
                                        HashMap c5 = f.c(cursor, Integer.valueOf(jVar3.f8687b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c5.put("cursorId", num);
                                        }
                                        c0607b22.c(c5);
                                        if (z4) {
                                            return;
                                        }
                                        fVar2.b(jVar3);
                                        return;
                                    } catch (Exception e4) {
                                        fVar2.i(e4, c0607b22);
                                        if (jVar3 != null) {
                                            fVar2.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        fVar2.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        fVar2.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                fVar.e(c0607b3);
                                return;
                            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                fVar.f(c0607b3);
                                return;
                            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                fVar.d(c0607b3);
                                return;
                            default:
                                f fVar3 = fVar;
                                AbstractC0579g abstractC0579g = c0607b3;
                                Object i8 = abstractC0579g.i("inTransaction");
                                Boolean bool = i8 instanceof Boolean ? (Boolean) i8 : null;
                                boolean z5 = Boolean.TRUE.equals(bool) && abstractC0579g.m() && ((Integer) abstractC0579g.i("transactionId")) == null;
                                if (z5) {
                                    int i9 = fVar3.f8675k + 1;
                                    fVar3.f8675k = i9;
                                    fVar3.f8676l = Integer.valueOf(i9);
                                }
                                if (!fVar3.g(abstractC0579g)) {
                                    if (z5) {
                                        fVar3.f8676l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", fVar3.f8676l);
                                    abstractC0579g.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        fVar3.f8676l = null;
                                    }
                                    abstractC0579g.c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                HashMap hashMap4 = m.f8700n;
                try {
                    fVar.f8673i.setLocale(Locale.forLanguageTag((String) nVar.a("locale")));
                    kVar.b(null);
                    return;
                } catch (Exception e4) {
                    kVar.a("sqlite_error", "Error calling setLocale: " + e4.getMessage(), null);
                    return;
                }
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                HashMap hashMap5 = m.f8700n;
                final C0607b c0607b4 = new C0607b(nVar, kVar);
                final int i8 = 4;
                fVar.l(c0607b4, new Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case 0:
                                f fVar2 = fVar;
                                C0607b c0607b22 = c0607b4;
                                L2.n nVar2 = c0607b22.f8906n;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (AbstractC0589a.b(fVar2.f8668d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = fVar2.f8671g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        fVar2.b(jVar2);
                                    }
                                    c0607b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f8688c;
                                        HashMap c5 = f.c(cursor, Integer.valueOf(jVar3.f8687b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c5.put("cursorId", num);
                                        }
                                        c0607b22.c(c5);
                                        if (z4) {
                                            return;
                                        }
                                        fVar2.b(jVar3);
                                        return;
                                    } catch (Exception e42) {
                                        fVar2.i(e42, c0607b22);
                                        if (jVar3 != null) {
                                            fVar2.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        fVar2.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        fVar2.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                fVar.e(c0607b4);
                                return;
                            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                fVar.f(c0607b4);
                                return;
                            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                fVar.d(c0607b4);
                                return;
                            default:
                                f fVar3 = fVar;
                                AbstractC0579g abstractC0579g = c0607b4;
                                Object i82 = abstractC0579g.i("inTransaction");
                                Boolean bool = i82 instanceof Boolean ? (Boolean) i82 : null;
                                boolean z5 = Boolean.TRUE.equals(bool) && abstractC0579g.m() && ((Integer) abstractC0579g.i("transactionId")) == null;
                                if (z5) {
                                    int i9 = fVar3.f8675k + 1;
                                    fVar3.f8675k = i9;
                                    fVar3.f8676l = Integer.valueOf(i9);
                                }
                                if (!fVar3.g(abstractC0579g)) {
                                    if (z5) {
                                        fVar3.f8676l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", fVar3.f8676l);
                                    abstractC0579g.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        fVar3.f8676l = null;
                                    }
                                    abstractC0579g.c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                HashMap hashMap6 = m.f8700n;
                final C0607b c0607b5 = new C0607b(nVar, kVar);
                fVar.l(c0607b5, new Runnable() { // from class: v2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                f fVar2 = fVar;
                                C0607b c0607b22 = c0607b5;
                                L2.n nVar2 = c0607b22.f8906n;
                                Integer num = (Integer) nVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(nVar2.a("cancel"));
                                if (AbstractC0589a.b(fVar2.f8668d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = fVar2.f8671g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        fVar2.b(jVar2);
                                    }
                                    c0607b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f8688c;
                                        HashMap c5 = f.c(cursor, Integer.valueOf(jVar3.f8687b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c5.put("cursorId", num);
                                        }
                                        c0607b22.c(c5);
                                        if (z4) {
                                            return;
                                        }
                                        fVar2.b(jVar3);
                                        return;
                                    } catch (Exception e42) {
                                        fVar2.i(e42, c0607b22);
                                        if (jVar3 != null) {
                                            fVar2.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        fVar2.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        fVar2.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                fVar.e(c0607b5);
                                return;
                            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                fVar.f(c0607b5);
                                return;
                            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                fVar.d(c0607b5);
                                return;
                            default:
                                f fVar3 = fVar;
                                AbstractC0579g abstractC0579g = c0607b5;
                                Object i82 = abstractC0579g.i("inTransaction");
                                Boolean bool = i82 instanceof Boolean ? (Boolean) i82 : null;
                                boolean z5 = Boolean.TRUE.equals(bool) && abstractC0579g.m() && ((Integer) abstractC0579g.i("transactionId")) == null;
                                if (z5) {
                                    int i9 = fVar3.f8675k + 1;
                                    fVar3.f8675k = i9;
                                    fVar3.f8676l = Integer.valueOf(i9);
                                }
                                if (!fVar3.g(abstractC0579g)) {
                                    if (z5) {
                                        fVar3.f8676l = null;
                                        return;
                                    }
                                    return;
                                } else if (z5) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", fVar3.f8676l);
                                    abstractC0579g.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        fVar3.f8676l = null;
                                    }
                                    abstractC0579g.c(null);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                HashMap hashMap7 = m.f8700n;
                boolean equals = Boolean.TRUE.equals(nVar.a("noResult"));
                boolean equals2 = Boolean.TRUE.equals(nVar.a("continueOnError"));
                List list = (List) nVar.a("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0606a c0606a = new C0606a((Map) it.next(), equals);
                    String j4 = c0606a.j();
                    j4.getClass();
                    C0044m c0044m = c0606a.f8903n;
                    switch (j4.hashCode()) {
                        case -1319569547:
                            if (j4.equals("execute")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -1183792455:
                            if (j4.equals("insert")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case -838846263:
                            if (j4.equals("update")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 107944136:
                            if (j4.equals("query")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    c4 = 65535;
                    switch (c4) {
                        case 0:
                            if (fVar.g(c0606a)) {
                                c0606a.c(null);
                                c0606a.q(arrayList);
                                break;
                            } else if (!equals2) {
                                kVar.a((String) c0044m.f848m, (String) c0044m.f849n, (HashMap) c0044m.f850o);
                                return;
                            } else {
                                c0606a.p(arrayList);
                                break;
                            }
                        case 1:
                            if (fVar.d(c0606a)) {
                                c0606a.q(arrayList);
                                break;
                            } else if (!equals2) {
                                kVar.a((String) c0044m.f848m, (String) c0044m.f849n, (HashMap) c0044m.f850o);
                                return;
                            } else {
                                c0606a.p(arrayList);
                                break;
                            }
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            if (fVar.f(c0606a)) {
                                c0606a.q(arrayList);
                                break;
                            } else if (!equals2) {
                                kVar.a((String) c0044m.f848m, (String) c0044m.f849n, (HashMap) c0044m.f850o);
                                return;
                            } else {
                                c0606a.p(arrayList);
                                break;
                            }
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            if (fVar.e(c0606a)) {
                                c0606a.q(arrayList);
                                break;
                            } else if (!equals2) {
                                kVar.a((String) c0044m.f848m, (String) c0044m.f849n, (HashMap) c0044m.f850o);
                                return;
                            } else {
                                c0606a.p(arrayList);
                                break;
                            }
                        default:
                            kVar.a("bad_param", "Batch method '" + j4 + "' not supported", null);
                            return;
                    }
                }
                if (equals) {
                    kVar.b(null);
                    return;
                } else {
                    kVar.b(arrayList);
                    return;
                }
        }
    }

    public /* synthetic */ k(L2.n nVar, f fVar, K2.k kVar) {
        this.f8689l = 3;
        this.f8690m = nVar;
        this.f8692o = fVar;
        this.f8691n = kVar;
    }

    public /* synthetic */ k(f fVar, L2.n nVar, K2.k kVar) {
        this.f8689l = 6;
        this.f8692o = fVar;
        this.f8690m = nVar;
        this.f8691n = kVar;
    }
}
