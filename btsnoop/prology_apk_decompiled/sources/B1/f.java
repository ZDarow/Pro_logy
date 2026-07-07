package B1;

import B2.AbstractC0007h;
import K2.k;
import a.AbstractC0110a;
import android.location.Address;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f101c;

    public /* synthetic */ f(k kVar, String str, int i4) {
        this.f99a = i4;
        this.f100b = kVar;
        this.f101c = str;
    }

    @Override // B1.a
    public final void onError(String str) {
        switch (this.f99a) {
            case 0:
                if (str == null) {
                    str = "Unknown error occurred";
                }
                this.f100b.a("IO_ERROR", str, null);
                return;
            default:
                if (str == null) {
                    str = "Unknown error occurred";
                }
                this.f100b.a("IO_ERROR", str, null);
                return;
        }
    }

    @Override // B1.a
    public final void onGeocode(List list) {
        switch (this.f99a) {
            case 0:
                k kVar = this.f100b;
                if (list == null || list.size() <= 0) {
                    kVar.a("NOT_FOUND", AbstractC0007h.m(new StringBuilder("No coordinates found for '"), this.f101c, "'"), null);
                    return;
                }
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Address address = (Address) it.next();
                    HashMap hashMap = new HashMap();
                    hashMap.put("latitude", Double.valueOf(address.getLatitude()));
                    hashMap.put("longitude", Double.valueOf(address.getLongitude()));
                    hashMap.put("timestamp", Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis()));
                    arrayList.add(hashMap);
                }
                kVar.b(arrayList);
                return;
            default:
                k kVar2 = this.f100b;
                if (list == null || list.size() <= 0) {
                    kVar2.a("NOT_FOUND", AbstractC0007h.m(new StringBuilder("No coordinates found for '"), this.f101c, "'"), null);
                    return;
                } else {
                    kVar2.b(AbstractC0110a.W(list));
                    return;
                }
        }
    }
}
