package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.gallery.l.b;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo = {1, 1, 13}, dWp = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, dWq = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GallerySwipeBackConsumer;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollConsumer;", "galleryView", "Landroid/view/View;", "galleryScaleListener", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;", "(Landroid/view/View;Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;)V", "consumed", "", "currScrollType", "", "downX", "", "downY", "getGalleryScaleListener", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;", "getGalleryView", "()Landroid/view/View;", "maxDownX", "moveExitY", "totalMovedX", "totalMovedY", "velocityTracker", "Landroid/view/VelocityTracker;", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "isTouchMoved", "scrollType", "getScrollDirection", "releaseVelocityTracker", "", "touchRelease", "touchTranslate", "Companion", "plugin-story_release"})
public final class h extends e {
    private static final String TAG = TAG;
    public static final a soA = new a();
    private float hke;
    private float hkf;
    private VelocityTracker oaQ;
    private int snR;
    private int sot = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 32);
    private final int sou = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 96);
    private float sov;
    private float sow;
    private boolean sox;
    private final View soy;
    private final b soz;

    @l(dWo = {1, 1, 13}, dWp = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, dWq = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GallerySwipeBackConsumer$Companion;", "", "()V", "TAG", "", "plugin-story_release"})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public h(View view, b bVar) {
        j.p(view, "galleryView");
        j.p(bVar, "galleryScaleListener");
        AppMethodBeat.i(110748);
        this.soy = view;
        this.soz = bVar;
        AppMethodBeat.o(110748);
    }

    static {
        AppMethodBeat.i(110749);
        AppMethodBeat.o(110749);
    }

    public final boolean a(MotionEvent motionEvent, boolean z, int i) {
        boolean z2 = true;
        AppMethodBeat.i(110746);
        j.p(motionEvent, "event");
        if (this.oaQ == null) {
            this.oaQ = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.oaQ;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.hke = motionEvent.getRawX();
                this.hkf = motionEvent.getRawY();
                break;
            case 1:
                if (this.sox) {
                    velocityTracker = this.oaQ;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(1000);
                    }
                    velocityTracker = this.oaQ;
                    float xVelocity = velocityTracker != null ? velocityTracker.getXVelocity() : 0.0f;
                    VelocityTracker velocityTracker2 = this.oaQ;
                    float yVelocity;
                    if (velocityTracker2 != null) {
                        yVelocity = velocityTracker2.getYVelocity();
                    } else {
                        yVelocity = 0.0f;
                    }
                    if (this.snR == 2) {
                        if (this.sow <= ((float) this.sou) && yVelocity <= 0.0f) {
                            z2 = false;
                        }
                    } else if (this.sov <= ((float) (this.soy.getWidth() / 2)) && xVelocity <= 50.0f) {
                        z2 = false;
                    }
                    if (z2) {
                        com.tencent.mm.plugin.story.g.h hVar = com.tencent.mm.plugin.story.g.h.scu;
                        com.tencent.mm.plugin.story.g.h.EX(13);
                        this.soz.cCg();
                    } else {
                        this.soy.animate().translationY(0.0f).start();
                    }
                }
                this.snR = 0;
                this.sov = 0.0f;
                this.sow = 0.0f;
                this.sox = false;
                lA();
                break;
            case 2:
                if (z) {
                    this.snR = i;
                    if ((i != 8 || this.hke >= ((float) this.sot)) && i != 2) {
                        z2 = false;
                    }
                    this.sox = z2;
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    this.sov = rawX - this.hke;
                    this.sow = rawY - this.hkf;
                    if (this.sox) {
                        this.soy.animate().cancel();
                        if (this.snR == 2) {
                            rawX = this.sow;
                        } else {
                            rawX = (this.sov * ((float) this.soy.getHeight())) / ((float) this.soy.getWidth());
                        }
                        if (rawX < 0.0f) {
                            rawX = 0.0f;
                        }
                        this.soy.setTranslationY(rawX);
                        this.soz.bc(0.8f - (rawX / ((float) this.soy.getHeight())));
                        break;
                    }
                }
                break;
            case 3:
                this.snR = 0;
                this.soy.setTranslationY(0.0f);
                this.sov = 0.0f;
                this.sow = 0.0f;
                this.sox = false;
                lA();
                break;
        }
        z2 = this.sox;
        AppMethodBeat.o(110746);
        return z2;
    }

    private final void lA() {
        AppMethodBeat.i(110747);
        VelocityTracker velocityTracker = this.oaQ;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        velocityTracker = this.oaQ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.oaQ = null;
        AppMethodBeat.o(110747);
    }

    public final int cCD() {
        return 10;
    }
}
