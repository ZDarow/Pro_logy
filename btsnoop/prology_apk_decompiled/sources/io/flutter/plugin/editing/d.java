package io.flutter.plugin.editing;

import B2.u;
import I.C0044m;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.t;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import f2.Y;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends BaseInputConnection implements f {

    /* renamed from: a, reason: collision with root package name */
    public final u f6262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6263b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.d f6264c;

    /* renamed from: d, reason: collision with root package name */
    public final g f6265d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f6266e;

    /* renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f6267f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6268g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f6269h;

    /* renamed from: i, reason: collision with root package name */
    public final ExtractedText f6270i;

    /* renamed from: j, reason: collision with root package name */
    public final InputMethodManager f6271j;

    /* renamed from: k, reason: collision with root package name */
    public final DynamicLayout f6272k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f6273l;

    /* renamed from: m, reason: collision with root package name */
    public final t f6274m;

    /* renamed from: n, reason: collision with root package name */
    public int f6275n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u uVar, int i4, B1.d dVar, t tVar, g gVar, EditorInfo editorInfo) {
        super(uVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f6268g = false;
        this.f6270i = new ExtractedText();
        this.f6275n = 0;
        this.f6262a = uVar;
        this.f6263b = i4;
        this.f6264c = dVar;
        this.f6265d = gVar;
        gVar.a(this);
        this.f6266e = editorInfo;
        this.f6274m = tVar;
        this.f6273l = new Y(8, flutterJNI);
        this.f6272k = new DynamicLayout(gVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f6271j = (InputMethodManager) uVar.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.f
    public final void a(boolean z4) {
        g gVar = this.f6265d;
        gVar.getClass();
        this.f6271j.updateSelection(this.f6262a, Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar), BaseInputConnection.getComposingSpanStart(gVar), BaseInputConnection.getComposingSpanEnd(gVar));
        ExtractedTextRequest extractedTextRequest = this.f6267f;
        InputMethodManager inputMethodManager = this.f6271j;
        u uVar = this.f6262a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(uVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f6268g) {
            inputMethodManager.updateCursorAnchorInfo(uVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f6269h;
        if (builder == null) {
            this.f6269h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f6269h;
        g gVar = this.f6265d;
        gVar.getClass();
        int selectionStart = Selection.getSelectionStart(gVar);
        gVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(gVar));
        gVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar);
        gVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f6269h.setComposingText(-1, "");
        } else {
            this.f6269h.setComposingText(composingSpanStart, gVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f6269h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f6265d.b();
        this.f6275n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f6270i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f6265d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f6265d.e(this);
        while (this.f6275n > 0) {
            endBatchEdit();
            this.f6275n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        int i5;
        if ((i4 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f6262a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i5 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i5 = -1;
                                    }
                                    if (i5 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        B1.d dVar = this.f6264c;
                                        dVar.getClass();
                                        ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f6263b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i5);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    public final boolean d(boolean z4, boolean z5) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i4;
        int i5;
        int charCount7;
        g gVar = this.f6265d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        int i6 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        Y y4 = this.f6273l;
        if (z4) {
            y4.getClass();
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(gVar, selectionEnd))))) != 0) {
                if (codePointBefore != 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) y4.f5535m;
                    if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                        int codePointBefore2 = Character.codePointBefore(gVar, charCount6);
                        int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                        int i7 = 1;
                        while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                            codePointBefore2 = Character.codePointBefore(gVar, charCount8);
                            charCount8 -= Character.charCount(codePointBefore2);
                            i7++;
                        }
                        if (i7 % 2 == 0) {
                            charCount5 += 2;
                        }
                    } else if (codePointBefore == 8419) {
                        int codePointBefore3 = Character.codePointBefore(gVar, charCount6);
                        int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                        if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                            int codePointBefore4 = Character.codePointBefore(gVar, charCount9);
                            if (Y.z(codePointBefore4)) {
                                charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                                charCount5 += charCount7;
                            }
                        } else if (Y.z(codePointBefore3)) {
                            charCount7 = Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else {
                        if (codePointBefore == 917631) {
                            int codePointBefore5 = Character.codePointBefore(gVar, charCount6);
                            charCount6 -= Character.charCount(codePointBefore5);
                            codePointBefore = codePointBefore5;
                            while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                                charCount5 += Character.charCount(codePointBefore);
                                codePointBefore = Character.codePointBefore(gVar, charCount6);
                                charCount6 -= Character.charCount(codePointBefore);
                            }
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += Character.charCount(codePointBefore);
                            } else {
                                i5 = selectionEnd - 2;
                            }
                        }
                        if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                            codePointBefore = Character.codePointBefore(gVar, charCount6);
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += Character.charCount(codePointBefore);
                                charCount6 -= charCount5;
                            }
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            boolean z6 = false;
                            int i8 = 0;
                            while (true) {
                                if (z6) {
                                    charCount5 = Character.charCount(codePointBefore) + i8 + 1 + charCount5;
                                    z6 = false;
                                }
                                if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                    int codePointBefore6 = Character.codePointBefore(gVar, charCount6);
                                    int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                    if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                        i4 = 0;
                                    } else {
                                        codePointBefore6 = Character.codePointBefore(gVar, charCount10);
                                        if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                            i4 = Character.charCount(codePointBefore6);
                                            Character.charCount(codePointBefore6);
                                        }
                                    }
                                    if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                        charCount5 += Character.charCount(codePointBefore6) + i4;
                                    }
                                } else {
                                    if (charCount6 > 0) {
                                        int codePointBefore7 = Character.codePointBefore(gVar, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore7);
                                        if (codePointBefore7 == 8205) {
                                            int codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                            if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                                i8 = 0;
                                            } else {
                                                codePointBefore8 = Character.codePointBefore(gVar, charCount6);
                                                i8 = Character.charCount(codePointBefore8);
                                                charCount6 -= Character.charCount(codePointBefore8);
                                            }
                                            codePointBefore = codePointBefore8;
                                            z6 = true;
                                            if (charCount6 != 0 || !z6 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            codePointBefore = codePointBefore7;
                                        }
                                    }
                                    i8 = 0;
                                    if (charCount6 != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (Character.codePointBefore(gVar, charCount6) == 13) {
                    charCount5++;
                }
                i5 = selectionEnd - charCount5;
            } else {
                i5 = 0;
            }
            min = Math.max(i5, 0);
        } else {
            y4.getClass();
            int length = gVar.length();
            int i9 = length - 1;
            if (selectionEnd >= i9) {
                i6 = length;
            } else {
                int codePointAt = Character.codePointAt(gVar, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i10 = selectionEnd + charCount11;
                if (i10 != 0) {
                    if (codePointAt != 10) {
                        FlutterJNI flutterJNI2 = (FlutterJNI) y4.f5535m;
                        if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                            if (Y.z(codePointAt)) {
                                charCount11 += Character.charCount(codePointAt);
                            }
                            if (codePointAt == 8419) {
                                int codePointBefore9 = Character.codePointBefore(gVar, i10);
                                int charCount12 = Character.charCount(codePointBefore9) + i10;
                                if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                    int codePointAt2 = Character.codePointAt(gVar, charCount12);
                                    if (Y.z(codePointAt2)) {
                                        charCount2 = Character.charCount(codePointBefore9);
                                        charCount3 = Character.charCount(codePointAt2);
                                        charCount11 += charCount3 + charCount2;
                                    }
                                } else if (Y.z(codePointBefore9)) {
                                    charCount = Character.charCount(codePointBefore9);
                                    charCount11 += charCount;
                                }
                            } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                                boolean z7 = false;
                                int i11 = 0;
                                while (true) {
                                    if (z7) {
                                        charCount11 = Character.charCount(codePointAt) + i11 + 1 + charCount11;
                                        z7 = false;
                                    }
                                    if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                        break;
                                    }
                                    if (i10 < length) {
                                        int codePointAt3 = Character.codePointAt(gVar, i10);
                                        int charCount13 = Character.charCount(codePointAt3) + i10;
                                        if (codePointAt3 == 8419) {
                                            int codePointBefore10 = Character.codePointBefore(gVar, charCount13);
                                            int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                            if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                                int codePointAt4 = Character.codePointAt(gVar, charCount14);
                                                if (Y.z(codePointAt4)) {
                                                    charCount2 = Character.charCount(codePointBefore10);
                                                    charCount3 = Character.charCount(codePointAt4);
                                                }
                                            } else if (Y.z(codePointBefore10)) {
                                                charCount = Character.charCount(codePointBefore10);
                                            }
                                        } else {
                                            if (flutterJNI2.isCodePointEmojiModifier(codePointAt3)) {
                                                charCount4 = Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (flutterJNI2.isCodePointVariantSelector(codePointAt3)) {
                                                charCount4 = Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (codePointAt3 == 8205) {
                                                int codePointAt5 = Character.codePointAt(gVar, charCount13);
                                                int charCount15 = Character.charCount(codePointAt5) + charCount13;
                                                if (charCount15 >= length || !flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                    codePointAt = codePointAt5;
                                                    i10 = charCount15;
                                                    i11 = 0;
                                                } else {
                                                    int codePointAt6 = Character.codePointAt(gVar, charCount15);
                                                    int charCount16 = Character.charCount(codePointAt6);
                                                    int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                    i11 = charCount16;
                                                    i10 = charCount17;
                                                    codePointAt = codePointAt6;
                                                }
                                                z7 = true;
                                                if (i10 < length || !z7 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt3;
                                                i10 = charCount13;
                                            }
                                        }
                                    }
                                    i11 = 0;
                                    if (i10 < length) {
                                        break;
                                    }
                                }
                                charCount11 += charCount4;
                            }
                        } else if (i10 >= i9 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(gVar, i10))) {
                            i6 = i10;
                        } else {
                            int i12 = selectionEnd;
                            while (i12 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(gVar, selectionEnd))) {
                                i12 -= Character.charCount(Character.codePointBefore(gVar, selectionEnd));
                                i6++;
                            }
                            if (i6 % 2 == 0) {
                                charCount11 += 2;
                            }
                        }
                    } else if (Character.codePointAt(gVar, i10) == 13) {
                        charCount11++;
                    }
                    i6 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i6, gVar.length());
        }
        if (selectionStart != selectionEnd || z5) {
            setSelection(selectionStart, min);
        } else {
            setSelection(min, min);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        g gVar = this.f6265d;
        gVar.getClass();
        if (Selection.getSelectionStart(gVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i4, i5);
    }

    public final boolean e(boolean z4, boolean z5) {
        g gVar = this.f6265d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        boolean z6 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z5) {
            z6 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f6272k;
        if (z6) {
            if (z4) {
                Selection.moveUp(gVar, dynamicLayout);
            } else {
                Selection.moveDown(gVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(gVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z4) {
                Selection.extendUp(gVar, dynamicLayout);
            } else {
                Selection.extendDown(gVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f6275n--;
        this.f6265d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f6265d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i4) {
        this.f6267f = (i4 & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i4) {
        beginBatchEdit();
        boolean z4 = true;
        g gVar = this.f6265d;
        if (i4 == 16908319) {
            setSelection(0, gVar.length());
        } else {
            u uVar = this.f6262a;
            if (i4 == 16908320) {
                int selectionStart = Selection.getSelectionStart(gVar);
                int selectionEnd = Selection.getSelectionEnd(gVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) uVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(min, max)));
                    gVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i4 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(gVar);
                int selectionEnd2 = Selection.getSelectionEnd(gVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) uVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i4 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) uVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(uVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(gVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(gVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        gVar.delete(min2, max4);
                    }
                    gVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z4 = false;
            }
        }
        endBatchEdit();
        return z4;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i4) {
        int i5 = this.f6263b;
        B1.d dVar = this.f6264c;
        if (i4 == 0) {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.unspecified"), null);
        } else if (i4 == 1) {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.newline"), null);
        } else if (i4 == 2) {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.go"), null);
        } else if (i4 == 3) {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.search"), null);
        } else if (i4 == 4) {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.send"), null);
        } else if (i4 == 5) {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.next"), null);
        } else if (i4 != 7) {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.done"), null);
        } else {
            dVar.getClass();
            ((C0044m) dVar.f96m).j("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        B1.d dVar = this.f6264c;
        dVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((C0044m) dVar.f96m).j("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f6263b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i4) {
        if ((i4 & 1) != 0) {
            this.f6271j.updateCursorAnchorInfo(this.f6262a, b());
        }
        this.f6268g = (i4 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f6274m.k0(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i4) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i4) : super.setComposingText(charSequence, i4);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i4, int i5) {
        beginBatchEdit();
        boolean selection = super.setSelection(i4, i5);
        endBatchEdit();
        return selection;
    }
}
