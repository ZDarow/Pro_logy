package p033H1;

/* renamed from: H1.b */
/* loaded from: classes.dex */
public final class C0246b implements p047L2.InterfaceC0388r, p047L2.InterfaceC0389s {

    /* renamed from: l */
    public final android.content.Context f714l;

    /* renamed from: m */
    public p017D1.C0173f f715m;

    /* renamed from: n */
    public p009B2.AbstractActivityC0047d f716n;

    /* renamed from: o */
    public int f717o;

    /* renamed from: p */
    public java.util.HashMap f718p;

    public C0246b(android.content.Context context) {
        this.f714l = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p047L2.InterfaceC0388r
    /* renamed from: a */
    public final boolean mo578a(int i4, int i5, android.content.Intent intent) {
        boolean z4;
        int i6;
        boolean canScheduleExactAlarms;
        boolean isExternalStorageManager;
        int i7;
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f716n;
        boolean z5 = false;
        z5 = false;
        if (abstractActivityC0047d == null) {
            return false;
        }
        if (this.f718p == null) {
            this.f717o = 0;
            return false;
        }
        if (i4 == 209) {
            android.content.Context context = this.f714l;
            java.lang.String packageName = context.getPackageName();
            android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z5 = true;
            }
            i6 = 16;
            i7 = z5;
        } else if (i4 == 210) {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                return false;
            }
            isExternalStorageManager = android.os.Environment.isExternalStorageManager();
            i6 = 22;
            i7 = isExternalStorageManager;
        } else if (i4 == 211) {
            i6 = 23;
            i7 = android.provider.Settings.canDrawOverlays(abstractActivityC0047d);
        } else if (i4 == 212) {
            i6 = 24;
            i7 = abstractActivityC0047d.getPackageManager().canRequestPackageInstalls();
        } else if (i4 == 213) {
            i6 = 27;
            i7 = ((android.app.NotificationManager) abstractActivityC0047d.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i4 != 214) {
                return false;
            }
            android.app.AlarmManager alarmManager = (android.app.AlarmManager) abstractActivityC0047d.getSystemService("alarm");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                z4 = canScheduleExactAlarms;
            } else {
                z4 = true;
            }
            i6 = 34;
            i7 = z4;
        }
        this.f718p.put(java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i7));
        int i8 = this.f717o - 1;
        this.f717o = i8;
        p017D1.C0173f c0173f = this.f715m;
        if (c0173f != null && i8 == 0) {
            c0173f.f466b.mo742b(this.f718p);
        }
        return true;
    }

    /* renamed from: b */
    public final int m651b(int i4) {
        boolean canScheduleExactAlarms;
        boolean isExternalStorageManager;
        int i5 = 0;
        android.content.Context context = this.f714l;
        if (i4 == 17) {
            if (android.os.Build.VERSION.SDK_INT < 33) {
                return new p183r.C2042j(context).f8306a.areNotificationsEnabled() ? 1 : 0;
            }
            if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                return 1;
            }
            return p080U1.AbstractC0748a.m1378l(this.f716n, "android.permission.POST_NOTIFICATIONS");
        }
        if (i4 == 21) {
            java.util.ArrayList m1383r = p080U1.AbstractC0748a.m1383r(context, 21);
            if (m1383r != null && !m1383r.isEmpty()) {
                return 1;
            }
            android.util.Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i4 == 30 || i4 == 28 || i4 == 29) && android.os.Build.VERSION.SDK_INT < 31) {
            java.util.ArrayList m1383r2 = p080U1.AbstractC0748a.m1383r(context, 21);
            if (m1383r2 != null && !m1383r2.isEmpty()) {
                return 1;
            }
            android.util.Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i4 == 37 || i4 == 0) && !m652d()) {
            return 0;
        }
        java.util.ArrayList m1383r3 = p080U1.AbstractC0748a.m1383r(context, i4);
        if (m1383r3 == null) {
            android.util.Log.d("permissions_handler", "No android specific permissions needed for: " + i4);
            return 1;
        }
        if (m1383r3.size() == 0) {
            android.util.Log.d("permissions_handler", "No permissions found in manifest for: " + m1383r3 + i4);
            return (i4 != 22 || android.os.Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = m1383r3.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (i4 == 16) {
                    java.lang.String packageName = context.getPackageName();
                    android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        hashSet.add(java.lang.Integer.valueOf(i5));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i4 == 22) {
                    if (android.os.Build.VERSION.SDK_INT < 30) {
                        hashSet.add(2);
                    }
                    isExternalStorageManager = android.os.Environment.isExternalStorageManager();
                    hashSet.add(java.lang.Integer.valueOf(isExternalStorageManager ? 1 : 0));
                } else if (i4 == 23) {
                    hashSet.add(java.lang.Integer.valueOf(android.provider.Settings.canDrawOverlays(context) ? 1 : 0));
                } else if (i4 == 24) {
                    hashSet.add(java.lang.Integer.valueOf(context.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                } else if (i4 == 27) {
                    hashSet.add(java.lang.Integer.valueOf(((android.app.NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                } else if (i4 == 34) {
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        canScheduleExactAlarms = ((android.app.AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                        hashSet.add(java.lang.Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i4 == 9 || i4 == 32) {
                    int m3938o = p176p1.AbstractC1949a.m3938o(context, str);
                    if ((android.os.Build.VERSION.SDK_INT >= 34 ? p176p1.AbstractC1949a.m3938o(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : m3938o) == 0 && m3938o == -1) {
                        hashSet.add(3);
                    } else if (m3938o == 0) {
                        hashSet.add(1);
                    } else {
                        hashSet.add(java.lang.Integer.valueOf(p080U1.AbstractC0748a.m1378l(this.f716n, str)));
                    }
                } else if (p176p1.AbstractC1949a.m3938o(context, str) != 0) {
                    hashSet.add(java.lang.Integer.valueOf(p080U1.AbstractC0748a.m1378l(this.f716n, str)));
                }
                i5 = 0;
            }
            if (!hashSet.isEmpty()) {
                return p080U1.AbstractC0748a.m1358F(hashSet).intValue();
            }
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02cc, code lost:
    
        switch(r8) {
            case 0: goto L222;
            case 1: goto L221;
            case 2: goto L220;
            case 3: goto L219;
            case 4: goto L218;
            case 5: goto L217;
            case 6: goto L216;
            case 7: goto L215;
            case 8: goto L222;
            case 9: goto L214;
            case 10: goto L219;
            case 11: goto L213;
            case 12: goto L222;
            case 13: goto L222;
            case 14: goto L212;
            case 15: goto L211;
            case 16: goto L218;
            case 17: goto L219;
            case 18: goto L222;
            case 19: goto L219;
            case 20: goto L210;
            case 21: goto L209;
            case 22: goto L208;
            case 23: goto L207;
            case 24: goto L221;
            case 25: goto L219;
            case 26: goto L206;
            case 27: goto L205;
            case 28: goto L219;
            case 29: goto L204;
            case 30: goto L203;
            case 31: goto L209;
            case 32: goto L211;
            case 33: goto L202;
            case 34: goto L201;
            case 35: goto L200;
            case 36: goto L209;
            case 37: goto L199;
            case 38: goto L198;
            case 39: goto L197;
            case 40: goto L219;
            default: goto L196;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02cf, code lost:
    
        r8 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x031a, code lost:
    
        if (r8 != 20) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031e, code lost:
    
        r14 = r23[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0320, code lost:
    
        if (r8 != 8) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0322, code lost:
    
        r8 = (java.lang.Integer) r20.f718p.get(8);
        r4 = java.lang.Integer.valueOf(p080U1.AbstractC0748a.m1362J(r20.f716n, r4, r14));
        r14 = new java.util.HashSet();
        r14.add(r8);
        r14.add(r4);
        r20.f718p.put(8, p080U1.AbstractC0748a.m1358F(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0352, code lost:
    
        if (r8 != 7) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x035e, code lost:
    
        if (r20.f718p.containsKey(7) != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0360, code lost:
    
        r20.f718p.put(7, java.lang.Integer.valueOf(p080U1.AbstractC0748a.m1362J(r20.f716n, r4, r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x037d, code lost:
    
        if (r20.f718p.containsKey(java.lang.Integer.valueOf(r5)) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x037f, code lost:
    
        r20.f718p.put(java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(p080U1.AbstractC0748a.m1362J(r20.f716n, r4, r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0394, code lost:
    
        if (r8 != 4) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0396, code lost:
    
        r4 = p080U1.AbstractC0748a.m1362J(r20.f716n, r4, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03a6, code lost:
    
        if (r20.f718p.containsKey(4) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03a8, code lost:
    
        r20.f718p.put(4, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03b8, code lost:
    
        if (r8 != 3) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03ba, code lost:
    
        r4 = p080U1.AbstractC0748a.m1362J(r20.f716n, r4, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03c4, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03d0, code lost:
    
        if (r20.f718p.containsKey(4) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03d2, code lost:
    
        r20.f718p.put(4, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ea, code lost:
    
        if (r20.f718p.containsKey(5) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03ec, code lost:
    
        r20.f718p.put(5, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03f9, code lost:
    
        r20.f718p.put(java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x040b, code lost:
    
        if (r8 == 9) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x040f, code lost:
    
        if (r8 != 32) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x041c, code lost:
    
        if (r20.f718p.containsKey(java.lang.Integer.valueOf(r8)) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x041e, code lost:
    
        r20.f718p.put(java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(p080U1.AbstractC0748a.m1362J(r20.f716n, r4, r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0432, code lost:
    
        r20.f718p.put(java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(m651b(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02d2, code lost:
    
        r8 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d6, code lost:
    
        r8 = 28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02d9, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02db, code lost:
    
        r8 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02dd, code lost:
    
        r8 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02e0, code lost:
    
        r8 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02e3, code lost:
    
        r8 = 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02e6, code lost:
    
        r8 = 34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02e9, code lost:
    
        r8 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02ec, code lost:
    
        r8 = 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02ef, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02f2, code lost:
    
        r8 = 35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02f5, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02f7, code lost:
    
        r8 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02fa, code lost:
    
        r8 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02fd, code lost:
    
        r8 = 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0300, code lost:
    
        r8 = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0303, code lost:
    
        r8 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0306, code lost:
    
        r8 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0309, code lost:
    
        r8 = 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x030c, code lost:
    
        r8 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x030f, code lost:
    
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0311, code lost:
    
        r8 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0313, code lost:
    
        r8 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0316, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0318, code lost:
    
        r8 = 13;
     */
    @Override // p047L2.InterfaceC0389s
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo648c(int r21, java.lang.String[] r22, int[] r23) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p033H1.C0246b.mo648c(int, java.lang.String[], int[]):boolean");
    }

    /* renamed from: d */
    public final boolean m652d() {
        java.util.ArrayList m1383r = p080U1.AbstractC0748a.m1383r(this.f714l, 37);
        boolean z4 = m1383r != null && m1383r.contains("android.permission.WRITE_CALENDAR");
        boolean z5 = m1383r != null && m1383r.contains("android.permission.READ_CALENDAR");
        if (z4 && z5) {
            return true;
        }
        if (!z4) {
            android.util.Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z5) {
            android.util.Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    /* renamed from: e */
    public final void m653e(java.lang.String str, int i4) {
        if (this.f716n == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(android.net.Uri.parse("package:" + this.f716n.getPackageName()));
        }
        this.f716n.startActivityForResult(intent, i4);
        this.f717o++;
    }
}
