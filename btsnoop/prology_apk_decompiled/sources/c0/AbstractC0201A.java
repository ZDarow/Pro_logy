package c0;

import android.media.AudioTrack;

/* renamed from: c0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0201A {
    public static void a(AudioTrack audioTrack, C0211j c0211j) {
        audioTrack.setPreferredDevice(c0211j == null ? null : c0211j.f4621a);
    }
}
