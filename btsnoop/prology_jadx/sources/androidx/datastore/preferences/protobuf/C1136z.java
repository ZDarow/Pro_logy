package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes.dex */
public class C1136z extends java.io.IOException {

    /* renamed from: l */
    public boolean f4299l;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.z, java.io.IOException] */
    /* renamed from: a */
    public static androidx.datastore.preferences.protobuf.C1136z m2645a() {
        return new java.io.IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.y, java.io.IOException] */
    /* renamed from: b */
    public static androidx.datastore.preferences.protobuf.C1135y m2646b() {
        return new java.io.IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.z, java.io.IOException] */
    /* renamed from: c */
    public static androidx.datastore.preferences.protobuf.C1136z m2647c() {
        return new java.io.IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.z, java.io.IOException] */
    /* renamed from: d */
    public static androidx.datastore.preferences.protobuf.C1136z m2648d() {
        return new java.io.IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.z, java.io.IOException] */
    /* renamed from: e */
    public static androidx.datastore.preferences.protobuf.C1136z m2649e() {
        return new java.io.IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
