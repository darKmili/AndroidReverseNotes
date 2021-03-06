package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public class KeyValuePreference extends Preference {
    private View contentView;
    protected TextView gne;
    public float nnX;
    protected TextView pnu;
    public boolean yCj;
    private boolean yCk;
    private boolean yCl;
    private boolean yCm;
    private int yCn;
    private int yCo;
    public int yCp;
    protected ImageView yCq;
    public Drawable yCr;
    private List<View> yCs;
    public int yCt;
    int yCu;
    public String ylA;

    public KeyValuePreference(Context context) {
        this(context, null);
    }

    public KeyValuePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyValuePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AppMethodBeat.i(107201);
        this.yCj = true;
        this.yCk = false;
        this.ylA = null;
        this.yCl = false;
        this.yCm = false;
        this.yCn = 17;
        this.yCo = 17;
        this.yCp = 0;
        this.yCq = null;
        this.yCr = null;
        this.yCs = new LinkedList();
        setLayoutResource(R.layout.ae4);
        AppMethodBeat.o(107201);
    }

    /* Access modifiers changed, original: protected */
    public View onCreateView(ViewGroup viewGroup) {
        AppMethodBeat.i(107202);
        View onCreateView = super.onCreateView(viewGroup);
        LayoutInflater layoutInflater = (LayoutInflater) this.mContext.getSystemService("layout_inflater");
        ViewGroup viewGroup2 = (ViewGroup) onCreateView.findViewById(R.id.m5);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(R.layout.aet, viewGroup2);
        AppMethodBeat.o(107202);
        return onCreateView;
    }

    public void onBindView(View view) {
        LinearLayout linearLayout;
        AppMethodBeat.i(107203);
        super.onBindView(view);
        this.contentView = view.findViewById(R.id.m5);
        if (this.yCX != null) {
            this.contentView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    AppMethodBeat.i(107199);
                    KeyValuePreference.this.yCX.car();
                    AppMethodBeat.o(107199);
                }
            });
        }
        if (this.yCY != null) {
            view.setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    AppMethodBeat.i(107200);
                    boolean cbK = KeyValuePreference.this.yCY.cbK();
                    AppMethodBeat.o(107200);
                    return cbK;
                }
            });
        }
        this.pnu = (TextView) view.findViewById(16908304);
        if (this.pnu != null) {
            this.pnu.setSingleLine(this.yCj);
            if (this.yCm) {
                this.pnu.setGravity(this.yCo);
            }
        }
        if (this.yCk) {
            setWidgetLayoutResource(R.layout.ag5);
        }
        this.gne = (TextView) view.findViewById(16908310);
        if (!bo.isNullOrNil(this.ylA)) {
            this.gne.setText(this.ylA);
        }
        if (this.gne != null) {
            LayoutParams layoutParams = this.gne.getLayoutParams();
            layoutParams.width = this.yCt == 0 ? a.al(this.mContext, R.dimen.i8) : this.yCt;
            this.gne.setLayoutParams(layoutParams);
        }
        this.yCq = (ImageView) view.findViewById(R.id.aga);
        if (this.yCr != null) {
            this.yCq.setVisibility(this.yCp);
            this.yCq.setImageDrawable(this.yCr);
        } else {
            this.yCq.setVisibility(8);
        }
        if (this.yCl) {
            linearLayout = (LinearLayout) view.findViewById(R.id.nc);
            if (linearLayout != null) {
                linearLayout.setGravity(this.yCn);
            }
        }
        if (this.yCs.size() > 0) {
            linearLayout = (LinearLayout) view.findViewById(R.id.d_k);
            linearLayout.removeAllViews();
            for (View view2 : this.yCs) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                linearLayout.addView(view2);
            }
        }
        if (this.nnX != 0.0f) {
            this.gne.setTextSize(this.nnX);
            this.pnu.setTextSize(this.nnX);
        }
        if (this.yCu > 0) {
            this.pnu.setMaxLines(this.yCu);
        }
        AppMethodBeat.o(107203);
    }

    public final void NT(int i) {
        AppMethodBeat.i(107204);
        this.yCu = i;
        if (this.pnu != null) {
            this.pnu.setMaxLines(this.yCu);
        }
        AppMethodBeat.o(107204);
    }

    public final void qi(boolean z) {
        AppMethodBeat.i(107205);
        this.yCk = z;
        if (this.yCk) {
            setWidgetLayoutResource(R.layout.ag5);
        }
        AppMethodBeat.o(107205);
    }

    public final void dAB() {
        this.yCm = true;
        this.yCo = 5;
    }

    public final void dAC() {
        AppMethodBeat.i(107206);
        this.yCs.clear();
        AppMethodBeat.o(107206);
    }

    public final void eI(View view) {
        AppMethodBeat.i(107207);
        this.yCs.add(view);
        AppMethodBeat.o(107207);
    }

    public final void dAD() {
        this.yCl = true;
        this.yCn = 49;
    }
}
