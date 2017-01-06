package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ActivityNavAboutBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_content, 1);
        sViewsWithIds.put(R.id.iv_icon, 2);
        sViewsWithIds.put(R.id.tv_new_version, 3);
        sViewsWithIds.put(R.id.tv_function, 4);
        sViewsWithIds.put(R.id.tv_about_star, 5);
        sViewsWithIds.put(R.id.tv_gankio, 6);
        sViewsWithIds.put(R.id.tv_douban, 7);
    }
    // views
    public final android.widget.RelativeLayout activityNavAbout;
    public final android.widget.ImageView ivIcon;
    public final android.widget.LinearLayout llContent;
    public final android.widget.TextView tvAboutStar;
    public final android.widget.TextView tvDouban;
    public final android.widget.TextView tvFunction;
    public final android.widget.TextView tvGankio;
    public final android.widget.TextView tvNewVersion;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNavAboutBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.activityNavAbout = (android.widget.RelativeLayout) bindings[0];
        this.activityNavAbout.setTag(null);
        this.ivIcon = (android.widget.ImageView) bindings[2];
        this.llContent = (android.widget.LinearLayout) bindings[1];
        this.tvAboutStar = (android.widget.TextView) bindings[5];
        this.tvDouban = (android.widget.TextView) bindings[7];
        this.tvFunction = (android.widget.TextView) bindings[4];
        this.tvGankio = (android.widget.TextView) bindings[6];
        this.tvNewVersion = (android.widget.TextView) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityNavAboutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityNavAboutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityNavAboutBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_nav_about, root, attachToRoot, bindingComponent);
    }
    public static ActivityNavAboutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityNavAboutBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_nav_about, null, false), bindingComponent);
    }
    public static ActivityNavAboutBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityNavAboutBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_nav_about_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityNavAboutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}