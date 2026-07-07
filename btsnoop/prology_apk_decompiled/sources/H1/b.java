package H1;

import B2.AbstractActivityC0003d;
import D1.f;
import L2.r;
import L2.s;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p1.AbstractC0462a;
import r.j;

/* loaded from: classes.dex */
public final class b implements r, s {

    /* renamed from: l, reason: collision with root package name */
    public final Context f703l;

    /* renamed from: m, reason: collision with root package name */
    public f f704m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractActivityC0003d f705n;

    /* renamed from: o, reason: collision with root package name */
    public int f706o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f707p;

    public b(Context context) {
        this.f703l = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L2.r
    public final boolean a(int i4, int i5, Intent intent) {
        boolean z4;
        int i6;
        boolean canScheduleExactAlarms;
        boolean isExternalStorageManager;
        int i7;
        AbstractActivityC0003d abstractActivityC0003d = this.f705n;
        boolean z5 = false;
        z5 = false;
        if (abstractActivityC0003d == null) {
            return false;
        }
        if (this.f707p == null) {
            this.f706o = 0;
            return false;
        }
        if (i4 == 209) {
            Context context = this.f703l;
            String packageName = context.getPackageName();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z5 = true;
            }
            i6 = 16;
            i7 = z5;
        } else if (i4 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            isExternalStorageManager = Environment.isExternalStorageManager();
            i6 = 22;
            i7 = isExternalStorageManager;
        } else if (i4 == 211) {
            i6 = 23;
            i7 = Settings.canDrawOverlays(abstractActivityC0003d);
        } else if (i4 == 212) {
            i6 = 24;
            i7 = abstractActivityC0003d.getPackageManager().canRequestPackageInstalls();
        } else if (i4 == 213) {
            i6 = 27;
            i7 = ((NotificationManager) abstractActivityC0003d.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i4 != 214) {
                return false;
            }
            AlarmManager alarmManager = (AlarmManager) abstractActivityC0003d.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 31) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                z4 = canScheduleExactAlarms;
            } else {
                z4 = true;
            }
            i6 = 34;
            i7 = z4;
        }
        this.f707p.put(Integer.valueOf(i6), Integer.valueOf(i7));
        int i8 = this.f706o - 1;
        this.f706o = i8;
        f fVar = this.f704m;
        if (fVar != null && i8 == 0) {
            fVar.f457b.b(this.f707p);
        }
        return true;
    }

    public final int b(int i4) {
        boolean canScheduleExactAlarms;
        boolean isExternalStorageManager;
        int i5 = 0;
        Context context = this.f703l;
        if (i4 == 17) {
            if (Build.VERSION.SDK_INT < 33) {
                return new j(context).f7997a.areNotificationsEnabled() ? 1 : 0;
            }
            if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                return 1;
            }
            return U1.a.l(this.f705n, "android.permission.POST_NOTIFICATIONS");
        }
        if (i4 == 21) {
            ArrayList r4 = U1.a.r(context, 21);
            if (r4 != null && !r4.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i4 == 30 || i4 == 28 || i4 == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList r5 = U1.a.r(context, 21);
            if (r5 != null && !r5.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i4 == 37 || i4 == 0) && !d()) {
            return 0;
        }
        ArrayList r6 = U1.a.r(context, i4);
        if (r6 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i4);
            return 1;
        }
        if (r6.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + r6 + i4);
            return (i4 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i4 == 16) {
                    String packageName = context.getPackageName();
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        hashSet.add(Integer.valueOf(i5));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i4 == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        hashSet.add(2);
                    }
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                } else if (i4 == 23) {
                    hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                } else if (i4 == 24) {
                    hashSet.add(Integer.valueOf(context.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                } else if (i4 == 27) {
                    hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                } else if (i4 == 34) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                        hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i4 == 9 || i4 == 32) {
                    int o2 = AbstractC0462a.o(context, str);
                    if ((Build.VERSION.SDK_INT >= 34 ? AbstractC0462a.o(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : o2) == 0 && o2 == -1) {
                        hashSet.add(3);
                    } else if (o2 == 0) {
                        hashSet.add(1);
                    } else {
                        hashSet.add(Integer.valueOf(U1.a.l(this.f705n, str)));
                    }
                } else if (AbstractC0462a.o(context, str) != 0) {
                    hashSet.add(Integer.valueOf(U1.a.l(this.f705n, str)));
                }
                i5 = 0;
            }
            if (!hashSet.isEmpty()) {
                return U1.a.F(hashSet).intValue();
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
    
        r8 = (java.lang.Integer) r20.f707p.get(8);
        r4 = java.lang.Integer.valueOf(U1.a.J(r20.f705n, r4, r14));
        r14 = new java.util.HashSet();
        r14.add(r8);
        r14.add(r4);
        r20.f707p.put(8, U1.a.F(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0352, code lost:
    
        if (r8 != 7) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x035e, code lost:
    
        if (r20.f707p.containsKey(7) != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0360, code lost:
    
        r20.f707p.put(7, java.lang.Integer.valueOf(U1.a.J(r20.f705n, r4, r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x037d, code lost:
    
        if (r20.f707p.containsKey(java.lang.Integer.valueOf(r5)) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x037f, code lost:
    
        r20.f707p.put(java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(U1.a.J(r20.f705n, r4, r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0394, code lost:
    
        if (r8 != 4) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0396, code lost:
    
        r4 = U1.a.J(r20.f705n, r4, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03a6, code lost:
    
        if (r20.f707p.containsKey(4) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03a8, code lost:
    
        r20.f707p.put(4, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03b8, code lost:
    
        if (r8 != 3) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03ba, code lost:
    
        r4 = U1.a.J(r20.f705n, r4, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03c4, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03d0, code lost:
    
        if (r20.f707p.containsKey(4) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03d2, code lost:
    
        r20.f707p.put(4, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ea, code lost:
    
        if (r20.f707p.containsKey(5) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03ec, code lost:
    
        r20.f707p.put(5, java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03f9, code lost:
    
        r20.f707p.put(java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x040b, code lost:
    
        if (r8 == 9) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x040f, code lost:
    
        if (r8 != 32) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x041c, code lost:
    
        if (r20.f707p.containsKey(java.lang.Integer.valueOf(r8)) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x041e, code lost:
    
        r20.f707p.put(java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(U1.a.J(r20.f705n, r4, r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0432, code lost:
    
        r20.f707p.put(java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(b(r8)));
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
    @Override // L2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r21, java.lang.String[] r22, int[] r23) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.b.c(int, java.lang.String[], int[]):boolean");
    }

    public final boolean d() {
        ArrayList r4 = U1.a.r(this.f703l, 37);
        boolean z4 = r4 != null && r4.contains("android.permission.WRITE_CALENDAR");
        boolean z5 = r4 != null && r4.contains("android.permission.READ_CALENDAR");
        if (z4 && z5) {
            return true;
        }
        if (!z4) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z5) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void e(String str, int i4) {
        if (this.f705n == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f705n.getPackageName()));
        }
        this.f705n.startActivityForResult(intent, i4);
        this.f706o++;
    }
}
