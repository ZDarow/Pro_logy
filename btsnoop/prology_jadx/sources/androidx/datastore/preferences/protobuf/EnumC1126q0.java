package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.q0 */
/* loaded from: classes.dex */
public class EnumC1126q0 {

    /* renamed from: n */
    public static final androidx.datastore.preferences.protobuf.C1118m0 f4272n;

    /* renamed from: o */
    public static final androidx.datastore.preferences.protobuf.C1120n0 f4273o;

    /* renamed from: p */
    public static final androidx.datastore.preferences.protobuf.C1122o0 f4274p;

    /* renamed from: q */
    public static final /* synthetic */ androidx.datastore.preferences.protobuf.EnumC1126q0[] f4275q;

    /* renamed from: l */
    public final androidx.datastore.preferences.protobuf.EnumC1128r0 f4276l;

    /* renamed from: m */
    public final int f4277m;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.EnumC1126q0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.EnumC1126q0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.EnumC1126q0 EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.m0, androidx.datastore.preferences.protobuf.q0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.o0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.n0] */
    static {
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q0 = new androidx.datastore.preferences.protobuf.EnumC1126q0("DOUBLE", 0, androidx.datastore.preferences.protobuf.EnumC1128r0.DOUBLE, 1);
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q02 = new androidx.datastore.preferences.protobuf.EnumC1126q0("FLOAT", 1, androidx.datastore.preferences.protobuf.EnumC1128r0.FLOAT, 5);
        androidx.datastore.preferences.protobuf.EnumC1128r0 enumC1128r0 = androidx.datastore.preferences.protobuf.EnumC1128r0.LONG;
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q03 = new androidx.datastore.preferences.protobuf.EnumC1126q0("INT64", 2, enumC1128r0, 0);
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q04 = new androidx.datastore.preferences.protobuf.EnumC1126q0("UINT64", 3, enumC1128r0, 0);
        androidx.datastore.preferences.protobuf.EnumC1128r0 enumC1128r02 = androidx.datastore.preferences.protobuf.EnumC1128r0.INT;
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q05 = new androidx.datastore.preferences.protobuf.EnumC1126q0("INT32", 4, enumC1128r02, 0);
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q06 = new androidx.datastore.preferences.protobuf.EnumC1126q0("FIXED64", 5, enumC1128r0, 1);
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q07 = new androidx.datastore.preferences.protobuf.EnumC1126q0("FIXED32", 6, enumC1128r02, 5);
        androidx.datastore.preferences.protobuf.EnumC1126q0 enumC1126q08 = new androidx.datastore.preferences.protobuf.EnumC1126q0("BOOL", 7, androidx.datastore.preferences.protobuf.EnumC1128r0.BOOLEAN, 0);
        ?? enumC1126q09 = new androidx.datastore.preferences.protobuf.EnumC1126q0("STRING", 8, androidx.datastore.preferences.protobuf.EnumC1128r0.STRING, 2);
        f4272n = enumC1126q09;
        androidx.datastore.preferences.protobuf.EnumC1128r0 enumC1128r03 = androidx.datastore.preferences.protobuf.EnumC1128r0.MESSAGE;
        ?? enumC1126q010 = new androidx.datastore.preferences.protobuf.EnumC1126q0("GROUP", 9, enumC1128r03, 3);
        f4273o = enumC1126q010;
        ?? enumC1126q011 = new androidx.datastore.preferences.protobuf.EnumC1126q0("MESSAGE", 10, enumC1128r03, 2);
        f4274p = enumC1126q011;
        f4275q = new androidx.datastore.preferences.protobuf.EnumC1126q0[]{enumC1126q0, enumC1126q02, enumC1126q03, enumC1126q04, enumC1126q05, enumC1126q06, enumC1126q07, enumC1126q08, enumC1126q09, enumC1126q010, enumC1126q011, new androidx.datastore.preferences.protobuf.EnumC1126q0("BYTES", 11, androidx.datastore.preferences.protobuf.EnumC1128r0.BYTE_STRING, 2), new androidx.datastore.preferences.protobuf.EnumC1126q0("UINT32", 12, enumC1128r02, 0), new androidx.datastore.preferences.protobuf.EnumC1126q0("ENUM", 13, androidx.datastore.preferences.protobuf.EnumC1128r0.ENUM, 0), new androidx.datastore.preferences.protobuf.EnumC1126q0("SFIXED32", 14, enumC1128r02, 5), new androidx.datastore.preferences.protobuf.EnumC1126q0("SFIXED64", 15, enumC1128r0, 1), new androidx.datastore.preferences.protobuf.EnumC1126q0("SINT32", 16, enumC1128r02, 0), new androidx.datastore.preferences.protobuf.EnumC1126q0("SINT64", 17, enumC1128r0, 0)};
    }

    public EnumC1126q0(java.lang.String str, int i4, androidx.datastore.preferences.protobuf.EnumC1128r0 enumC1128r0, int i5) {
        this.f4276l = enumC1128r0;
        this.f4277m = i5;
    }

    public static androidx.datastore.preferences.protobuf.EnumC1126q0 valueOf(java.lang.String str) {
        return (androidx.datastore.preferences.protobuf.EnumC1126q0) java.lang.Enum.valueOf(androidx.datastore.preferences.protobuf.EnumC1126q0.class, str);
    }

    public static androidx.datastore.preferences.protobuf.EnumC1126q0[] values() {
        return (androidx.datastore.preferences.protobuf.EnumC1126q0[]) f4275q.clone();
    }
}
