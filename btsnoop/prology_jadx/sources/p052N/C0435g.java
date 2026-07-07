package p052N;

/* renamed from: N.g */
/* loaded from: classes.dex */
public final class C0435g {

    /* renamed from: A */
    public static final byte[] f1230A;

    /* renamed from: B */
    public static final java.lang.String[] f1231B;

    /* renamed from: C */
    public static final int[] f1232C;

    /* renamed from: D */
    public static final byte[] f1233D;

    /* renamed from: E */
    public static final p052N.C0432d f1234E;

    /* renamed from: F */
    public static final p052N.C0432d[][] f1235F;

    /* renamed from: G */
    public static final p052N.C0432d[] f1236G;

    /* renamed from: H */
    public static final java.util.HashMap[] f1237H;

    /* renamed from: I */
    public static final java.util.HashMap[] f1238I;

    /* renamed from: J */
    public static final java.util.HashSet f1239J;

    /* renamed from: K */
    public static final java.util.HashMap f1240K;

    /* renamed from: L */
    public static final java.nio.charset.Charset f1241L;

    /* renamed from: M */
    public static final byte[] f1242M;

    /* renamed from: N */
    public static final byte[] f1243N;

    /* renamed from: l */
    public static final boolean f1244l = android.util.Log.isLoggable("ExifInterface", 3);

    /* renamed from: m */
    public static final int[] f1245m;

    /* renamed from: n */
    public static final int[] f1246n;

    /* renamed from: o */
    public static final byte[] f1247o;

    /* renamed from: p */
    public static final byte[] f1248p;

    /* renamed from: q */
    public static final byte[] f1249q;

    /* renamed from: r */
    public static final byte[] f1250r;

    /* renamed from: s */
    public static final byte[] f1251s;

    /* renamed from: t */
    public static final byte[] f1252t;

    /* renamed from: u */
    public static final byte[] f1253u;

    /* renamed from: v */
    public static final byte[] f1254v;

    /* renamed from: w */
    public static final byte[] f1255w;

    /* renamed from: x */
    public static final byte[] f1256x;

    /* renamed from: y */
    public static final byte[] f1257y;

    /* renamed from: z */
    public static final byte[] f1258z;

    /* renamed from: a */
    public final java.io.FileDescriptor f1259a;

    /* renamed from: b */
    public final android.content.res.AssetManager.AssetInputStream f1260b;

    /* renamed from: c */
    public int f1261c;

    /* renamed from: d */
    public final java.util.HashMap[] f1262d;

    /* renamed from: e */
    public final java.util.HashSet f1263e;

    /* renamed from: f */
    public java.nio.ByteOrder f1264f;

    /* renamed from: g */
    public boolean f1265g;

    /* renamed from: h */
    public int f1266h;

    /* renamed from: i */
    public int f1267i;

    /* renamed from: j */
    public int f1268j;

    /* renamed from: k */
    public int f1269k;

    static {
        java.util.Arrays.asList(1, 6, 3, 8);
        java.util.Arrays.asList(2, 7, 4, 5);
        f1245m = new int[]{8, 8, 8};
        f1246n = new int[]{8};
        f1247o = new byte[]{-1, -40, -1};
        f1248p = new byte[]{102, 116, 121, 112};
        f1249q = new byte[]{109, 105, 102, 49};
        f1250r = new byte[]{104, 101, 105, 99};
        f1251s = new byte[]{79, 76, 89, 77, 80, 0};
        f1252t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f1253u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f1254v = new byte[]{101, 88, 73, 102};
        f1255w = new byte[]{73, 72, 68, 82};
        f1256x = new byte[]{73, 69, 78, 68};
        f1257y = new byte[]{82, 73, 70, 70};
        f1258z = new byte[]{87, 69, 66, 80};
        f1230A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(java.nio.charset.Charset.defaultCharset());
        "VP8L".getBytes(java.nio.charset.Charset.defaultCharset());
        "VP8 ".getBytes(java.nio.charset.Charset.defaultCharset());
        "ANIM".getBytes(java.nio.charset.Charset.defaultCharset());
        "ANMF".getBytes(java.nio.charset.Charset.defaultCharset());
        f1231B = new java.lang.String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f1232C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f1233D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        p052N.C0432d[] c0432dArr = {new p052N.C0432d(254, 4, "NewSubfileType"), new p052N.C0432d(255, 4, "SubfileType"), new p052N.C0432d(256, 3, 4, "ImageWidth"), new p052N.C0432d(257, 3, 4, "ImageLength"), new p052N.C0432d(258, 3, "BitsPerSample"), new p052N.C0432d(259, 3, "Compression"), new p052N.C0432d(262, 3, "PhotometricInterpretation"), new p052N.C0432d(270, 2, "ImageDescription"), new p052N.C0432d(271, 2, "Make"), new p052N.C0432d(272, 2, "Model"), new p052N.C0432d(273, 3, 4, "StripOffsets"), new p052N.C0432d(274, 3, "Orientation"), new p052N.C0432d(277, 3, "SamplesPerPixel"), new p052N.C0432d(278, 3, 4, "RowsPerStrip"), new p052N.C0432d(279, 3, 4, "StripByteCounts"), new p052N.C0432d(282, 5, "XResolution"), new p052N.C0432d(283, 5, "YResolution"), new p052N.C0432d(284, 3, "PlanarConfiguration"), new p052N.C0432d(296, 3, "ResolutionUnit"), new p052N.C0432d(301, 3, "TransferFunction"), new p052N.C0432d(305, 2, "Software"), new p052N.C0432d(306, 2, "DateTime"), new p052N.C0432d(315, 2, "Artist"), new p052N.C0432d(318, 5, "WhitePoint"), new p052N.C0432d(319, 5, "PrimaryChromaticities"), new p052N.C0432d(330, 4, "SubIFDPointer"), new p052N.C0432d(513, 4, "JPEGInterchangeFormat"), new p052N.C0432d(514, 4, "JPEGInterchangeFormatLength"), new p052N.C0432d(529, 5, "YCbCrCoefficients"), new p052N.C0432d(530, 3, "YCbCrSubSampling"), new p052N.C0432d(531, 3, "YCbCrPositioning"), new p052N.C0432d(532, 5, "ReferenceBlackWhite"), new p052N.C0432d(33432, 2, "Copyright"), new p052N.C0432d(34665, 4, "ExifIFDPointer"), new p052N.C0432d(34853, 4, "GPSInfoIFDPointer"), new p052N.C0432d(4, 4, "SensorTopBorder"), new p052N.C0432d(5, 4, "SensorLeftBorder"), new p052N.C0432d(6, 4, "SensorBottomBorder"), new p052N.C0432d(7, 4, "SensorRightBorder"), new p052N.C0432d(23, 3, "ISO"), new p052N.C0432d(46, 7, "JpgFromRaw"), new p052N.C0432d(700, 1, "Xmp")};
        p052N.C0432d[] c0432dArr2 = {new p052N.C0432d(33434, 5, "ExposureTime"), new p052N.C0432d(33437, 5, "FNumber"), new p052N.C0432d(34850, 3, "ExposureProgram"), new p052N.C0432d(34852, 2, "SpectralSensitivity"), new p052N.C0432d(34855, 3, "PhotographicSensitivity"), new p052N.C0432d(34856, 7, "OECF"), new p052N.C0432d(34864, 3, "SensitivityType"), new p052N.C0432d(34865, 4, "StandardOutputSensitivity"), new p052N.C0432d(34866, 4, "RecommendedExposureIndex"), new p052N.C0432d(34867, 4, "ISOSpeed"), new p052N.C0432d(34868, 4, "ISOSpeedLatitudeyyy"), new p052N.C0432d(34869, 4, "ISOSpeedLatitudezzz"), new p052N.C0432d(36864, 2, "ExifVersion"), new p052N.C0432d(36867, 2, "DateTimeOriginal"), new p052N.C0432d(36868, 2, "DateTimeDigitized"), new p052N.C0432d(36880, 2, "OffsetTime"), new p052N.C0432d(36881, 2, "OffsetTimeOriginal"), new p052N.C0432d(36882, 2, "OffsetTimeDigitized"), new p052N.C0432d(37121, 7, "ComponentsConfiguration"), new p052N.C0432d(37122, 5, "CompressedBitsPerPixel"), new p052N.C0432d(37377, 10, "ShutterSpeedValue"), new p052N.C0432d(37378, 5, "ApertureValue"), new p052N.C0432d(37379, 10, "BrightnessValue"), new p052N.C0432d(37380, 10, "ExposureBiasValue"), new p052N.C0432d(37381, 5, "MaxApertureValue"), new p052N.C0432d(37382, 5, "SubjectDistance"), new p052N.C0432d(37383, 3, "MeteringMode"), new p052N.C0432d(37384, 3, "LightSource"), new p052N.C0432d(37385, 3, "Flash"), new p052N.C0432d(37386, 5, "FocalLength"), new p052N.C0432d(37396, 3, "SubjectArea"), new p052N.C0432d(37500, 7, "MakerNote"), new p052N.C0432d(37510, 7, "UserComment"), new p052N.C0432d(37520, 2, "SubSecTime"), new p052N.C0432d(37521, 2, "SubSecTimeOriginal"), new p052N.C0432d(37522, 2, "SubSecTimeDigitized"), new p052N.C0432d(40960, 7, "FlashpixVersion"), new p052N.C0432d(40961, 3, "ColorSpace"), new p052N.C0432d(40962, 3, 4, "PixelXDimension"), new p052N.C0432d(40963, 3, 4, "PixelYDimension"), new p052N.C0432d(40964, 2, "RelatedSoundFile"), new p052N.C0432d(40965, 4, "InteroperabilityIFDPointer"), new p052N.C0432d(41483, 5, "FlashEnergy"), new p052N.C0432d(41484, 7, "SpatialFrequencyResponse"), new p052N.C0432d(41486, 5, "FocalPlaneXResolution"), new p052N.C0432d(41487, 5, "FocalPlaneYResolution"), new p052N.C0432d(41488, 3, "FocalPlaneResolutionUnit"), new p052N.C0432d(41492, 3, "SubjectLocation"), new p052N.C0432d(41493, 5, "ExposureIndex"), new p052N.C0432d(41495, 3, "SensingMethod"), new p052N.C0432d(41728, 7, "FileSource"), new p052N.C0432d(41729, 7, "SceneType"), new p052N.C0432d(41730, 7, "CFAPattern"), new p052N.C0432d(41985, 3, "CustomRendered"), new p052N.C0432d(41986, 3, "ExposureMode"), new p052N.C0432d(41987, 3, "WhiteBalance"), new p052N.C0432d(41988, 5, "DigitalZoomRatio"), new p052N.C0432d(41989, 3, "FocalLengthIn35mmFilm"), new p052N.C0432d(41990, 3, "SceneCaptureType"), new p052N.C0432d(41991, 3, "GainControl"), new p052N.C0432d(41992, 3, "Contrast"), new p052N.C0432d(41993, 3, "Saturation"), new p052N.C0432d(41994, 3, "Sharpness"), new p052N.C0432d(41995, 7, "DeviceSettingDescription"), new p052N.C0432d(41996, 3, "SubjectDistanceRange"), new p052N.C0432d(42016, 2, "ImageUniqueID"), new p052N.C0432d(42032, 2, "CameraOwnerName"), new p052N.C0432d(42033, 2, "BodySerialNumber"), new p052N.C0432d(42034, 5, "LensSpecification"), new p052N.C0432d(42035, 2, "LensMake"), new p052N.C0432d(42036, 2, "LensModel"), new p052N.C0432d(42240, 5, "Gamma"), new p052N.C0432d(50706, 1, "DNGVersion"), new p052N.C0432d(50720, 3, 4, "DefaultCropSize")};
        p052N.C0432d[] c0432dArr3 = {new p052N.C0432d(0, 1, "GPSVersionID"), new p052N.C0432d(1, 2, "GPSLatitudeRef"), new p052N.C0432d(2, 5, 10, "GPSLatitude"), new p052N.C0432d(3, 2, "GPSLongitudeRef"), new p052N.C0432d(4, 5, 10, "GPSLongitude"), new p052N.C0432d(5, 1, "GPSAltitudeRef"), new p052N.C0432d(6, 5, "GPSAltitude"), new p052N.C0432d(7, 5, "GPSTimeStamp"), new p052N.C0432d(8, 2, "GPSSatellites"), new p052N.C0432d(9, 2, "GPSStatus"), new p052N.C0432d(10, 2, "GPSMeasureMode"), new p052N.C0432d(11, 5, "GPSDOP"), new p052N.C0432d(12, 2, "GPSSpeedRef"), new p052N.C0432d(13, 5, "GPSSpeed"), new p052N.C0432d(14, 2, "GPSTrackRef"), new p052N.C0432d(15, 5, "GPSTrack"), new p052N.C0432d(16, 2, "GPSImgDirectionRef"), new p052N.C0432d(17, 5, "GPSImgDirection"), new p052N.C0432d(18, 2, "GPSMapDatum"), new p052N.C0432d(19, 2, "GPSDestLatitudeRef"), new p052N.C0432d(20, 5, "GPSDestLatitude"), new p052N.C0432d(21, 2, "GPSDestLongitudeRef"), new p052N.C0432d(22, 5, "GPSDestLongitude"), new p052N.C0432d(23, 2, "GPSDestBearingRef"), new p052N.C0432d(24, 5, "GPSDestBearing"), new p052N.C0432d(25, 2, "GPSDestDistanceRef"), new p052N.C0432d(26, 5, "GPSDestDistance"), new p052N.C0432d(27, 7, "GPSProcessingMethod"), new p052N.C0432d(28, 7, "GPSAreaInformation"), new p052N.C0432d(29, 2, "GPSDateStamp"), new p052N.C0432d(30, 3, "GPSDifferential"), new p052N.C0432d(31, 5, "GPSHPositioningError")};
        p052N.C0432d[] c0432dArr4 = {new p052N.C0432d(1, 2, "InteroperabilityIndex")};
        p052N.C0432d[] c0432dArr5 = {new p052N.C0432d(254, 4, "NewSubfileType"), new p052N.C0432d(255, 4, "SubfileType"), new p052N.C0432d(256, 3, 4, "ThumbnailImageWidth"), new p052N.C0432d(257, 3, 4, "ThumbnailImageLength"), new p052N.C0432d(258, 3, "BitsPerSample"), new p052N.C0432d(259, 3, "Compression"), new p052N.C0432d(262, 3, "PhotometricInterpretation"), new p052N.C0432d(270, 2, "ImageDescription"), new p052N.C0432d(271, 2, "Make"), new p052N.C0432d(272, 2, "Model"), new p052N.C0432d(273, 3, 4, "StripOffsets"), new p052N.C0432d(274, 3, "ThumbnailOrientation"), new p052N.C0432d(277, 3, "SamplesPerPixel"), new p052N.C0432d(278, 3, 4, "RowsPerStrip"), new p052N.C0432d(279, 3, 4, "StripByteCounts"), new p052N.C0432d(282, 5, "XResolution"), new p052N.C0432d(283, 5, "YResolution"), new p052N.C0432d(284, 3, "PlanarConfiguration"), new p052N.C0432d(296, 3, "ResolutionUnit"), new p052N.C0432d(301, 3, "TransferFunction"), new p052N.C0432d(305, 2, "Software"), new p052N.C0432d(306, 2, "DateTime"), new p052N.C0432d(315, 2, "Artist"), new p052N.C0432d(318, 5, "WhitePoint"), new p052N.C0432d(319, 5, "PrimaryChromaticities"), new p052N.C0432d(330, 4, "SubIFDPointer"), new p052N.C0432d(513, 4, "JPEGInterchangeFormat"), new p052N.C0432d(514, 4, "JPEGInterchangeFormatLength"), new p052N.C0432d(529, 5, "YCbCrCoefficients"), new p052N.C0432d(530, 3, "YCbCrSubSampling"), new p052N.C0432d(531, 3, "YCbCrPositioning"), new p052N.C0432d(532, 5, "ReferenceBlackWhite"), new p052N.C0432d(33432, 2, "Copyright"), new p052N.C0432d(34665, 4, "ExifIFDPointer"), new p052N.C0432d(34853, 4, "GPSInfoIFDPointer"), new p052N.C0432d(50706, 1, "DNGVersion"), new p052N.C0432d(50720, 3, 4, "DefaultCropSize")};
        f1234E = new p052N.C0432d(273, 3, "StripOffsets");
        f1235F = new p052N.C0432d[][]{c0432dArr, c0432dArr2, c0432dArr3, c0432dArr4, c0432dArr5, c0432dArr, new p052N.C0432d[]{new p052N.C0432d(256, 7, "ThumbnailImage"), new p052N.C0432d(8224, 4, "CameraSettingsIFDPointer"), new p052N.C0432d(8256, 4, "ImageProcessingIFDPointer")}, new p052N.C0432d[]{new p052N.C0432d(257, 4, "PreviewImageStart"), new p052N.C0432d(258, 4, "PreviewImageLength")}, new p052N.C0432d[]{new p052N.C0432d(4371, 3, "AspectFrame")}, new p052N.C0432d[]{new p052N.C0432d(55, 3, "ColorSpace")}};
        f1236G = new p052N.C0432d[]{new p052N.C0432d(330, 4, "SubIFDPointer"), new p052N.C0432d(34665, 4, "ExifIFDPointer"), new p052N.C0432d(34853, 4, "GPSInfoIFDPointer"), new p052N.C0432d(40965, 4, "InteroperabilityIFDPointer"), new p052N.C0432d(8224, 1, "CameraSettingsIFDPointer"), new p052N.C0432d(8256, 1, "ImageProcessingIFDPointer")};
        f1237H = new java.util.HashMap[10];
        f1238I = new java.util.HashMap[10];
        f1239J = new java.util.HashSet(java.util.Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f1240K = new java.util.HashMap();
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("US-ASCII");
        f1241L = forName;
        f1242M = "Exif\u0000\u0000".getBytes(forName);
        f1243N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        java.util.Locale locale = java.util.Locale.US;
        new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        int i4 = 0;
        while (true) {
            p052N.C0432d[][] c0432dArr6 = f1235F;
            if (i4 >= c0432dArr6.length) {
                java.util.HashMap hashMap = f1240K;
                p052N.C0432d[] c0432dArr7 = f1236G;
                hashMap.put(java.lang.Integer.valueOf(c0432dArr7[0].f1224a), 5);
                hashMap.put(java.lang.Integer.valueOf(c0432dArr7[1].f1224a), 1);
                hashMap.put(java.lang.Integer.valueOf(c0432dArr7[2].f1224a), 2);
                hashMap.put(java.lang.Integer.valueOf(c0432dArr7[3].f1224a), 3);
                hashMap.put(java.lang.Integer.valueOf(c0432dArr7[4].f1224a), 7);
                hashMap.put(java.lang.Integer.valueOf(c0432dArr7[5].f1224a), 8);
                java.util.regex.Pattern.compile(".*[1-9].*");
                java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f1237H[i4] = new java.util.HashMap();
            f1238I[i4] = new java.util.HashMap();
            for (p052N.C0432d c0432d : c0432dArr6[i4]) {
                f1237H[i4].put(java.lang.Integer.valueOf(c0432d.f1224a), c0432d);
                f1238I[i4].put(c0432d.f1225b, c0432d);
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:7:0x0039, B:13:0x0056, B:15:0x0061, B:16:0x0077, B:25:0x0068, B:28:0x0070, B:29:0x0074, B:30:0x0081, B:32:0x008a, B:34:0x0090, B:36:0x0096, B:38:0x009c, B:48:0x00aa), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0435g(java.io.ByteArrayInputStream r9) {
        /*
            r8 = this;
            r8.<init>()
            N.d[][] r0 = p052N.C0435g.f1235F
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.f1262d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r8.f1263e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f1264f = r1
            r1 = 0
            boolean r2 = p052N.C0435g.f1244l
            java.lang.String r3 = "ExifInterface"
            r8.f1260b = r1
            r8.f1259a = r1
            r1 = 0
            r4 = r1
        L21:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r4 >= r5) goto L39
            java.util.HashMap[] r5 = r8.f1262d     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r5[r4] = r6     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r4 = r4 + 1
            goto L21
        L30:
            r9 = move-exception
            goto Lb0
        L33:
            r9 = move-exception
            goto La8
        L36:
            r9 = move-exception
            goto La8
        L39:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r4)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r9 = r8.m920f(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.f1261c = r9     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L81
            if (r9 == r6) goto L81
            if (r9 == r5) goto L81
            if (r9 != r4) goto L56
            goto L81
        L56:
            N.f r9 = new N.f     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f1261c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r1 = 12
            if (r0 != r1) goto L65
            r8.m918d(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L65:
            r1 = 7
            if (r0 != r1) goto L6c
            r8.m921g(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L6c:
            r1 = 10
            if (r0 != r1) goto L74
            r8.m925k(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L74:
            r8.m924j(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L77:
            int r0 = r8.f1266h     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.m913b(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.m934u(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L81:
            N.b r9 = new N.b     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f1261c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r0 != r7) goto L8e
            r8.m919e(r9, r1, r1)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L8e:
            if (r0 != r5) goto L94
            r8.m922h(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L94:
            if (r0 != r6) goto L9a
            r8.m923i(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L9a:
            if (r0 != r4) goto L9f
            r8.m926l(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L9f:
            r8.m915a()
            if (r2 == 0) goto Lbf
        La4:
            r8.m930p()
            goto Lbf
        La8:
            if (r2 == 0) goto Lb9
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r3, r0, r9)     // Catch: java.lang.Throwable -> L30
            goto Lb9
        Lb0:
            r8.m915a()
            if (r2 == 0) goto Lb8
            r8.m930p()
        Lb8:
            throw r9
        Lb9:
            r8.m915a()
            if (r2 == 0) goto Lbf
            goto La4
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p052N.C0435g.<init>(java.io.ByteArrayInputStream):void");
    }

    /* renamed from: q */
    public static java.nio.ByteOrder m914q(p052N.C0430b c0430b) {
        short readShort = c0430b.readShort();
        boolean z4 = f1244l;
        if (readShort == 18761) {
            if (z4) {
                android.util.Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return java.nio.ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z4) {
                android.util.Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return java.nio.ByteOrder.BIG_ENDIAN;
        }
        throw new java.io.IOException("Invalid byte order: " + java.lang.Integer.toHexString(readShort));
    }

    /* renamed from: a */
    public final void m915a() {
        java.lang.String m916b = m916b("DateTimeOriginal");
        java.util.HashMap[] hashMapArr = this.f1262d;
        if (m916b != null && m916b("DateTime") == null) {
            java.util.HashMap hashMap = hashMapArr[0];
            byte[] bytes = m916b.concat("\u0000").getBytes(f1241L);
            hashMap.put("DateTime", new p052N.C0431c(bytes, 2, bytes.length));
        }
        if (m916b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", p052N.C0431c.m906a(0L, this.f1264f));
        }
        if (m916b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", p052N.C0431c.m906a(0L, this.f1264f));
        }
        if (m916b("Orientation") == null) {
            hashMapArr[0].put("Orientation", p052N.C0431c.m906a(0L, this.f1264f));
        }
        if (m916b("LightSource") == null) {
            hashMapArr[1].put("LightSource", p052N.C0431c.m906a(0L, this.f1264f));
        }
    }

    /* renamed from: b */
    public final java.lang.String m916b(java.lang.String str) {
        p052N.C0431c m917c = m917c(str);
        if (m917c != null) {
            if (!f1239J.contains(str)) {
                return m917c.m911f(this.f1264f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i4 = m917c.f1220a;
                if (i4 != 5 && i4 != 10) {
                    android.util.Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i4);
                    return null;
                }
                p052N.C0433e[] c0433eArr = (p052N.C0433e[]) m917c.m912g(this.f1264f);
                if (c0433eArr == null || c0433eArr.length != 3) {
                    android.util.Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + java.util.Arrays.toString(c0433eArr));
                    return null;
                }
                p052N.C0433e c0433e = c0433eArr[0];
                java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (((float) c0433e.f1228a) / ((float) c0433e.f1229b)));
                p052N.C0433e c0433e2 = c0433eArr[1];
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (((float) c0433e2.f1228a) / ((float) c0433e2.f1229b)));
                p052N.C0433e c0433e3 = c0433eArr[2];
                return java.lang.String.format("%02d:%02d:%02d", valueOf, valueOf2, java.lang.Integer.valueOf((int) (((float) c0433e3.f1228a) / ((float) c0433e3.f1229b))));
            }
            try {
                return java.lang.Double.toString(m917c.m909d(this.f1264f));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final p052N.C0431c m917c(java.lang.String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f1244l) {
                android.util.Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i4 = 0; i4 < f1235F.length; i4++) {
            p052N.C0431c c0431c = (p052N.C0431c) this.f1262d[i4].get(str);
            if (c0431c != null) {
                return c0431c;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m918d(p052N.C0434f c0434f) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            throw new java.lang.UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        try {
            try {
                p052N.AbstractC0437i.m941a(mediaMetadataRetriever, new p052N.C0429a(c0434f));
                java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                java.lang.String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                java.lang.String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                java.lang.String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                java.util.HashMap[] hashMapArr = this.f1262d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", p052N.C0431c.m908c(java.lang.Integer.parseInt(str), this.f1264f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", p052N.C0431c.m908c(java.lang.Integer.parseInt(str2), this.f1264f));
                }
                if (str3 != null) {
                    int parseInt = java.lang.Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", p052N.C0431c.m908c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f1264f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = java.lang.Integer.parseInt(extractMetadata);
                    int parseInt3 = java.lang.Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new java.io.IOException("Invalid exif length");
                    }
                    c0434f.m913b(parseInt2);
                    byte[] bArr = new byte[6];
                    if (c0434f.read(bArr) != 6) {
                        throw new java.io.IOException("Can't read identifier");
                    }
                    int i4 = parseInt2 + 6;
                    int i5 = parseInt3 - 6;
                    if (!java.util.Arrays.equals(bArr, f1242M)) {
                        throw new java.io.IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c0434f.read(bArr2) != i5) {
                        throw new java.io.IOException("Can't read exif");
                    }
                    this.f1266h = i4;
                    m931r(bArr2, 0);
                }
                if (f1244l) {
                    android.util.Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (java.lang.RuntimeException unused) {
                throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (java.lang.Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a2, code lost:
    
        r23.f1217m = r22.f1264f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a7. Please report as an issue. */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m919e(p052N.C0430b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p052N.C0435g.m919e(N.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00bf, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0155, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m920f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p052N.C0435g.m920f(java.io.BufferedInputStream):int");
    }

    /* renamed from: g */
    public final void m921g(p052N.C0434f c0434f) {
        int i4;
        int i5;
        m924j(c0434f);
        java.util.HashMap[] hashMapArr = this.f1262d;
        p052N.C0431c c0431c = (p052N.C0431c) hashMapArr[1].get("MakerNote");
        if (c0431c != null) {
            p052N.C0434f c0434f2 = new p052N.C0434f(c0431c.f1223d);
            c0434f2.f1217m = this.f1264f;
            byte[] bArr = f1251s;
            byte[] bArr2 = new byte[bArr.length];
            c0434f2.readFully(bArr2);
            c0434f2.m913b(0L);
            byte[] bArr3 = f1252t;
            byte[] bArr4 = new byte[bArr3.length];
            c0434f2.readFully(bArr4);
            if (java.util.Arrays.equals(bArr2, bArr)) {
                c0434f2.m913b(8L);
            } else if (java.util.Arrays.equals(bArr4, bArr3)) {
                c0434f2.m913b(12L);
            }
            m932s(c0434f2, 6);
            p052N.C0431c c0431c2 = (p052N.C0431c) hashMapArr[7].get("PreviewImageStart");
            p052N.C0431c c0431c3 = (p052N.C0431c) hashMapArr[7].get("PreviewImageLength");
            if (c0431c2 != null && c0431c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c0431c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c0431c3);
            }
            p052N.C0431c c0431c4 = (p052N.C0431c) hashMapArr[8].get("AspectFrame");
            if (c0431c4 != null) {
                int[] iArr = (int[]) c0431c4.m912g(this.f1264f);
                if (iArr == null || iArr.length != 4) {
                    android.util.Log.w("ExifInterface", "Invalid aspect frame values. frame=" + java.util.Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i7 = iArr[0];
                if (i6 <= i7 || (i4 = iArr[3]) <= (i5 = iArr[1])) {
                    return;
                }
                int i8 = (i6 - i7) + 1;
                int i9 = (i4 - i5) + 1;
                if (i8 < i9) {
                    int i10 = i8 + i9;
                    i9 = i10 - i9;
                    i8 = i10 - i9;
                }
                p052N.C0431c m908c = p052N.C0431c.m908c(i8, this.f1264f);
                p052N.C0431c m908c2 = p052N.C0431c.m908c(i9, this.f1264f);
                hashMapArr[0].put("ImageWidth", m908c);
                hashMapArr[0].put("ImageLength", m908c2);
            }
        }
    }

    /* renamed from: h */
    public final void m922h(p052N.C0430b c0430b) {
        if (f1244l) {
            android.util.Log.d("ExifInterface", "getPngAttributes starting with: " + c0430b);
        }
        c0430b.f1217m = java.nio.ByteOrder.BIG_ENDIAN;
        byte[] bArr = f1253u;
        c0430b.m905a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c0430b.readInt();
                byte[] bArr2 = new byte[4];
                if (c0430b.read(bArr2) != 4) {
                    throw new java.io.IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i4 = length + 8;
                if (i4 == 16 && !java.util.Arrays.equals(bArr2, f1255w)) {
                    throw new java.io.IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (java.util.Arrays.equals(bArr2, f1256x)) {
                    return;
                }
                if (java.util.Arrays.equals(bArr2, f1254v)) {
                    byte[] bArr3 = new byte[readInt];
                    if (c0430b.read(bArr3) != readInt) {
                        throw new java.io.IOException("Failed to read given length for given PNG chunk type: " + p176p1.AbstractC1949a.m3933g(bArr2));
                    }
                    int readInt2 = c0430b.readInt();
                    java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f1266h = i4;
                        m931r(bArr3, 0);
                        m937x();
                        m934u(new p052N.C0430b(bArr3));
                        return;
                    }
                    throw new java.io.IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i5 = readInt + 4;
                c0430b.m905a(i5);
                length = i4 + i5;
            } catch (java.io.EOFException unused) {
                throw new java.io.IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: i */
    public final void m923i(p052N.C0430b c0430b) {
        boolean z4 = f1244l;
        if (z4) {
            android.util.Log.d("ExifInterface", "getRafAttributes starting with: " + c0430b);
        }
        c0430b.m905a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0430b.read(bArr);
        c0430b.read(bArr2);
        c0430b.read(bArr3);
        int i4 = java.nio.ByteBuffer.wrap(bArr).getInt();
        int i5 = java.nio.ByteBuffer.wrap(bArr2).getInt();
        int i6 = java.nio.ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        c0430b.m905a(i4 - c0430b.f1218n);
        c0430b.read(bArr4);
        m919e(new p052N.C0430b(bArr4), i4, 5);
        c0430b.m905a(i6 - c0430b.f1218n);
        c0430b.f1217m = java.nio.ByteOrder.BIG_ENDIAN;
        int readInt = c0430b.readInt();
        if (z4) {
            android.util.Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i7 = 0; i7 < readInt; i7++) {
            int readUnsignedShort = c0430b.readUnsignedShort();
            int readUnsignedShort2 = c0430b.readUnsignedShort();
            if (readUnsignedShort == f1234E.f1224a) {
                short readShort = c0430b.readShort();
                short readShort2 = c0430b.readShort();
                p052N.C0431c m908c = p052N.C0431c.m908c(readShort, this.f1264f);
                p052N.C0431c m908c2 = p052N.C0431c.m908c(readShort2, this.f1264f);
                java.util.HashMap[] hashMapArr = this.f1262d;
                hashMapArr[0].put("ImageLength", m908c);
                hashMapArr[0].put("ImageWidth", m908c2);
                if (z4) {
                    android.util.Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c0430b.m905a(readUnsignedShort2);
        }
    }

    /* renamed from: j */
    public final void m924j(p052N.C0434f c0434f) {
        m929o(c0434f);
        m932s(c0434f, 0);
        m936w(c0434f, 0);
        m936w(c0434f, 5);
        m936w(c0434f, 4);
        m937x();
        if (this.f1261c == 8) {
            java.util.HashMap[] hashMapArr = this.f1262d;
            p052N.C0431c c0431c = (p052N.C0431c) hashMapArr[1].get("MakerNote");
            if (c0431c != null) {
                p052N.C0434f c0434f2 = new p052N.C0434f(c0431c.f1223d);
                c0434f2.f1217m = this.f1264f;
                c0434f2.m905a(6);
                m932s(c0434f2, 9);
                p052N.C0431c c0431c2 = (p052N.C0431c) hashMapArr[9].get("ColorSpace");
                if (c0431c2 != null) {
                    hashMapArr[1].put("ColorSpace", c0431c2);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m925k(p052N.C0434f c0434f) {
        if (f1244l) {
            android.util.Log.d("ExifInterface", "getRw2Attributes starting with: " + c0434f);
        }
        m924j(c0434f);
        java.util.HashMap[] hashMapArr = this.f1262d;
        p052N.C0431c c0431c = (p052N.C0431c) hashMapArr[0].get("JpgFromRaw");
        if (c0431c != null) {
            m919e(new p052N.C0430b(c0431c.f1223d), (int) c0431c.f1222c, 5);
        }
        p052N.C0431c c0431c2 = (p052N.C0431c) hashMapArr[0].get("ISO");
        p052N.C0431c c0431c3 = (p052N.C0431c) hashMapArr[1].get("PhotographicSensitivity");
        if (c0431c2 == null || c0431c3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c0431c2);
    }

    /* renamed from: l */
    public final void m926l(p052N.C0430b c0430b) {
        if (f1244l) {
            android.util.Log.d("ExifInterface", "getWebpAttributes starting with: " + c0430b);
        }
        c0430b.f1217m = java.nio.ByteOrder.LITTLE_ENDIAN;
        c0430b.m905a(f1257y.length);
        int readInt = c0430b.readInt() + 8;
        byte[] bArr = f1258z;
        c0430b.m905a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0430b.read(bArr2) != 4) {
                    throw new java.io.IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = c0430b.readInt();
                int i4 = length + 8;
                if (java.util.Arrays.equals(f1230A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (c0430b.read(bArr3) == readInt2) {
                        this.f1266h = i4;
                        m931r(bArr3, 0);
                        m934u(new p052N.C0430b(bArr3));
                        return;
                    } else {
                        throw new java.io.IOException("Failed to read given length for given PNG chunk type: " + p176p1.AbstractC1949a.m3933g(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i4 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new java.io.IOException("Encountered WebP file with invalid chunk size");
                }
                c0430b.m905a(readInt2);
            } catch (java.io.EOFException unused) {
                throw new java.io.IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: m */
    public final void m927m(p052N.C0430b c0430b, java.util.HashMap hashMap) {
        p052N.C0431c c0431c = (p052N.C0431c) hashMap.get("JPEGInterchangeFormat");
        p052N.C0431c c0431c2 = (p052N.C0431c) hashMap.get("JPEGInterchangeFormatLength");
        if (c0431c == null || c0431c2 == null) {
            return;
        }
        int m910e = c0431c.m910e(this.f1264f);
        int m910e2 = c0431c2.m910e(this.f1264f);
        if (this.f1261c == 7) {
            m910e += this.f1267i;
        }
        if (m910e > 0 && m910e2 > 0 && this.f1260b == null && this.f1259a == null) {
            c0430b.skip(m910e);
            c0430b.read(new byte[m910e2]);
        }
        if (f1244l) {
            android.util.Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m910e + ", length: " + m910e2);
        }
    }

    /* renamed from: n */
    public final boolean m928n(java.util.HashMap hashMap) {
        p052N.C0431c c0431c = (p052N.C0431c) hashMap.get("ImageLength");
        p052N.C0431c c0431c2 = (p052N.C0431c) hashMap.get("ImageWidth");
        if (c0431c == null || c0431c2 == null) {
            return false;
        }
        return c0431c.m910e(this.f1264f) <= 512 && c0431c2.m910e(this.f1264f) <= 512;
    }

    /* renamed from: o */
    public final void m929o(p052N.C0434f c0434f) {
        java.nio.ByteOrder m914q = m914q(c0434f);
        this.f1264f = m914q;
        c0434f.f1217m = m914q;
        int readUnsignedShort = c0434f.readUnsignedShort();
        int i4 = this.f1261c;
        if (i4 != 7 && i4 != 10 && readUnsignedShort != 42) {
            throw new java.io.IOException("Invalid start code: " + java.lang.Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0434f.readInt();
        if (readInt < 8) {
            throw new java.io.IOException(p009B2.AbstractC0051h.m152k("Invalid first Ifd offset: ", readInt));
        }
        int i5 = readInt - 8;
        if (i5 > 0) {
            c0434f.m905a(i5);
        }
    }

    /* renamed from: p */
    public final void m930p() {
        int i4 = 0;
        while (true) {
            java.util.HashMap[] hashMapArr = this.f1262d;
            if (i4 >= hashMapArr.length) {
                return;
            }
            android.util.Log.d("ExifInterface", "The size of tag group[" + i4 + "]: " + hashMapArr[i4].size());
            for (java.util.Map.Entry entry : hashMapArr[i4].entrySet()) {
                p052N.C0431c c0431c = (p052N.C0431c) entry.getValue();
                android.util.Log.d("ExifInterface", "tagName: " + ((java.lang.String) entry.getKey()) + ", tagType: " + c0431c.toString() + ", tagValue: '" + c0431c.m911f(this.f1264f) + "'");
            }
            i4++;
        }
    }

    /* renamed from: r */
    public final void m931r(byte[] bArr, int i4) {
        p052N.C0434f c0434f = new p052N.C0434f(bArr);
        m929o(c0434f);
        m932s(c0434f, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m932s(p052N.C0434f r29, int r30) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p052N.C0435g.m932s(N.f, int):void");
    }

    /* renamed from: t */
    public final void m933t(int i4, java.lang.String str, java.lang.String str2) {
        java.util.HashMap[] hashMapArr = this.f1262d;
        if (hashMapArr[i4].isEmpty() || hashMapArr[i4].get(str) == null) {
            return;
        }
        java.util.HashMap hashMap = hashMapArr[i4];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i4].remove(str);
    }

    /* renamed from: u */
    public final void m934u(p052N.C0430b c0430b) {
        p052N.C0431c c0431c;
        int m910e;
        java.util.HashMap hashMap = this.f1262d[4];
        p052N.C0431c c0431c2 = (p052N.C0431c) hashMap.get("Compression");
        if (c0431c2 == null) {
            m927m(c0430b, hashMap);
            return;
        }
        int m910e2 = c0431c2.m910e(this.f1264f);
        if (m910e2 != 1) {
            if (m910e2 == 6) {
                m927m(c0430b, hashMap);
                return;
            } else if (m910e2 != 7) {
                return;
            }
        }
        p052N.C0431c c0431c3 = (p052N.C0431c) hashMap.get("BitsPerSample");
        if (c0431c3 != null) {
            int[] iArr = (int[]) c0431c3.m912g(this.f1264f);
            int[] iArr2 = f1245m;
            if (java.util.Arrays.equals(iArr2, iArr) || (this.f1261c == 3 && (c0431c = (p052N.C0431c) hashMap.get("PhotometricInterpretation")) != null && (((m910e = c0431c.m910e(this.f1264f)) == 1 && java.util.Arrays.equals(iArr, f1246n)) || (m910e == 6 && java.util.Arrays.equals(iArr, iArr2))))) {
                p052N.C0431c c0431c4 = (p052N.C0431c) hashMap.get("StripOffsets");
                p052N.C0431c c0431c5 = (p052N.C0431c) hashMap.get("StripByteCounts");
                if (c0431c4 == null || c0431c5 == null) {
                    return;
                }
                long[] m3941r = p176p1.AbstractC1949a.m3941r(c0431c4.m912g(this.f1264f));
                long[] m3941r2 = p176p1.AbstractC1949a.m3941r(c0431c5.m912g(this.f1264f));
                if (m3941r == null || m3941r.length == 0) {
                    android.util.Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (m3941r2 == null || m3941r2.length == 0) {
                    android.util.Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (m3941r.length != m3941r2.length) {
                    android.util.Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j4 = 0;
                for (long j5 : m3941r2) {
                    j4 += j5;
                }
                byte[] bArr = new byte[(int) j4];
                this.f1265g = true;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < m3941r.length; i6++) {
                    int i7 = (int) m3941r[i6];
                    int i8 = (int) m3941r2[i6];
                    if (i6 < m3941r.length - 1 && i7 + i8 != m3941r[i6 + 1]) {
                        this.f1265g = false;
                    }
                    int i9 = i7 - i4;
                    if (i9 < 0) {
                        android.util.Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j6 = i9;
                    if (c0430b.skip(j6) != j6) {
                        android.util.Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                        return;
                    }
                    int i10 = i4 + i9;
                    byte[] bArr2 = new byte[i8];
                    if (c0430b.read(bArr2) != i8) {
                        android.util.Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                        return;
                    }
                    i4 = i10 + i8;
                    java.lang.System.arraycopy(bArr2, 0, bArr, i5, i8);
                    i5 += i8;
                }
                if (this.f1265g) {
                    long j7 = m3941r[0];
                    return;
                }
                return;
            }
        }
        if (f1244l) {
            android.util.Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* renamed from: v */
    public final void m935v(int i4, int i5) {
        java.util.HashMap[] hashMapArr = this.f1262d;
        boolean isEmpty = hashMapArr[i4].isEmpty();
        boolean z4 = f1244l;
        if (isEmpty || hashMapArr[i5].isEmpty()) {
            if (z4) {
                android.util.Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        p052N.C0431c c0431c = (p052N.C0431c) hashMapArr[i4].get("ImageLength");
        p052N.C0431c c0431c2 = (p052N.C0431c) hashMapArr[i4].get("ImageWidth");
        p052N.C0431c c0431c3 = (p052N.C0431c) hashMapArr[i5].get("ImageLength");
        p052N.C0431c c0431c4 = (p052N.C0431c) hashMapArr[i5].get("ImageWidth");
        if (c0431c == null || c0431c2 == null) {
            if (z4) {
                android.util.Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c0431c3 == null || c0431c4 == null) {
            if (z4) {
                android.util.Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m910e = c0431c.m910e(this.f1264f);
        int m910e2 = c0431c2.m910e(this.f1264f);
        int m910e3 = c0431c3.m910e(this.f1264f);
        int m910e4 = c0431c4.m910e(this.f1264f);
        if (m910e >= m910e3 || m910e2 >= m910e4) {
            return;
        }
        java.util.HashMap hashMap = hashMapArr[i4];
        hashMapArr[i4] = hashMapArr[i5];
        hashMapArr[i5] = hashMap;
    }

    /* renamed from: w */
    public final void m936w(p052N.C0434f c0434f, int i4) {
        p052N.C0431c m908c;
        p052N.C0431c m908c2;
        java.util.HashMap[] hashMapArr = this.f1262d;
        p052N.C0431c c0431c = (p052N.C0431c) hashMapArr[i4].get("DefaultCropSize");
        p052N.C0431c c0431c2 = (p052N.C0431c) hashMapArr[i4].get("SensorTopBorder");
        p052N.C0431c c0431c3 = (p052N.C0431c) hashMapArr[i4].get("SensorLeftBorder");
        p052N.C0431c c0431c4 = (p052N.C0431c) hashMapArr[i4].get("SensorBottomBorder");
        p052N.C0431c c0431c5 = (p052N.C0431c) hashMapArr[i4].get("SensorRightBorder");
        if (c0431c != null) {
            if (c0431c.f1220a == 5) {
                p052N.C0433e[] c0433eArr = (p052N.C0433e[]) c0431c.m912g(this.f1264f);
                if (c0433eArr == null || c0433eArr.length != 2) {
                    android.util.Log.w("ExifInterface", "Invalid crop size values. cropSize=" + java.util.Arrays.toString(c0433eArr));
                    return;
                }
                m908c = p052N.C0431c.m907b(c0433eArr[0], this.f1264f);
                m908c2 = p052N.C0431c.m907b(c0433eArr[1], this.f1264f);
            } else {
                int[] iArr = (int[]) c0431c.m912g(this.f1264f);
                if (iArr == null || iArr.length != 2) {
                    android.util.Log.w("ExifInterface", "Invalid crop size values. cropSize=" + java.util.Arrays.toString(iArr));
                    return;
                }
                m908c = p052N.C0431c.m908c(iArr[0], this.f1264f);
                m908c2 = p052N.C0431c.m908c(iArr[1], this.f1264f);
            }
            hashMapArr[i4].put("ImageWidth", m908c);
            hashMapArr[i4].put("ImageLength", m908c2);
            return;
        }
        if (c0431c2 != null && c0431c3 != null && c0431c4 != null && c0431c5 != null) {
            int m910e = c0431c2.m910e(this.f1264f);
            int m910e2 = c0431c4.m910e(this.f1264f);
            int m910e3 = c0431c5.m910e(this.f1264f);
            int m910e4 = c0431c3.m910e(this.f1264f);
            if (m910e2 <= m910e || m910e3 <= m910e4) {
                return;
            }
            p052N.C0431c m908c3 = p052N.C0431c.m908c(m910e2 - m910e, this.f1264f);
            p052N.C0431c m908c4 = p052N.C0431c.m908c(m910e3 - m910e4, this.f1264f);
            hashMapArr[i4].put("ImageLength", m908c3);
            hashMapArr[i4].put("ImageWidth", m908c4);
            return;
        }
        p052N.C0431c c0431c6 = (p052N.C0431c) hashMapArr[i4].get("ImageLength");
        p052N.C0431c c0431c7 = (p052N.C0431c) hashMapArr[i4].get("ImageWidth");
        if (c0431c6 == null || c0431c7 == null) {
            p052N.C0431c c0431c8 = (p052N.C0431c) hashMapArr[i4].get("JPEGInterchangeFormat");
            p052N.C0431c c0431c9 = (p052N.C0431c) hashMapArr[i4].get("JPEGInterchangeFormatLength");
            if (c0431c8 == null || c0431c9 == null) {
                return;
            }
            int m910e5 = c0431c8.m910e(this.f1264f);
            int m910e6 = c0431c8.m910e(this.f1264f);
            c0434f.m913b(m910e5);
            byte[] bArr = new byte[m910e6];
            c0434f.read(bArr);
            m919e(new p052N.C0430b(bArr), m910e5, i4);
        }
    }

    /* renamed from: x */
    public final void m937x() {
        m935v(0, 5);
        m935v(0, 4);
        m935v(5, 4);
        java.util.HashMap[] hashMapArr = this.f1262d;
        p052N.C0431c c0431c = (p052N.C0431c) hashMapArr[1].get("PixelXDimension");
        p052N.C0431c c0431c2 = (p052N.C0431c) hashMapArr[1].get("PixelYDimension");
        if (c0431c != null && c0431c2 != null) {
            hashMapArr[0].put("ImageWidth", c0431c);
            hashMapArr[0].put("ImageLength", c0431c2);
        }
        if (hashMapArr[4].isEmpty() && m928n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new java.util.HashMap();
        }
        if (!m928n(hashMapArr[4])) {
            android.util.Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m933t(0, "ThumbnailOrientation", "Orientation");
        m933t(0, "ThumbnailImageLength", "ImageLength");
        m933t(0, "ThumbnailImageWidth", "ImageWidth");
        m933t(5, "ThumbnailOrientation", "Orientation");
        m933t(5, "ThumbnailImageLength", "ImageLength");
        m933t(5, "ThumbnailImageWidth", "ImageWidth");
        m933t(4, "Orientation", "ThumbnailOrientation");
        m933t(4, "ImageLength", "ThumbnailImageLength");
        m933t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
